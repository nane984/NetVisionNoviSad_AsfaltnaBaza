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
import pogon.osnova2.TezineDvaRegistra;
import pogon.osnova2.Prekidac;
import pogon.osnova2.Taster;
import pogon.osnova2.TasterSaPokazivacemPolozaja;
import pogon.osnova2.VagaNivo;
import utils.MutantToDec;

/**
 *
 * @author Branko
 */
public class Bitumen {
    private final TasterSaPokazivacemPolozaja VentilPunjenjeCB1;
    private final TasterSaPokazivacemPolozaja VentilPunjenjeCB2;
    private final TasterSaPokazivacemPolozaja VentilPunjenjeCB3;
    private final TasterSaPokazivacemPolozaja VentilPraznjenjeCB1;
    private final TasterSaPokazivacemPolozaja VentilPraznjenjeCB2;
    private final TasterSaPokazivacemPolozaja VentilPraznjenjeCB3;
    private final Taster KlapnaBitumena;
    private final TasterSaPokazivacemPolozaja KlapnaIspodVageBitumena;
    private final VagaNivo VagaBitumen;
    private final Digitalac VagaBitumenTariraj;
    private final Prekidac PumpaBitumena;
    private final AnalognaZadataIzdata kolicine;
    private final Analogna tempB1;
    private final Analogna tempB2;
    private final Analogna tempB3;
    private final Analogna tempBitumenPrateceGrejanje;
    private final Analogna tempBitumen;
    private final TezineDvaRegistra silosBitumen1;
    private final TezineDvaRegistra silosBitumen2;
    private final TezineDvaRegistra silosBitumen3;
    private final VagaNivo nivoSilosBitumen1;
    private final VagaNivo nivoSilosBitumen2;
    private final VagaNivo nivoSilosBitumen3;
    
    private final Image image;
    
    public Bitumen(){
        this.image = new Image();
        
        this.VentilPunjenjeCB1 = new TasterSaPokazivacemPolozaja(
                MutantToDec.getValue("301"),
                MutantToDec.getValue("56"),
                MutantToDec.getValue("57"),
                "Ventil punjenja CB1",
                image.getKlapne()
        );
                
        this.VentilPunjenjeCB2 = new TasterSaPokazivacemPolozaja(
                MutantToDec.getValue("30D"),
                MutantToDec.getValue("67"),
                MutantToDec.getValue("68"),
                "Ventil punjenja CB2",
                image.getKlapne()
        );        
       
        this.VentilPunjenjeCB3 = new TasterSaPokazivacemPolozaja(
                MutantToDec.getValue("30B"),
                MutantToDec.getValue("5F"),
                MutantToDec.getValue("60"),
                "Ventil punjenja CB3",
                image.getKlapne()
        );    
        
        this.VentilPraznjenjeCB1 = new TasterSaPokazivacemPolozaja(
                MutantToDec.getValue("302"),
                MutantToDec.getValue("58"),
                MutantToDec.getValue("5A"),
                "Ventil praznjenja CB1",
                image.getKlapne()
        );   
        
        this.VentilPraznjenjeCB2 = new TasterSaPokazivacemPolozaja(
                MutantToDec.getValue("30E"),
                MutantToDec.getValue("69"),
                MutantToDec.getValue("6A"),
                "Ventil praznjenja CB2",
                image.getKlapne()
        );
        
        this.VentilPraznjenjeCB3 = new TasterSaPokazivacemPolozaja(
                MutantToDec.getValue("30C"),
                MutantToDec.getValue("62"),
                MutantToDec.getValue("61"),
                "Ventil praznjenja CB3",
                image.getKlapne()
        ); 
        
        this.KlapnaBitumena = new Taster(
                MutantToDec.getValue("312"),
                "Klapna butumena",
                image.getKlapne()
        );
        
        this.KlapnaIspodVageBitumena = new TasterSaPokazivacemPolozaja(
                MutantToDec.getValue("313"),
                MutantToDec.getValue("0"),
                MutantToDec.getValue("10B"),
                "Klapna ispod vage bitumena",
                image.getKlapne()
        );
        this.VagaBitumen = new VagaNivo(226, 0, 0, 32768, "Vaga bitumen");
        this.PumpaBitumena = new Prekidac(MutantToDec.getValue("322"), MutantToDec.getValue("323"), "Pumpa bitumen", image.getPumpeLD());
        this.kolicine = new AnalognaZadataIzdata(209, 221, 0 , "Bitumen");
        this.tempB1 = new Analogna(93, 0);
        this.tempB2 = new Analogna(94, 0);
        this.tempB3 = new Analogna(95, 0);
        this.tempBitumenPrateceGrejanje = new Analogna(91, 0);
        this.tempBitumen = new Analogna(129, 0);
        
        
        this.silosBitumen1 = new TezineDvaRegistra(334, 335, 2147483647, 0, "Silos bitumen br. 1");
        this.silosBitumen2 = new TezineDvaRegistra(336, 337, 2147483647, 0, "Silos bitumen br. 2");
        this.silosBitumen3 = new TezineDvaRegistra(338, 339, 2147483647, 0, "Silos bitumen br. 3");
        
        this.nivoSilosBitumen1 = new VagaNivo(146, 0, 0, 100, "Nivo u silosu 1");
        this.nivoSilosBitumen2 = new VagaNivo(147, 0, 0, 100, "Nivo u silosu 1");
        this.nivoSilosBitumen3 = new VagaNivo(148, 0, 0, 100, "Nivo u silosu 1");
        
        this.VagaBitumenTariraj = new Digitalac(MutantToDec.getValue("1007"));
    }

