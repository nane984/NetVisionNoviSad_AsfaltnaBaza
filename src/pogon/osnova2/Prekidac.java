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
public class Prekidac {
     
    private final Digitalac uklucennje;
    private final Digitalac iskljucennje;
    private final String opis;
    private final int tipSlike;

    public Prekidac(int adresaUklj, int adresaIsklj, 
            String opis, int tipSlike) {
        this.uklucennje = new Digitalac(adresaUklj);
        this.iskljucennje =  new Digitalac(adresaIsklj);
        this.opis = opis;
        this.tipSlike = tipSlike;
    }

    public Digitalac getUklucennje() {
        return uklucennje;
    }

    public Digitalac getIskljucennje() {
        return iskljucennje;
    }
    
    public String getOpis() {
        return opis;
    }

    public int getTipSlike() {
        return tipSlike;
    }
    
    
}
