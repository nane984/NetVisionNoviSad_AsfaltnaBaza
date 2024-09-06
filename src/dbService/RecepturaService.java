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

/**
 *
 * @author Branko
 */
public class RecepturaService {
    private final EntityManagerFactory emf;

    public RecepturaService(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public List<db.Receptura> getReceptiOrderByRecepti() {
        try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT r FROM Receptura r ORDER BY r.receptura ASC");
            List<db.Receptura> result = q.getResultList();
            em.close();
            return result;
        } catch (Exception ex) {
            System.out.println(ex);
            List<db.Receptura> result = new ArrayList<>();
            db.Receptura markabetona = getNulaValue(0);
            result.add(markabetona);
            return result;
        }
    }
    
    public List<db.Receptura> getReceptiOrderId() {
        try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT r FROM Receptura r ORDER BY r.id ASC");
            List<db.Receptura> result = q.getResultList();
            em.close();
            return result;
        } catch (Exception ex) {
            System.out.println(ex);
            List<db.Receptura> result = new ArrayList<>();
            db.Receptura markabetona = getNulaValue(0);
            result.add(markabetona);
            return result;
        }
    }
    
     public db.Receptura getRecept(long id) {
        try {
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT r FROM Receptura r WHERE r.id = :id");
            q.setParameter("id", id);

            db.Receptura res = (db.Receptura) q.getSingleResult();
            em.close();

            return res;
        } catch (Exception ex) {
            db.Receptura markabetona = getNulaValue(id);
            return markabetona;
        }
    }
     
    private db.Receptura getNulaValue(long id){
        db.Receptura markabetona = new db.Receptura();
            markabetona.setId(id);
            markabetona.setReceptura("-");
            markabetona.setFrakcija1(0);
            markabetona.setFrakcija2(0);
            markabetona.setFrakcija3(0);
            markabetona.setFrakcija4(0);
            markabetona.setFrakcija5(0);
            markabetona.setFrakcija6(0);
            markabetona.setFrakcija7(0);
            markabetona.setDozator1(0);
            markabetona.setDozator2(0);
            markabetona.setDozator3(0);
            markabetona.setDozator4(0);
            markabetona.setDozator5(0);
            markabetona.setDozator6(0);
            markabetona.setDozator7(0);
            markabetona.setDozator8(0);
            markabetona.setDozator9(0);
            markabetona.setDozator10(0);
            markabetona.setDozator11(0);
            markabetona.setBitumen(0);
            markabetona.setKupfiler(0);
            markabetona.setSopfiler(0);
                       
            return markabetona;
    }
    
    public void setRecept(long id, String recepta, 
            int frakcija1, int frakcija2, int frakcija3,
            int frakcija4, int frakcija5, int frakcija6,
            int frakcija7, int filerKup, int filerSop, int bitumen, 
            int dozator1, int dozator2, int dozator3, int dozator4,
            int dozator5, int dozator6, int dozator7, int dozator8,
            int dozator9, int dozator10, int dozator11) {

        try {
            EntityManager em = emf.createEntityManager();
            db.Receptura p = em.find(db.Receptura.class, id);
            em.getTransaction().begin();
            p.setReceptura(recepta);
            p.setFrakcija1(frakcija1);
            p.setFrakcija2(frakcija2);
            p.setFrakcija3(frakcija3);
            p.setFrakcija4(frakcija4);
            p.setFrakcija5(frakcija5);
            p.setFrakcija6(frakcija6);
            p.setFrakcija7(frakcija7);
            p.setKupfiler(filerKup);
            p.setSopfiler(filerSop);
            p.setBitumen(bitumen);
            p.setDozator1(dozator1);
            p.setDozator2(dozator2);
            p.setDozator3(dozator3);
            p.setDozator4(dozator4);
            p.setDozator5(dozator5);
            p.setDozator6(dozator6);
            p.setDozator7(dozator7);
            p.setDozator8(dozator8);
            p.setDozator9(dozator9);
            p.setDozator10(dozator10);
            p.setDozator11(dozator11);
           
            em.persist(p);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            EntityManager em = emf.createEntityManager();
            db.Receptura p = new db.Receptura();
            em.getTransaction().begin();
            p.setId(id);
             p.setReceptura(recepta);
            p.setFrakcija1(frakcija1);
            p.setFrakcija2(frakcija2);
            p.setFrakcija3(frakcija3);
            p.setFrakcija4(frakcija4);
            p.setFrakcija5(frakcija5);
            p.setFrakcija6(frakcija6);
            p.setFrakcija7(frakcija7);
            p.setKupfiler(filerKup);
            p.setSopfiler(filerSop);
            p.setBitumen(bitumen);
            p.setDozator1(dozator1);
            p.setDozator2(dozator2);
            p.setDozator3(dozator3);
            p.setDozator4(dozator4);
            p.setDozator5(dozator5);
            p.setDozator6(dozator6);
            p.setDozator7(dozator7);
            p.setDozator8(dozator8);
            p.setDozator9(dozator9);
            p.setDozator10(dozator10);
            p.setDozator11(dozator11);
            
            em.persist(p);
            em.getTransaction().commit();
            em.close();
        }
    }
    
    
    
    public void setReceptPreddozatori(long id,  
            int dozator1, int dozator2, int dozator3, int dozator4,
            int dozator5, int dozator6, int dozator7, int dozator8,
            int dozator9, int dozator10, int dozator11) {

        try {
            EntityManager em = emf.createEntityManager();
            db.Receptura p = em.find(db.Receptura.class, id);
            em.getTransaction().begin();
            p.setDozator1(dozator1);
            p.setDozator2(dozator2);
            p.setDozator3(dozator3);
            p.setDozator4(dozator4);
            p.setDozator5(dozator5);
            p.setDozator6(dozator6);
            p.setDozator7(dozator7);
            p.setDozator8(dozator8);
            p.setDozator9(dozator9);
            p.setDozator10(dozator10);
            p.setDozator11(dozator11);
           
            em.persist(p);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            EntityManager em = emf.createEntityManager();
            db.Receptura p = new db.Receptura();
            em.getTransaction().begin();
            p.setId(id);
            p.setDozator1(dozator1);
            p.setDozator2(dozator2);
            p.setDozator3(dozator3);
            p.setDozator4(dozator4);
            p.setDozator5(dozator5);
            p.setDozator6(dozator6);
            p.setDozator7(dozator7);
            p.setDozator8(dozator8);
            p.setDozator9(dozator9);
            p.setDozator10(dozator10);
            p.setDozator11(dozator11);
            
            em.persist(p);
            em.getTransaction().commit();
            em.close();
        }
    }
}
