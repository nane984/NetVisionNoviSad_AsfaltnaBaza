/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogon.old;

/**
 *
 * @author branko.scekic
 */
public class RezimRada {
    private final Komanda rezRada;
    private final Komanda pc_R_A;
    private final Komanda ocitavanjePulta;
    
    public RezimRada(){
        rezRada = new Komanda();
        pc_R_A = new Komanda();
        ocitavanjePulta = new Komanda();
    }

    public Komanda getRezRada() {
        return rezRada;
    }

    public Komanda getPc_R_A() {
        return pc_R_A;
    }

    public Komanda getOcitavanjePulta() {
        return ocitavanjePulta;
    }
    
    
}
