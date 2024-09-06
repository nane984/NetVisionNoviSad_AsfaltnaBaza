/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbService;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author branko.scekic
 */
public class ZbirniParametriService {

    private final EntityManagerFactory emf;
    private List<db.Zbirniparametri> result;
    public ZbirniParametriService(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public List<db.Zbirniparametri> getZbirniParametri() {
        EntityManager em = emf.createEntityManager();
        //Query q = em.createQuery("SELECT z FROM Zbirniparametri z");
        Query q = em.createNamedQuery("Zbirniparametri.findAll");
        result = q.getResultList();
        em.close();
        return result;
    }

   

    public void saveZbirniParametri(double VremeSmirivanjaVageFrakcije, double VremePraznjenjaVageFrakcije, double AOParametriVremePraznjenjaKoseTrake,
            double AOParametriKontrolnoVremeKoseTrake, double AOParametriZadrskaNaDoziranjeVode, double AOParametriZadrskaNaDoziranjeCementa,
            double AOParametriVremeMesanjaMaterijala, double AOParametriPocetnoOtvaranjeMesalice, double AOParametriVremePocetnogPraznjenjaMesalice,
            double AOParametriVremeKonacnogPraznjenjaMesalice, double AOParametriVremeIspiranjaVageAditiva, double AOParametriPauzaFluidizacije,
            double AOParametriRadFluidizacije, int AOParametriKapacitetMesalice, double AOParametriZadrskaNaStartKoseTrake,
            double AOParametriVremeSmirivanjaVageAditiva, double AOParametriVremeSmirivanjaVageCementa) {

        try {
            Long a = 1l;
            EntityManager em = emf.createEntityManager();
            db.Zbirniparametri zp = em.find(db.Zbirniparametri.class, a);
            em.getTransaction().begin();

            zp.setVremesmirivanjavagefrakcije(VremeSmirivanjaVageFrakcije);
            zp.setVremepraznjenjavagefrakcije(VremePraznjenjaVageFrakcije);
            zp.setVremepraznjenjakosetrake(AOParametriVremePraznjenjaKoseTrake);
            zp.setKontrolnovremekosetrake(AOParametriKontrolnoVremeKoseTrake);
            zp.setZadrskanadoziranjevode(AOParametriZadrskaNaDoziranjeVode);
            zp.setZadrskanadoziranjecementa(AOParametriZadrskaNaDoziranjeCementa);
            zp.setVrememesanjamaterijala(AOParametriVremeMesanjaMaterijala);
            zp.setPocetnootvaranjemesalice(AOParametriPocetnoOtvaranjeMesalice);
            zp.setVremepocetnogpraznjenjamesalice(AOParametriVremePocetnogPraznjenjaMesalice);
            zp.setVremekonacnogpraznjenjamesalice(AOParametriVremeKonacnogPraznjenjaMesalice);
            zp.setVremeispiranjavageaditiva(AOParametriVremeIspiranjaVageAditiva);
            zp.setPauzafluidizacije(AOParametriPauzaFluidizacije);
            zp.setRadfluidizacije(AOParametriRadFluidizacije);
            zp.setKapacitetmesalice(AOParametriKapacitetMesalice);
            zp.setZadrskanastartkosetrake(AOParametriZadrskaNaStartKoseTrake);
            zp.setVremesmirivanjavageaditiva(AOParametriVremeSmirivanjaVageAditiva);
            zp.setVremesmirivanjavagecementa(AOParametriVremeSmirivanjaVageCementa);

            em.persist(zp);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            try {
                EntityManager em = emf.createEntityManager();
                db.Zbirniparametri zp = new db.Zbirniparametri();
                em.getTransaction().begin();
                Long id = 1l;
                zp.setId(id);
                zp.setVremesmirivanjavagefrakcije(VremeSmirivanjaVageFrakcije);
                zp.setVremepraznjenjavagefrakcije(VremePraznjenjaVageFrakcije);
                zp.setVremepraznjenjakosetrake(AOParametriVremePraznjenjaKoseTrake);
                zp.setKontrolnovremekosetrake(AOParametriKontrolnoVremeKoseTrake);
                zp.setZadrskanadoziranjevode(AOParametriZadrskaNaDoziranjeVode);
                zp.setZadrskanadoziranjecementa(AOParametriZadrskaNaDoziranjeCementa);
                zp.setVrememesanjamaterijala(AOParametriVremeMesanjaMaterijala);
                zp.setPocetnootvaranjemesalice(AOParametriPocetnoOtvaranjeMesalice);
                zp.setVremepocetnogpraznjenjamesalice(AOParametriVremePocetnogPraznjenjaMesalice);
                zp.setVremekonacnogpraznjenjamesalice(AOParametriVremeKonacnogPraznjenjaMesalice);
                zp.setVremeispiranjavageaditiva(AOParametriVremeIspiranjaVageAditiva);
                zp.setPauzafluidizacije(AOParametriPauzaFluidizacije);
                zp.setRadfluidizacije(AOParametriRadFluidizacije);
                zp.setKapacitetmesalice(AOParametriKapacitetMesalice);
                zp.setZadrskanastartkosetrake(AOParametriZadrskaNaStartKoseTrake);
                zp.setVremesmirivanjavageaditiva(AOParametriVremeSmirivanjaVageAditiva);
                zp.setVremesmirivanjavagecementa(AOParametriVremeSmirivanjaVageCementa);

                em.persist(zp);
                em.getTransaction().commit();
                em.close();
            } catch (Exception ex) {
                System.out.println("_______________________________________");
                System.out.println(ex);
            }
        }

    }
}
