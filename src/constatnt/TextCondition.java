/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constatnt;

/**
 *
 * @author Branko
 */
public class TextCondition {

    public static String getTextTransport(int brText) {
        
        String text = "";

        switch (brText) {
            case 0:     //sivo
                text = "TRANSPORT STOP";
                break;
            
            case 1:     //plavo
                text = "START VIBRO SITA";
                break;
            case 2:
                text = "START ELEVATORA";
                break;
            case 3:
                text = "START PUZEVA 3";
                break;
            case 4:
                text = "START PUZEVA 2";
                break;
            case 5:
                text = "START PUZA 1";
                break;
            case 6:
                text = "START PUZA KROZ FILER";
                break;
            case 7:
                text = "START KOSE TRAKE";
                break;
            case 8:
                text = "START TRAKA PREDDOZATORA 6-11";
                break;
            case 9:
                text = "START TRAKA PREDDOZATORA 1-5";
                break;
            
            
            case 10:        //zeleno
                text = "AUTOMATSKI RAD POGONA";
                break;
            
            case 11:    //plavo
                text = "PRAZNJENJE TRAKE PREDDOZATORA 1-5";
                break;
            case 12:
                text = "PRAZNJENJE TRAKE PREDDOZATORA 6-11";
                break;
            case 13:
                text = "PRAZNJENJE KOSE TRAKE";
                break;
            case 14:
                text = "PRAZNJENJE ROTACIONE PECI";
                break;
            case 15:
                text = "PRAZNJENJE PUZA 1";
                break;
            case 16:
                text = "PRAZNJENJE PUZEVA 2";
                break;
            case 17:
                text = "PRAZNJENJE PUZEVA 3";
                break;
            case 18:
                text = "PRAZNJENJE ELEVATORA";
                break;
            case 19:
                text = "PRAZNJENJE VIBRO SITO";
                break;
            default:
                text = "";
        }
        return text;
    }
    
    public static String getTextStatusFrakcije(int brText){
        String status="";
        
        switch(brText){
            case 1:
                status="1-GRUBO DOZIRANJE IZ BOKSA 1";
                break;
            case 2:
                status="2-PRITVARANJE KLAPNE BOKSA 1";
                break;
            case 3:
                status="3-FINO DOZIRANJE IZ BOKSA 1";
                break;
            case 4:
                status="4-SMIRIVANJE VAGE";
                break;
            case 5:
                status="5-GRUBO DOZIRANJE IZ BOKSA 2";
                break;
            case 6:
                status="6-PRITVARANJE KLAPNE BOKSA 2";
                break;
            case 7:
                status="7-FINO DOZIRANJE IZ BOKSA 2";
                break;
            case 8:
                status="8-SMIRIVANJE VAGE";
                break;
            case 9:
                status="9-GRUBO DOZIRANJE IZ BOKSA 3";
                break;
            case 10:
                status="10-PRITVARANJE KLAPNE BOKSA 3";
                break;
            case 11:
                status="11-FINO DOZIRANJE IZ BOKSA 3";
                break;
            case 12:
                status="12-SMIRIVANJE VAGE";
                break;
            case 13:
                status="13-GRUBO DOZIRANJE IZ BOKSA 4";
                break;
            case 14:
                status="14-PRITVARANJE KLAPNE BOKSA 4";
                break;
            case 15:
                status="15-FINO DOZIRANJE IZ BOKSA 4";
                break;
            case 16:
                status="16-SMIRIVANJE VAGE";
                break;
            case 17:
                status="17-GRUBO DOZIRANJE IZ BOKSA 5";
                break;
            case 18:
                status="18-PRITVARANJE KLAPNE BOKSA 5";
                break;
            case 19:
                status="19-FINO DOZIRANJE IZ BOKSA 5";
                break;
            case 20:
                status="20-SMIRIVANJE VAGE";
                break;
            case 21:
                status="21-GRUBO DOZIRANJE IZ BOKSA 6";
                break;
            case 22:
                status="22-PRITVARANJE KLAPNE BOKSA 6";
                break;
            case 23:
                status="23-FINO DOZIRANJE IZ BOKSA 6";
                break;
            case 24:
                status="24-SMIRIVANJE VAGE";
                break;
             case 25:
                status="25-GRUBO DOZIRANJE IZ BOKSA 7";
                break;
            case 26:
                status="26-PRITVARANJE KLAPNE BOKSA 7";
                break;
            case 27:
                status="27-FINO DOZIRANJE IZ BOKSA 7";
                break;
            case 28:
                status="28-SMIRIVANJE VAGE";
                break;
            case 29:
                status="29-CEKANJE NA PRAZNJENJE";
                break;
            case 30:
                status="30-PRAZJENJE VAGE";
                break;
            case 31:
                status="31-ZATVARANJE VAGE";
                break;
            default:
                status="";
                break;
        }
        return status;
    } 
    
}
