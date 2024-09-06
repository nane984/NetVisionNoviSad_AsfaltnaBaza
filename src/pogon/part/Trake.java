/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.part;

import constatnt.Image;
import pogon.osnova2.TasterSaRadomIGreskom;
import utils.MutantToDec;


/**
 *
 * @author Branko
 */
public class Trake {
    
    private final TasterSaRadomIGreskom Traka1;
    private final TasterSaRadomIGreskom Traka2;
    private final TasterSaRadomIGreskom Traka3;
    private final TasterSaRadomIGreskom TrakaKosa;
    
    private final Image image;

    public Trake() {
        this.image = new Image();
        
        this.Traka1 = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("21B"), 
               MutantToDec.getValue("18E"), 
               MutantToDec.getValue("18F"),
               "Traka 1",
               image.getTrake()
        );
        
        this.Traka2 = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("21D"), 
               MutantToDec.getValue("192"), 
               MutantToDec.getValue("193"),
               "Traka 2",
               image.getTrake());
        
        this.Traka3 = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("21C"), 
               MutantToDec.getValue("190"), 
               MutantToDec.getValue("191"),
               "Traka 3",
               image.getTrake());
        
        this.TrakaKosa = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("21A"), 
               MutantToDec.getValue("18C"), 
               MutantToDec.getValue("18D"),
               "Traka kosa",
               image.getTrake());
    }

    public TasterSaRadomIGreskom getTraka1() {
        return Traka1;
    }

    public TasterSaRadomIGreskom getTraka2() {
        return Traka2;
    }

    public TasterSaRadomIGreskom getTraka3() {
        return Traka3;
    }

    public TasterSaRadomIGreskom getTrakaKosa() {
        return TrakaKosa;
    }

}
