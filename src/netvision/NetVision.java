/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netvision;

import com.Buff;
import com.Mxl;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import db.Zbirniparametri;
import dbService.GradilisteService;
import dbService.KupciService;
import dbService.OtpremaService;
import dbService.RecepturaService;
import dbService.RucniRadService;
import dbService.SarzaService;
import dbService.SifreService;
import dbService.SilosiService;
import dbService.VozacService;
import dbService.VoziloService;
import dbService.ZbirniParametriService;
import frame.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Properties;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import pogon.Pogon;
import pogon.part.ZbirniParametri;
import rucniRad.RucniRadOtprema;
import utils.Convert;
import writedb.WriteInDb;


/**
 *
 * @author branko.scekic
 */
public class NetVision {

    //modbus
    public static Buff mb;
    private final String ipAdresa;
    private final int mw1;
    private final int mw2;
    private final int mw3;
    private final int mx;
    private final int ix;
    
    public Timer timer;
    
    private final Pogon pogon;
    //private final OtpremnicaStampa otpremnicaStampa;
    
    //private final RucniRad rucniRad;
    //private final RucniRadOtprema rucniRadOtprema;
    
    //Database
    private final WriteInDb writeInDb;
    private final RecepturaService recepturaDb;
    private final ZbirniParametriService zbirniParametriDb;
    private final OtpremaService otpremnicaDb;
    private final SarzaService sarzaDb;
    private EntityManagerFactory emf;
    
