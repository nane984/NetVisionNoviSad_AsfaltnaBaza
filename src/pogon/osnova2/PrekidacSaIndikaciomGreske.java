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
public class PrekidacSaIndikaciomGreske {
     
    private final Digitalac uklucennje;
    private final Digitalac iskljucennje;
    private final Digitalac potvrdaRadaL;
    private final Digitalac potvrdaRadaD;
    private final Digitalac greska;
    private final String opis;
    private final int tipSlike;

    public PrekidacSaIndikaciomGreske(int adresaUklj, int adresaIsklj, 
            int adresaPotvrdaRadaL, int adresaPotvrdaRadaD, int adresaGreska, 
            String opis, int tipSlike) {
        this.uklucennje = new Digitalac(adresaUklj);
        this.iskljucennje =  new Digitalac(adresaIsklj);
        this.potvrdaRadaL = new Digitalac(adresaPotvrdaRadaL);
        this.potvrdaRadaD = new Digitalac(adresaPotvrdaRadaD);
        this.greska = new Digitalac(adresaGreska);
        this.opis = opis;
        this.tipSlike = tipSlike;
    }

    public Digitalac getUklucennje() {
        return uklucennje;
    }

    public Digitalac getIskljucennje() {
        return iskljucennje;
    }

    public Digitalac getPotvrdaRadaL() {
        return potvrdaRadaL;
    }

    public Digitalac getPotvrdaRadaD() {
        return potvrdaRadaD;
    }

    public Digitalac getGreska() {
        return greska;
    }

    
    
    public String getOpis() {
        return opis;
    }

    public int getTipSlike() {
        return tipSlike;
    }
    
    
}
