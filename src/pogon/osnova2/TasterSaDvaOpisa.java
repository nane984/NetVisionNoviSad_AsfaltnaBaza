/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.osnova2;

import java.awt.Color;
import pogon.osnova.Digitalac;

/**
 *
 * @author Branko
 */
public class TasterSaDvaOpisa {
    private final Digitalac komanda;
    private final String opisOff;
    private final String opisOn;
    private final Color colorOff;
    private final Color colorOn;
    
    public TasterSaDvaOpisa(int adresaUkljIsklj,
            String opisOff, String opisOn){
        this.komanda = new Digitalac(adresaUkljIsklj);
        this.opisOn = opisOn;
        this.opisOff = opisOff;
        this.colorOff = Color.LIGHT_GRAY;
        this.colorOn = Color.GREEN;
    }

    public Digitalac getKomanda() {
        return komanda;
    }

    public String getOpisOff() {
        return opisOff;
    }

    public String getOpisOn() {
        return opisOn;
    }

    public Color getColorOff() {
        return colorOff;
    }

    public Color getColorOn() {
        return colorOn;
    }
    
    
}
