/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author branko.scekic
 */
public class SarzaService{

    private final EntityManagerFactory emf;


    public SarzaService(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
     public void addSarza(db.Otprema otprema, 
            int zadato0_32,   int izdato0_32,
            int zadato0_4,   int izdato0_4,
            int zadato4_8,   int izdato4_8, 
            int zadato8_11,  int izdato8_11, 
            int zadato11_16, int izdato11_16,
            int zadato16_22, int izdato16_22,
            int zadato16_32, int izdato16_32,
            int zadatoFilerKupovni, int izdatoFilerKupovni,
            int zadatoFilerSopstveni, int izdatoFilerSopstveni,
            int zadatoBitumen, int izdatoBitumen,
            int zadatoRAsfalt, int izdatoRAsfalt) {
        try {
            db.Sarza sarza = new db.Sarza();
            Date localDate = new Date();

            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            sarza.setOtprema(otprema);

            sarza.setAgregatzadato032(zadato0_32);
            sarza.setAgregatizdato032(izdato0_32);
            sarza.setAgregatzadato04(zadato0_4);
            sarza.setAgregaizdato04(izdato0_4);
            sarza.setAgregatzadato48(zadato4_8);
            sarza.setAgregatizdato48(izdato4_8);
            sarza.setAgregatzadato811(zadato8_11);
            sarza.setAgregatizdato811(izdato8_11);
            sarza.setAgregatzadato1116(zadato11_16);
            sarza.setAgregatizdato1116(izdato11_16);
            sarza.setAgregatzadato1622(zadato16_22);
            sarza.setAgregatizdato1622(izdato16_22);
            sarza.setAgregatzadato1632(zadato16_32);
            sarza.setAgregatizdato1632(izdato16_32);
            sarza.setFilerkupovnizadato(zadatoFilerKupovni);
            sarza.setFilerkupovniizdato(izdatoFilerKupovni);
            sarza.setFilersopstvenizadato(zadatoFilerSopstveni);
            sarza.setFilersopstveniizdato(izdatoFilerSopstveni);
            sarza.setBitumenzadato(zadatoBitumen);
            sarza.setBitumenizdato(izdatoBitumen);
            sarza.setRasfaltzadato(zadatoRAsfalt);
            sarza.setRasfaltizdato(izdatoRAsfalt);

            sarza.setDate(localDate);

            em.persist(sarza);
            em.getTransaction().commit();
            em.close();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }

    }

     
    public List<db.Sarza> getSarzeZaOtpremu(long otprema) {
       try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT s FROM Sarza s WHERE s.otprema.id = :otprema");
            q.setParameter("otprema", otprema);
            List<db.Sarza> result = q.getResultList();
            em.close();
            return result;
        } catch (Exception ex) {
            db.Sarza a = new db.Sarza();
            List<db.Sarza> result = new ArrayList<>();
            result.add(a);
            System.out.println(ex);
            return result;
        }
    }
    /*
    public dbOld.Sarza getLastSarzeZaOtpremu(long otprema) {
       try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT s FROM Sarza s WHERE s.otprema.id = :otprema ORDER BY s.date ASC");
            q.setParameter("otprema", otprema);
            List<dbOld.Sarza> result = q.getResultList();
            em.close();
            dbOld.Sarza sar = new dbOld.Sarza();;
            int i=1;
            for(dbOld.Sarza sarza : result){ 
                if(i== result.size()){
                    sar=sarza;
                }
                i++;
            }
            return sar;
        } catch (Exception ex) {
            dbOld.Sarza a = new dbOld.Sarza();
            return a;
        }
    }
    
    public List<dbOld.Sarza> getSarzeZaRadniNalog(long radniNalog){
        try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT s FROM Sarza s WHERE s.radninalog.rn = :radniNalog");
            q.setParameter("radniNalog", radniNalog);
            List<dbOld.Sarza> result = q.getResultList();
            em.close();
            return result;
        } catch (Exception ex) {
            dbOld.Sarza a = new dbOld.Sarza();
            List<dbOld.Sarza> result = new ArrayList<>();
            result.add(a);
            return result;
        }
    }
    
    public List<dbOld.Sarza> getSarzeZaRadniNalogIOtpremu(long radniNalog, long otpremaId){
        try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT s FROM Sarza s WHERE s.radninalog.rn = :radniNalog AND s.otprema.id = :otprema ORDER BY s.id");
            q.setParameter("radniNalog", radniNalog);
            q.setParameter("otprema", otpremaId);
            List<dbOld.Sarza> result = q.getResultList();
            em.close();
            return result;
        } catch (Exception ex) {
            dbOld.Sarza a = new dbOld.Sarza();
            List<dbOld.Sarza> result = new ArrayList<>();
            result.add(a);
            return result;
        }
    }
   */
}
