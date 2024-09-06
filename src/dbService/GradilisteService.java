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
public class GradilisteService {

    private final EntityManagerFactory emf;

    public GradilisteService(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public List<dbOld.Gradiliste> getGradiliste(dbOld.Kupci kupac) {
        try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT g FROM Gradiliste g WHERE g.kupacid =:kupac ORDER BY g.gradiliste ASC");
            q.setParameter("kupac", Long.parseLong(kupac.getSifrapartnera()));
            List<dbOld.Gradiliste> result = q.getResultList();
            em.close();
            return result;
        } catch (Exception ex) {
            List<dbOld.Gradiliste> result = new ArrayList<>();
            dbOld.Gradiliste gradiliste = new dbOld.Gradiliste();
            gradiliste.setId(1l);
            gradiliste.setGradiliste("");
            gradiliste.setAktivno(true);
            result.add(gradiliste);
            
            System.out.println(ex);
            return result;
        }

    }

    public void addGradiliste(String gradiliste, dbOld.Kupci kupac) {
        try {
            dbOld.Gradiliste gradilisteDb = new dbOld.Gradiliste();

            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            gradilisteDb.setGradiliste(gradiliste);
            gradilisteDb.setAktivno(true);
            gradilisteDb.setKupacid(Long.parseLong(kupac.getSifrapartnera()));
            
            em.persist(gradilisteDb);
            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(null, "Dodali ste gradiliste", "Obavestenje", 1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Doslo je do greske, pokusajte ponovo da dodate gradiliste", "Obavestenje", 0);
            System.out.println(ex);
        }
    }
    public void deleteGradiliste(long id){
         try {
            EntityManager em = emf.createEntityManager();
            dbOld.Gradiliste p = em.find(dbOld.Gradiliste.class, id);
            em.getTransaction().begin();

            p.setAktivno(false);
            em.persist(p);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}