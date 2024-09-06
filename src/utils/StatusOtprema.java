/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author branko.scekic
 */
public class StatusOtprema {
    public static String getStatus(int i){
        switch(i){
            case 0:
                return "zavrsen";
            case 1:
                return "storniran";
            case 2:
                return "povrat";
            default:
                return "pult";
        }
    }
    
    private static final int Zavrsen = 0;
    private static final int Storniran = 1; 
    private static final int Povrat = 2;
    private static final int Pult = 3;

    public static int getZavrsen() {
        return Zavrsen;
    }

    public static int getStorniran() {
        return Storniran;
    }

    public static int getPovrat(){
        return Povrat;
    }
    
    public static int getPult() {
        return Pult;
    }
    
    public static int getIndexStatus(String status){
        int st = 3;

        if(status.equalsIgnoreCase("zavrsen")){
            st = 0;
        }
        if(status.equalsIgnoreCase("storniran")){
            st = 1;
        }
        if(status.equalsIgnoreCase("povrat")){
            st = 2;
        }
        if(status.equalsIgnoreCase("pult")){
            st = 3;
        }
        return st;
    }
}
