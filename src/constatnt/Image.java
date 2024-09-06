/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constatnt;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author branko.scekic
 */
public class Image {

    private final ImageIcon klapnuZatvori;
    private final ImageIcon klapnuOtvori;
    
    private final ImageIcon klapnuNeutral;
    private final ImageIcon klapnuDesno;
    private final ImageIcon klapnuLevo;
    private final ImageIcon klapnuRadL;
    private final ImageIcon klapnuRadD;
    private final ImageIcon klapnuErr;

    private final ImageIcon puznaPumpaOn;
    private final ImageIcon puznaPumpaOff;
    private final ImageIcon puznaPumpaErr;
    
    private final ImageIcon pumpaOn;
    private final ImageIcon pumpaOnLeft;
    private final ImageIcon pumpaOff;
    private final ImageIcon pumpaErr;

    private final ImageIcon rucno;
    private final ImageIcon automatski;
    
    private final ImageIcon switchOn;
    private final ImageIcon switchOff;

    private final ImageIcon trakaOn;
    private final ImageIcon trakaOff;
    private final ImageIcon trakaErr;

    private final ImageIcon izdozirano;

    private final ImageIcon mesalicaOn;
    private final ImageIcon mesalicaOff;

    private final ImageIcon vibracijaOn;
    private final ImageIcon vibracijaOff;

    private final ImageIcon fanOn;
    private final ImageIcon fanOff;
     private final ImageIcon fanErr;
    
    private final ImageIcon gorionikOn;
    private final ImageIcon gorionikOff;
    
    private final ImageIcon Yes;
    private final ImageIcon No;
    
    private final ImageIcon frequentOn;
    private final ImageIcon frequentOff;
    private final ImageIcon frequentErr;

    private final int klapne = 0;
    private final int puznePumpe = 1;
    private final int pumpe = 2;
    private final int rucnoAutomatski = 3;
    private final int switchOnOff = 4;
    private final int trake = 5;
    private final int dozirano = 6;
    private final int mesalica = 7;
    private final int vibracija = 8;
    private final int fan = 9;
    private final int gorionik = 10;
    private final int frekfrentni = 11;
    private final int pumpeLD = 12;
    private final int klapneMedjupolozajSaKrajnjimPrekidacima = 13;
    private final int yesNo = 14;

    public Image() {
        klapnuZatvori = new ImageIcon(getClass().getResource(Link.klapnuZatvori));
        klapnuOtvori = new ImageIcon(getClass().getResource(Link.klapnuOtvori));

        puznaPumpaOn = new ImageIcon(getClass().getResource(Link.puznaPumpaOn));
        puznaPumpaOff = new ImageIcon(getClass().getResource(Link.puznaPumpaOff));
        puznaPumpaErr = new ImageIcon(getClass().getResource(Link.puznaPumpaErr));
        
        pumpaOn = new ImageIcon(getClass().getResource(Link.pumpaOn));
        pumpaOnLeft = new ImageIcon(getClass().getResource(Link.pumpaOnLeft));
        pumpaOff = new ImageIcon(getClass().getResource(Link.pumpaOff));
        pumpaErr = new ImageIcon(getClass().getResource(Link.pumpaErr));

        rucno = new ImageIcon(getClass().getResource(Link.rucno));
        automatski = new ImageIcon(getClass().getResource(Link.automatski));
        
        Yes = new ImageIcon(getClass().getResource(Link.yes));
        No = new ImageIcon(getClass().getResource(Link.no));
        
        switchOn = new ImageIcon(getClass().getResource(Link.switchOn));
        switchOff = new ImageIcon(getClass().getResource(Link.switchOff));

        trakaOn = new ImageIcon(getClass().getResource(Link.trakaOn));
        trakaOff = new ImageIcon(getClass().getResource(Link.trakaOff));
        trakaErr = new ImageIcon(getClass().getResource(Link.trakaErr));

        izdozirano = new ImageIcon(getClass().getResource(Link.izdozirano));

        mesalicaOn = new ImageIcon(getClass().getResource(Link.mesalicaOn));
        mesalicaOff = new ImageIcon(getClass().getResource(Link.mesalicaOff));

        vibracijaOn = new ImageIcon(getClass().getResource(Link.vibroOn));
        vibracijaOff = new ImageIcon(getClass().getResource(Link.vibroOff));

        fanOn = new ImageIcon(getClass().getResource(Link.fanOn));
        fanOff = new ImageIcon(getClass().getResource(Link.fanOff));
        fanErr = new ImageIcon(getClass().getResource(Link.fanErr));
        
        gorionikOn = new ImageIcon(getClass().getResource(Link.gorionikOn));
        gorionikOff = new ImageIcon(getClass().getResource(Link.gorionikOff));
        
        frequentOn = new ImageIcon(getClass().getResource(Link.frequentOn));
        frequentOff = new ImageIcon(getClass().getResource(Link.frequentOff));
        frequentErr = new ImageIcon(getClass().getResource(Link.frequentErr));
        
        klapnuNeutral = new ImageIcon(getClass().getResource(Link.klapnuNeutral));
        klapnuDesno = new ImageIcon(getClass().getResource(Link.klapnuDesno));
        klapnuLevo = new ImageIcon(getClass().getResource(Link.klapnuLevo));
        klapnuRadL = new ImageIcon(getClass().getResource(Link.klapnuRadL));
        klapnuRadD = new ImageIcon(getClass().getResource(Link.klapnuRadD));
        klapnuErr = new ImageIcon(getClass().getResource(Link.klapnuErr));
    }

