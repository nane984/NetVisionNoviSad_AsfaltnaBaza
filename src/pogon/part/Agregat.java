/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.part;

import constatnt.Image;
import pogon.osnova.Analogna;
import pogon.osnova.Digitalac;
import pogon.osnova2.AnalognaZadataIzdata;
import pogon.osnova2.Prekidac;
import pogon.osnova2.Taster;
import pogon.osnova2.AnalognaMinMaxOpis;
import utils.MutantToDec;

/**
 *
 * @author Branko
 */
public class Agregat {
     private final Taster dozator1;
     private final Prekidac dozator2;
     private final Prekidac dozator3;
     private final Prekidac dozator4;
     private final Prekidac dozator5;
     private final Prekidac dozator6;
     private final Prekidac dozator7;
     private final Taster klapnaVagaFrakcije;
     private final AnalognaMinMaxOpis VagaFrakcije;
     private final Digitalac VagaFrakcijeTariraj;
     private final AnalognaMinMaxOpis NivoSilos1;
     private final AnalognaMinMaxOpis NivoSilos2;
     private final AnalognaMinMaxOpis NivoSilos3;
     private final AnalognaMinMaxOpis NivoSilos4;
     private final AnalognaMinMaxOpis NivoSilos5;
     private final AnalognaMinMaxOpis NivoSilos6;
     private final AnalognaMinMaxOpis NivoSilos7;
     
     private final Analogna temperaturaFrakcija1;
     private final Analogna temperaturaFrakcija2;
     
     private final AnalognaZadataIzdata doz1;
     private final AnalognaZadataIzdata doz2;
     private final AnalognaZadataIzdata doz3;
     private final AnalognaZadataIzdata doz4;
     private final AnalognaZadataIzdata doz5;
     private final AnalognaZadataIzdata doz6;
     private final AnalognaZadataIzdata doz7;
     
     private int status=0;
     
     private final Image image;
     
     public Agregat(){
        this.image = new Image();
        this.dozator1 = new Taster(MutantToDec.getValue("30A"), "Klapna vage filera", image.getKlapne());
        this.dozator2 = new Prekidac(MutantToDec.getValue("308"), MutantToDec.getValue("307"), "Agregat 2", image.getKlapne());
        this.dozator3 = new Prekidac(MutantToDec.getValue("29F"), MutantToDec.getValue("29E"), "Agregat 3", image.getKlapne());
        this.dozator4 = new Prekidac(MutantToDec.getValue("29D"), MutantToDec.getValue("29C"), "Agregat 4", image.getKlapne());
        this.dozator5 = new Prekidac(MutantToDec.getValue("306"), MutantToDec.getValue("305"), "Agregat 5", image.getKlapne());
        this.dozator6 = new Prekidac(MutantToDec.getValue("304"), MutantToDec.getValue("303"), "Agregat 6", image.getKlapne());
        this.dozator7 = new Prekidac(MutantToDec.getValue("29B"), MutantToDec.getValue("29A"), "Agregat 7", image.getKlapne());
        this.klapnaVagaFrakcije = new Taster(MutantToDec.getValue("300"), "Klapna vage filera", image.getKlapne());
        this.VagaFrakcije = new AnalognaMinMaxOpis(224, 0, 0, 1500, "Vaga frakcije");
        this.VagaFrakcijeTariraj = new Digitalac(MutantToDec.getValue("1005"));
        this.NivoSilos1 = new AnalognaMinMaxOpis(101, 0, 0, 100, "Nivo Silos 1");
        this.NivoSilos2 = new AnalognaMinMaxOpis(102, 0, 0, 100, "Nivo Silos 2");
        this.NivoSilos3 = new AnalognaMinMaxOpis(103, 0, 0, 100, "Nivo Silos 3");
        this.NivoSilos4 = new AnalognaMinMaxOpis(104, 0, 0, 100, "Nivo Silos 4");
        this.NivoSilos5 = new AnalognaMinMaxOpis(105, 0, 0, 100, "Nivo Silos 5");
        this.NivoSilos6 = new AnalognaMinMaxOpis(106, 0, 0, 100, "Nivo Silos 6");
        this.NivoSilos7 = new AnalognaMinMaxOpis(106, 0, 0, 100, "Nivo Silos 7");
        
        this.doz1 = new AnalognaZadataIzdata(200, 212, 0 , "0-32");
        this.doz2 = new AnalognaZadataIzdata(201, 213, 0 , "0-4");
        this.doz3 = new AnalognaZadataIzdata(202, 214, 0 , "4-8");
        this.doz4 = new AnalognaZadataIzdata(203, 215, 0 , "8-11");
        this.doz5 = new AnalognaZadataIzdata(204, 216, 0 , "11-16");
        this.doz6 = new AnalognaZadataIzdata(205, 217, 0 , "16-22");
        this.doz7 = new AnalognaZadataIzdata(206, 218, 0 , "16-32");
        
        this.temperaturaFrakcija1 = new Analogna(125, 0);
        this.temperaturaFrakcija2 = new Analogna(126, 0);
     }

    public Taster getDozator1() {
        return dozator1;
    }

    public Prekidac getDozator2() {
        return dozator2;
    }

    public Prekidac getDozator3() {
        return dozator3;
    }

    public Prekidac getDozator4() {
        return dozator4;
    }

    public Prekidac getDozator5() {
        return dozator5;
    }

    public Prekidac getDozator6() {
        return dozator6;
    }

    public Prekidac getDozator7() {
        return dozator7;
    }

    public Image getImage() {
        return image;
    }

    public Taster getKlapnaVagaFrakcije() {
        return klapnaVagaFrakcije;
    }

    public AnalognaMinMaxOpis getVagaFrakcije() {
        return VagaFrakcije;
    }

    public AnalognaMinMaxOpis getNivoSilos2() {
        return NivoSilos2;
    }

    public AnalognaMinMaxOpis getNivoSilos3() {
        return NivoSilos3;
    }

    public AnalognaMinMaxOpis getNivoSilos4() {
        return NivoSilos4;
    }

    public AnalognaMinMaxOpis getNivoSilos5() {
        return NivoSilos5;
    }

    public AnalognaMinMaxOpis getNivoSilos6() {
        return NivoSilos6;
    }

    public AnalognaMinMaxOpis getNivoSilos7() {
        return NivoSilos7;
    }

    public AnalognaZadataIzdata getDoz1() {
        return doz1;
    }

    public AnalognaZadataIzdata getDoz2() {
        return doz2;
    }

    public AnalognaZadataIzdata getDoz3() {
        return doz3;
    }

    public AnalognaZadataIzdata getDoz4() {
        return doz4;
    }

    public AnalognaZadataIzdata getDoz5() {
        return doz5;
    }

    public AnalognaZadataIzdata getDoz6() {
        return doz6;
    }

    public AnalognaZadataIzdata getDoz7() {
        return doz7;
    }

    public AnalognaMinMaxOpis getNivoSilos1() {
        return NivoSilos1;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Analogna getTemperaturaFrakcija1() {
        return temperaturaFrakcija1;
    }

    public Analogna getTemperaturaFrakcija2() {
        return temperaturaFrakcija2;
    }

    public Digitalac getVagaFrakcijeTariraj() {
        return VagaFrakcijeTariraj;
    }

    
}