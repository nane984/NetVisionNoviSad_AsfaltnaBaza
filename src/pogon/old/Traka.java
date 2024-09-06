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
public class Traka {
    private final Komanda trakaVageRun;
    private final Komanda kosaTrakaRun;
   
    private boolean izdozirano = false;
    private boolean kosaTrakaPrazna = false;
    private int kosaTrakaPraznaAdresa;
    private int tezina = 0;
    
    private final int brDec = 0;
    
    private final Komanda vibracija;
    private final Komanda tariranje;

    private int izdoziranoAdresa = 0;
    private int tezinaAdresa = 0;

    public Traka(){
        trakaVageRun = new Komanda();
        kosaTrakaRun = new Komanda();
        
        trakaVageRun.setTipSlike(4);
        kosaTrakaRun.setTipSlike(4);
        
        tariranje = new Komanda();
        tariranje.setTipSlike(5);
        
        vibracija = new Komanda();
        vibracija.setTipSlike(7);
    }
   
    public boolean isIzdozirano() {
        return izdozirano;
    }

    public void setKosaTrakaPraznaAdresa(int kosaTrakaPraznaAdresa) {
        this.kosaTrakaPraznaAdresa = kosaTrakaPraznaAdresa;
    }
    
    public void setIzdozirano(boolean izdozirano) {
        this.izdozirano = izdozirano;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    public int getBrDec() {
        return brDec;
    }

    public int getIzdoziranoAdresa() {
        return izdoziranoAdresa;
    }

    public void setIzdoziranoAdresa(int izdoziranoAdresa) {
        this.izdoziranoAdresa = izdoziranoAdresa;
    }

    public int getTezinaAdresa() {
        return tezinaAdresa;
    }

    public void setTezinaAdresa(int tezinaAdresa) {
        this.tezinaAdresa = tezinaAdresa;
    }

    public Komanda trakaVageRun() {
        return trakaVageRun;
    }

    public Komanda kosaTrakaRun() {
        return kosaTrakaRun;
    }

    public Komanda getTariranje() {
        return tariranje;
    }

    public Komanda getVibracija() {
        return vibracija;
    }

    public boolean getKosaTrakaPrazna() {
        return kosaTrakaPrazna;
    }

    public void setKosaTrakaPrazna(boolean kosaTrakaPrazna) {
        this.kosaTrakaPrazna = kosaTrakaPrazna;
    }

    public int getKosaTrakaPraznaAdresa() {
        return kosaTrakaPraznaAdresa;
    }
    
    
    
}
