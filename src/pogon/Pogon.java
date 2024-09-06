/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon;
;
import constatnt.Image;
import pogon.osnova.Analogna;
import pogon.osnova.Digitalac;
import pogon.part.Preleti;
import pogon.osnova2.TasterSaRadomIGreskom;
import pogon.part.ZbirniParametri;
import pogon.part.Mesalica;
import pogon.part.Agregat;
import pogon.part.AsfaltSilosi;
import pogon.part.Bitumen;
import pogon.part.Filer;
import pogon.part.GrupaKomandi1;
import pogon.part.KorpaVagon;
import pogon.part.Otprasivanje;
import pogon.part.Preddozatori;
import pogon.part.Skretnica;
import pogon.part.Susara;
import pogon.part.Trake;
import utils.MutantToDec;


/**
 *
 * @author branko.scekic
 */
public class Pogon {
   
   
    
    private final Preddozatori Preddozatori;
    private final Trake Trake;
    private final Susara Susara;
    private final Otprasivanje Otprasivanje;
    private final Filer Filer;
    private final Agregat Agregat;
    private final Bitumen Bitumen;
    private final AsfaltSilosi AsfaltSilosi;
    private final Mesalica Mesalica;
    private final GrupaKomandi1 Grupakomandi;
    private final ZbirniParametri parametri;
    private final KorpaVagon KorpaVagon;
    private final TasterSaRadomIGreskom pumpaZaNaftuTermopak;
    private final Preleti preleti;
    private final Skretnica skretnica;
    private boolean sacuvajFrekfrencije;
    private final Analogna zadatoBrSarzi;
    private final Analogna izdatoBrSarzi;
    private final Digitalac writeSarzeInDb; 
   

    public Pogon(){
       this.Preddozatori = new Preddozatori();
       this.Trake = new Trake();
       this.Susara = new Susara();
       this.Otprasivanje = new Otprasivanje();
       this.Filer = new Filer();
       this.Agregat = new Agregat();
       this.Bitumen = new Bitumen();
       this.AsfaltSilosi = new AsfaltSilosi();
       this.Mesalica = new Mesalica();
       this.Grupakomandi = new GrupaKomandi1();
       this.parametri = new ZbirniParametri();
       this.KorpaVagon = new KorpaVagon();
       this.pumpaZaNaftuTermopak = new TasterSaRadomIGreskom( 
               MutantToDec.getValue("225"), 
               MutantToDec.getValue("201"), 
               MutantToDec.getValue("203"),
               "Pumpa za naftu termopak",
               new Image().getPumpe());
       
       this.preleti = new Preleti();
       this.skretnica = new Skretnica();
       this.zadatoBrSarzi = new Analogna(271,0);
       this.izdatoBrSarzi = new Analogna(272,0);
       this.writeSarzeInDb = new Digitalac(MutantToDec.getValue("330"));
    }

    public Preddozatori getPreddozatori() {
        return Preddozatori;
    }

    public Trake getTrake() {
        return Trake;
    }

    public Susara getSusara() {
        return Susara;
    }

    public Otprasivanje getOtprasivanje() {
        return Otprasivanje;
    }

    public Filer getFiler() {
        return Filer;
    }

    public Agregat getAgregat() {
        return Agregat;
    }

    public Bitumen getBitumen() {
        return Bitumen;
    }

    public AsfaltSilosi getAsfaltSilosi() {
        return AsfaltSilosi;
    }

    public Mesalica getMesalica() {
        return Mesalica;
    }

    public GrupaKomandi1 getGrupakomandi() {
        return Grupakomandi;
    }
    
    public ZbirniParametri getParametri() {
        return parametri;
    }

    public KorpaVagon getKorpaVagon() {
        return KorpaVagon;
    }
    
    

    public boolean isSacuvajFrekfrencije() {
        return sacuvajFrekfrencije;
    }

    public void setSacuvajFrekfrencije(boolean sacuvajFrekfrencije) {
        this.sacuvajFrekfrencije = sacuvajFrekfrencije;
    }

    public TasterSaRadomIGreskom getPumpaZaNaftuTermopak() {
        return pumpaZaNaftuTermopak;
    }

    public Preleti getPreleti() {
        return preleti;
    }

    public Skretnica getSkretnica() {
        return skretnica;
    }
    

    public Analogna getZadatoBrSarzi() {
        return zadatoBrSarzi;
    }

    public Analogna getIzdatoBrSarzi() {
        return izdatoBrSarzi;
    }

    public Digitalac getWriteSarzeInDb() {
        return writeSarzeInDb;
    }
    
    
}