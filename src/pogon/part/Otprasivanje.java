/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.part;

import constatnt.Image;
import pogon.osnova.Digitalac;
import pogon.osnova2.Preddozator;
import pogon.osnova2.FrekfrentniUprosceno;
import pogon.osnova2.PrekidacSaIndikaciomGreske;
import pogon.osnova2.PrekidacSaIndikaciomGreskeIPokazivacimaKrajnjegPrekidaca;
import pogon.osnova2.Taster;
import pogon.osnova2.TasterSaRadomIGreskom;
import utils.MutantToDec;

/**
 *
 * @author Branko
 */
public class Otprasivanje {
    private final TasterSaRadomIGreskom PumpaGorioniikaNaKanalu;
    private final Taster GorionikNaKanalu;
    private final TasterSaRadomIGreskom VentilatorOtprasivanja1;
    private final TasterSaRadomIGreskom VentilatorOtprasivanja2;
    private final TasterSaRadomIGreskom VentilatorOtprasivanja3;
    private final TasterSaRadomIGreskom VentilatorOtprasivanja4;
    private final PrekidacSaIndikaciomGreskeIPokazivacimaKrajnjegPrekidaca KlapnaSvezegVazduha;
    private final TasterSaRadomIGreskom VentilatorOtprasivanja;
    private final TasterSaRadomIGreskom KlapnaOtprasivanja;
    private final PrekidacSaIndikaciomGreske PosmakOtprasivane;
    private final Taster VibroSito;
    private final Taster VruciElevator;
    private final Taster PuzGrubePrasine1;
    private final Digitalac PuzGrubePrasine1Bimetal;
    private final Taster PuzGrubePrasine2;
    private final Digitalac PuzGrubePrasine2Bimetal;
    private final Taster PuzGrubePrasine3;
    private final Digitalac PuzGrubePrasine3Bimetal;
    private final TasterSaRadomIGreskom PuzIspodFilera;
    private final Taster PuzSopstvenogFilera1;
    private final Digitalac PuzSopstvenogFilera1Bimetal;
    private final Taster PuzSopstvenogFilera2;
    private final Digitalac PuzSopstvenogFilera2Bimetal;
    private final TasterSaRadomIGreskom ElevatorSopstvenogFilera;
    private boolean OtsisniVentilator;
    private final FrekfrentniUprosceno OtsisniVentilatorF;
    private final PrekidacSaIndikaciomGreskeIPokazivacimaKrajnjegPrekidaca KlapnaNaOtsisniVentil;
    private final Taster klapna1;
    private final Taster klapna2;
    private final Taster klapna3;
    
    private final Image image;

    public Otprasivanje() {
        this.image = new Image();
        
        this.PumpaGorioniikaNaKanalu = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("224"), 
               MutantToDec.getValue("200"), 
               MutantToDec.getValue("201"),
               "Pumpa gorionika",
               image.getPumpe());
        
