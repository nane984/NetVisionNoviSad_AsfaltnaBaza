/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pogon.Pogon;

/**
 *
 * @author branko.scekic
 */
public class Buff implements Runnable{

    private final Mxl mxl;
    private InetAddress ip;
    private final Pogon pogon;
    
    //write
    private boolean writeRegister;
    private boolean writeRegisters;
    private boolean writeDigital;
    private int offsetWriteDig;
    private int offsetWriteReg;
    private int offsetWriteRegS;
    private boolean mxValue;
    private int mwValue;
    private int[] mwValues;
    
    //za prekidace 
    private boolean writeTwoDigital;
    private int offsetWriteDig1;
    private int offsetWriteDig2;
    private boolean mxValue1;
    private boolean mxValue2;
    
    //write two register
    private boolean writeTwoRegister;
    private int offsetWriteReg1;
    private int offsetWriteReg2;
    private int mwValue1;
    private int mwValue2;
    
     //write three registers
    private boolean writeThreeRegisters;
    private int offsetWriteRegs1;
    private int offsetWriteRegs2;
    private int offsetWriteRegs3;
    private int[] mwValues1;
    private int[] mwValues2;
    private int[] mwValues3;
    
    
    //read
    private int [] resMerenja1;
    private int [] resMerenja2;
    private int [] resMerenja3;
    private boolean[] resultDigitalMemory;
    private boolean[] resultInputMemory;
    
    
    private int defaultOffsetReadMW1;
    private int defaultOffsetReadMW2;
    private int defaultOffsetReadMW3;
    private int defaultOffsetReadMX;
    private int defaultOffsetReadIX;
    
    
    public Buff (Pogon pogon){
        mxl = new Mxl();
        this.pogon = pogon;
    }
    
        
    public void setIpAdresa(String address, int mw1, int mw2, int mw3, int mx, int ix){
        defaultOffsetReadMW1 = mw1; 
        defaultOffsetReadMW2 = mw2; 
        defaultOffsetReadMW3 = mw3; 
        defaultOffsetReadMX = mx;
        defaultOffsetReadIX = ix;
        try {
            ip = InetAddress.getByName(address);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Buff.class.getName()).log(Level.SEVERE, null, ex);
        }
        mxl.setIp(ip);
        
    }
    
    public void openConnection() {
        mxl.openConnection();
    }

    public void closeConnection() {
        mxl.closeConnection();
    }

    public boolean ping() {
        return mxl.ping();
    }
    
    
    
    @Override
    public void run() {
        if(ping()){
            openConnection();
        }
        
        while(Mxl.conOk){
            getMerenja1();
            getMerenja2();
            getMerenja3();
            getDigitalniMemory();
            getInputRegistri();
                   
            writeDigit();
            writeTwoDigital();
            writeRegister();
            writeRegisters();
            writeTwoRegister();
            writeThreeRegisters();
        }
        
    }
    
        
       
    private synchronized void getMerenja1(){
        resMerenja1 = mxl.readHoldingRegisters(defaultOffsetReadMW1, 100);        //max 100 start 49
    
        pogon.getPreddozatori().getPreddozator1().getFrekfrencija().setVrednost(resMerenja1[0]);
        pogon.getPreddozatori().getPreddozator2().getFrekfrencija().setVrednost(resMerenja1[1]);
        pogon.getPreddozatori().getPreddozator3().getFrekfrencija().setVrednost(resMerenja1[2]);
        pogon.getPreddozatori().getPreddozator4().getFrekfrencija().setVrednost(resMerenja1[3]);
        pogon.getPreddozatori().getPreddozator5().getFrekfrencija().setVrednost(resMerenja1[4]);
        pogon.getPreddozatori().getPreddozator6().getFrekfrencija().setVrednost(resMerenja1[5]);
        pogon.getPreddozatori().getPreddozator7().getFrekfrencija().setVrednost(resMerenja1[6]);
        pogon.getPreddozatori().getPreddozator8().getFrekfrencija().setVrednost(resMerenja1[7]);
        pogon.getPreddozatori().getPreddozator9().getFrekfrencija().setVrednost(resMerenja1[8]);
        pogon.getPreddozatori().getPreddozator10().getFrekfrencija().setVrednost(resMerenja1[9]);
        pogon.getPreddozatori().getPreddozator11().getFrekfrencija().setVrednost(resMerenja1[10]);
        
        pogon.getOtprasivanje().getOtsisniVentilatorF().getFrekfrencija().setVrednost(resMerenja1[36]);
        
        pogon.getBitumen().getTempBitumenPrateceGrejanje().setVrednost(resMerenja1[42]);
        pogon.getBitumen().getTempBitumen().setVrednost(resMerenja1[80]);
        
        pogon.getAgregat().getNivoSilos1().getVrednost().setVrednost(resMerenja1[52]);
        pogon.getAgregat().getNivoSilos2().getVrednost().setVrednost(resMerenja1[53]);
        pogon.getAgregat().getNivoSilos3().getVrednost().setVrednost(resMerenja1[54]);
        pogon.getAgregat().getNivoSilos4().getVrednost().setVrednost(resMerenja1[55]);
        pogon.getAgregat().getNivoSilos5().getVrednost().setVrednost(resMerenja1[56]);
        pogon.getAgregat().getNivoSilos6().getVrednost().setVrednost(resMerenja1[57]);
        pogon.getAgregat().getNivoSilos7().getVrednost().setVrednost(resMerenja1[58]);
        
        pogon.getFiler().getNivoUKupovnomFileru().getVrednost().setVrednost(resMerenja1[78]);
        pogon.getFiler().getNivoUSopstvenomFileru().getVrednost().setVrednost(resMerenja1[79]);
        
        pogon.getAgregat().getTemperaturaFrakcija1().setVrednost(resMerenja1[76]);
        pogon.getAgregat().getTemperaturaFrakcija2().setVrednost(resMerenja1[77]);
        
        pogon.getSusara().getPritisakUSusari().getVrednost().setVrednost(resMerenja1[95]);
        pogon.getSusara().getTempIzaSusare().getVrednost().setVrednost(resMerenja1[86]);
        
        pogon.getFiler().getTempNaUlazuFilter().getVrednost().setVrednost(resMerenja1[43]);
        pogon.getFiler().getTempUilteru().getVrednost().setVrednost(resMerenja1[47]);
        
        pogon.getBitumen().getTempB1().setVrednost(resMerenja1[44]);
        pogon.getBitumen().getTempB2().setVrednost(resMerenja1[45]);
        pogon.getBitumen().getTempB3().setVrednost(resMerenja1[46]);
        
        pogon.getKorpaVagon().getSelectSilos().setVrednost(resMerenja1[61]);
        
        pogon.getBitumen().getNivoSilosBitumen1().getVrednost().setVrednost(resMerenja1[97]);
        pogon.getBitumen().getNivoSilosBitumen2().getVrednost().setVrednost(resMerenja1[98]);
        pogon.getBitumen().getNivoSilosBitumen3().getVrednost().setVrednost(resMerenja1[99]);
    }
    
    private synchronized void getMerenja2(){
        resMerenja2 = mxl.readHoldingRegisters(defaultOffsetReadMW2, 96);        //max 100 start 200
        
        pogon.getAgregat().getDoz1().getZadata().setVrednost(resMerenja2[0]);
        pogon.getAgregat().getDoz2().getZadata().setVrednost(resMerenja2[1]);
        pogon.getAgregat().getDoz3().getZadata().setVrednost(resMerenja2[2]);
        pogon.getAgregat().getDoz4().getZadata().setVrednost(resMerenja2[3]);
        pogon.getAgregat().getDoz5().getZadata().setVrednost(resMerenja2[4]);
        pogon.getAgregat().getDoz6().getZadata().setVrednost(resMerenja2[5]);
        pogon.getAgregat().getDoz7().getZadata().setVrednost(resMerenja2[6]);
        pogon.getFiler().getKupovni().getZadata().setVrednost(resMerenja2[7]);
        pogon.getFiler().getSopstveni().getZadata().setVrednost(resMerenja2[8]);
        pogon.getBitumen().getKolicine().getZadata().setVrednost(resMerenja2[9]);
        
        pogon.getAgregat().getDoz1().getIzdozirana().setVrednost(resMerenja2[12]);
        pogon.getAgregat().getDoz2().getIzdozirana().setVrednost(resMerenja2[13]);
        pogon.getAgregat().getDoz3().getIzdozirana().setVrednost(resMerenja2[14]);
        pogon.getAgregat().getDoz4().getIzdozirana().setVrednost(resMerenja2[15]);
        pogon.getAgregat().getDoz5().getIzdozirana().setVrednost(resMerenja2[16]);
        pogon.getAgregat().getDoz6().getIzdozirana().setVrednost(resMerenja2[17]);
        pogon.getAgregat().getDoz7().getIzdozirana().setVrednost(resMerenja2[18]);
        pogon.getFiler().getKupovni().getIzdozirana().setVrednost(resMerenja2[19]);
        pogon.getFiler().getSopstveni().getIzdozirana().setVrednost(resMerenja2[20]);
        pogon.getBitumen().getKolicine().getIzdozirana().setVrednost(resMerenja2[21]);
        
        pogon.getAgregat().getVagaFrakcije().getVrednost().setVrednost(resMerenja2[24]);
        pogon.getFiler().getVagaFilera().getVrednost().setVrednost(resMerenja2[25]);
        pogon.getBitumen().getVagaBitumen().getVrednost().setVrednost(resMerenja2[26]);
        
        pogon.getPreleti().getFinoDoziranjeFrakcija1().setVrednost(resMerenja2[32]);
        pogon.getPreleti().getPreletFrakcija1().setVrednost(resMerenja2[33]);
        pogon.getPreleti().getFinoDoziranjeFrakcija2().setVrednost(resMerenja2[34]);
        pogon.getPreleti().getPreletFrakcija2().setVrednost(resMerenja2[35]);
        pogon.getPreleti().getFinoDoziranjeFrakcija3().setVrednost(resMerenja2[36]);
        pogon.getPreleti().getPreletFrakcija3().setVrednost(resMerenja2[37]);
        pogon.getPreleti().getFinoDoziranjeFrakcija4().setVrednost(resMerenja2[38]);
        pogon.getPreleti().getPreletFrakcija4().setVrednost(resMerenja2[39]);
        pogon.getPreleti().getFinoDoziranjeFrakcija5().setVrednost(resMerenja2[40]);
        pogon.getPreleti().getPreletFrakcija5().setVrednost(resMerenja2[41]);
        pogon.getPreleti().getFinoDoziranjeFrakcija6().setVrednost(resMerenja2[42]);
        pogon.getPreleti().getPreletFrakcija6().setVrednost(resMerenja2[43]);
        pogon.getPreleti().getFinoDoziranjeFrakcija7().setVrednost(resMerenja2[44]);
        pogon.getPreleti().getPreletFrakcija7().setVrednost(resMerenja2[45]);
        pogon.getPreleti().getPreletKupovnogFilera().setVrednost(resMerenja2[46]);
        pogon.getPreleti().getPreletSopstvenogFilera().setVrednost(resMerenja2[47]);
        pogon.getPreleti().getPreletBitumena().setVrednost(resMerenja2[48]);
        
        pogon.getAgregat().setStatus(resMerenja2[51]);
        
        pogon.getParametri().getVremeSmirivanjaVageFrakcije().setVrednost(resMerenja2[55]);
        pogon.getParametri().getVremeSmirivanjaVageFilera().setVrednost(resMerenja2[56]);
        pogon.getParametri().getVremeSmirivanjaVageBitumena().setVrednost(resMerenja2[57]);
        
        pogon.getIzdatoBrSarzi().setVrednost(resMerenja2[72]);
        
        pogon.getParametri().getZadrskaZaDoziranjeFilera().setVrednost(resMerenja2[74]);
        pogon.getParametri().getZadrskaZaDoziranjeBitumena().setVrednost(resMerenja2[75]);
        pogon.getParametri().getVremeMesanjaMesalice().setVrednost(resMerenja2[76]);
        pogon.getParametri().getVremePraznjenjaMesalice().setVrednost(resMerenja2[77]);
        
        pogon.getGrupakomandi().getTextTransport().setVrednost(resMerenja2[67]);
        
        pogon.getAsfaltSilosi().getSilos1().setVrednostNiza(resMerenja2[83]);
        pogon.getAsfaltSilosi().getSilos1().setVrednostVisa(resMerenja2[84]);
        pogon.getAsfaltSilosi().getSilos2().setVrednostNiza(resMerenja2[85]);
        pogon.getAsfaltSilosi().getSilos2().setVrednostVisa(resMerenja2[86]);
        pogon.getAsfaltSilosi().getSilos3().setVrednostNiza(resMerenja2[87]);
        pogon.getAsfaltSilosi().getSilos3().setVrednostVisa(resMerenja2[88]);
        pogon.getAsfaltSilosi().getSilos4().setVrednostNiza(resMerenja2[89]);
        pogon.getAsfaltSilosi().getSilos4().setVrednostVisa(resMerenja2[90]);
        pogon.getAsfaltSilosi().getSilos5().setVrednostNiza(resMerenja2[91]);
        pogon.getAsfaltSilosi().getSilos5().setVrednostVisa(resMerenja2[92]);
        pogon.getAsfaltSilosi().getIber().setVrednostNiza(resMerenja2[93]);
        pogon.getAsfaltSilosi().getIber().setVrednostVisa(resMerenja2[94]);
        
        
    }
    
    private synchronized void getMerenja3(){
        resMerenja3 = mxl.readHoldingRegisters(defaultOffsetReadMW3, 95);        //max 100 start 300
        
        pogon.getSusara().getSnagaGorionika().setVrednost(resMerenja3[29]);
        pogon.getParametri().getVremePrskanjaNaftomKorpe().setVrednost(resMerenja3[30]);
        pogon.getParametri().getVremePrskanjaNaftomVagona().setVrednost(resMerenja3[31]);
        
        pogon.getFiler().getSilosKupovniFiler().setVrednostNiza(resMerenja3[32]);
        pogon.getFiler().getSilosKupovniFiler().setVrednostVisa(resMerenja3[33]);
        
        pogon.getBitumen().getSilosBitumen1().setVrednostNiza(resMerenja3[34]);
        pogon.getBitumen().getSilosBitumen1().setVrednostVisa(resMerenja3[35]);
        pogon.getBitumen().getSilosBitumen2().setVrednostNiza(resMerenja3[36]);
        pogon.getBitumen().getSilosBitumen2().setVrednostVisa(resMerenja3[37]);
        pogon.getBitumen().getSilosBitumen3().setVrednostNiza(resMerenja3[38]);
        pogon.getBitumen().getSilosBitumen3().setVrednostVisa(resMerenja3[39]);
        pogon.getAsfaltSilosi().getTempAsfalta().setVrednost(resMerenja3[40]);
        pogon.getSusara().getTempIzaSusare2().setVrednost(resMerenja3[41]);
        
        pogon.getMesalica().getStrujaMesalice().getVrednost().setVrednost(resMerenja3[42]);
        
    }
     
    private synchronized void getDigitalniMemory(){
        resultDigitalMemory = mxl.readCoil(defaultOffsetReadMX, 600);  //bilo je 600 max 2000 start 0
        
        pogon.getGrupakomandi().getRad().getKomanda().setVrednost(resultDigitalMemory[2]);
        pogon.getGrupakomandi().getOtprasivanje().getKomanda().setVrednost(resultDigitalMemory[5]);
        pogon.getGrupakomandi().getTransport().getKomanda().setVrednost(resultDigitalMemory[3]);
        pogon.getGrupakomandi().getSusara().getKomanda().setVrednost(resultDigitalMemory[343]);
        pogon.getGrupakomandi().getVelikiGorionik().getKomanda().setVrednost(resultDigitalMemory[358]);
        pogon.getGrupakomandi().getGorionikNaKanalu().getKomanda().setVrednost(resultDigitalMemory[363]);
        pogon.getGrupakomandi().getPredozator().getKomanda().setVrednost(resultDigitalMemory[4]);
        pogon.getGrupakomandi().getMesalica().getKomanda().setVrednost(resultDigitalMemory[14]);
        pogon.getGrupakomandi().getProizvodnjaAsfalta().getKomanda().setVrednost(resultDigitalMemory[12]);
        
        pogon.getPreddozatori().getPreddozator1().getKomanda().setVrednost(resultDigitalMemory[132]);
        pogon.getPreddozatori().getPreddozator1().getPotvrdaRada().setVrednost(resultDigitalMemory[84]);
        pogon.getPreddozatori().getPreddozator1().getGreska().setVrednost(resultDigitalMemory[100]);
        pogon.getPreddozatori().getPreddozator1().getPrazanPredozator().setVrednost(resultDigitalMemory[544]);
        pogon.getPreddozatori().getPreddozator1().getTotalStop().setVrednost(resultDigitalMemory[560]);
        
        pogon.getPreddozatori().getPreddozator2().getKomanda().setVrednost(resultDigitalMemory[133]);
        pogon.getPreddozatori().getPreddozator2().getPotvrdaRada().setVrednost(resultDigitalMemory[85]);
        pogon.getPreddozatori().getPreddozator2().getGreska().setVrednost(resultDigitalMemory[101]);
        pogon.getPreddozatori().getPreddozator2().getPrazanPredozator().setVrednost(resultDigitalMemory[545]);
        pogon.getPreddozatori().getPreddozator2().getTotalStop().setVrednost(resultDigitalMemory[561]);
        
        pogon.getPreddozatori().getPreddozator3().getKomanda().setVrednost(resultDigitalMemory[134]);
        pogon.getPreddozatori().getPreddozator3().getPotvrdaRada().setVrednost(resultDigitalMemory[86]);
        pogon.getPreddozatori().getPreddozator3().getGreska().setVrednost(resultDigitalMemory[102]);
        pogon.getPreddozatori().getPreddozator3().getPrazanPredozator().setVrednost(resultDigitalMemory[546]);
        pogon.getPreddozatori().getPreddozator3().getTotalStop().setVrednost(resultDigitalMemory[562]);
        
        pogon.getPreddozatori().getPreddozator4().getKomanda().setVrednost(resultDigitalMemory[135]);
        pogon.getPreddozatori().getPreddozator4().getPotvrdaRada().setVrednost(resultDigitalMemory[87]);
        pogon.getPreddozatori().getPreddozator4().getGreska().setVrednost(resultDigitalMemory[103]);
        pogon.getPreddozatori().getPreddozator4().getPrazanPredozator().setVrednost(resultDigitalMemory[547]);
        pogon.getPreddozatori().getPreddozator4().getTotalStop().setVrednost(resultDigitalMemory[563]);
        
        pogon.getPreddozatori().getPreddozator5().getKomanda().setVrednost(resultDigitalMemory[136]);
        pogon.getPreddozatori().getPreddozator5().getPotvrdaRada().setVrednost(resultDigitalMemory[88]);
        pogon.getPreddozatori().getPreddozator5().getGreska().setVrednost(resultDigitalMemory[104]);
        pogon.getPreddozatori().getPreddozator5().getPrazanPredozator().setVrednost(resultDigitalMemory[548]);
        pogon.getPreddozatori().getPreddozator5Vibrator().setVrednost(resultDigitalMemory[144]);
        pogon.getPreddozatori().getPreddozator5().getTotalStop().setVrednost(resultDigitalMemory[564]);
        
        pogon.getPreddozatori().getPreddozator6().getKomanda().setVrednost(resultDigitalMemory[137]);
        pogon.getPreddozatori().getPreddozator6().getPotvrdaRada().setVrednost(resultDigitalMemory[89]);
        pogon.getPreddozatori().getPreddozator6().getGreska().setVrednost(resultDigitalMemory[105]);
        pogon.getPreddozatori().getPreddozator6().getPrazanPredozator().setVrednost(resultDigitalMemory[549]);
        pogon.getPreddozatori().getPreddozator6().getTotalStop().setVrednost(resultDigitalMemory[565]);
        
        pogon.getPreddozatori().getPreddozator7().getKomanda().setVrednost(resultDigitalMemory[138]);
        pogon.getPreddozatori().getPreddozator7().getPotvrdaRada().setVrednost(resultDigitalMemory[90]);
        pogon.getPreddozatori().getPreddozator7().getGreska().setVrednost(resultDigitalMemory[106]);
        pogon.getPreddozatori().getPreddozator7().getPrazanPredozator().setVrednost(resultDigitalMemory[550]);
        pogon.getPreddozatori().getPreddozator7Vibrator().setVrednost(resultDigitalMemory[145]);
        pogon.getPreddozatori().getPreddozator7().getTotalStop().setVrednost(resultDigitalMemory[566]);
        
        pogon.getPreddozatori().getPreddozator8().getKomanda().setVrednost(resultDigitalMemory[139]);
        pogon.getPreddozatori().getPreddozator8().getPotvrdaRada().setVrednost(resultDigitalMemory[91]);
        pogon.getPreddozatori().getPreddozator8().getGreska().setVrednost(resultDigitalMemory[107]);
        pogon.getPreddozatori().getPreddozator8().getPrazanPredozator().setVrednost(resultDigitalMemory[551]);
        pogon.getPreddozatori().getPreddozator8().getTotalStop().setVrednost(resultDigitalMemory[567]);
        
        pogon.getPreddozatori().getPreddozator9().getKomanda().setVrednost(resultDigitalMemory[140]);
        pogon.getPreddozatori().getPreddozator9().getPotvrdaRada().setVrednost(resultDigitalMemory[92]);
        pogon.getPreddozatori().getPreddozator9().getGreska().setVrednost(resultDigitalMemory[108]);
        pogon.getPreddozatori().getPreddozator9().getPrazanPredozator().setVrednost(resultDigitalMemory[552]);
        pogon.getPreddozatori().getPreddozator9().getTotalStop().setVrednost(resultDigitalMemory[568]);
        
        pogon.getPreddozatori().getPreddozator10().getKomanda().setVrednost(resultDigitalMemory[141]);
        pogon.getPreddozatori().getPreddozator10().getPotvrdaRada().setVrednost(resultDigitalMemory[93]);
        pogon.getPreddozatori().getPreddozator10().getGreska().setVrednost(resultDigitalMemory[109]);
        pogon.getPreddozatori().getPreddozator10().getPrazanPredozator().setVrednost(resultDigitalMemory[553]);
        pogon.getPreddozatori().getPreddozator10().getTotalStop().setVrednost(resultDigitalMemory[569]);
        
        pogon.getPreddozatori().getPreddozator11().getKomanda().setVrednost(resultDigitalMemory[142]);
        pogon.getPreddozatori().getPreddozator11().getPotvrdaRada().setVrednost(resultDigitalMemory[94]);
        pogon.getPreddozatori().getPreddozator11().getGreska().setVrednost(resultDigitalMemory[110]);
        pogon.getPreddozatori().getPreddozator11().getPrazanPredozator().setVrednost(resultDigitalMemory[554]);
        pogon.getPreddozatori().getPreddozator11().getTotalStop().setVrednost(resultDigitalMemory[570]);
        
        pogon.getTrake().getTraka1().getKomanda().setVrednost(resultDigitalMemory[347]);
        pogon.getTrake().getTraka1().getPotvrdaRada().setVrednost(resultDigitalMemory[302]);
        pogon.getTrake().getTraka1().getGreska().setVrednost(resultDigitalMemory[303]);
        
        pogon.getTrake().getTraka2().getKomanda().setVrednost(resultDigitalMemory[349]);
        pogon.getTrake().getTraka2().getPotvrdaRada().setVrednost(resultDigitalMemory[306]);
        pogon.getTrake().getTraka2().getGreska().setVrednost(resultDigitalMemory[307]);
        
        pogon.getTrake().getTraka3().getKomanda().setVrednost(resultDigitalMemory[348]);
        pogon.getTrake().getTraka3().getPotvrdaRada().setVrednost(resultDigitalMemory[304]);
        pogon.getTrake().getTraka3().getGreska().setVrednost(resultDigitalMemory[305]);
        
        pogon.getTrake().getTrakaKosa().getKomanda().setVrednost(resultDigitalMemory[346]);
        pogon.getTrake().getTrakaKosa().getPotvrdaRada().setVrednost(resultDigitalMemory[300]);
        pogon.getTrake().getTrakaKosa().getGreska().setVrednost(resultDigitalMemory[301]);
       
        pogon.getSusara().getRotacionaSusara().getKomanda().setVrednost(resultDigitalMemory[343]);
        pogon.getSusara().getRotacionaSusara().getPotvrdaRada().setVrednost(resultDigitalMemory[296]);
        pogon.getSusara().getRotacionaSusara().getGreska().setVrednost(resultDigitalMemory[299]);
        
        pogon.getSusara().getPumpaGorionikaSusare().getKomanda().setVrednost(resultDigitalMemory[355]);
        pogon.getSusara().getPumpaGorionikaSusare().getPotvrdaRada().setVrednost(resultDigitalMemory[318]);
        pogon.getSusara().getPumpaGorionikaSusare().getGreska().setVrednost(resultDigitalMemory[319]);
        
        pogon.getSusara().getGorionikSusare().getKomanda().setVrednost(resultDigitalMemory[358]);
        pogon.getSusara().getGreskaGorionik().setVrednost(resultDigitalMemory[325]);
        
        pogon.getPumpaZaNaftuTermopak().getKomanda().setVrednost(resultDigitalMemory[357]);
        pogon.getPumpaZaNaftuTermopak().getPotvrdaRada().setVrednost(resultDigitalMemory[322]);
        pogon.getPumpaZaNaftuTermopak().getGreska().setVrednost(resultDigitalMemory[323]);
        
        pogon.getOtprasivanje().getPumpaGorioniikaNaKanalu().getKomanda().setVrednost(resultDigitalMemory[356]);
        pogon.getOtprasivanje().getPumpaGorioniikaNaKanalu().getPotvrdaRada().setVrednost(resultDigitalMemory[320]);
        pogon.getOtprasivanje().getPumpaGorioniikaNaKanalu().getGreska().setVrednost(resultDigitalMemory[321]);
        
        pogon.getOtprasivanje().getGorionikNaKanalu().getKomanda().setVrednost(resultDigitalMemory[363]);
        
        pogon.getOtprasivanje().getVentilatorOtprasivanja1().getKomanda().setVrednost(resultDigitalMemory[203]);
        pogon.getOtprasivanje().getVentilatorOtprasivanja1().getPotvrdaRada().setVrednost(resultDigitalMemory[183]);
        pogon.getOtprasivanje().getVentilatorOtprasivanja1().getGreska().setVrednost(resultDigitalMemory[171]);
        
        pogon.getOtprasivanje().getVentilatorOtprasivanja2().getKomanda().setVrednost(resultDigitalMemory[202]);
        pogon.getOtprasivanje().getVentilatorOtprasivanja2().getPotvrdaRada().setVrednost(resultDigitalMemory[182]);
        pogon.getOtprasivanje().getVentilatorOtprasivanja2().getGreska().setVrednost(resultDigitalMemory[170]);
        
        pogon.getOtprasivanje().getVentilatorOtprasivanja3().getKomanda().setVrednost(resultDigitalMemory[201]);
        pogon.getOtprasivanje().getVentilatorOtprasivanja3().getPotvrdaRada().setVrednost(resultDigitalMemory[181]);
        pogon.getOtprasivanje().getVentilatorOtprasivanja3().getGreska().setVrednost(resultDigitalMemory[169]);
        
        pogon.getOtprasivanje().getVentilatorOtprasivanja4().getKomanda().setVrednost(resultDigitalMemory[204]);
        pogon.getOtprasivanje().getVentilatorOtprasivanja4().getPotvrdaRada().setVrednost(resultDigitalMemory[184]);
        pogon.getOtprasivanje().getVentilatorOtprasivanja4().getGreska().setVrednost(resultDigitalMemory[174]);
        
        pogon.getOtprasivanje().getKlapnaSvezegVazduha().getUkljuci().setVrednost(resultDigitalMemory[207]);
        pogon.getOtprasivanje().getKlapnaSvezegVazduha().getIskljuci().setVrednost(resultDigitalMemory[200]);
        pogon.getOtprasivanje().getKlapnaSvezegVazduha().getPotvrdaRadaD().setVrednost(resultDigitalMemory[180]);
        pogon.getOtprasivanje().getKlapnaSvezegVazduha().getPotvrdaRadaL().setVrednost(resultDigitalMemory[187]);
        pogon.getOtprasivanje().getKlapnaSvezegVazduha().getGreska().setVrednost(resultDigitalMemory[168]);
        pogon.getOtprasivanje().getKlapnaSvezegVazduha().getOtvoren().setVrednost(resultDigitalMemory[153]);
        pogon.getOtprasivanje().getKlapnaSvezegVazduha().getZatvoren().setVrednost(resultDigitalMemory[154]);
        
        pogon.getOtprasivanje().getVentilatorOtprasivanja().getKomanda().setVrednost(resultDigitalMemory[199]);
        pogon.getOtprasivanje().getVentilatorOtprasivanja().getPotvrdaRada().setVrednost(resultDigitalMemory[179]);
        pogon.getOtprasivanje().getVentilatorOtprasivanja().getGreska().setVrednost(resultDigitalMemory[167]);
        
        pogon.getOtprasivanje().getKlapnaOtprasivanja().getKomanda().setVrednost(resultDigitalMemory[197]);
        pogon.getOtprasivanje().getKlapnaOtprasivanja().getPotvrdaRada().setVrednost(resultDigitalMemory[177]);
        pogon.getOtprasivanje().getKlapnaOtprasivanja().getGreska().setVrednost(resultDigitalMemory[165]);
        
        pogon.getOtprasivanje().getPosmakOtprasivane().getUklucennje().setVrednost(resultDigitalMemory[198]);
        pogon.getOtprasivanje().getPosmakOtprasivane().getIskljucennje().setVrednost(resultDigitalMemory[206]);
        pogon.getOtprasivanje().getPosmakOtprasivane().getPotvrdaRadaL().setVrednost(resultDigitalMemory[178]);
        pogon.getOtprasivanje().getPosmakOtprasivane().getPotvrdaRadaD().setVrednost(resultDigitalMemory[186]);
        pogon.getOtprasivanje().getPosmakOtprasivane().getGreska().setVrednost(resultDigitalMemory[166]);
        
        pogon.getOtprasivanje().getVibroSito().getKomanda().setVrednost(resultDigitalMemory[510]);
        
        pogon.getOtprasivanje().getVruciElevator().getKomanda().setVrednost(resultDigitalMemory[511]);
        
        pogon.getOtprasivanje().getPuzGrubePrasine1().getKomanda().setVrednost(resultDigitalMemory[352]);
        pogon.getOtprasivanje().getPuzGrubePrasine2().getKomanda().setVrednost(resultDigitalMemory[353]);
        pogon.getOtprasivanje().getPuzGrubePrasine3().getKomanda().setVrednost(resultDigitalMemory[354]);
        pogon.getOtprasivanje().getPuzGrubePrasine1Bimetal().setVrednost(resultDigitalMemory[313]);
        pogon.getOtprasivanje().getPuzGrubePrasine2Bimetal().setVrednost(resultDigitalMemory[315]);
        pogon.getOtprasivanje().getPuzGrubePrasine3Bimetal().setVrednost(resultDigitalMemory[317]);
        
        pogon.getOtprasivanje().getPuzIspodFilera().getKomanda().setVrednost(resultDigitalMemory[196]);
        pogon.getOtprasivanje().getPuzIspodFilera().getPotvrdaRada().setVrednost(resultDigitalMemory[176]);
        pogon.getOtprasivanje().getPuzIspodFilera().getGreska().setVrednost(resultDigitalMemory[164]);
        
        pogon.getOtprasivanje().getPuzSopstvenogFilera1().getKomanda().setVrednost(resultDigitalMemory[350]);
        pogon.getOtprasivanje().getPuzSopstvenogFilera2().getKomanda().setVrednost(resultDigitalMemory[351]);
        pogon.getOtprasivanje().getPuzSopstvenogFilera1Bimetal().setVrednost(resultDigitalMemory[309]);
        pogon.getOtprasivanje().getPuzSopstvenogFilera2Bimetal().setVrednost(resultDigitalMemory[311]);
        
        pogon.getOtprasivanje().getElevatorSopstvenogFilera().getKomanda().setVrednost(resultDigitalMemory[509]);
        
        pogon.getOtprasivanje().setOtsisniVentilator(resultDigitalMemory[156]);
        
        pogon.getOtprasivanje().getKlapnaNaOtsisniVentil().getUkljuci().setVrednost(resultDigitalMemory[205]);
        pogon.getOtprasivanje().getKlapnaNaOtsisniVentil().getIskljuci().setVrednost(resultDigitalMemory[208]);
        pogon.getOtprasivanje().getKlapnaNaOtsisniVentil().getPotvrdaRadaL().setVrednost(resultDigitalMemory[185]);
        pogon.getOtprasivanje().getKlapnaNaOtsisniVentil().getPotvrdaRadaD().setVrednost(resultDigitalMemory[188]);
        pogon.getOtprasivanje().getKlapnaNaOtsisniVentil().getGreska().setVrednost(resultDigitalMemory[175]);
        pogon.getOtprasivanje().getKlapnaNaOtsisniVentil().getOtvoren().setVrednost(resultDigitalMemory[189]);
        pogon.getOtprasivanje().getKlapnaNaOtsisniVentil().getZatvoren().setVrednost(resultDigitalMemory[190]);
        
        pogon.getOtprasivanje().getKlapna1().getKomanda().setVrednost(resultDigitalMemory[504]);
        pogon.getOtprasivanje().getKlapna2().getKomanda().setVrednost(resultDigitalMemory[505]);
        pogon.getOtprasivanje().getKlapna3().getKomanda().setVrednost(resultDigitalMemory[506]);
        
        pogon.getFiler().getPuzKupovniFiler().getKomanda().setVrednost(resultDigitalMemory[66]);
                
        pogon.getFiler().getPuzSopstveniFiler().getKomanda().setVrednost(resultDigitalMemory[67]);
                
        pogon.getFiler().getKlapnaKupovniFiler().getKomanda().setVrednost(resultDigitalMemory[501]);
                
        pogon.getFiler().getKlapnaSopstveniFiler().getKomanda().setVrednost(resultDigitalMemory[502]);
               
        pogon.getFiler().getKlapnaIspodVageFilera().getKomanda().setVrednost(resultDigitalMemory[500]);
               
        pogon.getFiler().getPuzIspodVageFilera().getKomanda().setVrednost(resultDigitalMemory[65]);
        
        pogon.getFiler().getVibroSilosKupovniFiler().getKomanda().setVrednost(resultDigitalMemory[529]);
        pogon.getFiler().getVibroSilosSopstveniFiler().getKomanda().setVrednost(resultDigitalMemory[527]);
        pogon.getFiler().getVibroSilosKupovniFilerOtprasivanje().getKomanda().setVrednost(resultDigitalMemory[530]);
        
        pogon.getAgregat().getDozator1().getKomanda().setVrednost(resultDigitalMemory[490]);
        
        pogon.getAgregat().getDozator2().getUklucennje().setVrednost(resultDigitalMemory[488]);
        pogon.getAgregat().getDozator2().getIskljucennje().setVrednost(resultDigitalMemory[487]);
        
        pogon.getAgregat().getDozator3().getUklucennje().setVrednost(resultDigitalMemory[479]);
        pogon.getAgregat().getDozator3().getIskljucennje().setVrednost(resultDigitalMemory[478]);
        
        pogon.getAgregat().getDozator4().getUklucennje().setVrednost(resultDigitalMemory[477]);
        pogon.getAgregat().getDozator4().getIskljucennje().setVrednost(resultDigitalMemory[476]);
        
        pogon.getAgregat().getDozator5().getUklucennje().setVrednost(resultDigitalMemory[486]);
        pogon.getAgregat().getDozator5().getIskljucennje().setVrednost(resultDigitalMemory[485]);
        
        pogon.getAgregat().getDozator6().getUklucennje().setVrednost(resultDigitalMemory[484]);
        pogon.getAgregat().getDozator6().getIskljucennje().setVrednost(resultDigitalMemory[483]);
        
        pogon.getAgregat().getDozator7().getUklucennje().setVrednost(resultDigitalMemory[475]);
        pogon.getAgregat().getDozator7().getIskljucennje().setVrednost(resultDigitalMemory[474]);
        
        pogon.getAgregat().getKlapnaVagaFrakcije().getKomanda().setVrednost(resultDigitalMemory[480]);
        
        pogon.getBitumen().getVentilPunjenjeCB1().getKomanda().setVrednost(resultDigitalMemory[481]);
                
        pogon.getBitumen().getVentilPunjenjeCB2().getKomanda().setVrednost(resultDigitalMemory[493]);
                
        pogon.getBitumen().getVentilPunjenjeCB3().getKomanda().setVrednost(resultDigitalMemory[491]);
              
        pogon.getBitumen().getVentilPraznjenjeCB1().getKomanda().setVrednost(resultDigitalMemory[482]);
               
        pogon.getBitumen().getVentilPraznjenjeCB2().getKomanda().setVrednost(resultDigitalMemory[494]);
       
        pogon.getBitumen().getVentilPraznjenjeCB3().getKomanda().setVrednost(resultDigitalMemory[492]);
               
        pogon.getBitumen().getKlapnaBitumena().getKomanda().setVrednost(resultDigitalMemory[498]);
        
        pogon.getBitumen().getKlapnaIspodVageBitumena().getKomanda().setVrednost(resultDigitalMemory[499]);
        
        pogon.getBitumen().getPumpaBitumena().getUklucennje().setVrednost(resultDigitalMemory[515]);
        pogon.getBitumen().getPumpaBitumena().getIskljucennje().setVrednost(resultDigitalMemory[514]);
        
        pogon.getMesalica().getMesalica().getKomanda().setVrednost(resultDigitalMemory[14]);
        pogon.getMesalica().getKlapnaMesalice().getKomanda().setVrednost(resultDigitalMemory[496]);
        pogon.getMesalica().getGrejacMesalice().setVrednost(resultDigitalMemory[516]);
        
        pogon.getKorpaVagon().getStartDizniVagona().setVrednost(resultDigitalMemory[260]);
        pogon.getKorpaVagon().getStartDizniKorpe().setVrednost(resultDigitalMemory[495]);
        pogon.getKorpaVagon().getPraznjenjeVagona().setVrednost(resultDigitalMemory[261]);
        pogon.getKorpaVagon().getStartKorpe().setVrednost(resultDigitalMemory[263]);
        pogon.getKorpaVagon().getPromenaSmeraKorpe().setVrednost(resultDigitalMemory[264]);
        pogon.getKorpaVagon().getPromenaBrzinaKorpe().setVrednost(resultDigitalMemory[265]);
        pogon.getKorpaVagon().getStartFrekfrentnogReg().setVrednost(resultDigitalMemory[266]);
        pogon.getKorpaVagon().getStartLevo().setVrednost(resultDigitalMemory[267]);
        pogon.getKorpaVagon().getStartDesno().setVrednost(resultDigitalMemory[268]);
        pogon.getKorpaVagon().getGrejanjeUstavagona().setVrednost(resultDigitalMemory[269]);
        pogon.getKorpaVagon().getStartCiklusaKorpe().setVrednost(resultDigitalMemory[277]);
        pogon.getKorpaVagon().getStartCiklusaVagona().setVrednost(resultDigitalMemory[281]);
        
        pogon.getKorpaVagon().getIberVagona().setVrednost(resultDigitalMemory[276]);
        
        pogon.getKorpaVagon().getPozicijaVagona1().setVrednost(resultDigitalMemory[241]);
        pogon.getKorpaVagon().getPozicijaVagona2().setVrednost(resultDigitalMemory[240]);
        pogon.getKorpaVagon().getPozicijaVagona3().setVrednost(resultDigitalMemory[239]);
        pogon.getKorpaVagon().getPozicijaVagona4().setVrednost(resultDigitalMemory[238]);
        pogon.getKorpaVagon().getPozicijaVagona5().setVrednost(resultDigitalMemory[237]);
        pogon.getKorpaVagon().getPozicijaVagona6().setVrednost(resultDigitalMemory[236]);
        
        pogon.getKorpaVagon().getPozicijaKorpe1().setVrednost(resultDigitalMemory[233]);
        pogon.getKorpaVagon().getPozicijaKorpe2().setVrednost(resultDigitalMemory[231]);
        pogon.getKorpaVagon().getPozicijaKorpe3().setVrednost(resultDigitalMemory[229]);

        pogon.getAsfaltSilosi().getGrejanjeUstaSilosaAsfalta1().setVrednost(resultDigitalMemory[271]);
        pogon.getAsfaltSilosi().getGrejanjeUstaSilosaAsfalta2().setVrednost(resultDigitalMemory[272]);
        pogon.getAsfaltSilosi().getGrejanjeUstaSilosaAsfalta3().setVrednost(resultDigitalMemory[273]);
        pogon.getAsfaltSilosi().getGrejanjeUstaSilosaAsfalta45().setVrednost(resultDigitalMemory[274]);
        
        pogon.getSkretnica().getSkretnicaUpravljanje().setVrednost(resultDigitalMemory[270]);
        pogon.getSkretnica().getSkretnicaIber1().setVrednost(resultDigitalMemory[244]);
        pogon.getSkretnica().getSkretnicaVagon1().setVrednost(resultDigitalMemory[245]);
        pogon.getSkretnica().getSkretnicaIber2().setVrednost(resultDigitalMemory[246]);
        pogon.getSkretnica().getSkretnicaVagon2().setVrednost(resultDigitalMemory[247]);
        
        
        
        pogon.getWriteSarzeInDb().setVrednost(resultDigitalMemory[528]);
    }
    
    private void getInputRegistri() {
        resultInputMemory = mxl.readDiscretInput(defaultOffsetReadIX , 200);  //max 2000
        
        pogon.getOtprasivanje().getElevatorSopstvenogFilera().getPotvrdaRada().setVrednost(resultInputMemory[52]);
        pogon.getOtprasivanje().getElevatorSopstvenogFilera().getGreska().setVrednost(resultInputMemory[51]);
        
        pogon.getFiler().getPuzKupovniFiler().getPotvrdaRada().setVrednost(resultInputMemory[55]);
        pogon.getFiler().getPuzKupovniFiler().getGreska().setVrednost(resultInputMemory[54]);
        
        pogon.getFiler().getPuzSopstveniFiler().getPotvrdaRada().setVrednost(resultInputMemory[57]);
        pogon.getFiler().getPuzSopstveniFiler().getGreska().setVrednost(resultInputMemory[56]);
        
        pogon.getFiler().getKlapnaKupovniFiler().getOtvoren().setVrednost(resultInputMemory[174]);
        pogon.getFiler().getKlapnaKupovniFiler().getZatvoren().setVrednost(false);
        
        pogon.getFiler().getKlapnaSopstveniFiler().getOtvoren().setVrednost(resultInputMemory[175]);
        pogon.getFiler().getKlapnaSopstveniFiler().getZatvoren().setVrednost(false);
        
        pogon.getFiler().getKlapnaIspodVageFilera().getOtvoren().setVrednost(false);
        pogon.getFiler().getKlapnaIspodVageFilera().getZatvoren().setVrednost(resultInputMemory[172]);
        
        pogon.getBitumen().getVentilPunjenjeCB1().getOtvoren().setVrednost(resultInputMemory[86]);
        pogon.getBitumen().getVentilPunjenjeCB1().getZatvoren().setVrednost(resultInputMemory[89]);
        
        pogon.getBitumen().getVentilPunjenjeCB2().getOtvoren().setVrednost(resultInputMemory[103]);
        pogon.getBitumen().getVentilPunjenjeCB2().getZatvoren().setVrednost(resultInputMemory[104]);
        
        pogon.getBitumen().getVentilPunjenjeCB3().getOtvoren().setVrednost(resultInputMemory[95]);
        pogon.getBitumen().getVentilPunjenjeCB3().getZatvoren().setVrednost(resultInputMemory[96]);
        
        pogon.getBitumen().getVentilPraznjenjeCB1().getOtvoren().setVrednost(resultInputMemory[88]);
        pogon.getBitumen().getVentilPraznjenjeCB1().getZatvoren().setVrednost(resultInputMemory[90]);
        
        pogon.getBitumen().getVentilPraznjenjeCB2().getOtvoren().setVrednost(resultInputMemory[105]);
        pogon.getBitumen().getVentilPraznjenjeCB2().getZatvoren().setVrednost(resultInputMemory[106]);
        
        pogon.getBitumen().getVentilPraznjenjeCB3().getOtvoren().setVrednost(resultInputMemory[98]);
        pogon.getBitumen().getVentilPraznjenjeCB3().getZatvoren().setVrednost(resultInputMemory[97]);
        
        pogon.getBitumen().getKlapnaIspodVageBitumena().getZatvoren().setVrednost(resultInputMemory[171]);
    }

    private void writeDigit() {
        if (writeDigital) {
            mxl.writeCoil(offsetWriteDig, mxValue);
            writeDigital = false;
        }
    }
    
    private void writeTwoDigital() {
        if (writeTwoDigital) {
            mxl.writeCoil(offsetWriteDig1, mxValue1);
            mxl.writeCoil(offsetWriteDig2, mxValue2);
            writeTwoDigital = false;
        }
    }
    
    private void writeRegister() {
        if (writeRegister) {
            mxl.writeHoldingRegister(offsetWriteReg, mwValue);
            writeRegister = false;
        }
    }
    
    private void writeRegisters() {
        if (writeRegisters) {
            mxl.writeHoldingRegisters(offsetWriteRegS, mwValues);
            writeRegisters = false;
        }
    }
    
     private void writeTwoRegister() {
        if (writeTwoRegister) {
            mxl.writeHoldingRegister(offsetWriteReg1, mwValue1);
            mxl.writeHoldingRegister(offsetWriteReg2, mwValue2);
            writeTwoRegister = false;
        }
    }
     
     private void writeThreeRegisters() {
        if (writeThreeRegisters) {
            mxl.writeHoldingRegisters(offsetWriteRegs1, mwValues1);
            mxl.writeHoldingRegisters(offsetWriteRegs2, mwValues2);
            mxl.writeHoldingRegisters(offsetWriteRegs3, mwValues3);
            writeThreeRegisters = false;
        }
    }
   
    
    public synchronized void writeMX(boolean mxValue, int offset){
        this.writeDigital = true;
        this.mxValue = mxValue;
        this.offsetWriteDig = offset;
    }
    
    public synchronized void writeMW(int mwValue, int offset){
        this.writeRegister = true;
        this.mwValue = mwValue;
        this.offsetWriteReg = offset;
    }
    
    public synchronized void writeMWs(int[] mwValues, int offset){
        this.writeRegisters = true;
        this.mwValues = mwValues;
        this.offsetWriteRegS = offset;
    }
    
    public synchronized void writeTwoRegister(int mw1, int offset1, int mw2, int offset2){
        writeTwoRegister = true;
        offsetWriteReg1 = offset1;
        offsetWriteReg2 = offset2;
        mwValue1 = mw1;
        mwValue2 = mw2;
    }
    
    public synchronized void writeThreeRegisters(int[] mw1, int offset1, int[] mw2, int offset2, int[] mw3, int offset3){
        writeThreeRegisters = true;
        offsetWriteRegs1 = offset1;
        offsetWriteRegs2 = offset2;
        offsetWriteRegs3 = offset3;
        mwValues1 = mw1;
        mwValues2 = mw2;
        mwValues3 = mw3;
    }
    
    public synchronized void writePrekidac(boolean mx1, int offset1, boolean mx2, int offset2){
        writeTwoDigital = true;
        offsetWriteDig1 = offset1;
        offsetWriteDig2 = offset2;
        mxValue1 = mx1;
        mxValue2 = mx2;
    }

}
