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
public class Komanda {
     private boolean vrednost = false;
     private int komandaAdresa = 0;
     private int tipSlike = 0;
    

    public boolean getVrednost() {
        return vrednost;
    }

    public void setVrednost(boolean komanda) {
        this.vrednost = komanda;
    }

    public int getKomandaAdresa() {
        return komandaAdresa;
    }

    public void setKomandaAdresa(int komandaAdresa) {
        this.komandaAdresa = komandaAdresa;
    }

    public int getTipSlike() {
        return tipSlike;
    }

    public void setTipSlike(int tip) {
        this.tipSlike = tip;
    }
     
     
}
