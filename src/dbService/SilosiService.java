/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author branko.scekic
 */
public class SilosiService {

    private final EntityManagerFactory emf;

    public SilosiService(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void setKolicina(int brSilosa, double stanje, double unos, String silosOpis) {

        try {
            dbOld.Silosi silos = new dbOld.Silosi();
            Date localDate = new Date();

            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            silos.setBrsilosa(brSilosa);
            silos.setStanje((long) stanje);
            silos.setUnos((long) unos);
            silos.setDatum(localDate);
            silos.setOpissilosa(silosOpis);
            silos.setNulirano(false);

            em.persist(silos);
            em.getTransaction().commit();
            em.close();
            //JOptionPane.showMessageDialog(null, "Dodali ste kupca", "Obavestenje", 1);
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Doslo je do greske, pokusajte ponovo da dodate kupca", "Obavestenje", 0);
            //JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void nuliraj(int brSilosa, String silosOpis) {

        try {
            dbOld.Silosi silos = new dbOld.Silosi();
            Date localDate = new Date();

            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            silos.setBrsilosa(brSilosa);
            silos.setStanje(0);
            silos.setUnos(0);
            silos.setDatum(localDate);
            silos.setOpissilosa(silosOpis);
            silos.setNulirano(true);

            em.persist(silos);
            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(null, "Nulirali ste silos", "Obavestenje", 1);
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Doslo je do greske, pokusajte ponovo da dodate kupca", "Obavestenje", 0);
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public List<dbOld.Silosi> getSilosi(int brSil, String datumOd, String datumDo) {

        List<dbOld.Silosi> result;

        try {

            EntityManager em = emf.createEntityManager();
            Query q;

            DateFormat formatMyComp = new SimpleDateFormat("dd MMM yyyy", Locale.ROOT);
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

            Date dateOd;
            Date dateDo;

            if (!datumOd.isEmpty()) {
                dateOd = sdf.parse(datumOd);

                //System.out.println(datumOd + " ovo je neparsirano");
                //System.out.println(dateOd + " ovo je parsirano");
            } else {
                dateOd = formatMyComp.parse("01 jan 2000  00:01:00");
            }

            if (!datumDo.isEmpty()) {
                dateDo = sdf.parse(datumDo);

            } else {
                dateDo = formatMyComp.parse("01 jan 2040  23:59:00");
            }
            if (brSil == 0) {
                q = em.createQuery("SELECT s FROM Silosi s WHERE s.datum >= :datumOd AND s.datum <= :datumDo ORDER BY s.datum ASC");
                q.setParameter("datumOd", dateOd);
                q.setParameter("datumDo", dateDo);
            } else {
                q = em.createQuery("SELECT s FROM Silosi s WHERE s.brsilosa= :brSil AND s.datum >= :datumOd AND s.datum <= :datumDo ORDER BY s.datum ASC");
                q.setParameter("datumOd", dateOd);
                q.setParameter("datumDo", dateDo);
                q.setParameter("brSil", brSil);
            }

            result = q.getResultList();
            
            for(int i = 0; i<result.size(); i++){
                result.get(i).setNulirano(Optional.ofNullable(result.get(i).getNulirano()).orElseGet(() -> false));
            }
            
            em.close();

            return result;

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex);
            result = new ArrayList<>();
        }
        return result;
    }
    
    public dbOld.Silosi getSilosCement1() {

        List<dbOld.Silosi> result;

        try {
            EntityManager em = emf.createEntityManager();
            Query q;
            q = em.createQuery("SELECT s FROM Silosi s WHERE s.brsilosa = 1 ORDER BY s.datum DESC");
            
            result = q.getResultList();
            em.close();
            
            for(int i = 0; i<result.size(); i++){
                result.get(i).setNulirano(Optional.ofNullable(result.get(i).getNulirano()).orElseGet(() -> false));
            }
            
            return result.get(0);

        } catch (Exception ex) {
            dbOld.Silosi si = new dbOld.Silosi();
            si.setBrsilosa(1);
            si.setStanje(0);
            si.setNulirano(false);
            result = new ArrayList<>();
            result.add(si);
        }
        return result.get(0);
    }
    
    public dbOld.Silosi getSilosCement2() {

        List<dbOld.Silosi> result;

        try {
            EntityManager em = emf.createEntityManager();
            Query q;
            q = em.createQuery("SELECT s FROM Silosi s WHERE s.brsilosa = 2 ORDER BY s.datum DESC");
            
            result = q.getResultList();
            em.close();
            
            for(int i = 0; i<result.size(); i++){
                result.get(i).setNulirano(Optional.ofNullable(result.get(i).getNulirano()).orElseGet(() -> false));
            }
            
            return result.get(0);

        } catch (Exception ex) {
            dbOld.Silosi si = new dbOld.Silosi();
            si.setBrsilosa(2);
            si.setStanje(0);
            si.setNulirano(false);
            result = new ArrayList<>();
            result.add(si);
        }
        return result.get(0);
    }
    
     public dbOld.Silosi getSilosAgregat04() {

        List<dbOld.Silosi> result;

        try {
            EntityManager em = emf.createEntityManager();
            Query q;
            q = em.createQuery("SELECT s FROM Silosi s WHERE s.brsilosa = 3 ORDER BY s.datum DESC");
            
            result = q.getResultList();
            em.close();
            
            for(int i = 0; i<result.size(); i++){
                result.get(i).setNulirano(Optional.ofNullable(result.get(i).getNulirano()).orElseGet(() -> false));
            }
            
            return result.get(0);

        } catch (Exception ex) {
            dbOld.Silosi si = new dbOld.Silosi();
            si.setBrsilosa(3);
            si.setStanje(0);
            si.setNulirano(false);
            result = new ArrayList<>();
            result.add(si);
        }
        return result.get(0);
    }
     
     public dbOld.Silosi getSilosAgregat48() {

        List<dbOld.Silosi> result;

        try {
            EntityManager em = emf.createEntityManager();
            Query q;
            q = em.createQuery("SELECT s FROM Silosi s WHERE s.brsilosa = 4 ORDER BY s.datum DESC");
            
            result = q.getResultList();
            em.close();
            
            for(int i = 0; i<result.size(); i++){
                result.get(i).setNulirano(Optional.ofNullable(result.get(i).getNulirano()).orElseGet(() -> false));
            }
            
            return result.get(0);

        } catch (Exception ex) {
            dbOld.Silosi si = new dbOld.Silosi();
            si.setBrsilosa(4);
            si.setStanje(0);
            si.setNulirano(false);
            result = new ArrayList<>();
            result.add(si);
        }
        return result.get(0);
    }
     
     public dbOld.Silosi getSilosAgregat816() {

        List<dbOld.Silosi> result;

        try {
            EntityManager em = emf.createEntityManager();
            Query q;
            q = em.createQuery("SELECT s FROM Silosi s WHERE s.brsilosa = 5 ORDER BY s.datum DESC");
            
            result = q.getResultList();
            em.close();
            
            for(int i = 0; i<result.size(); i++){
                result.get(i).setNulirano(Optional.ofNullable(result.get(i).getNulirano()).orElseGet(() -> false));
            }
            
            return result.get(0);

        } catch (Exception ex) {
            dbOld.Silosi si = new dbOld.Silosi();
            si.setBrsilosa(5);
            si.setStanje(0);
            si.setNulirano(false);
            result = new ArrayList<>();
            result.add(si);
        }
        return result.get(0);
    }
     
     public dbOld.Silosi getSilosAditiv1() {

        List<dbOld.Silosi> result;

        try {
            EntityManager em = emf.createEntityManager();
            Query q;
            q = em.createQuery("SELECT s FROM Silosi s WHERE s.brsilosa = 6 ORDER BY s.datum DESC");
            
            result = q.getResultList();
            em.close();
            
            for(int i = 0; i<result.size(); i++){
                result.get(i).setNulirano(Optional.ofNullable(result.get(i).getNulirano()).orElseGet(() -> false));
            }
            
            return result.get(0);

        } catch (Exception ex) {
            dbOld.Silosi si = new dbOld.Silosi();
            si.setBrsilosa(6);
            si.setStanje(0);
            si.setNulirano(false);
            result = new ArrayList<>();
            result.add(si);
        }
        return result.get(0);
    }
     
      public dbOld.Silosi getSilosAditiv2() {

        List<dbOld.Silosi> result;

        try {
            EntityManager em = emf.createEntityManager();
            Query q;
            q = em.createQuery("SELECT s FROM Silosi s WHERE s.brsilosa = 7 ORDER BY s.datum DESC");
            
            result = q.getResultList();
            em.close();
            
            for(int i = 0; i<result.size(); i++){
                result.get(i).setNulirano(Optional.ofNullable(result.get(i).getNulirano()).orElseGet(() -> false));
            }
            
            return result.get(0);

        } catch (Exception ex) {
            dbOld.Silosi si = new dbOld.Silosi();
            si.setBrsilosa(7);
            si.setStanje(0);
            si.setNulirano(false);
            result = new ArrayList<>();
            result.add(si);
        }
        return result.get(0);
    }
      
       public dbOld.Silosi getSilosAditiv3() {

        List<dbOld.Silosi> result;

        try {
            EntityManager em = emf.createEntityManager();
            Query q;
            q = em.createQuery("SELECT s FROM Silosi s WHERE s.brsilosa = 8 ORDER BY s.datum DESC");
            
            result = q.getResultList();
            em.close();
            
            for(int i = 0; i<result.size(); i++){
                result.get(i).setNulirano(Optional.ofNullable(result.get(i).getNulirano()).orElseGet(() -> false));
            }
            
            return result.get(0);

        } catch (Exception ex) {
            dbOld.Silosi si = new dbOld.Silosi();
            si.setBrsilosa(8);
            si.setStanje(0);
            si.setNulirano(false);
            result = new ArrayList<>();
            result.add(si);
        }
        return result.get(0);
    }
     
}
