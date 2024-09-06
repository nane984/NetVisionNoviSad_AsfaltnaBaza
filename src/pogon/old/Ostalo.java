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
public class Ostalo {
    private final Komanda hidropumpaUkljucena;
    private final Komanda kompresorUkljucen;
    //private final Komanda rucnoAutomatski;
    
    private final Komanda otpremaZavrsena;
    private final Komanda sarzaZavrsena;

    private final Komanda startCiklus;
    private final Komanda zavrsiCiklus;
    private final Komanda stopCiklus;
    
    private boolean SelectSilosCement = false;
    private boolean SelectFilerCement = false;

    public Ostalo(){
        hidropumpaUkljucena = new Komanda();
        kompresorUkljucen = new Komanda();
       
        startCiklus = new Komanda();
        zavrsiCiklus = new Komanda();
        stopCiklus = new Komanda();
        otpremaZavrsena = new Komanda();
        sarzaZavrsena = new Komanda();
        
        hidropumpaUkljucena.setTipSlike(4);
        kompresorUkljucen.setTipSlike(4);
  
    }

    public Komanda getStartCiklus() {
        return startCiklus;
    }

    public Komanda getZavrsiCiklus() {
        return zavrsiCiklus;
    }

    public Komanda getStopCiklus() {
        return stopCiklus;
    }
   
    public Komanda getHidropumpaUkljucena() {
        return hidropumpaUkljucena;
    }

    public Komanda getKompresorUkljucen() {
        return kompresorUkljucen;
    }

    public boolean getSelectSilosCement() {
        return SelectSilosCement;
    }

    public void setSelectSilosCement(boolean SelectSilosCement) {
        this.SelectSilosCement = SelectSilosCement;
    }

    public boolean getSelectFilerCement() {
        return SelectFilerCement;
    }

    public void setSelectFilerCement(boolean SelectFilerCement) {
        this.SelectFilerCement = SelectFilerCement;
    }

    public Komanda getOtpremaZavrsena() {
        return otpremaZavrsena;
    }

    public Komanda getSarzaZavrsena() {
        return sarzaZavrsena;
    }
}
