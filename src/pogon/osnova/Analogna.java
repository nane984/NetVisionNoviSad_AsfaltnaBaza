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
public class Analogna {
    private int vrednost = 0;
    private final int adresaVrednosti;
    private final int brojDecimala;

    public Analogna(int adresaVrednosti, int brojDecimala) {
        this.adresaVrednosti = adresaVrednosti;
        this.brojDecimala = brojDecimala;
    }

    public int getVrednost() {
        return vrednost;
    }

    public void setVrednost(int vrednost) {
        this.vrednost = vrednost;
    }

    public int getAdresaVrednosti() {
        return adresaVrednosti;
    }

    public int getBrojDecimala() {
        return brojDecimala;
    }

    
    
    
}
