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
public class TasterSaPokazivacemPolozaja {
     
    private final Digitalac komanda;
    private final Digitalac otvoren;
    private final Digitalac zatvoren;
    private final String opis;
    private final int tipSlike;
    

    public TasterSaPokazivacemPolozaja(int adresaUkljIsklj,
            int adresaPotvrdaOtvorenosti, int adresaPotvrdaZatvorenosti, 
            String opis, int tipSlike) {
        this.komanda = new Digitalac(adresaUkljIsklj);
        this.otvoren = new Digitalac(adresaPotvrdaOtvorenosti);
        this.zatvoren = new Digitalac(adresaPotvrdaZatvorenosti);
        this.opis = opis;
        this.tipSlike = tipSlike;
    }

  
    public Digitalac getKomanda() {
        return komanda;
    }

    public Digitalac getOtvoren() {
        return otvoren;
    }

    
    
    public int getTipSlike() {
        return tipSlike;
    }

    public Digitalac getZatvoren() {
        return zatvoren;
    }

   
   

    public String getOpis() {
        return opis;
    }
    
    
}
