/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constatnt;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import pogon.osnova.Digitalac;
import pogon.osnova2.TasterSaDvaOpisa;

/**
 *
 * @author Branko
 */
public class LabelText {
    
    public static void getColor(JButton label, Digitalac taster){
        if(taster.isVrednost()){
            label.setBackground(Color.GREEN);
            //return label;
        }else{
            label.setBackground(Color.LIGHT_GRAY);
            //return label;
        }
    }
    
    public static void getText(JToggleButton label, TasterSaDvaOpisa taster){
        if(taster.getKomanda().isVrednost()){
            label.setText(taster.getOpisOn());
            label.setSelected(true);
            label.setBackground(taster.getColorOn());
            //return label;
        }else{
            label.setText(taster.getOpisOff());
            label.setSelected(false);
            label.setBackground(taster.getColorOff());
            //return label;
        }
    }
    
    public static void getText(JButton label,int value){
        label.setText(TextCondition.getTextTransport(value));
        label.setBackground(ColorCondition.getColor(value));  
        
    }
    
}
