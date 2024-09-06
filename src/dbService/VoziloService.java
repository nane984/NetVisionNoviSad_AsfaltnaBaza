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
public class VoziloService {

    private final EntityManagerFactory emf;


    public VoziloService(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public List<dbOld.Vozilo> getVozilaZaVozaca(dbOld.Vozac vozac) {
        try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT v FROM Vozilo v WHERE v.idvozac=:vozac ORDER BY v.tablica ASC");
            q.setParameter("vozac", vozac.getId().intValue());
            List<dbOld.Vozilo> result = q.getResultList();
            em.close();
            return result;
        } catch (Exception ex) {
            List<dbOld.Vozilo> result = new ArrayList<>();
            dbOld.Vozilo vozilo = new dbOld.Vozilo();
            vozilo.setId(0l);
            vozilo.setGaraznibroj("");
            vozilo.setAkivan(true);
            result.add(vozilo);
            return result;
        }
    }
    
    public List<dbOld.Vozilo> getVozila() {
        try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT v FROM Vozilo v ORDER BY v.tablica ASC");
            List<dbOld.Vozilo> result = q.getResultList();
            em.close();
            return result;
        } catch (Exception ex) {
            List<dbOld.Vozilo> result = new ArrayList<>();
            dbOld.Vozilo vozilo = new dbOld.Vozilo();
            vozilo.setId(0l);
            vozilo.setGaraznibroj("");
            vozilo.setAkivan(true);
            result.add(vozilo);
            return result;
        }
    }

    public void addVozilo(String tablice, String garazni, dbOld.Vozac vozac) {
        try {
            dbOld.Vozilo vozilo = new dbOld.Vozilo();

            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            vozilo.setTablica(tablice);
            vozilo.setGaraznibroj(garazni);
            vozilo.setIdvozac(vozac.getId());
            vozilo.setAkivan(true);

            em.persist(vozilo);
            em.getTransaction().commit();
            em.close();

            //getVozila();
            JOptionPane.showMessageDialog(null, "Dodali ste vozilo", "Obavestenje", 1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Doslo je do greske, pokusajte ponovo da dodate vozilo", "Obavestenje", 0);
        }
    }
    
     public void deleteVozilo(long id){
         try {
            EntityManager em = emf.createEntityManager();
            dbOld.Vozilo p = em.find(dbOld.Vozilo.class, id);
            em.getTransaction().begin();
            p.setAkivan(false);
            em.persist(p);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
