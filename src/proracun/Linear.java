/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proracun;

/**
 *
 * @author Branko
 */
public class Linear {
    
    public static int getLinearResult(int x, float koef, int t0, int t1){
        int result =0;
        result = Math.round(x*koef);
        
        if(result <t0){
            return t0;
        }else if(result > t1){
            return t1;
        }else{
            return result;
        }
    }
    
}