        this.GorionikNaKanalu = new Taster(
               MutantToDec.getValue("22B"),
               "Gorionik na kanalu",
               image.getGorionik()
        );
        this.VentilatorOtprasivanja1 = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("12B"), 
               MutantToDec.getValue("117"), 
               MutantToDec.getValue("10B"),
               "Ventilator otprasivanja 1",
               image.getfan());
        this.VentilatorOtprasivanja2 = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("12A"), 
               MutantToDec.getValue("116"), 
               MutantToDec.getValue("10A"),
               "Ventilator otprasivanja 2",
               image.getfan());
        this.VentilatorOtprasivanja3 = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("129"), 
               MutantToDec.getValue("115"), 
               MutantToDec.getValue("109"),
               "Ventilator otprasivanja 3",
               image.getfan());
        this.VentilatorOtprasivanja4 = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("12C"), 
               MutantToDec.getValue("118"), 
               MutantToDec.getValue("10E"),
               "Ventilator otprasivanja 4",
               image.getfan()
        );
        this.KlapnaSvezegVazduha = new PrekidacSaIndikaciomGreskeIPokazivacimaKrajnjegPrekidaca(
                MutantToDec.getValue("12F"), 
                MutantToDec.getValue("128"), 
                MutantToDec.getValue("114"), 
                MutantToDec.getValue("11B"), 
                MutantToDec.getValue("108"), 
                MutantToDec.getValue("99"), 
                MutantToDec.getValue("9A"),
                "Klapna svezeg vazduha",
                image.getKlapneMedjupolozajSaKrajnjimPrekidacima()
        );
        this.VentilatorOtprasivanja = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("127"), 
               MutantToDec.getValue("113"), 
               MutantToDec.getValue("107"),
               "Ventilator otprasivanja",
               image.getfan()
        );
        this.KlapnaOtprasivanja = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("125"), 
               MutantToDec.getValue("111"), 
               MutantToDec.getValue("105"),
               "Klapna otprasivanja",
               image.getKlapne()
        );
        this.PosmakOtprasivane = new PrekidacSaIndikaciomGreske(
                MutantToDec.getValue("126"), 
                MutantToDec.getValue("12E"), 
                MutantToDec.getValue("112"), 
                MutantToDec.getValue("11A"), 
                MutantToDec.getValue("106"),
                "Posmak otprasivanja",
                image.getKlapneMedjupolozajSaKrajnjimPrekidacima()
        );
        this.VibroSito = new Taster(
               MutantToDec.getValue("31E"),
               "Vibro sito",
               image.getVibracija()
        );
        this.VruciElevator = new Taster(
               MutantToDec.getValue("31F"),
               "Vruci elevator",
               image.getFrekfrentni()
        );
        this.PuzGrubePrasine1 = new Taster(
               MutantToDec.getValue("220"),
               "Gruba prasina 1",
               image.getPuznePumpe()
        );
        this.PuzGrubePrasine1Bimetal = new Digitalac(
               MutantToDec.getValue("199")
        );
        this.PuzGrubePrasine2 = new Taster(
               MutantToDec.getValue("221"),
               "Gruba prasina 2",
               image.getPuznePumpe()
        );
        this.PuzGrubePrasine2Bimetal = new Digitalac(
               MutantToDec.getValue("19B")
        );
        this.PuzGrubePrasine3 = new Taster(
               MutantToDec.getValue("222"),
               "Gruba prasina 3",
               image.getPuznePumpe()
        );
        this.PuzGrubePrasine3Bimetal = new Digitalac(
               MutantToDec.getValue("19D")
        );
        this.PuzIspodFilera = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("124"), 
               MutantToDec.getValue("110"), 
               MutantToDec.getValue("104"),
               "Puz ispod filera",
               image.getPuznePumpe()
        );
        this.PuzSopstvenogFilera1 = new Taster(
               MutantToDec.getValue("21E"),
               "Sopstveni filer 1",
               image.getPuznePumpe()
        );
        this.PuzSopstvenogFilera1Bimetal = new Digitalac(
               MutantToDec.getValue("195")
        );        
        this.PuzSopstvenogFilera2 = new Taster(
               MutantToDec.getValue("21F"),
               "Sopstveni filer 2",
               image.getPuznePumpe()
        );
        this.PuzSopstvenogFilera2Bimetal = new Digitalac(
               MutantToDec.getValue("197")
        );
        this.ElevatorSopstvenogFilera = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("31D"), 
               MutantToDec.getValue("34"), 
               MutantToDec.getValue("33"),
               "Elevator sopstvenog filera",
               image.getFrekfrentni()
        );
        this.KlapnaNaOtsisniVentil = new PrekidacSaIndikaciomGreskeIPokazivacimaKrajnjegPrekidaca(
                MutantToDec.getValue("12D"), 
                MutantToDec.getValue("130"), 
                MutantToDec.getValue("119"), 
                MutantToDec.getValue("11C"), 
                MutantToDec.getValue("10F"), 
                MutantToDec.getValue("11D"), 
                MutantToDec.getValue("11E"),
                "Klapna na otsisni ventilator",
                image.getKlapneMedjupolozajSaKrajnjimPrekidacima()
        );
        
        this.OtsisniVentilatorF = new FrekfrentniUprosceno( 85, 0 ,
               MutantToDec.getValue("9C"),
               "Ventilator otprasivanja",
               image.getFrekfrentni());
        
        this.klapna1 = new Taster(
               MutantToDec.getValue("318"),
               "Klapna 1",
               image.getSwitchOnOff()
        );
        this.klapna2 = new Taster(
               MutantToDec.getValue("319"),
               "Klapna 2",
               image.getSwitchOnOff()
        );
        this.klapna3 = new Taster(
               MutantToDec.getValue("31A"),
               "Klapna 3",
               image.getSwitchOnOff()
        );
    }

    public TasterSaRadomIGreskom getPumpaGorioniikaNaKanalu() {
        return PumpaGorioniikaNaKanalu;
    }

    public Taster getGorionikNaKanalu() {
        return GorionikNaKanalu;
    }

    public TasterSaRadomIGreskom getVentilatorOtprasivanja1() {
        return VentilatorOtprasivanja1;
    }

    public TasterSaRadomIGreskom getVentilatorOtprasivanja2() {
        return VentilatorOtprasivanja2;
    }

    public TasterSaRadomIGreskom getVentilatorOtprasivanja3() {
        return VentilatorOtprasivanja3;
    }

    public TasterSaRadomIGreskom getVentilatorOtprasivanja4() {
        return VentilatorOtprasivanja4;
    }

    public PrekidacSaIndikaciomGreskeIPokazivacimaKrajnjegPrekidaca getKlapnaSvezegVazduha() {
        return KlapnaSvezegVazduha;
    }

    public TasterSaRadomIGreskom getVentilatorOtprasivanja() {
        return VentilatorOtprasivanja;
    }

    public TasterSaRadomIGreskom getKlapnaOtprasivanja() {
        return KlapnaOtprasivanja;
    }

    public PrekidacSaIndikaciomGreske getPosmakOtprasivane() {
        return PosmakOtprasivane;
    }

    public Taster getVibroSito() {
        return VibroSito;
    }

    public Taster getVruciElevator() {
        return VruciElevator;
    }

    public Image getImage() {
        return image;
    }

    public Taster getPuzGrubePrasine1() {
        return PuzGrubePrasine1;
    }

    public Taster getPuzGrubePrasine2() {
        return PuzGrubePrasine2;
    }

    public Taster getPuzGrubePrasine3() {
        return PuzGrubePrasine3;
    }

    public TasterSaRadomIGreskom getPuzIspodFilera() {
        return PuzIspodFilera;
    }

    public Taster getPuzSopstvenogFilera1() {
        return PuzSopstvenogFilera1;
    }

    public Taster getPuzSopstvenogFilera2() {
        return PuzSopstvenogFilera2;
    }

    public TasterSaRadomIGreskom getElevatorSopstvenogFilera() {
        return ElevatorSopstvenogFilera;
    }

    public PrekidacSaIndikaciomGreskeIPokazivacimaKrajnjegPrekidaca getKlapnaNaOtsisniVentil() {
        return KlapnaNaOtsisniVentil;
    }

    public boolean isOtsisniVentilator() {
        return OtsisniVentilator;
    }
    
    

    public void setOtsisniVentilator(boolean OtsisniVentilator) {
        this.OtsisniVentilator = OtsisniVentilator;
    }

    public FrekfrentniUprosceno getOtsisniVentilatorF() {
        return OtsisniVentilatorF;
    }
   
    public Taster getKlapna1() {
        return klapna1;
    }

    public Taster getKlapna2() {
        return klapna2;
    }

    public Taster getKlapna3() {
        return klapna3;
    }

    public Digitalac getPuzSopstvenogFilera1Bimetal() {
        return PuzSopstvenogFilera1Bimetal;
    }

    public Digitalac getPuzSopstvenogFilera2Bimetal() {
        return PuzSopstvenogFilera2Bimetal;
    }

    public Digitalac getPuzGrubePrasine1Bimetal() {
        return PuzGrubePrasine1Bimetal;
    }

    public Digitalac getPuzGrubePrasine2Bimetal() {
        return PuzGrubePrasine2Bimetal;
    }

    public Digitalac getPuzGrubePrasine3Bimetal() {
        return PuzGrubePrasine3Bimetal;
    }
    
    
}