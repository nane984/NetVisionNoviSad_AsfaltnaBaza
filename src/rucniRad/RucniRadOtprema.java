/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rucniRad;

import utils.Convert;

/**
 *
 * @author branko.scekic
 */
public class RucniRadOtprema {

    private final RucniRadOtpremaElement frakcija1;
    private final RucniRadOtpremaElement frakcija2;
    private final RucniRadOtpremaElement frakcija3;

    private final RucniRadOtpremaElement frakcija1Fino;
    private final RucniRadOtpremaElement frakcija3Fino;

    //private final RucniRadElement frakcija4;
    private final RucniRadOtpremaElement vagaFrakcije;

    private final RucniRadOtpremaElement silos1;
    private final RucniRadOtpremaElement silos2;
    private final RucniRadOtpremaElement vagaCement;

    private final RucniRadOtpremaElement aditiv1;
    private final RucniRadOtpremaElement aditiv2;
    private final RucniRadOtpremaElement aditiv3;
    private final RucniRadOtpremaElement vagaAditiv;

    private final RucniRadOtpremaElement voda;
    private final RucniRadOtpremaElement vodaKaAditivu;
    private final RucniRadOtpremaElement vodaVaga;

    private boolean upisiUDB;

    public RucniRadOtprema() {
        upisiUDB = false;

        silos1 = new RucniRadOtpremaElement("SILOS 1");
        silos2 = new RucniRadOtpremaElement("SILOS 2");
        vagaCement = new RucniRadOtpremaElement("VAGA CEMENTA");

        frakcija1 = new RucniRadOtpremaElement("FRAKCIJA 1");
        frakcija2 = new RucniRadOtpremaElement("FRAKCIJA 2");
        frakcija3 = new RucniRadOtpremaElement("FRAKCIJA 3");
        frakcija1Fino = new RucniRadOtpremaElement("FRAKCIJA 1 fino");
        frakcija3Fino = new RucniRadOtpremaElement("FRAKCIJA 3 fino");
        //frakcija4 = new RucniRadElement("START RUČNOG DOZIRANJA FRAKCIJE 4", "ZAVRŠETAK RUČNOG DOZIRANJA FRAKCIJE 4");
        vagaFrakcije = new RucniRadOtpremaElement("VAGA FRAKCIJE");

        aditiv1 = new RucniRadOtpremaElement("ADITIV 1");
        aditiv2 = new RucniRadOtpremaElement("ADITIV 2");
        aditiv3 = new RucniRadOtpremaElement("ADITIV 3");
        vagaAditiv = new RucniRadOtpremaElement("VAGA ADITIV");

        voda = new RucniRadOtpremaElement("VODA IZ SILOSA");
        vodaVaga = new RucniRadOtpremaElement("VAGA VODE");

        vodaKaAditivu = new RucniRadOtpremaElement("VODA IZ SILOSA KA ADITIVU");
    }

    public RucniRadOtpremaElement getSilos1() {
        return silos1;
    }

    public RucniRadOtpremaElement getSilos2() {
        return silos2;
    }

    public RucniRadOtpremaElement getVagaCement() {
        return vagaCement;
    }

    public RucniRadOtpremaElement getFrakcija1() {
        return frakcija1;
    }

    public RucniRadOtpremaElement getFrakcija2() {
        return frakcija2;
    }

    public RucniRadOtpremaElement getFrakcija3() {
        return frakcija3;
    }

    /*public RucniRadElement getFrakcija4() {
        return frakcija4;
    }*/
    public RucniRadOtpremaElement getVagaFrakcije() {
        return vagaFrakcije;
    }

    public RucniRadOtpremaElement getAditiv1() {
        return aditiv1;
    }

    public RucniRadOtpremaElement getAditiv2() {
        return aditiv2;
    }

    public RucniRadOtpremaElement getAditiv3() {
        return aditiv3;
    }

    public RucniRadOtpremaElement getVagaAditiv() {
        return vagaAditiv;
    }

    public RucniRadOtpremaElement getVoda() {
        return voda;
    }

