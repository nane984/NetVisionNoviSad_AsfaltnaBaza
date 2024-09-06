/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.old;

/**
 *
 * @author branko.scekic
 */
public class Cement {
    private int zadato = 0;
    private int izdato = 0;
    private final Komanda komanda;
    
    private final Komanda fluidizacija;
    
    private final int brDec = 0;
    
    private int zadatoAdresa = 0;
    private int izdatoAdresa = 0;
    
    private int procenjenaKolicinaSilos1 = 0;
    private int procenjenaKolicinaSilos2 = 0;
    
    private int kapacitetSilos1 = 60000;
    private int kapacitetSilos2 = 60000;
    
    
    public Cement(){
        komanda = new Komanda();
        komanda.setTipSlike(1);
        
        fluidizacija = new Komanda();
        fluidizacija.setTipSlike(7);
    }

    public int getZadato() {
        return zadato;
    }

    public void setZadato(int zadato) {
        this.zadato = zadato;
    }

    public int getIzdato() {
        return izdato;
    }

    public void setIzdato(int izdato) {
        this.izdato = izdato;
    }


    public int getZadatoAdresa() {
        return zadatoAdresa;
    }

    public void setZadatoAdresa(int zadatoAdresa) {
        this.zadatoAdresa = zadatoAdresa;
    }

    public int getIzdatoAdresa() {
        return izdatoAdresa;
    }

    public void setIzdatoAdresa(int izdatoAdresa) {
        this.izdatoAdresa = izdatoAdresa;
    }

    public int getBrDec() {
        return brDec;
    }

 
    public Komanda getKomanda() {
        return komanda;
    }

    public int getProcenjenaKolicinaSilos1() {
        return procenjenaKolicinaSilos1;
    }

    public void setProcenjenaKolicinaSilos1(int procenjenaKolicinaSilos1) {
        this.procenjenaKolicinaSilos1 = procenjenaKolicinaSilos1;
    }


    public int getProcenjenaKolicinaSilos2() {
        return procenjenaKolicinaSilos2;
    }

    public void setProcenjenaKolicinaSilos2(int procenjenaKolicinaSilos2) {
        this.procenjenaKolicinaSilos2 = procenjenaKolicinaSilos2;
    }


    public int getKapacitetSilos1() {
        return kapacitetSilos1;
    }

    public void setKapacitetSilos1(int kapacitetSilos1) {
        this.kapacitetSilos1 = kapacitetSilos1;
    }

    public int getKapacitetSilos2() {
        return kapacitetSilos2;
    }

    public void setKapacitetSilos2(int kapacitetSilos2) {
        this.kapacitetSilos2 = kapacitetSilos2;
    } 

    public Komanda getFluidizacija() {
        return fluidizacija;
    }
    
    
}
