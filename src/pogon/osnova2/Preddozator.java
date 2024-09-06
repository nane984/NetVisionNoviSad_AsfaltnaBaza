/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.osnova2;

import pogon.osnova.Analogna;
import pogon.osnova.Digitalac;

/**
 *
 * @author Branko
 */
public class Preddozator {

    private final Analogna Frekfrencija;
    private int frekfrencijaPoRecepturi = 0;
    private final Digitalac Komanda;
    private final Digitalac PotvrdaRada;
    private final Digitalac Greska;
    private final String opis;
    private final int tipSlike;
    private final Digitalac prazanPredozator;
    private final Digitalac TotalStop;
    private final int tipSlikeTotalStop;
   
    
    public Preddozator(int adresaFrekfrencija, int brojDecimala, 
            int adresaUkljIsklj, int adresaPotvrdaRada, int adresaGreska,
            int adresaPrazan, int adresaTotalStop, String opis, 
            int tipSlike, int tipSlikeTotalStop){
        this.Frekfrencija = new Analogna(adresaFrekfrencija, brojDecimala);
        this.Komanda = new Digitalac(adresaUkljIsklj);
        this.PotvrdaRada = new Digitalac(adresaPotvrdaRada);
        this.Greska = new Digitalac(adresaGreska);
        this.prazanPredozator = new Digitalac(adresaPrazan);
        this.opis = opis;
        this.tipSlike =  tipSlike;
        this.TotalStop = new Digitalac(adresaTotalStop);
        this.tipSlikeTotalStop = tipSlikeTotalStop;
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

    public Analogna getFrekfrencija() {
        return Frekfrencija;
    }

    public int getFrekfrencijaPoRecepturi() {
        return frekfrencijaPoRecepturi;
    }

    public void setFrekfrencijaPoRecepturi(int frekfrencijaPoRecepturi) {
        this.frekfrencijaPoRecepturi = frekfrencijaPoRecepturi;
    }

    public Digitalac getPrazanPredozator() {
        return prazanPredozator;
    }

    public Digitalac getTotalStop() {
        return TotalStop;
    }

    public int getTipSlikeTotalStop() {
        return tipSlikeTotalStop;
    }
    
    
}
