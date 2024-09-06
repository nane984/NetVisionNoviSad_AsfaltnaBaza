/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbService;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author branko.scekic
 */
public class VozacService {

    private final EntityManagerFactory emf;

    public VozacService(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public List<dbOld.Vozac> getVozaci() {
        try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT v FROM Vozac v ORDER BY v.vozac ASC");
            List<dbOld.Vozac> result = q.getResultList();
            em.close();
            return result;
        } catch (Exception ex) {
            List<dbOld.Vozac> result = new ArrayList<>();
            dbOld.Vozac vozac = new dbOld.Vozac();
            vozac.setId(1l);
            vozac.setVozac("");
            vozac.setAktivan(true);
            result.add(vozac);
            return result;
        }

    }
    
     public dbOld.Vozac getVozac(int ida) {
        try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT v FROM Vozac v WHERE v.id=:id ORDER BY v.vozac ASC");
            q.setParameter("id", ida);
            //Query q = em.createNamedQuery("Vozac.findById").setParameter("id",ida);
            dbOld.Vozac result = (dbOld.Vozac) q.getSingleResult();
            em.close();
            return result;
        } catch (Exception ex) {
            System.out.println(ex);
            dbOld.Vozac vozac = new dbOld.Vozac();
            vozac.setId(100l);
            vozac.setVozac("");
            vozac.setAktivan(true);
            return vozac;
        }
    }
     
     public dbOld.Vozac getVozac(String vozac) {
        try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT v FROM Vozac v WHERE v.vozac=:vozac AND v.aktivan=true ORDER BY v.vozac ASC");
            //Query q = em.createNamedQuery("Vozac.findByVozac").setParameter(vozac, vozac);
            q.setParameter("vozac", vozac);
            dbOld.Vozac result = (dbOld.Vozac) q.getSingleResult();
            em.close();
            return result;
        } catch (Exception ex) {
            dbOld.Vozac voz = new dbOld.Vozac();
            voz.setId(100l);
            voz.setVozac("");
            voz.setAktivan(true);
            return voz;
        }
    }

    public void addVozac(String vozacType) {
        try {
            dbOld.Vozac vozac = new dbOld.Vozac();

            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            vozac.setVozac(vozacType);
            vozac.setAktivan(true);

            em.persist(vozac);
            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(null, "Dodali ste vozaca", "Obavestenje",1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Doslo je do greske, pokusajte ponovo da dodate vozaca", "Obavestenje",0);
        }
    }
    
     public void deleteVozac(long id){
         try {
            EntityManager em = emf.createEntityManager();
            dbOld.Vozac p = em.find(dbOld.Vozac.class, id);
            em.getTransaction().begin();
            p.setAktivan(false);
            em.persist(p);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
