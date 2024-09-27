/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.part;

import constatnt.Image;
import pogon.osnova.Analogna;
import pogon.osnova.Digitalac;
import pogon.osnova2.Taster;
import pogon.osnova2.AnalognaMinMaxOpis;
import utils.MutantToDec;

/**
 *
 * @author Branko
 */
public class Mesalica {
    private final Taster Mesalica;
    private final Taster KlapnaMesalice;
    private final Analogna kapacitetMesalice;
    private final AnalognaMinMaxOpis strujaMesalice;
    private final Digitalac grejacMesalice;
    private boolean rucnoAutomatskiGrejac = false;
    
    private final Image image;
    
    public Mesalica(){
        this.image = new Image();
        
        this.Mesalica = new Taster(
            MutantToDec.getValue("E"),
            "Mesalica",
            image.getMesalica()
        );
        this.KlapnaMesalice =  new Taster(
            MutantToDec.getValue("310"),    
            "Klapna mesalice",
            image.getKlapne()
        );
        this.kapacitetMesalice = new Analogna(1, 1);
        
        this.strujaMesalice = new AnalognaMinMaxOpis(342, 0, 0, 100, "Struja mesalice");
        
        this.grejacMesalice = new Digitalac(MutantToDec.getValue("324"));
    }

    public Taster getMesalica() {
        return Mesalica;
    }

    public Taster getKlapnaMesalice() {
        return KlapnaMesalice;
    }

    public Image getImage() {
        return image;
    }

    public Analogna getKapacitetMesalice() {
        return kapacitetMesalice;
    }

    public AnalognaMinMaxOpis getStrujaMesalice() {
        return strujaMesalice;
    }

    public Digitalac getGrejacMesalice() {
        return grejacMesalice;
    }

    public boolean isRucnoAutomatskiGrejac() {
        return rucnoAutomatskiGrejac;
    }

    public void setRucnoAutomatskiGrejac(boolean rucnoAutomatskiGrejac) {
        this.rucnoAutomatskiGrejac = rucnoAutomatskiGrejac;
    }
    
    
}