    public RucniRadOtpremaElement getVodaKaAditivu() {
        return vodaKaAditivu;
    }

    public RucniRadOtpremaElement getVodaVaga() {
        return vodaVaga;
    }

    public RucniRadOtpremaElement getFrakcija1Fino() {
        return frakcija1Fino;
    }

    public RucniRadOtpremaElement getFrakcija3Fino() {
        return frakcija3Fino;
    }

    public boolean isUpisiUDB() {
        return upisiUDB;
    }

    public void setUpisiUDB(boolean upisiUDB) {
        this.upisiUDB = upisiUDB;
    }
    
    

    public void writeData() {
        silos1.setVrednost(getPotrosenoSilos(silos1));
        silos2.setVrednost(getPotrosenoSilos(silos2));
        vagaCement.setVrednost(getPotrosenoVaga(vagaCement));
        frakcija1.setVrednost(getPotrosenoSilos(frakcija1));
        frakcija1Fino.setVrednost(getPotrosenoSilos(frakcija1Fino));
        frakcija2.setVrednost(getPotrosenoSilos(frakcija2));
        frakcija3.setVrednost(getPotrosenoSilos(frakcija3));
        frakcija3Fino.setVrednost(getPotrosenoSilos(frakcija3Fino));
        vagaFrakcije.setVrednost(getPotrosenoVaga(vagaFrakcije));
        aditiv1.setVrednost(getPotrosenoSilos(aditiv1));
        aditiv2.setVrednost(getPotrosenoSilos(aditiv2));
        aditiv3.setVrednost(getPotrosenoSilos(aditiv3));
        voda.setVrednost(getPotrosenoSilos(voda));
        vodaVaga.setVrednost(getPotrosenoVaga(vodaVaga));
        setUpisiUDB(true);
    }

    private double getPotrosenoSilos(RucniRadOtpremaElement element) {
        if (element.isPromenaVrednosti()) {
            double result = element.getUkupnaVrednost();
            element.setUkupnaVrednost(0);
            element.setPromenaVrednosti(false);
            return result;
        } else {
            element.setPromenaVrednosti(false);
            return 0;
        }

    }

    private double getPotrosenoVaga(RucniRadOtpremaElement element) {
        if (element.isPromenaVrednosti()) {
            double result = element.getUkupnaVrednost();
            element.setUkupnaVrednost(0);
            element.setPromenaVrednosti(false);
            return result;
        } else {
            element.setPromenaVrednosti(false);
            return 0;
        }
    }

    public void setDataSilos(boolean komanda, RucniRadOtpremaElement element, int tezina, int brDec) {
        if (komanda && element.isUnesiPocetak()) {
            element.setPromenaVrednosti(true);
            element.setVrednosVagePocetak(Convert.shiftPointDoubleSign(tezina, brDec));
            element.setUnesiPocetak(false);
            element.setUnesiKraj(true);
        }
        if (!komanda && element.isUnesiKraj()) {
            element.setVrednosVageKraj(Convert.shiftPointDoubleSign(tezina, brDec));
            element.setUnesiKraj(false);
            element.setUkupnaVrednost((element.getVrednosVageKraj() - element.getVrednosVagePocetak()) + element.getUkupnaVrednost());
        }
    }
    
    public void setDataVaga(boolean komanda, RucniRadOtpremaElement element, int tezina, int brDec) {
        if (komanda && element.isUnesiPocetak()) {
            element.setPromenaVrednosti(true);
            element.setVrednosVagePocetak(Convert.shiftPointDoubleSign(tezina, brDec));
            element.setUnesiPocetak(false);
            element.setUnesiKraj(true);
        }
        if (!komanda && element.isUnesiKraj()) {
            element.setVrednosVageKraj(Convert.shiftPointDoubleSign(tezina, brDec));
            element.setUnesiKraj(false);
            element.setUkupnaVrednost((element.getVrednosVagePocetak() - element.getVrednosVageKraj()) + element.getUkupnaVrednost());
        }
    }
}
