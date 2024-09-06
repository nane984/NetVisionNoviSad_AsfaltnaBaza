/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.part;

import pogon.osnova.Analogna;
import pogon.osnova2.TasterSaDvaOpisa;
import utils.MutantToDec;

/**
 *
 * @author Branko
 */
public class GrupaKomandi1 {
     private final TasterSaDvaOpisa Rad;
     private final TasterSaDvaOpisa Otprasivanje;
     private final TasterSaDvaOpisa Transport;
     private final TasterSaDvaOpisa Susara;
     private final TasterSaDvaOpisa VelikiGorionik;
     private final TasterSaDvaOpisa GorionikNaKanalu;
     private final TasterSaDvaOpisa Predozator;
     private final TasterSaDvaOpisa Mesalica;
     private final TasterSaDvaOpisa ProizvodnjaAsfalta;
     private final Analogna textTransport;
     
     public GrupaKomandi1(){
         
         this.Rad = new TasterSaDvaOpisa(MutantToDec.getValue("2"), "Rucni rad", "Automatski rad");
         this.Otprasivanje = new TasterSaDvaOpisa(MutantToDec.getValue("5"), "Otprasivanje STOP", "Otprasivanje U TOKU");
         this.Transport = new TasterSaDvaOpisa(MutantToDec.getValue("3"), "Transport STOP", "Transport U TOKU");
         this.Susara = new TasterSaDvaOpisa(MutantToDec.getValue("217"), "Susara STOP", "Susara U RADU");
         this.VelikiGorionik = new TasterSaDvaOpisa(MutantToDec.getValue("226"), "Veliki gorionik STOP", "Veliki gorionik U RADU");
         this.GorionikNaKanalu = new TasterSaDvaOpisa(MutantToDec.getValue("22B"), "Gorionik na kanalu STOP", "Gorionik na kanalu U RADU");
         this.Predozator = new TasterSaDvaOpisa(MutantToDec.getValue("4"), "Predozator STOP", "Predozator U RADU");
         this.Mesalica = new TasterSaDvaOpisa(MutantToDec.getValue("E"), "Mesalica STOP", "Mesalica U RADU");
         this.ProizvodnjaAsfalta = new TasterSaDvaOpisa(MutantToDec.getValue("C"), "Proizvodnja asfalta STOP", "Proizvodnja asfalta U TOKU");
         this.textTransport = new Analogna(267, 0);
     }

    public TasterSaDvaOpisa getRad() {
        return Rad;
    }

    public TasterSaDvaOpisa getOtprasivanje() {
        return Otprasivanje;
    }

    public TasterSaDvaOpisa getSusara() {
        return Susara;
    }

    public TasterSaDvaOpisa getVelikiGorionik() {
        return VelikiGorionik;
    }

    public TasterSaDvaOpisa getGorionikNaKanalu() {
        return GorionikNaKanalu;
    }

    public TasterSaDvaOpisa getPredozator() {
        return Predozator;
    }

    public TasterSaDvaOpisa getMesalica() {
        return Mesalica;
    }

    public TasterSaDvaOpisa getProizvodnjaAsfalta() {
        return ProizvodnjaAsfalta;
    }

    public TasterSaDvaOpisa getTransport() {
        return Transport;
    }

    public Analogna getTextTransport() {
        return textTransport;
    }
     
     
}
