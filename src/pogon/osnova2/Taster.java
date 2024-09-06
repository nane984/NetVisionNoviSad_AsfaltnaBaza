/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.osnova2;

import pogon.osnova.Digitalac;

/**
 *
 * @author Branko
 */
public class Taster {
     
    private final Digitalac komanda;
    private final String opis;
    private final int tipSlike;
    

    public Taster(int adresaUkljIsklj,
            String opis, int tipSlike) {
        this.komanda = new Digitalac(adresaUkljIsklj);
        this.opis = opis;
        this.tipSlike = tipSlike;
    }

    public Digitalac getKomanda() {
        return komanda;
    }

    public int getTipSlike() {
        return tipSlike;
    }

    public String getOpis() {
        return opis;
    }
    
    
}