    public TasterSaPokazivacemPolozaja getVentilPunjenjeCB1() {
        return VentilPunjenjeCB1;
    }

    public TasterSaPokazivacemPolozaja getVentilPunjenjeCB2() {
        return VentilPunjenjeCB2;
    }

    public TasterSaPokazivacemPolozaja getVentilPunjenjeCB3() {
        return VentilPunjenjeCB3;
    }

    public TasterSaPokazivacemPolozaja getVentilPraznjenjeCB1() {
        return VentilPraznjenjeCB1;
    }

    public TasterSaPokazivacemPolozaja getVentilPraznjenjeCB2() {
        return VentilPraznjenjeCB2;
    }

    public TasterSaPokazivacemPolozaja getVentilPraznjenjeCB3() {
        return VentilPraznjenjeCB3;
    }

    public Image getImage() {
        return image;
    }

    public Taster getKlapnaBitumena() {
        return KlapnaBitumena;
    }

    public TasterSaPokazivacemPolozaja getKlapnaIspodVageBitumena() {
        return KlapnaIspodVageBitumena;
    }

    public VagaNivo getVagaBitumen() {
        return VagaBitumen;
    }

    public Prekidac getPumpaBitumena() {
        return PumpaBitumena;
    }

    public AnalognaZadataIzdata getKolicine() {
        return kolicine;
    }

    public Analogna getTempB1() {
        return tempB1;
    }

    public Analogna getTempB2() {
        return tempB2;
    }

    public Analogna getTempB3() {
        return tempB3;
    }

    public Analogna getTempBitumenPrateceGrejanje() {
        return tempBitumenPrateceGrejanje;
    }

    public TezineDvaRegistra getSilosBitumen1() {
        return silosBitumen1;
    }

    public TezineDvaRegistra getSilosBitumen2() {
        return silosBitumen2;
    }

    public TezineDvaRegistra getSilosBitumen3() {
        return silosBitumen3;
    }

    public Analogna getTempBitumen() {
        return tempBitumen;
    }

    public VagaNivo getNivoSilosBitumen1() {
        return nivoSilosBitumen1;
    }

    public VagaNivo getNivoSilosBitumen2() {
        return nivoSilosBitumen2;
    }

    public VagaNivo getNivoSilosBitumen3() {
        return nivoSilosBitumen3;
    }

    public Digitalac getVagaBitumenTariraj() {
        return VagaBitumenTariraj;
    }
    
    
}