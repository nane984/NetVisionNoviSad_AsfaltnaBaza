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
public class FrekfrentniUprosceno {

    private final Analogna Frekfrencija;
    private final Digitalac PotvrdaRada;
    private final String opis;
    private final int tipSlike;
    
    public FrekfrentniUprosceno(int adresaFrekfrencija, int brojDecimala, 
            int adresaPotvrdaRada, String opis, int tipSlike){
        this.Frekfrencija = new Analogna(adresaFrekfrencija, brojDecimala);
        this.PotvrdaRada = new Digitalac(adresaPotvrdaRada);
       
        this.opis = opis;
        this.tipSlike =  tipSlike;
    }


   
    public Digitalac getPotvrdaRada() {
        return PotvrdaRada;
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
    
}
