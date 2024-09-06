/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.osnova;

/**
 *
 * @author Branko
 */
public class Digitalac {
     
    private boolean vrednost = false;
    private final int adresaVrednosti;


    public Digitalac(int adresaUkljIsklj) {
        this.adresaVrednosti = adresaUkljIsklj;
    }

    public boolean isVrednost() {
        return vrednost;
    }

    public void setVrednost(boolean vrednost) {
        this.vrednost = vrednost;
    }

    public int getAdresaVrednosti() {
        return adresaVrednosti;
    }

    
}