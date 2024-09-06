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
public class TasterSaRadomIGreskom {

    private final Digitalac Komanda;
    private final Digitalac PotvrdaRada;
    private final Digitalac Greska;
    private final String opis;
    private final int tipSlike;
    
    public TasterSaRadomIGreskom(int adresaUkljIsklj, int adresaPotvrdaRada, int adresaGreska,
            String opis, int tipSlike){
        this.Komanda = new Digitalac(adresaUkljIsklj);
        this.PotvrdaRada = new Digitalac(adresaPotvrdaRada);
        this.Greska = new Digitalac(adresaGreska);
        
        this.opis = opis;
        this.tipSlike =  tipSlike;
    }


    public Digitalac getKomanda() {
        return Komanda;
    }

    public Digitalac getPotvrdaRada() {
        return PotvrdaRada;
    }

    public Digitalac getGreska() {
        return Greska;
    }

    public int getTipSlike() {
        return tipSlike;
    }

    public String getOpis() {
        return opis;
    }
 
}