    /*
    private final VozacService vozacDb;
    private final KupciService kupciDb;
    private final GradilisteService gradilisteDb;
    private final VoziloService voziloDb;
    private final RadniNalogService radniNalogDb;
    private final OtpremaService otpremaDb;
    private final SifreService sifreDb;
    private final SilosiService silosiDb;
    private final RucniRadService rucniRadDb;
    
    //Frame
    private final VozacFrame vozacFrame;
    private final KupacFrame kupacFrame;
    private final PregledRadnihNalogaFrame pregledRadnihNalogaFrame;
    private final PregledOtpremaZaRadniNalogFrame pregledRadnogNalogaPoOtpremamaFrame;
    private final PregledSarziZaOtpremuFrame pregledSarziZaOtpremuFrame;
    private final SifreFrame sifreFrame;
    private final PregledIzvestajaFrame pregledIzvestajaFrame;
    private final PregledRucniRadFrame pregledRucniRadFrame;
    private final IzvestajMaterijalFrame izvestajMaterijalFrame;
    private final IzvestajPoOtpremiFrame izvestajPoKupcuFrame;
    private final IzvestajPoSarzamaFrame izvestajPoSarzamaFrame;
    private final IzvestajSilosiFrame izvestajSilosiFrame;
    private final IzvestajPoRecepturamaFrame izvestajPoRecepturamaframe;
    private final IzvestajPoVozacimaFrame izvestajPoVozacimaFrame;
*/

    
    public NetVision(){
        this.pogon = new Pogon();

        //comm
        /*
        this.ipAdresa = "DESKTOP-RA5GQLE";  //kuca
        this.mw1 = 0;
        this.mw2 = 0;
        this.mx = 0;
        this.ix = 0;
        */
        
        this.ipAdresa = "192.168.0.2"; //plc
        this.mw1 = 49;
        this.mw2 = 200;
        this.mw3 = 300;
        this.mx = 0;
        this.ix = 0;
        
        this.mb = new Buff(pogon);
        this.mb.setIpAdresa(this.ipAdresa, mw1, mw2, mw3, mx, ix);
        
        
        this.emf = Persistence.createEntityManagerFactory("NetVisionNoviSad_AsfaltnaBazaPU");
        this.recepturaDb = new RecepturaService(emf);
        this.zbirniParametriDb  = new ZbirniParametriService(emf);
        this.otpremnicaDb = new OtpremaService(emf);
        this.sarzaDb = new SarzaService(this.emf);
        this.writeInDb = new WriteInDb(pogon, sarzaDb, otpremnicaDb);
        
        inicijalizujZbirneParametre();
        inicDbSarza();
        /*
        this.brSarzi = new BrSarzi();
        this.tekuciRN = new TekuciRN();
        this.vozacDb = new VozacService(this.emf);
        this.kupciDb = new KupciService(this.emf);
        this.gradilisteDb = new GradilisteService(this.emf);
        this.voziloDb = new VoziloService(this.emf);
        this.radniNalogDb = new RadniNalogService(this.emf, this.tekuciRN);
        this.otpremaDb = new OtpremaService(this.emf, tekuciRN);
        this.sifreDb = new SifreService(this.emf);
        this.silosiDb = new SilosiService(this.emf);
        this.rucniRadDb = new RucniRadService(this.emf);
          */
        
        //this.otpremnicaStampa = new OtpremnicaStampa(sarzaDb);
        //this.vozacFrame = new VozacFrame(vozacDb, voziloDb);
        //this.kupacFrame = new KupacFrame(kupciDb, gradilisteDb);
        //this.novaOtpremaFrame = new NovaOtpremaFrame(otpremaDb, vozacDb, voziloDb, recepturaDb, radniNalogDb,
        //                                            vozacFrame, pogonOld, brSarzi, tekuciRN);
        //this.izvestajPoRecepturamaframe = new IzvestajPoRecepturamaFrame(otpremaDb, sarzaDb);
        //this.pregledIzvestajaFrame = new PregledIzvestajaFrame(sarzaDb);
        //this.pregledSarziZaOtpremuFrame = new PregledSarziZaOtpremuFrame(sarzaDb, radniNalogDb, otpremaDb, recepturaDb, otpremnicaStampa, kupciDb);
        //this.pregledRadnogNalogaPoOtpremamaFrame = new PregledOtpremaZaRadniNalogFrame(otpremaDb, radniNalogDb, pregledSarziZaOtpremuFrame);
        //this.aktivniRadniNaloziFrame = new AktivniRadniNaloziFrame(radniNalogDb, novaOtpremaFrame, tekuciRN, pregledRadnogNalogaPoOtpremamaFrame, pogonOld);
        //this.noviRadniNalogFrame = new NoviRadniNalogFrame(radniNalogDb, kupciDb, 
        //        gradilisteDb, recepturaDb, kupacFrame, novaOtpremaFrame, tekuciRN);
        //this.izvestajMaterijalFrame = new IzvestajMaterijalFrame(otpremaDb, sarzaDb);
        //this.izvestajPoKupcuFrame = new IzvestajPoOtpremiFrame(otpremaDb);
        //this.izvestajPoSarzamaFrame = new IzvestajPoSarzamaFrame(otpremaDb, sarzaDb);
        //this.izvestajSilosiFrame = new IzvestajSilosiFrame(silosiDb);
        //this.izvestajPoVozacimaFrame = new IzvestajPoVozacimaFrame(this.otpremaDb, this.sarzaDb);
        //this.pregledRadnihNalogaFrame = new PregledRadnihNalogaFrame(radniNalogDb, pregledRadnogNalogaPoOtpremamaFrame, 
        //        pregledIzvestajaFrame, izvestajMaterijalFrame, izvestajPoKupcuFrame, izvestajPoSarzamaFrame, izvestajSilosiFrame,
        //        izvestajPoRecepturamaframe, izvestajPoVozacimaFrame);
        //this.sifreFrame = new SifreFrame(sifreDb);
        //this.pregledRucniRadFrame = new PregledRucniRadFrame(this.rucniRadDb);
        
        
        //this.rucniRad = new RucniRad();
        //this.rucniRadOtprema = new RucniRadOtprema();
    }
    
   
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        try {
            //here you can put the selected theme class name in JTattoo
            Properties p = new Properties();
            p.put("windowTitleFont", "Ebrima PLAIN 15");
            p.put("logoString", "");
            p.put("windowDecoration", "off");
            AluminiumLookAndFeel.setCurrentTheme(p);
            ///UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                try{
                
                NetVision nv = new NetVision();
                
                MainFrame main1 = new MainFrame(nv.pogon, nv.recepturaDb, nv.zbirniParametriDb, nv.otpremnicaDb, nv.sarzaDb);
                MainFrame.showOnScreen(1, main1);
                main1.setVisible(true);
                main1.otvoriGlavnuSliku();
                
                MainFrame main2 = new MainFrame(nv.pogon, nv.recepturaDb, nv.zbirniParametriDb, nv.otpremnicaDb, nv.sarzaDb);
                MainFrame.showOnScreen(2, main2);
                main2.setVisible(true);
                main2.otvoriGlavnuSliku2();
               
                nv.timer = new Timer(1000, new ActionListener() {  //1000 1 sec
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        nv.resetCom();
                        nv.writeInDbSarze();
                    }
                });
                nv.timer.start();
                
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }            
        });
    }
        
    
    private void inicijalizujZbirneParametre(){
        List<Zbirniparametri> zp = zbirniParametriDb.getZbirniParametri();
        int last = zp.size()-1;
        
        pogon.getParametri().setKapacitetMesalice(zp.get(last).getKapacitetmesalice()); 
    }
    
    private void resetCom() {
        if (!Mxl.conOk) {
            mb = new Buff(pogon);
            mb.setIpAdresa(this.ipAdresa, mw1, mw2, mw3, mx, ix);
            new Thread(mb).start();
            //novaOtpremaFrame.setMb(mb);

        }
    }    

    private void inicDbSarza() {
        new Thread(writeInDb);
    }
    
    private void writeInDbSarze() {
        if(pogon.getWriteSarzeInDb().isVrednost()){
            writeInDb.run();
            NetVision.mb.writeMX(false, pogon.getWriteSarzeInDb().getAdresaVrednosti());
        }
    }
}
