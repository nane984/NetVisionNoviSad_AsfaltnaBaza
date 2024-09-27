/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.part;

import constatnt.Image;
import pogon.osnova.Digitalac;
import pogon.osnova2.AnalognaZadataIzdata;
import pogon.osnova2.TezineDvaRegistra;
import pogon.osnova2.Taster;
import pogon.osnova2.TasterSaPokazivacemPolozaja;
import pogon.osnova2.TasterSaRadomIGreskom;
import pogon.osnova2.AnalognaMinMaxOpis;
import utils.MutantToDec;

/**
 *
 * @author Branko
 */
public class Filer {
    private final TasterSaRadomIGreskom PuzKupovniFiler;
    private final TasterSaRadomIGreskom PuzSopstveniFiler;
    private final TasterSaPokazivacemPolozaja KlapnaKupovniFiler;
    private final TasterSaPokazivacemPolozaja KlapnaSopstveniFiler;
    private final TasterSaPokazivacemPolozaja KlapnaIspodVageFilera;
    private final Taster PuzIspodVageFilera;
    private final AnalognaMinMaxOpis VagaFilera;
    private final Digitalac VagaFileraTariraj;
    private final AnalognaMinMaxOpis TempNaUlazuFilter;
    private final AnalognaMinMaxOpis TempUilteru;
    private final AnalognaMinMaxOpis NivoUKupovnomFileru;
    private final AnalognaMinMaxOpis NivoUSopstvenomFileru;
    private final Taster VibroSilosKupovniFiler;
    private final Taster VibroSilosSopstveniFiler;
    private final Taster VibroSilosKupovniFilerOtprasivanje;
    private final AnalognaZadataIzdata kupovni;
    private final AnalognaZadataIzdata sopstveni;
    private final TezineDvaRegistra silosKupovniFiler;
    
    private final Image image;

    public Filer() {
        this.image = new Image();
        
        this.PuzKupovniFiler = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("42"), 
               MutantToDec.getValue("37"), 
               MutantToDec.getValue("36"),
               "Kupovni filer",
               image.getPuznePumpe());
        this.PuzSopstveniFiler = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("43"), 
               MutantToDec.getValue("39"), 
               MutantToDec.getValue("38"),
               "Sopstveni filer",
               image.getPuznePumpe());
        this.KlapnaKupovniFiler = new TasterSaPokazivacemPolozaja(
                MutantToDec.getValue("315"), 
                MutantToDec.getValue("10E"),
                MutantToDec.getValue("10E"),
                "Klapna kupovni filer",
                image.getKlapne());
        this.KlapnaSopstveniFiler = new TasterSaPokazivacemPolozaja(
                MutantToDec.getValue("316"), 
                MutantToDec.getValue("10F"),
                MutantToDec.getValue("10F"),
                "Klapna sopstveni filer",
                image.getKlapne());
        this.KlapnaIspodVageFilera = new TasterSaPokazivacemPolozaja(
                MutantToDec.getValue("314"), 
                MutantToDec.getValue("10C"),
                MutantToDec.getValue("10C"),
                "Klapna ispod vage filer",
                image.getKlapne());
        this.PuzIspodVageFilera = new Taster(
               MutantToDec.getValue("41"),
               "Ispod vage filera",
               image.getPuznePumpe()
        );
        this.VagaFilera = new AnalognaMinMaxOpis(225, 0, 0, 32768, "Vaga filera");
        this.TempNaUlazuFilter = new AnalognaMinMaxOpis(92, 0, 0, 32768, "Temperatura na ulazu u filter");
        this.TempUilteru = new AnalognaMinMaxOpis(96, 0, 0, 32768, "Temperatura u filteru");
        this.NivoUKupovnomFileru = new AnalognaMinMaxOpis(127, 0, 0, 100, "Nivo u kupovnom fileru");
        this.NivoUSopstvenomFileru = new AnalognaMinMaxOpis(128, 0, 0, 100, "Nivo u sopstvenom fileru");
        
        this.VibroSilosKupovniFiler = new Taster(
               MutantToDec.getValue("331"),
               "Vibro silos kupovnog filera",
               image.getVibracija()
        );
        this.VibroSilosSopstveniFiler = new Taster(
               MutantToDec.getValue("32F"),
               "Vibro silos sopstvenog filera",
               image.getVibracija()
        );
         this.VibroSilosKupovniFilerOtprasivanje = new Taster(
               MutantToDec.getValue("332"),
               "Vibro silos kupovnog filera otprasivanje",
               image.getVibracija()
        );
        
        this.kupovni = new AnalognaZadataIzdata(207, 219, 0 , "Kupovni filer");
        this.sopstveni = new AnalognaZadataIzdata(208, 220, 0 , "Sopstveni filer");
        this.silosKupovniFiler = new TezineDvaRegistra(332, 333, 2147483647, 0, "Silos kupovni filer");
        
        this.VagaFileraTariraj = new Digitalac(MutantToDec.getValue("1006"));
    }

    public TasterSaRadomIGreskom getPuzKupovniFiler() {
        return PuzKupovniFiler;
    }

    public TasterSaRadomIGreskom getPuzSopstveniFiler() {
        return PuzSopstveniFiler;
    }

    public TasterSaPokazivacemPolozaja getKlapnaKupovniFiler() {
        return KlapnaKupovniFiler;
    }

    public TasterSaPokazivacemPolozaja getKlapnaSopstveniFiler() {
        return KlapnaSopstveniFiler;
    }

    public TasterSaPokazivacemPolozaja getKlapnaIspodVageFilera() {
        return KlapnaIspodVageFilera;
    }

    public Taster getPuzIspodVageFilera() {
        return PuzIspodVageFilera;
    }

    public Image getImage() {
        return image;
    }

    public AnalognaMinMaxOpis getVagaFilera() {
        return VagaFilera;
    }

    public AnalognaMinMaxOpis getTempNaUlazuFilter() {
        return TempNaUlazuFilter;
    }

    public AnalognaMinMaxOpis getTempUilteru() {
        return TempUilteru;
    }

    public AnalognaMinMaxOpis getNivoUKupovnomFileru() {
        return NivoUKupovnomFileru;
    }

    public AnalognaMinMaxOpis getNivoUSopstvenomFileru() {
        return NivoUSopstvenomFileru;
    }

    public AnalognaZadataIzdata getKupovni() {
        return kupovni;
    }

    public AnalognaZadataIzdata getSopstveni() {
        return sopstveni;
    }

    public TezineDvaRegistra getSilosKupovniFiler() {
        return silosKupovniFiler;
    }

    public Digitalac getVagaFileraTariraj() {
        return VagaFileraTariraj;
    }

    public Taster getVibroSilosKupovniFiler() {
        return VibroSilosKupovniFiler;
    }

    public Taster getVibroSilosSopstveniFiler() {
        return VibroSilosSopstveniFiler;
    }

    public Taster getVibroSilosKupovniFilerOtprasivanje() {
        return VibroSilosKupovniFilerOtprasivanje;
    }
}
