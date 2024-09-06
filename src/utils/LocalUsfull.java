/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Branko
 */
public class LocalUsfull {
    
    public static int[] getStanjeZalihaMinusKolicina(int visa, int niza, int minus){
        double r = Convert.getTwoRegisterIntShiftPointToDouble(visa, niza, 0);
        int[] result = Convert.convertDoubleToTwoInt((long) ((long) r - minus));
        int[] upis = new int[2];
        upis[0] = result[0];
        upis[1] = result[1];
        
        return upis;
    }
}
