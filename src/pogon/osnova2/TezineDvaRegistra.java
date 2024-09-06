/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.osnova2;

/**
 *
 * @author Branko
 */
public class TezineDvaRegistra {
    
     private int vrednostVisa;
    private final int adresaVrednostiVisa;
    private int vrednostNiza;
    private final int adresaVrednostiNiza;
    private final int Min;
    private final int Max;
    private final String Opis; 
    
    public TezineDvaRegistra(int adresaNiza, int adresaVisa, int min, int max, String opis){
        
        this.adresaVrednostiNiza = adresaNiza;
        this.adresaVrednostiVisa = adresaVisa;
        this.Max = max;
        this.Min = min;
        this.Opis = opis;
    }

    public int getVrednostVisa() {
        return vrednostVisa;
    }

    public void setVrednostVisa(int vrednostVisa) {
        this.vrednostVisa = vrednostVisa;
    }

    public int getVrednostNiza() {
        return vrednostNiza;
    }

    public void setVrednostNiza(int vrednostNiza) {
        this.vrednostNiza = vrednostNiza;
    }

    public int getAdresaVrednostiVisa() {
        return adresaVrednostiVisa;
    }

    public int getAdresaVrednostiNiza() {
        return adresaVrednostiNiza;
    }

    public String getOpis() {
        return Opis;
    }

    public int getMin() {
        return Min;
    }

    public int getMax() {
        return Max;
    }
    
    
}
