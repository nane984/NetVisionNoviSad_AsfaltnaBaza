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
public class VagaNivo {
    private final Analogna vrednost;
    private final int Min;
    private final int Max;
    private final String Opis;
    
    public VagaNivo(int adresa, int brDec, int min, int max, String opis){
        this.vrednost = new Analogna(adresa, brDec);
        this.Min = min;
        this.Max = max;
        this.Opis = opis;
    }

    public Analogna getVrednost() {
        return vrednost;
    }

    public int getMin() {
        return Min;
    }

    public int getMax() {
        return Max;
    }

    public String getOpis() {
        return Opis;
    }

}
