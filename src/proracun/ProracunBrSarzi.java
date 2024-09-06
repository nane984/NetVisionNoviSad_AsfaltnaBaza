/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proracun;

import utils.Convert;

/**
 *
 * @author Branko
 */
public class ProracunBrSarzi {

    private int zadatiBrojSarzi;
    private int zadataKolicinaAsfaltaPoSarzi;
    private int zadataKolicina;
    private db.Receptura receptura;
    private int kapacitetMes = 0;
    
  
    public boolean calculateBrSarzi(
            int zadataKubikaza, int kapacitet,
            db.Receptura receptura) {

        this.kapacitetMes = kapacitet;
        this.receptura = receptura;
        this.zadataKolicina = zadataKubikaza;
        boolean result = false;

     
        if ((zadataKolicina % kapacitetMes)!=0) {
            double res = Convert.cutDecimal(zadataKolicina /kapacitetMes);
            zadatiBrojSarzi = (int) (res + 1);
            zadataKolicinaAsfaltaPoSarzi = zadataKolicina / zadatiBrojSarzi;
        } else {
            double res = Convert.cutDecimal(zadataKolicina /kapacitetMes);
            zadatiBrojSarzi = (int) res;
            zadataKolicinaAsfaltaPoSarzi = zadataKolicina / zadatiBrojSarzi;
        }
        result = true;

        return result;
    }

    public int getZadatiBrojSarzi() {
        return zadatiBrojSarzi;
    }

    public int getZadataKolicinaAsfaltaPoSarzi() {
        return zadataKolicinaAsfaltaPoSarzi;
    }

    public int getKapacitetMes() {
        return kapacitetMes;
    }

    public int getZadataKolicina() {
        return zadataKolicina;
    }
    
    public int getFilerKupljen() {
        return receptura.getKupfiler() * getZadataKolicinaAsfaltaPoSarzi()/1000;
        
    }

    public int getFilerSopstven() {
        return receptura.getSopfiler() * getZadataKolicinaAsfaltaPoSarzi()/1000;
        
    }

    public int getFrakcija1() {
        return receptura.getFrakcija1() * getZadataKolicinaAsfaltaPoSarzi()/1000;
        
    }

    public int getFrakcija2() {
        return receptura.getFrakcija2() * getZadataKolicinaAsfaltaPoSarzi()/1000;
       
    }

    public int getFrakcija3() {
        return receptura.getFrakcija3() * getZadataKolicinaAsfaltaPoSarzi()/1000;
        
    }

    public int getFrakcija4() {
        return receptura.getFrakcija4() * getZadataKolicinaAsfaltaPoSarzi()/1000;
        
    }

    public int getFrakcija5() {
        return receptura.getFrakcija5() * getZadataKolicinaAsfaltaPoSarzi()/1000;
       
    }

    public int getFrakcija6() {
        return receptura.getFrakcija6() * getZadataKolicinaAsfaltaPoSarzi()/1000;
        
    }

    public int getFrakcija7() {
        return receptura.getFrakcija7() * getZadataKolicinaAsfaltaPoSarzi()/1000;
       
    }

    public int getBitumen() {
        return receptura.getBitumen() * getZadataKolicinaAsfaltaPoSarzi()/1000;
        
    }

   
    
    
    public static void main(String[] a){
        ProracunBrSarzi pp = new ProracunBrSarzi();
        db.Receptura r = new db.Receptura();
        
        r.setKupfiler(90);
        r.setSopfiler(0);
        r.setFrakcija1(0);
        r.setFrakcija2(414);
        r.setFrakcija3(285);
        r.setFrakcija4(161);
        r.setFrakcija5(0);
        r.setFrakcija6(0);
        r.setFrakcija7(0);
        r.setBitumen(50);
        
        int zadatoKubika = 15000;
        int kapacitet = 1500;
        
        
        pp.calculateBrSarzi(zadatoKubika, kapacitet, r);
        
        System.out.println("Zadato kubika / kapacitet "+(double)(zadatoKubika) /kapacitet);
        System.out.println("Zadati broj zarzi "+pp.getZadatiBrojSarzi());
        System.out.println("zadataKolicinaAsfaltaPoSarzi "+ pp.getZadataKolicinaAsfaltaPoSarzi());
        System.out.println("filer kupljen "+ pp.getFilerKupljen());
        System.out.println("filer kupljen "+ pp.getFilerSopstven());
        System.out.println("frakcija1 "+ pp.getFrakcija1());
        System.out.println("frakcija2 "+ pp.getFrakcija2());
        System.out.println("frakcija3 "+ pp.getFrakcija3());
        System.out.println("frakcija4 "+ pp.getFrakcija4());
        System.out.println("frakcija5 "+ pp.getFrakcija5());
        System.out.println("frakcija6 "+ pp.getFrakcija6());
        System.out.println("frakcija7 "+ pp.getFrakcija7());
        System.out.println("bitumen "+ pp.getBitumen());
    }
    
    
}
