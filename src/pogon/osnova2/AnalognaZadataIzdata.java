/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.osnova2;

import pogon.osnova.Analogna;

/**
 *
 * @author Branko
 */
public class AnalognaZadataIzdata {
    private final Analogna Zadata;
    private final Analogna Izdozirana;
    private final int brDec;
    private final String Opis;
    
    public AnalognaZadataIzdata(int adresaZadato, int adresaIzdozirano, int brDec, String opis){
        this.Zadata = new Analogna(adresaZadato, brDec);
        this.Izdozirana = new Analogna(adresaIzdozirano, brDec);
        this.brDec = brDec;
        this.Opis = opis;
    }

    public Analogna getZadata() {
        return Zadata;
    }

    public Analogna getIzdozirana() {
        return Izdozirana;
    }

    public int getBrDec() {
        return brDec;
    }

    public String getOpis() {
        return Opis;
    }
}
