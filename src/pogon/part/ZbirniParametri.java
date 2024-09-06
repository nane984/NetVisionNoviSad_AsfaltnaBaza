/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.part;

import pogon.osnova.Analogna;

/**
 *
 * @author branko.scekic
 */
public class ZbirniParametri {
    
    private final int brDec = 0;
    
    private final Analogna vremeSmirivanjaVageFrakcije;
    private final Analogna vremeSmirivanjaVageFilera;
    private final Analogna vremeSmirivanjaVageBitumena;
    private final Analogna zadrskaZaDoziranjeFilera;
    private final Analogna zadrskaZaDoziranjeBitumena;
    private final Analogna vremeMesanjaMesalice;
    private final Analogna vremePraznjenjaMesalice;
    private final Analogna vremePrskanjaNaftomKorpe;
    private final Analogna vremePrskanjaNaftomVagona;
    
    private int kapacitetMesalice = 1500;
    
    public ZbirniParametri(){
        this.vremeSmirivanjaVageFrakcije = new Analogna(255,1);
        this.vremeSmirivanjaVageFilera = new Analogna(256,1);
        this.vremeSmirivanjaVageBitumena = new Analogna(257,1);
        
        this.zadrskaZaDoziranjeFilera = new Analogna(274,1);
        this.zadrskaZaDoziranjeBitumena = new Analogna(275,1);
        this.vremeMesanjaMesalice = new Analogna(276, 1);
        this.vremePraznjenjaMesalice = new Analogna(277, 1);
                
        this.vremePrskanjaNaftomKorpe = new Analogna(330,1);
        this.vremePrskanjaNaftomVagona = new Analogna(331,1);
    }
    
    public Analogna getVremeSmirivanjaVageFrakcije() {
        return vremeSmirivanjaVageFrakcije;
    }

    public int getKapacitetMesalice() {
        return kapacitetMesalice;
    }

    public void setKapacitetMesalice(int kapacitetMesalice) {
        this.kapacitetMesalice = kapacitetMesalice;
    }

    public int getBrDec() {
        return brDec;
    }

    public Analogna getVremeSmirivanjaVageFilera() {
        return vremeSmirivanjaVageFilera;
    }

    public Analogna getVremeSmirivanjaVageBitumena() {
        return vremeSmirivanjaVageBitumena;
    }

    public Analogna getZadrskaZaDoziranjeFilera() {
        return zadrskaZaDoziranjeFilera;
    }

    public Analogna getZadrskaZaDoziranjeBitumena() {
        return zadrskaZaDoziranjeBitumena;
    }

    public Analogna getVremePrskanjaNaftomKorpe() {
        return vremePrskanjaNaftomKorpe;
    }

    public Analogna getVremePrskanjaNaftomVagona() {
        return vremePrskanjaNaftomVagona;
    }

    public Analogna getVremeMesanjaMesalice() {
        return vremeMesanjaMesalice;
    }

    public Analogna getVremePraznjenjaMesalice() {
        return vremePraznjenjaMesalice;
    }
    
    

}

    
