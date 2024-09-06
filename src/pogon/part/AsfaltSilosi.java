/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.part;

import pogon.osnova.Analogna;
import pogon.osnova.Digitalac;
import pogon.osnova2.TezineDvaRegistra;
import utils.MutantToDec;



/**
 *
 * @author Branko
 */
public class AsfaltSilosi {
    private final TezineDvaRegistra Silos1;
    private final TezineDvaRegistra Silos2;
    private final TezineDvaRegistra Silos3;
    private final TezineDvaRegistra Silos4;
    private final TezineDvaRegistra Silos5;
    private final TezineDvaRegistra Iber;
    private final Analogna tempAsfalta;
    
    private final Digitalac grejanjeUstaSilosaAsfalta1; 
    private final Digitalac grejanjeUstaSilosaAsfalta2; 
    private final Digitalac grejanjeUstaSilosaAsfalta3; 
    private final Digitalac grejanjeUstaSilosaAsfalta45; ; 
    
    public AsfaltSilosi(){                          
        this.Silos1 = new TezineDvaRegistra(283, 284, 2147483647, 0, "Silos br 1");
        this.Silos2 = new TezineDvaRegistra(285, 286, 2147483647, 0, "Silos br 2");
        this.Silos3 = new TezineDvaRegistra(287, 288, 2147483647, 0, "Silos br 3");
        this.Silos4 = new TezineDvaRegistra(289, 290, 2147483647, 0, "Silos br 4");
        this.Silos5 = new TezineDvaRegistra(291, 292, 2147483647, 0, "Silos br 5");
        this.Iber = new TezineDvaRegistra(293, 294, 2147483647, 0, "Iber");
        this.tempAsfalta = new Analogna(340, 0);
        this.grejanjeUstaSilosaAsfalta1 = new Digitalac(MutantToDec.getValue("16F"));
        this.grejanjeUstaSilosaAsfalta2 = new Digitalac(MutantToDec.getValue("170"));
        this.grejanjeUstaSilosaAsfalta3 = new Digitalac(MutantToDec.getValue("171"));
        this.grejanjeUstaSilosaAsfalta45 = new Digitalac(MutantToDec.getValue("172"));
    }

    public TezineDvaRegistra getSilos1() {
        return Silos1;
    }

    public TezineDvaRegistra getSilos2() {
        return Silos2;
    }

    public TezineDvaRegistra getSilos3() {
        return Silos3;
    }

    public TezineDvaRegistra getSilos4() {
        return Silos4;
    }

    public TezineDvaRegistra getSilos5() {
        return Silos5;
    }

    public TezineDvaRegistra getIber() {
        return Iber;
    }

    public Analogna getTempAsfalta() {
        return tempAsfalta;
    }

    public Digitalac getGrejanjeUstaSilosaAsfalta1() {
        return grejanjeUstaSilosaAsfalta1;
    }

    public Digitalac getGrejanjeUstaSilosaAsfalta2() {
        return grejanjeUstaSilosaAsfalta2;
    }

    public Digitalac getGrejanjeUstaSilosaAsfalta3() {
        return grejanjeUstaSilosaAsfalta3;
    }

    public Digitalac getGrejanjeUstaSilosaAsfalta45() {
        return grejanjeUstaSilosaAsfalta45;
    }
    
    
}
