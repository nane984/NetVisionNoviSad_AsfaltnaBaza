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
public class PrekidacSaIndikaciomGreskeIPokazivacimaKrajnjegPrekidaca {
     
    private final Digitalac ukljuci;
    private final Digitalac iskljuci;
    private final Digitalac potvrdaRadaL;
    private final Digitalac potvrdaRadaD;
    private final Digitalac greska;
    private final Digitalac otvoren;
    private final Digitalac zatvoren;

    private final String opis;
    
    private final int tipSlike;

    public PrekidacSaIndikaciomGreskeIPokazivacimaKrajnjegPrekidaca(int adresaUklj, int adresaIsklj, 
            int adresaPotvrdaRada, int adresaPotvrdaRada2, int adresaGreska, int adresaPotvrdaOtvoren, 
            int adresaPotvrdaZatvoren, String opis, int tipSlike) {
        this.ukljuci = new Digitalac(adresaUklj);
        this.iskljuci = new Digitalac(adresaIsklj);
        this.potvrdaRadaL = new Digitalac(adresaPotvrdaRada);
        this.potvrdaRadaD = new Digitalac(adresaPotvrdaRada2);
        this.greska = new Digitalac(adresaGreska);
        this.otvoren = new Digitalac(adresaPotvrdaOtvoren);
        this.zatvoren = new Digitalac(adresaPotvrdaZatvoren);
        this.opis = opis;
        this.tipSlike = tipSlike;
    }

    public Digitalac getUkljuci() {
        return ukljuci;
    }

    public Digitalac getIskljuci() {
        return iskljuci;
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

    public Digitalac getOtvoren() {
        return otvoren;
    }

    public Digitalac getZatvoren() {
        return zatvoren;
    }

    public String getOpis() {
        return opis;
    }

    public int getTipSlike() {
        return tipSlike;
    }
    
    
}
