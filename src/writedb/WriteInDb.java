/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writedb;

import dbService.OtpremaService;
import dbService.SarzaService;
import pogon.Pogon;

/**
 *
 * @author Branko
 */
public class WriteInDb implements Runnable{
    
    private final Pogon pogon;
    private final SarzaService sarzaDb;
    private final OtpremaService otpremaDb;
    
    public WriteInDb(Pogon pogon, SarzaService sarzaDb, OtpremaService otpremaDb){
        this.pogon = pogon;
        this.sarzaDb = sarzaDb;
        this.otpremaDb = otpremaDb;
    }

    @Override
    public void run() {
        //privremeno();
        //System.out.println("Upis u bazu");
        sarzaDb.addSarza(otpremaDb.getLastOtprema(),
                pogon.getAgregat().getDoz1().getZadata().getVrednost(), pogon.getAgregat().getDoz1().getIzdozirana().getVrednost(), 
                pogon.getAgregat().getDoz2().getZadata().getVrednost(), pogon.getAgregat().getDoz2().getIzdozirana().getVrednost(),
                pogon.getAgregat().getDoz3().getZadata().getVrednost(), pogon.getAgregat().getDoz3().getIzdozirana().getVrednost(),
                pogon.getAgregat().getDoz4().getZadata().getVrednost(), pogon.getAgregat().getDoz4().getIzdozirana().getVrednost(),
                pogon.getAgregat().getDoz5().getZadata().getVrednost(), pogon.getAgregat().getDoz5().getIzdozirana().getVrednost(),
                pogon.getAgregat().getDoz6().getZadata().getVrednost(), pogon.getAgregat().getDoz6().getIzdozirana().getVrednost(),
                pogon.getAgregat().getDoz7().getZadata().getVrednost(), pogon.getAgregat().getDoz7().getIzdozirana().getVrednost(),
                pogon.getFiler().getKupovni().getZadata().getVrednost(), pogon.getFiler().getKupovni().getIzdozirana().getVrednost(),
                pogon.getFiler().getSopstveni().getZadata().getVrednost(), pogon.getFiler().getSopstveni().getIzdozirana().getVrednost(),
                pogon.getBitumen().getKolicine().getZadata().getVrednost(), pogon.getBitumen().getKolicine().getIzdozirana().getVrednost(),
                0, 0);
    }
    
    public void privremeno(){
        pogon.getAgregat().getDoz1().getZadata().setVrednost(1);
        pogon.getAgregat().getDoz2().getZadata().setVrednost(2);
        pogon.getAgregat().getDoz3().getZadata().setVrednost(3);
        pogon.getAgregat().getDoz4().getZadata().setVrednost(4);
        pogon.getAgregat().getDoz5().getZadata().setVrednost(5);
        pogon.getAgregat().getDoz6().getZadata().setVrednost(6);
        pogon.getAgregat().getDoz7().getZadata().setVrednost(7);
        pogon.getFiler().getKupovni().getZadata().setVrednost(8);
        pogon.getFiler().getSopstveni().getZadata().setVrednost(9);
        pogon.getBitumen().getKolicine().getZadata().setVrednost(10);
        
        pogon.getAgregat().getDoz1().getIzdozirana().setVrednost(12);
        pogon.getAgregat().getDoz2().getIzdozirana().setVrednost(13);
        pogon.getAgregat().getDoz3().getIzdozirana().setVrednost(14);
        pogon.getAgregat().getDoz4().getIzdozirana().setVrednost(15);
        pogon.getAgregat().getDoz5().getIzdozirana().setVrednost(16);
        pogon.getAgregat().getDoz6().getIzdozirana().setVrednost(17);
        pogon.getAgregat().getDoz7().getIzdozirana().setVrednost(18);
        pogon.getFiler().getKupovni().getIzdozirana().setVrednost(19);
        pogon.getFiler().getSopstveni().getIzdozirana().setVrednost(20);
        pogon.getBitumen().getKolicine().getIzdozirana().setVrednost(21);
    }
    
}
