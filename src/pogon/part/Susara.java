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
import pogon.osnova2.TasterSaRadomIGreskom;
import pogon.osnova2.VagaNivo;
import utils.MutantToDec;

/**
 *
 * @author Branko
 */
public class Susara {
    private final TasterSaRadomIGreskom RotacionaSusara;
    private final TasterSaRadomIGreskom PumpaGorionikaSusare;
    private final Taster GorionikSusare;
    private final Taster GorionikSusareSnagaPlus;
    private final Taster GorionikSusareSnagaMinus;
    private final Taster ResetGreska;
    private final Digitalac GreskaGorionik;
    private final VagaNivo PritisakUSusari;
    private final VagaNivo TempIzaSusare;
    private final Analogna TempIzaSusare2;
    private final Analogna snagaGorionika;
    
    private final Image image;

    public Susara() {
        
        this.image = new Image();
        
        this.RotacionaSusara = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("217"), 
               MutantToDec.getValue("188"), 
               MutantToDec.getValue("18B"),
               "Rotaciona susara",
               image.getPumpe());
        this.PumpaGorionikaSusare = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("223"), 
               MutantToDec.getValue("19E"), 
               MutantToDec.getValue("19F"),
               "Pumpa gorionika susare",
               image.getPumpe());
        this.GorionikSusare = new Taster(
               MutantToDec.getValue("226"),
               "Gorionik susare",
               image.getGorionik()
        );
        
        this.GorionikSusareSnagaPlus = new Taster(
               MutantToDec.getValue("227"),
               "Gorionik susare snaga plus",
               image.getGorionik()
        );
        this.GorionikSusareSnagaMinus = new Taster(
               MutantToDec.getValue("228"),
               "Gorionik susare snaga minus",
               image.getGorionik()
        );
        
        this.ResetGreska = new Taster(
               MutantToDec.getValue("229"),
               "Gorionik susare snaga minus",
               image.getGorionik()
        );
        this.GreskaGorionik = new Digitalac(MutantToDec.getValue("205"));
        this.PritisakUSusari = new VagaNivo(144, 1, 0, 32768, "Potpritisak u susari");
        this.TempIzaSusare = new VagaNivo(135, 0, 0, 32768, "Temperatura iza susare");
        
        this.snagaGorionika = new Analogna(329,0);
        this.TempIzaSusare2 = new Analogna(341, 0);
    }

    public TasterSaRadomIGreskom getRotacionaSusara() {
        return RotacionaSusara;
    }

    public TasterSaRadomIGreskom getPumpaGorionikaSusare() {
        return PumpaGorionikaSusare;
    }

    public Taster getGorionikSusare() {
        return GorionikSusare;
    }

    public Taster getGorionikSusareSnagaPlus() {
        return GorionikSusareSnagaPlus;
    }

    public Taster getGorionikSusareSnagaMinus() {
        return GorionikSusareSnagaMinus;
    }
    
    public Image getImage() {
        return image;
    }

    public VagaNivo getPritisakUSusari() {
        return PritisakUSusari;
    }

    public VagaNivo getTempIzaSusare() {
        return TempIzaSusare;
    }

    public Taster getResetGreska() {
        return ResetGreska;
    }

    public Digitalac getGreskaGorionik() {
        return GreskaGorionik;
    }

    public Analogna getSnagaGorionika() {
        return snagaGorionika;
    }

    public Analogna getTempIzaSusare2() {
        return TempIzaSusare2;
    }

    
}
