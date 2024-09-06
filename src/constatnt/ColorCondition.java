/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constatnt;

import java.awt.Color;

/**
 *
 * @author Branko
 */
public class ColorCondition {

    public static Color getColor(int brText) {
        
        Color color;
        
        Color svetloPlava = new Color(66, 134, 207);

        switch (brText) {
            case 0:     //zeleno
                color = Color.LIGHT_GRAY;
                break;
            
            case 1:     //plavo
                color = svetloPlava;
                break;
            case 2:
                color = svetloPlava;
                break;
            case 3:
                color = svetloPlava;
                break;
            case 4:
                color = svetloPlava;
                break;
            case 5:
                color = svetloPlava;
                break;
            case 6:
                color = svetloPlava;
                break;
            case 7:
                color = svetloPlava;
                break;
            case 8:
                color = svetloPlava;
                break;
            case 9:
                color = svetloPlava;
                break;
            
            
            case 10:        //zeleno
                color = Color.GREEN;
                break;
            
            case 11:    //plavo
                color = svetloPlava;
                break;
            case 12:
                color = svetloPlava;
                break;
            case 13:
                color = svetloPlava;
                break;
            case 14:
                color = svetloPlava;
                break;
            case 15:
                color = svetloPlava;
                break;
            case 16:
                color = svetloPlava;
                break;
            case 17:
                color = svetloPlava;
                break;
            case 18:
                color = svetloPlava;
                break;
            case 19:
                color = svetloPlava;
                break;
            default:
                color = Color.LIGHT_GRAY;
        }
        return color;
    }
    
    
}
