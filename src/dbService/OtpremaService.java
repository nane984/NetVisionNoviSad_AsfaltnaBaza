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
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author branko.scekic
 */
public class OtpremaService{

    private final EntityManagerFactory emf;


    public OtpremaService(EntityManagerFactory emf) {
        this.emf = emf;
    }


    public void addOprema(String receptura, String vozac, String vozilo, String gradiliste, String kupac, int zadataKolicina) {
        try {
            
            db.Otprema otprema = new db.Otprema();
            Date localDate = new Date();

            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            otprema.setDatum(localDate);
            otprema.setVozac(vozac);
            otprema.setVozilo(vozilo);
            otprema.setGradiliste(gradiliste);
            otprema.setKupac(kupac);
            otprema.setZadatokg(zadataKolicina);
            otprema.setIzdatokg(0);
            otprema.setReceptura(receptura);
            otprema.setPovrat(0);

            em.persist(otprema);
            em.getTransaction().commit();

            em.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Proverite broj radnog naloga", "Dialog", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public db.Otprema getOtprema(long brOtp) {
        
        try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT o FROM Otprema o WHERE o.id = :brOtp");
            q.setParameter("brOtp", brOtp);
            db.Otprema result = (db.Otprema) q.getSingleResult();
            em.close();

            return result;
                
        } catch (Exception ex) {
            db.Otprema a = new db.Otprema();
            return a;
        }
    }
    
    public db.Otprema getLastOtprema() {
        
        try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT o FROM Otprema o ORDER BY o.id DESC");
           
            List<db.Otprema> result = q.getResultList();
            em.close();

            return result.get(0);
                
        } catch (Exception ex) {
            db.Otprema a = new db.Otprema();
            return a;
        }
    }
    
    public List<db.Otprema> getOtpreme() {
        
        try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT o FROM Otprema o ORDER BY o.id");
           
            List<db.Otprema> result = q.getResultList();
            em.close();

            return result;
                
        } catch (Exception ex) {
            db.Otprema a = new db.Otprema();
            List<db.Otprema> b = new ArrayList<>();
            b.add(a);
            return b;
        }
    }
    
    public List<String> getMarkeAsfalta() {
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT DISTINCT o.receptura FROM Otprema o ORDER BY o.receptura");
        //Query q = em.createNamedQuery("Markabetona.findAll");
        List<String> result = q.getResultList();
        em.close();

        return result;
    }
    
     public List<String> getKupci() {

        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT DISTINCT o.kupac FROM Otprema o ORDER BY o.kupac");
        //Query q = em.createNamedQuery("Markabetona.findAll");
        List<String> result = q.getResultList();
        em.close();

        return result;
    }
     
    public List<String> getGradilista() {

        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT DISTINCT o.gradiliste FROM Otprema o ORDER BY o.gradiliste");
        //Query q = em.createNamedQuery("Markabetona.findAll");
        List<String> result = q.getResultList();
        em.close();

        return result;
    }
    
    public List<db.Otprema> getFilteredData(
            String filterOtprema, 
            String filterKupac, String filterGradiliste, String filterMarkaAsfalta,
            String filterDatumOd, String filterDatumDo) {
        List<db.Otprema> result;
        try {
            EntityManager em = emf.createEntityManager();
            Query q;

            DateFormat formatMyComp = new SimpleDateFormat("dd MMM yyyy", Locale.ROOT);
////////////////////VAZNOOO KADA SE SPUSTA U VALJEVU PROMENITI FORMAT ///////////////////////////////////////////////////////////////////////////////////////////////////////////            
            //SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");//ovo funkcionise kod njih za format month/day/year
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");//ovo je na mom pc
            
            
            Date dateOd;
            Date dateDo;

            if (!filterDatumOd.isEmpty()) {
                dateOd = sdf.parse(filterDatumOd);

            } else {
                dateOd = formatMyComp.parse("01 jan 2000  00:01:00");
            }

            if (!filterDatumDo.isEmpty()) {
                dateDo = sdf.parse(filterDatumDo);

            } else {
                dateDo = formatMyComp.parse("01 jan 2040  23:59:00");
            }

            if (!filterOtprema.isEmpty()) {
                q = em.createQuery("SELECT o FROM Otprema o WHERE o.id = :id");
                q.setParameter("id", Integer.parseInt(filterOtprema));

            } else {
                
                //kupac i gradiliste su null pa zato imam problem. Kad oni budu imali neki rezultat ukljucicemo ih.

                    //q = em.createQuery("SELECT o FROM Otprema o WHERE o.kupac LIKE :kupac AND o.gradiliste LIKE :gradiliste AND o.receptura LIKE :markaasfalta "
                        //    + "AND o.datum >= :datumOd AND o.datum <= :datumDo ORDER BY o.datum DESC");
        
                    q = em.createQuery("SELECT o FROM Otprema o WHERE o.receptura LIKE :markaasfalta "
                            + "AND o.datum >= :datumOd AND o.datum <= :datumDo ORDER BY o.datum DESC");
                        
                    //q.setParameter("kupac", "%" + filterKupac + "%");
                    //q.setParameter("gradiliste", "%" + filterGradiliste + "%");
                    q.setParameter("markaasfalta", "%" + filterMarkaAsfalta + "%");
                    q.setParameter("datumOd", dateOd);
                    q.setParameter("datumDo", dateDo);
                
            }

            //System.out.println(filterKupac+" "+filterGradiliste+" "+filterMarkaAsfalta);
            
            result = q.getResultList();
            em.close();

            return result;

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(new JFrame(), ex);
            result = new ArrayList<>();
        }
        return result;

    }
}
