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
public class KupciService {
    
    private final EntityManagerFactory emf;
    
    public KupciService(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
     public List<dbOld.Kupci> getKupci() {
        try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT k FROM Kupci k ORDER BY k.skraceninazivpartnera ASC");
            List<dbOld.Kupci> result = q.getResultList();
            em.close();
            return result;
        } catch (Exception ex) {
            List<dbOld.Kupci> result = new ArrayList<>();
            dbOld.Kupci kupci = new dbOld.Kupci();
            kupci.setSifrapartnera("");
            kupci.setMaticnibrojsudskogregistra("");
            kupci.setMesto("");
            kupci.setNazivdrzave("");
            kupci.setNazivmesta("");
            kupci.setPoreskiidentifikacionibroj("");
            kupci.setSkraceninazivpartnera("");
            kupci.setUlicaibroj("");
            kupci.setAktivan(true);        
            result.add(kupci);
            
            System.out.println(ex);
            return result;
        }
    }
     
     public dbOld.Kupci getKupacSifarnik(String id){
         try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT k FROM Kupci k WHERE k.sifrapartnera = :id");
            q.setParameter("id", id);

            dbOld.Kupci res = (dbOld.Kupci) q.getSingleResult();
            em.close();

            return res;
        } catch (Exception ex) {
            dbOld.Kupci kupci = new dbOld.Kupci();
            kupci.setSifrapartnera("");
            kupci.setMaticnibrojsudskogregistra("");
            kupci.setMesto("");
            kupci.setNazivdrzave("");
            kupci.setNazivmesta("");
            kupci.setPoreskiidentifikacionibroj("");
            kupci.setSkraceninazivpartnera("");
            kupci.setUlicaibroj("");
            kupci.setAktivan(true);
            return kupci;
        }
    }
     
     public dbOld.Kupci getKupac(String kupac, String ulica){
         try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT k FROM Kupci k WHERE k.skraceninazivpartnera = :kupac AND k.ulicaibroj = :ulica");
            q.setParameter("kupac", kupac);
            q.setParameter("ulica", ulica);

            dbOld.Kupci res = (dbOld.Kupci) q.getSingleResult();
            em.close();

            return res;
        } catch (Exception ex) {
            dbOld.Kupci kupci = new dbOld.Kupci();
            kupci.setSifrapartnera("");
            kupci.setMaticnibrojsudskogregistra("");
            kupci.setMesto("");
            kupci.setNazivdrzave("");
            kupci.setNazivmesta("");
            kupci.setPoreskiidentifikacionibroj("");
            kupci.setSkraceninazivpartnera("");
            kupci.setUlicaibroj("");
            kupci.setAktivan(true);
            return kupci;
        }
    }
     
     
     public dbOld.Kupci getAktivniKupac(String kup){
         try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT k FROM Kupci k WHERE k.skraceninazivpartnera = :kupac AND k.aktivan = true");
            q.setParameter("kupac", kup);
            dbOld.Kupci res = (dbOld.Kupci) q.getSingleResult();
            em.close();

            return res;
        } catch (Exception ex) {
            dbOld.Kupci kupci = new dbOld.Kupci();
            kupci.setSifrapartnera("");
            kupci.setMaticnibrojsudskogregistra("");
            kupci.setMesto("");
            kupci.setNazivdrzave("");
            kupci.setNazivmesta("");
            kupci.setPoreskiidentifikacionibroj("");
            kupci.setSkraceninazivpartnera("");
            kupci.setUlicaibroj("");
            kupci.setAktivan(true);
            
            System.out.println(kup + " " + ex);
            return kupci;
        }
    }
     
      public void deleteKupac(String id){
         try {
            EntityManager em = emf.createEntityManager();
            dbOld.Kupci p = em.find(dbOld.Kupci.class, id);
            em.getTransaction().begin();

            p.setAktivan(false);
            em.persist(p);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addKupac(String sifarnik,  String mb, String postanskiBrMesta,
            String drzava, String mesto, String pib, String imePartnera, String ulicaibroj) {

        try {
            dbOld.Kupci kupac = new dbOld.Kupci();

            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            kupac.setSifrapartnera(sifarnik);
            kupac.setAktivan(true);
            kupac.setMaticnibrojsudskogregistra(mb);
            kupac.setMesto(postanskiBrMesta);
            kupac.setNazivdrzave(drzava);
            kupac.setNazivmesta(mesto);
            kupac.setPoreskiidentifikacionibroj(pib);
            kupac.setSkraceninazivpartnera(imePartnera);
            kupac.setUlicaibroj(ulicaibroj);
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
    
    public void updateKupac(String sifarnik,  String mb, String postanskiBrMesta,
            String drzava, String mesto, String pib, String imePartnera, String ulicaibroj){
        try {           
            EntityManager em = emf.createEntityManager();
            dbOld.Kupci kupac = em.find(dbOld.Kupci.class, sifarnik);
            em.getTransaction().begin();

            
            kupac.setSifrapartnera(sifarnik);
            kupac.setAktivan(true);
            kupac.setMaticnibrojsudskogregistra(mb);
            kupac.setMesto(postanskiBrMesta);
            kupac.setNazivdrzave(drzava);
            kupac.setNazivmesta(mesto);

            kupac.setPoreskiidentifikacionibroj(pib);
            kupac.setSkraceninazivpartnera(imePartnera);
            kupac.setUlicaibroj(ulicaibroj);
            kupac.setAktivan(true);
            
            em.persist(kupac);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Doslo je do greske, pokusajte ponovo da sacuvate kupca", "Obavestenje", 0);
        }
    }
}
