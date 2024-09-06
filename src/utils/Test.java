/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import constatnt.TextCondition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import proracun.Linear;

/**
 *
 * @author branko.scekic
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        String a = "350";
        String b = "351";
        String c = "156";
        System.out.println(a + " = " + MutantToDec.getValue(a));
        System.out.println(b + " = " + MutantToDec.getValue(b));
        System.out.println(c + " = " + MutantToDec.getValue(c));
        
        //System.out.println(Linear.getLinearResult(5, 0.7f, 0, 50));
        
        //double s = Convert.shiftPointDoubleSign(Convert.objectToInt(64536d, 0),1);
        //int s2 = Convert.objectToInt(64536d, 0);
        
        //System.out.println(s);
        //System.out.println(s2);
        
        //int nizi = 1;
        //int visi = 1;
        
        //long c = Convert.getTwoRegisterIntShiftPointToInt(visi, nizi);
        
        //long c = 97580;     //65536
        
        //System.out.println("Nizi "+nizi);
        //System.out.println("Visi "+visi);
        //System.out.println("Dva registra  "+c);
        
        //int[] cement = Convert.convertDoubleToTwoInt((long) (c));
                
        //int[] upis = new int[2];
        //upis[0] = cement[0];
        //upis[1] = cement[1];
        
        //System.out.println("Nizi  "+upis[0]);
        //System.out.println("Visi  "+upis[1]);
        
        
        
    }
}
