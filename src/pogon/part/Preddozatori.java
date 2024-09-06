/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.part;

import constatnt.Image;
import pogon.osnova.Digitalac;
import pogon.osnova2.Preddozator;
import utils.MutantToDec;



/**
 *
 * @author Branko
 */
public class Preddozatori {
   private final Preddozator Preddozator1;
   private final Preddozator Preddozator2;
   private final Preddozator Preddozator3;
   private final Preddozator Preddozator4;
   private final Preddozator Preddozator5;
   private final Digitalac Preddozator5Vibrator;
   private final Preddozator Preddozator6;
   private final Preddozator Preddozator7;
   private final Digitalac Preddozator7Vibrator;
   private final Preddozator Preddozator8;
   private final Preddozator Preddozator9;
   private final Preddozator Preddozator10;
   private final Preddozator Preddozator11;
   
   private boolean saveChangeInDb=false;
   
   private final Image image;
  
   
   public Preddozatori(){
       this.image = new Image();
       
       this.Preddozator1 = new Preddozator( 49, 0 ,
               MutantToDec.getValue("84"), 
               MutantToDec.getValue("54"), 
               MutantToDec.getValue("64"),
               MutantToDec.getValue("340"),
               MutantToDec.getValue("350"),
               "Preddozator 1",
               image.getFrekfrentni(),
               image.getYesNo());
       
       this.Preddozator2 = new Preddozator( 50, 0 ,
               MutantToDec.getValue("85"), 
               MutantToDec.getValue("55"), 
               MutantToDec.getValue("65"),
               MutantToDec.getValue("341"),
               MutantToDec.getValue("351"),
               "Preddozator 2",
               image.getFrekfrentni(),
               image.getYesNo());
       
       this.Preddozator3 = new Preddozator( 51, 0 ,
               MutantToDec.getValue("86"), 
               MutantToDec.getValue("56"), 
               MutantToDec.getValue("66"),
               MutantToDec.getValue("342"),
               MutantToDec.getValue("352"),
               "Preddozator 3",
               image.getFrekfrentni(),
               image.getYesNo());
       
       this.Preddozator4 = new Preddozator( 52, 0 ,
               MutantToDec.getValue("87"), 
               MutantToDec.getValue("57"), 
               MutantToDec.getValue("67"),
               MutantToDec.getValue("343"),
               MutantToDec.getValue("353"),
               "Preddozator 4",
               image.getFrekfrentni(),
               image.getYesNo());
       
       this.Preddozator5 = new Preddozator( 53, 0 ,
               MutantToDec.getValue("88"), 
               MutantToDec.getValue("58"), 
               MutantToDec.getValue("68"),
               MutantToDec.getValue("344"),
               MutantToDec.getValue("354"),
               "Preddozator 5",
               image.getFrekfrentni(),
               image.getYesNo());
       
       this.Preddozator6 = new Preddozator( 54, 0 ,
               MutantToDec.getValue("89"), 
               MutantToDec.getValue("59"), 
               MutantToDec.getValue("69"),
               MutantToDec.getValue("345"),
               MutantToDec.getValue("355"),
               "Preddozator 6",
               image.getFrekfrentni(),
               image.getYesNo());
       
       this.Preddozator7 = new Preddozator( 55, 0 ,
               MutantToDec.getValue("8A"), 
               MutantToDec.getValue("5A"), 
               MutantToDec.getValue("6A"),
               MutantToDec.getValue("346"),
               MutantToDec.getValue("356"),
               "Preddozator 7",
               image.getFrekfrentni(),
               image.getYesNo());
       
       this.Preddozator8 = new Preddozator( 56, 0 ,
               MutantToDec.getValue("8B"), 
               MutantToDec.getValue("5B"), 
               MutantToDec.getValue("6B"),
               MutantToDec.getValue("347"),
               MutantToDec.getValue("357"),
               "Preddozator 8",
               image.getFrekfrentni(),
               image.getYesNo());
       
       this.Preddozator9 = new Preddozator( 57, 0 ,
               MutantToDec.getValue("8C"), 
               MutantToDec.getValue("5C"), 
               MutantToDec.getValue("6C"),
               MutantToDec.getValue("348"),
               MutantToDec.getValue("358"),
               "Preddozator 9",
               image.getFrekfrentni(),
               image.getYesNo());
       
       this.Preddozator10 = new Preddozator( 58, 0 ,
               MutantToDec.getValue("8D"), 
               MutantToDec.getValue("5D"), 
               MutantToDec.getValue("6D"),
               MutantToDec.getValue("349"),
               MutantToDec.getValue("359"),
               "Preddozator 10",
               image.getFrekfrentni(),
               image.getYesNo());
       
       this.Preddozator11 = new Preddozator( 59, 0 ,
               MutantToDec.getValue("8E"), 
               MutantToDec.getValue("5E"), 
               MutantToDec.getValue("6E"),
               MutantToDec.getValue("34A"),
               MutantToDec.getValue("35A"),
               "Preddozator 11",
               image.getFrekfrentni(),
               image.getYesNo());
       
       this.Preddozator5Vibrator = new Digitalac(MutantToDec.getValue("90"));
       this.Preddozator7Vibrator = new Digitalac(MutantToDec.getValue("91"));
   }

    public Preddozator getPreddozator1() {
        return Preddozator1;
    }

    public Preddozator getPreddozator2() {
        return Preddozator2;
    }

    public Preddozator getPreddozator3() {
        return Preddozator3;
    }

    public Preddozator getPreddozator4() {
        return Preddozator4;
    }

    public Preddozator getPreddozator5() {
        return Preddozator5;
    }

    public Preddozator getPreddozator6() {
        return Preddozator6;
    }

    public Preddozator getPreddozator7() {
        return Preddozator7;
    }

    public Preddozator getPreddozator8() {
        return Preddozator8;
    }

    public Preddozator getPreddozator9() {
        return Preddozator9;
    }

    public Preddozator getPreddozator10() {
        return Preddozator10;
    }

    public Preddozator getPreddozator11() {
        return Preddozator11;
    }

    public boolean isSaveChangeInDb() {
        return saveChangeInDb;
    }

    public void setSaveChangeInDb(boolean saveChangeInDb) {
        this.saveChangeInDb = saveChangeInDb;
    }

    public Digitalac getPreddozator5Vibrator() {
        return Preddozator5Vibrator;
    }

    public Digitalac getPreddozator7Vibrator() {
        return Preddozator7Vibrator;
    }
   
    
}
