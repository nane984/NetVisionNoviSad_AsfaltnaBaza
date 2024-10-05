/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.part;

import pogon.osnova.Analogna;
import pogon.osnova.Digitalac;
import utils.MutantToDec;

/**
 *
 * @author Branko
 */
public class KorpaVagon {
    private final Digitalac  StartCiklusaKorpe;
    private final Digitalac  StartKorpe;
    private final Digitalac  PromenaSmeraKorpe;
    private final Digitalac  PromenaBrzinaKorpe;
    private final Digitalac  StartDizniKorpe;
    private final Digitalac  StartFrekfrentnogReg;
    
    private final Digitalac  StartCiklusaVagona;
    private final Digitalac  StartLevo;
    private final Digitalac  StartDesno;
    private final Digitalac  PraznjenjeVagona;
    private final Digitalac  StartDizniVagona;
    
    
    private final Analogna selectSilos;
    private final Digitalac iberVagona;
    private final Digitalac grejanjeUstavagona;
    
    private final Digitalac pozicijaKorpe1;
    private final Digitalac pozicijaKorpe2;
    private final Digitalac pozicijaKorpe3;
    
    private final Digitalac pozicijaVagona1;
    private final Digitalac pozicijaVagona2;
    private final Digitalac pozicijaVagona3;
    private final Digitalac pozicijaVagona4;
    private final Digitalac pozicijaVagona5;
    private final Digitalac pozicijaVagona6;
    
    public KorpaVagon(){
        this.StartCiklusaKorpe = new Digitalac(MutantToDec.getValue("175"));
        this.StartCiklusaVagona  = new Digitalac(MutantToDec.getValue("179"));
        
        this.StartKorpe = new Digitalac(MutantToDec.getValue("167"));
        this.PromenaSmeraKorpe = new Digitalac(MutantToDec.getValue("168"));
        this.PromenaBrzinaKorpe = new Digitalac(MutantToDec.getValue("169"));
        this.StartDizniKorpe  = new Digitalac(MutantToDec.getValue("30F"));
        this.StartFrekfrentnogReg = new Digitalac(MutantToDec.getValue("16A"));
        
        this.StartLevo = new Digitalac(MutantToDec.getValue("16B"));
        this.StartDesno = new Digitalac(MutantToDec.getValue("16C"));
        this.PraznjenjeVagona = new Digitalac(MutantToDec.getValue("165"));
        this.StartDizniVagona  = new Digitalac(MutantToDec.getValue("164"));
        
        this.selectSilos = new Analogna(110, 0);
        this.iberVagona = new Digitalac(MutantToDec.getValue("174"));
        this.grejanjeUstavagona = new Digitalac(MutantToDec.getValue("16D"));
        
        this.pozicijaKorpe1 = new Digitalac(MutantToDec.getValue("149"));
        this.pozicijaKorpe2 = new Digitalac(MutantToDec.getValue("147"));
        this.pozicijaKorpe3 = new Digitalac(MutantToDec.getValue("145"));
        
        this.pozicijaVagona1 = new Digitalac(MutantToDec.getValue("151"));
        this.pozicijaVagona2 = new Digitalac(MutantToDec.getValue("150"));
        this.pozicijaVagona3 = new Digitalac(MutantToDec.getValue("14F"));
        this.pozicijaVagona4 = new Digitalac(MutantToDec.getValue("14E"));
        this.pozicijaVagona5 = new Digitalac(MutantToDec.getValue("14D"));
        this.pozicijaVagona6 = new Digitalac(MutantToDec.getValue("14C"));
    }

    public Digitalac getStartCiklusaKorpe() {
        return StartCiklusaKorpe;
    }

    public Digitalac getStartKorpe() {
        return StartKorpe;
    }

    public Digitalac getPromenaSmeraKorpe() {
        return PromenaSmeraKorpe;
    }

    public Digitalac getPromenaBrzinaKorpe() {
        return PromenaBrzinaKorpe;
    }

    public Digitalac getStartFrekfrentnogReg() {
        return StartFrekfrentnogReg;
    }

    public Digitalac getStartCiklusaVagona() {
        return StartCiklusaVagona;
    }

    public Digitalac getStartLevo() {
        return StartLevo;
    }

    public Digitalac getStartDesno() {
        return StartDesno;
    }

    public Digitalac getPraznjenjeVagona() {
        return PraznjenjeVagona;
    }

    public Digitalac getStartDizniVagona() {
        return StartDizniVagona;
    }

    public Analogna getSelectSilos() {
        return selectSilos;
    }

    public Digitalac getIberVagona() {
        return iberVagona;
    }

    public Digitalac getStartDizniKorpe() {
        return StartDizniKorpe;
    }

    public Digitalac getGrejanjeUstavagona() {
        return grejanjeUstavagona;
    }

    public Digitalac getPozicijaVagona1() {
        return pozicijaVagona1;
    }

    public Digitalac getPozicijaVagona2() {
        return pozicijaVagona2;
    }

    public Digitalac getPozicijaVagona3() {
        return pozicijaVagona3;
    }

    public Digitalac getPozicijaVagona4() {
        return pozicijaVagona4;
    }

    public Digitalac getPozicijaVagona5() {
        return pozicijaVagona5;
    }

    public Digitalac getPozicijaVagona6() {
        return pozicijaVagona6;
    }

    public Digitalac getPozicijaKorpe1() {
        return pozicijaKorpe1;
    }

    public Digitalac getPozicijaKorpe2() {
        return pozicijaKorpe2;
    }

    public Digitalac getPozicijaKorpe3() {
        return pozicijaKorpe3;
    }
    
    
}
