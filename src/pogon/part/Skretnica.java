/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.part;

import pogon.osnova.Digitalac;
import utils.MutantToDec;

/**
 *
 * @author Branko
 */
public class Skretnica {
    private final Digitalac SkretnicaUpravljanje;
    private final Digitalac SkretnicaVagon1;
    private final Digitalac SkretnicaVagon2;
    private final Digitalac SkretnicaIber1;
    private final Digitalac SkretnicaIber2;
    
    public Skretnica(){
        this.SkretnicaUpravljanje = new Digitalac(MutantToDec.getValue("16E"));
        this.SkretnicaIber1 = new Digitalac(MutantToDec.getValue("154"));
        this.SkretnicaVagon1 = new Digitalac(MutantToDec.getValue("155"));
        this.SkretnicaIber2 = new Digitalac(MutantToDec.getValue("156"));
        this.SkretnicaVagon2 = new Digitalac(MutantToDec.getValue("157"));
    }

    public Digitalac getSkretnicaUpravljanje() {
        return SkretnicaUpravljanje;
    }

    public Digitalac getSkretnicaVagon1() {
        return SkretnicaVagon1;
    }

    public Digitalac getSkretnicaVagon2() {
        return SkretnicaVagon2;
    }

    public Digitalac getSkretnicaIber1() {
        return SkretnicaIber1;
    }

    public Digitalac getSkretnicaIber2() {
        return SkretnicaIber2;
    }
    
    
}
