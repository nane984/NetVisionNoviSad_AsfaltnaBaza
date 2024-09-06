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
public class Aditiv {
    private int zadato = 0;
    private int izdato = 0;
    private final Komanda komanda;
    
    private final int brDec = 2;
    
    private int zadatoAdresa = 0;
    private int izdatoAdresa = 0;
    
    private int procenjenaKolicinaSilos = 0;

    private int kapacitetSilos = 1000;
    
    public Aditiv(){
        komanda = new Komanda();
        komanda.setTipSlike(2);
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

    public int getProcenjenaKolicinaSilos() {
        return procenjenaKolicinaSilos;
    }

    public void setProcenjenaKolicinaSilos(int procenjenaKolicinaSilos) {
        this.procenjenaKolicinaSilos = procenjenaKolicinaSilos;
    }


    public int getKapacitetSilos() {
        return kapacitetSilos;
    }

    public void setKapacitetSilos(int kapacitetSilos) {
        this.kapacitetSilos = kapacitetSilos;
    }
}