    public int getKlapne() {
        return klapne;
    }

    public int getPuznePumpe() {
        return puznePumpe;
    }

    public int getPumpe() {
        return pumpe;
    }

    public int getRucnoAutomatski() {
        return rucnoAutomatski;
    }

    public int getSwitchOnOff() {
        return switchOnOff;
    }
    
    public int getTrake() {
        return trake;
    }

    public int getDozirano() {
        return dozirano;
    }

    public int getMesalica() {
        return mesalica;
    }

    public int getVibracija() {
        return vibracija;
    }

    public int getfan() {
        return fan;
    }

    public int getGorionik() {
        return gorionik;
    }

    public int getFrekfrentni() {
        return frekfrentni;
    }

    public int getPumpeLD() {
        return pumpeLD;
    }
    
    public int getKlapneMedjupolozajSaKrajnjimPrekidacima() {
        return klapneMedjupolozajSaKrajnjimPrekidacima;
    }

    public int getYesNo() {
        return yesNo;
    }
    
    
    
    public void setImg(JLabel label, boolean vrednost, boolean err, int tip) {

        switch (tip) {
            case klapne:
                if (vrednost) {
                    label.setIcon(klapnuOtvori);
                }else{
                    label.setIcon(klapnuZatvori);
                }
                break;
            case puznePumpe:
                if (vrednost && !err) {
                    label.setIcon(puznaPumpaOn);
                }else if(!vrednost && !err) {
                    label.setIcon(puznaPumpaOff);
                }else if(err){
                    label.setIcon(puznaPumpaErr);
                }
                break;
            case pumpe:
                if (vrednost && !err) {
                    label.setIcon(pumpaOn);
                }else if(!vrednost && !err) {
                    label.setIcon(pumpaOff);
                }else if(err){
                    label.setIcon(pumpaErr);
                }
                break;
            case rucnoAutomatski:
                if (vrednost) {
                    label.setIcon(rucno);
                } else {
                    label.setIcon(automatski);
                }
                break;
            case switchOnOff:
                if (vrednost) {
                    label.setIcon(switchOn);
                } else {
                    label.setIcon(switchOff);
                }
                break;
            case trake:
                if (vrednost && !err) {
                    label.setIcon(trakaOn);
                }else if(!vrednost && !err) {
                    label.setIcon(trakaOff);
                }else if(err){
                    label.setIcon(trakaErr);
                }
                break;
            case dozirano:
                if (vrednost) {
                    label.setIcon(izdozirano);
                } else {
                    label.setIcon(new ImageIcon());
                }
                break;
            case mesalica:
                if (vrednost) {
                    label.setIcon(mesalicaOn);
                } else {
                    label.setIcon(mesalicaOff);
                }
                break;
            case vibracija:
                if (vrednost) {
                    label.setIcon(vibracijaOn);
                } else {
                    label.setIcon(vibracijaOff);
                }
                break;
            case fan:
                if (vrednost && !err) {
                    label.setIcon(fanOn);
                }else if(!vrednost && !err) {
                    label.setIcon(fanOff);
                }else if(err){
                    label.setIcon(fanErr);
                }
                break;  
            case gorionik:
                if (vrednost) {
                    label.setIcon(gorionikOn);
                } else {
                    label.setIcon(gorionikOff);
                }
                break;
            case frekfrentni:
                if (vrednost && !err) {
                    label.setIcon(frequentOn);
                }else if(!vrednost && !err) {
                    label.setIcon(frequentOff);
                }else if(err){
                    label.setIcon(frequentErr);
                }
                break;
            case pumpeLD:
                if (vrednost && !err) {
                    label.setIcon(pumpaOn);
                }else if(!vrednost && err) {
                    label.setIcon(pumpaOnLeft);
                }else if(!vrednost && !err){
                    label.setIcon(pumpaOff);
                }
                break;
             case yesNo:
                if (vrednost) {
                    label.setIcon(Yes);
                } else {
                    label.setIcon(No);
                }
                break;
            default:
                break;
        }
    }
    
    
    public void setImg(JLabel label, boolean otvoren, boolean zatvoren, boolean uraduL, boolean uraduD, boolean err) {

        if (uraduL && !err) {
            label.setIcon(klapnuRadL);
        }else if(uraduD && !err) {
            label.setIcon(klapnuRadD);
        }else if(otvoren && !err){
            label.setIcon(klapnuLevo);
        }else if(zatvoren && !err){
            label.setIcon(klapnuDesno);
        }else if(!otvoren && !zatvoren && !err){
            label.setIcon(klapnuNeutral);
        }else if(err){
            label.setIcon(klapnuErr);
        }
               
        
    }
        
}
