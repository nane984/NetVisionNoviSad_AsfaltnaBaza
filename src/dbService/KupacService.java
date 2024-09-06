/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbService;

import java.math.BigInteger;
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
public class KupacService {

    private final EntityManagerFactory emf;

    public KupacService(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public List<dbOld.Kupac> getKupci() {
        try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT k FROM Kupac k ORDER BY k.kupac ASC");
            List<dbOld.Kupac> result = q.getResultList();
            em.close();
            return result;
        } catch (Exception ex) {
            List<dbOld.Kupac> result = new ArrayList<>();
            dbOld.Kupac kupac = new dbOld.Kupac();
            kupac.setId(1l);
            kupac.setKupac("");
            kupac.setAktivan(true);
             kupac.setMb(BigInteger.valueOf(0));
            kupac.setPib(BigInteger.valueOf(0));
            kupac.setAdresa("");
            result.add(kupac);
            
            return result;
        }
    }
    
    public dbOld.Kupac getKupac(int id){
         try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT k FROM Kupac k WHERE k.id = :id");
            q.setParameter("id", id);

            dbOld.Kupac res = (dbOld.Kupac) q.getSingleResult();
            em.close();

            return res;
        } catch (Exception ex) {
            dbOld.Kupac kupac = new dbOld.Kupac();
            kupac.setId(100l);
            kupac.setAktivan(false);
            kupac.setKupac("");
            kupac.setMb(BigInteger.valueOf(0));
            kupac.setPib(BigInteger.valueOf(0));
            kupac.setAdresa("");
            return kupac;
        }
    }
    
    public dbOld.Kupac getKupac(String kupac, String mb){
         try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT k FROM Kupac k WHERE k.kupac = :kupac AND k.mb = :mb");
            q.setParameter("kupac", kupac);
            q.setParameter("mb", mb);

            dbOld.Kupac res = (dbOld.Kupac) q.getSingleResult();
            em.close();

            return res;
        } catch (Exception ex) {
            dbOld.Kupac kupacNew = new dbOld.Kupac();
            kupacNew.setId(100l);
            kupacNew.setAktivan(false);
            kupacNew.setKupac("");
            kupacNew.setMb(BigInteger.valueOf(0));
            kupacNew.setPib(BigInteger.valueOf(0));
            kupacNew.setAdresa("");
            return kupacNew;
        }
    }
    
    public dbOld.Kupac getKupac(String kup){
         try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT k FROM Kupac k WHERE k.kupac = :kupac AND k.aktivan=true");
            q.setParameter("kupac", kup);
            dbOld.Kupac res = (dbOld.Kupac) q.getSingleResult();
            em.close();

            return res;
        } catch (Exception ex) {
            dbOld.Kupac kupacNew = new dbOld.Kupac();
            kupacNew.setId(100l);
            kupacNew.setAktivan(false);
            kupacNew.setKupac("");
            kupacNew.setMb(BigInteger.valueOf(0));
            kupacNew.setPib(BigInteger.valueOf(0));
            kupacNew.setAdresa("");
            return kupacNew;
        }
    }
    
    public void deleteKupac(long id){
         try {
            EntityManager em = emf.createEntityManager();
            dbOld.Kupac p = em.find(dbOld.Kupac.class, id);
            em.getTransaction().begin();

            p.setAktivan(false);
            em.persist(p);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addKupac(String newKupac, long MB, long PIB, String adresa) {

        try {
            dbOld.Kupac kupac = new dbOld.Kupac();

            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            kupac.setKupac(newKupac);
            kupac.setAktivan(true);
            kupac.setMb(BigInteger.valueOf(MB));
            kupac.setPib(BigInteger.valueOf(PIB));
            kupac.setAdresa(adresa);
            em.persist(kupac);
            em.getTransaction().commit();
            em.close();
            getKupci();
            JOptionPane.showMessageDialog(null, "Dodali ste kupca", "Obavestenje", 1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Doslo je do greske, pokusajte ponovo da dodate kupca", "Obavestenje", 0);
            //JOptionPane.showMessageDialog(null, ex);
        }
    }
}