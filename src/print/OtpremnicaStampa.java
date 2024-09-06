/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

import dbService.KupciService;
import dbService.SarzaService;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import utils.Convert;
import utils.PrintReport;

/**
 *
 * @author branko.scekic
 */
public class OtpremnicaStampa extends javax.swing.JFrame {

    /**
     * Creates new form Print1
     *
     *
     * @param sarzadb
     */
    public OtpremnicaStampa(SarzaService sarzadb) {

        initComponents();

        URL iconURL = getClass().getResource("/img/logo.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);
        this.sarzadb = sarzadb;
    }

    /*
    public void print(db.Otprema otprema, db.Receptura markaBet, KupciService kupcidb) {
        
        try {
            brRN.setText(Long.toString(radniNalog.getRn()));
            brOtpreme.setText(Integer.toString((int) otprema.getBrotpreme()));

            cvrstocaBetona.setText(radniNalog.getKlasacvrstoce());
            oznakaBetona.setText(radniNalog.getOznakabetona());
            klasaKonzistencije.setText(radniNalog.getKlasakonzistencije());

            dbOld.Kupci kup = kupcidb.getKupac(radniNalog.getKupac(), radniNalog.getKupacadresa());
            if (!kup.getSifrapartnera().isEmpty()) {
                kupac.setText(kup.getSkraceninazivpartnera());
                kupacAdresa.setText(kup.getNazivmesta() + " " + kup.getUlicaibroj());
                kupacMB.setText(kup.getMaticnibrojsudskogregistra());
                kupacPIB.setText(kup.getPoreskiidentifikacionibroj());
            } else {
                kupac.setText(radniNalog.getKupac());
                kupacAdresa.setText(radniNalog.getKupacadresa());
                kupacMB.setText(radniNalog.getKupacmb());
                kupacPIB.setText(radniNalog.getKupacpib());
            }

            gradiliste.setText(radniNalog.getGradiliste());
/*
            cvrstocaCementa.setText(markaBet.getCvrstocacementa());
            jLabelAditiv1.setText(markaBet.getTipaditiv1());
            jLabelAditiv2.setText(markaBet.getTipaditiv2());
            maximalnaVelicinaZrna.setText(markaBet.getMaxvelicinazrna().toString());
            if (markaBet.getMaxsadrzajhlorida() == 0) {
                maxHlorid.setText("");
            } else {
                maxHlorid.setText(markaBet.getMaxsadrzajhlorida().toString());
            }
            wbVrednost.setText(markaBet.getWbvrednost().toString());
            specijalnaSvojstva.setText(markaBet.getSpecijalnasvostva());

            datum.setText(Convert.convertDateToStringDate(otprema.getDatum()));
            vremePunjenja.setText(Convert.convertDateToStringTime(otprema.getDatum()));
            vozac.setText(otprema.getVozac());
            brVozila.setText(otprema.getVozilo());
            kolicinaBetonaIsporuceno.setText(Double.toString(Convert.format2DecimalPrint(otprema.getIzdatom3() + otprema.getPovrat())));
            
            
            dbOld.Sarza sarza = sarzadb.getLastSarzeZaOtpremu(otprema.getId());
            vremeZavrsetkaPunjenja.setText(Convert.convertDateToStringTime(sarza.getDate()));

            this.setVisible(true);
        } catch (java.lang.NullPointerException ex) {
            System.out.println("Ne moze da stampa");
            System.out.println(ex);
        }
    }
    
     public void printPocetnuOtp(dbOld.Radninalog radniNalog, dbOld.Otprema otprema, db.Receptura markaBet, KupciService kupcidb) {
        try {
            brRN.setText(Long.toString(radniNalog.getRn()));
            brOtpreme.setText(Integer.toString(radniNalog.getBrojotpreme()));

            cvrstocaBetona.setText(radniNalog.getKlasacvrstoce());
            oznakaBetona.setText(radniNalog.getOznakabetona());
            klasaKonzistencije.setText(radniNalog.getKlasakonzistencije());

            dbOld.Kupci kup = kupcidb.getKupac(radniNalog.getKupac(), radniNalog.getKupacadresa());
            if (!kup.getSifrapartnera().isEmpty()) {
                kupac.setText(kup.getSkraceninazivpartnera());
                kupacAdresa.setText(kup.getNazivmesta() + " " + kup.getUlicaibroj());
                kupacMB.setText(kup.getMaticnibrojsudskogregistra());
                kupacPIB.setText(kup.getPoreskiidentifikacionibroj());
            } else {
                kupac.setText(radniNalog.getKupac());
                kupacAdresa.setText(radniNalog.getKupacadresa());
                kupacMB.setText(radniNalog.getKupacmb());
                kupacPIB.setText(radniNalog.getKupacpib());
            }

            gradiliste.setText(radniNalog.getGradiliste());
/*
            cvrstocaCementa.setText(markaBet.getCvrstocacementa());
            jLabelAditiv1.setText(markaBet.getTipaditiv1());
            jLabelAditiv2.setText(markaBet.getTipaditiv2());
            maximalnaVelicinaZrna.setText(markaBet.getMaxvelicinazrna().toString());
            if (markaBet.getMaxsadrzajhlorida() == 0) {
                maxHlorid.setText("");
            } else {
                maxHlorid.setText(markaBet.getMaxsadrzajhlorida().toString());
            }
            wbVrednost.setText(markaBet.getWbvrednost().toString());
            specijalnaSvojstva.setText(markaBet.getSpecijalnasvostva());

            datum.setText(Convert.convertDateToStringDate(otprema.getDatum()));
            vremePunjenja.setText(Convert.convertDateToStringTime(otprema.getDatum()));
            vozac.setText(otprema.getVozac());
            brVozila.setText(otprema.getVozilo());
            kolicinaBetonaIsporuceno.setText(Double.toString(Convert.format2DecimalPrint(otprema.getZadatom3() + otprema.getPovrat())));
            
            
            dbOld.Sarza sarza = sarzadb.getLastSarzeZaOtpremu(otprema.getId());
            vremeZavrsetkaPunjenja.setText(Convert.convertDateToStringTime(sarza.getDate()));

            this.setVisible(true);
        } catch (java.lang.NullPointerException ex) {
            System.out.println("Ne moze da stampa");
            System.out.println(ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kupac = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gradiliste = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        oznakaBetona = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        datum = new javax.swing.JLabel();
        jLabelBrOtpr = new javax.swing.JLabel();
        brOtpreme = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        kolicinaBetonaIsporuceno = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        brVozila = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        vremePunjenja = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        vozac = new javax.swing.JLabel();
        jLabelAditiv1 = new javax.swing.JLabel();
        klasaKonzistencije = new javax.swing.JLabel();
        cvrstocaCementa = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabelBrOtpr1 = new javax.swing.JLabel();
        brRN = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cvrstocaBetona = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        kupacAdresa = new javax.swing.JLabel();
        kupacMB = new javax.swing.JLabel();
        kupacPIB = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        jLabelAditiv2 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        vremeZavrsetkaPunjenja = new javax.swing.JLabel();
        jSeparator30 = new javax.swing.JSeparator();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        maximalnaVelicinaZrna = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        maxHlorid = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        wbVrednost = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        specijalnaSvojstva = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 640));
        setType(java.awt.Window.Type.UTILITY);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(892, 630));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("PIB 103726184");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(20, 140, 150, 20);

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setText("PIB");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(20, 220, 40, 20);

        kupac.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        kupac.setText("-");
        jPanel4.add(kupac);
        kupac.setBounds(90, 180, 320, 20);

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setText("Gradilište:  ");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(450, 180, 72, 20);

        gradiliste.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        gradiliste.setText("-");
        jPanel4.add(gradiliste);
        gradiliste.setBounds(520, 180, 320, 20);

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel13.setText("Maks. veličina zrna agregata");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(20, 280, 200, 20);

        oznakaBetona.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        oznakaBetona.setText("-");
        jPanel4.add(oznakaBetona);
        oznakaBetona.setBounds(190, 260, 160, 20);

        jLabel3.setText("Datum: ");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(480, 10, 43, 30);

        datum.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        datum.setText("-");
        jPanel4.add(datum);
        datum.setBounds(530, 10, 110, 30);

        jLabelBrOtpr.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelBrOtpr.setText("Broj otpreme: ");
        jPanel4.add(jLabelBrOtpr);
        jLabelBrOtpr.setBounds(100, 10, 120, 24);

        brOtpreme.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        brOtpreme.setText("-");
        jPanel4.add(brOtpreme);
        brOtpreme.setBounds(230, 10, 40, 24);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOpaque(true);
        jPanel4.add(jSeparator2);
        jSeparator2.setBounds(10, 170, 860, 2);

        jLabel17.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel17.setText("Klasa konzistencije");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(20, 320, 150, 20);

        kolicinaBetonaIsporuceno.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        kolicinaBetonaIsporuceno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kolicinaBetonaIsporuceno.setText("0");
        jPanel4.add(kolicinaBetonaIsporuceno);
        kolicinaBetonaIsporuceno.setBounds(650, 200, 120, 20);

        jLabel31.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel31.setText("Kamion");
        jPanel4.add(jLabel31);
        jLabel31.setBounds(450, 340, 60, 20);

        brVozila.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        brVozila.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        brVozila.setText("-");
        jPanel4.add(brVozila);
        brVozila.setBounds(650, 340, 130, 20);

        jLabel34.setText("Br. licne karte:");
        jPanel4.add(jLabel34);
        jLabel34.setBounds(20, 560, 80, 16);

        vremePunjenja.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        vremePunjenja.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        vremePunjenja.setText("-");
        jPanel4.add(vremePunjenja);
        vremePunjenja.setBounds(220, 340, 70, 20);

        jSeparator23.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator23.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jSeparator23.setOpaque(true);
        jPanel4.add(jSeparator23);
        jSeparator23.setBounds(10, 44, 860, 2);

        jLabel37.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel37.setText("Vreme pocetka punjenja");
        jPanel4.add(jLabel37);
        jLabel37.setBounds(20, 340, 170, 20);

        vozac.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        vozac.setText("-");
        jPanel4.add(vozac);
        vozac.setBounds(320, 540, 120, 20);

        jLabelAditiv1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelAditiv1.setText("-");
        jPanel4.add(jLabelAditiv1);
        jLabelAditiv1.setBounds(650, 240, 130, 20);

        klasaKonzistencije.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        klasaKonzistencije.setText("-");
        jPanel4.add(klasaKonzistencije);
        klasaKonzistencije.setBounds(220, 320, 130, 20);

        cvrstocaCementa.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cvrstocaCementa.setText("-");
        jPanel4.add(cvrstocaCementa);
        cvrstocaCementa.setBounds(650, 220, 130, 20);

        jLabel41.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel41.setText("Tip aditiva1");
        jPanel4.add(jLabel41);
        jLabel41.setBounds(450, 240, 80, 20);

        jLabelBrOtpr1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelBrOtpr1.setText("/");
        jPanel4.add(jLabelBrOtpr1);
        jLabelBrOtpr1.setBounds(270, 10, 10, 24);

        brRN.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        brRN.setText("-");
        jPanel4.add(brRN);
        brRN.setBounds(290, 10, 100, 24);

        jLabel32.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel32.setText("Klasa čvstoće betona");
        jPanel4.add(jLabel32);
        jLabel32.setBounds(20, 240, 150, 20);

        cvrstocaBetona.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cvrstocaBetona.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cvrstocaBetona.setText("-");
        jPanel4.add(cvrstocaBetona);
        cvrstocaBetona.setBounds(190, 240, 160, 20);

        jLabel26.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Količina betona u m3 ");
        jPanel4.add(jLabel26);
        jLabel26.setBounds(450, 200, 150, 20);

        jLabel43.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel43.setText("Tip i klasa čvrstoce cementa");
        jPanel4.add(jLabel43);
        jLabel43.setBounds(450, 220, 190, 20);

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel12.setText("Karin Komerc MD d.o.o.");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(20, 50, 230, 30);

        jLabel27.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel27.setText("Novosadski Put br. 128  21283 Veternik");
        jPanel4.add(jLabel27);
        jLabel27.setBounds(20, 80, 380, 20);

        jLabel45.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel45.setText("Adresa isporuke: Vrbas");
        jPanel4.add(jLabel45);
        jLabel45.setBounds(20, 100, 320, 20);

        jLabel46.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel46.setText("MB 20009233");
        jPanel4.add(jLabel46);
        jLabel46.setBounds(20, 120, 150, 20);

        jLabel35.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel35.setText("Kupac");
        jPanel4.add(jLabel35);
        jLabel35.setBounds(20, 180, 60, 20);

        jLabel44.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel44.setText("Adresa");
        jPanel4.add(jLabel44);
        jLabel44.setBounds(20, 200, 60, 20);

        jLabel47.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel47.setText("MB");
        jPanel4.add(jLabel47);
        jLabel47.setBounds(220, 220, 30, 20);

        kupacAdresa.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        kupacAdresa.setText("-");
        jPanel4.add(kupacAdresa);
        kupacAdresa.setBounds(90, 200, 350, 20);

        kupacMB.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        kupacMB.setText("-");
        jPanel4.add(kupacMB);
        kupacMB.setBounds(250, 220, 160, 20);

        kupacPIB.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        kupacPIB.setText("-");
        jPanel4.add(kupacPIB);
        kupacPIB.setBounds(60, 220, 150, 20);

        jSeparator29.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator29.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jSeparator29.setOpaque(true);
        jPanel4.add(jSeparator29);
        jSeparator29.setBounds(10, 380, 860, 2);

        jLabel42.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel42.setText("Tip aditiva2");
        jPanel4.add(jLabel42);
        jLabel42.setBounds(450, 260, 80, 20);

        jLabelAditiv2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelAditiv2.setText("-");
        jPanel4.add(jLabelAditiv2);
        jLabelAditiv2.setBounds(650, 260, 130, 20);

        jLabel36.setText("Količina i tip dodataka na gradilištu ___________________       Vreme završetka istovara na gradilištu__________");
        jPanel4.add(jLabel36);
        jLabel36.setBounds(20, 460, 830, 16);

        jLabel48.setText("Karinkomerc");
        jPanel4.add(jLabel48);
        jLabel48.setBounds(20, 540, 90, 16);

        jLabel49.setText("Vozac");
        jPanel4.add(jLabel49);
        jLabel49.setBounds(320, 520, 100, 16);

        jLabel51.setText("Br. licne karte:");
        jPanel4.add(jLabel51);
        jLabel51.setBounds(320, 560, 80, 16);

        jLabel52.setText("Ime i prezime primaoca");
        jPanel4.add(jLabel52);
        jLabel52.setBounds(590, 520, 140, 16);

        jLabel53.setText("potpis");
        jPanel4.add(jLabel53);
        jLabel53.setBounds(590, 540, 70, 16);

        jLabel54.setText("Br. licne karte");
        jPanel4.add(jLabel54);
        jLabel54.setBounds(590, 560, 80, 16);

        jLabel38.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel38.setText("Vreme zavrsetka punjenja");
        jPanel4.add(jLabel38);
        jLabel38.setBounds(450, 320, 180, 20);

        vremeZavrsetkaPunjenja.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        vremeZavrsetkaPunjenja.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        vremeZavrsetkaPunjenja.setText("-");
        jPanel4.add(vremeZavrsetkaPunjenja);
        vremeZavrsetkaPunjenja.setBounds(650, 320, 120, 20);

        jSeparator30.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator30.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jSeparator30.setOpaque(true);
        jPanel4.add(jSeparator30);
        jSeparator30.setBounds(10, 500, 860, 2);

        jLabel39.setText("Magacioner - Operater");
        jPanel4.add(jLabel39);
        jLabel39.setBounds(20, 520, 200, 16);

        jLabel40.setText("Deklaracija u skladu sa normom ___________________            Ime ili znak kontrole_______________________");
        jPanel4.add(jLabel40);
        jLabel40.setBounds(20, 400, 840, 16);

        jLabel50.setText("Vreme odlaska betona na gradiliste ___________________       Vreme dolaska na gradilište_________________");
        jPanel4.add(jLabel50);
        jLabel50.setBounds(20, 430, 840, 16);

        jLabel14.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel14.setText("Fabrička oznaka betona");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(20, 260, 170, 20);

        maximalnaVelicinaZrna.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        maximalnaVelicinaZrna.setText("-");
        jPanel4.add(maximalnaVelicinaZrna);
        maximalnaVelicinaZrna.setBounds(220, 280, 150, 19);

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel15.setText("Maks. sadrzaj hlorida");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(20, 300, 170, 20);

        maxHlorid.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        maxHlorid.setText("-");
        jPanel4.add(maxHlorid);
        maxHlorid.setBounds(220, 300, 130, 20);

        jLabel55.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel55.setText("WB-Vrednost");
        jPanel4.add(jLabel55);
        jLabel55.setBounds(450, 280, 160, 20);

        wbVrednost.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        wbVrednost.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        wbVrednost.setText("-");
        jPanel4.add(wbVrednost);
        wbVrednost.setBounds(650, 280, 120, 20);

        jLabel56.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel56.setText("Specijala svojstva");
        jPanel4.add(jLabel56);
        jLabel56.setBounds(450, 300, 160, 20);

        specijalnaSvojstva.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        specijalnaSvojstva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        specijalnaSvojstva.setText("-");
        jPanel4.add(specijalnaSvojstva);
        specijalnaSvojstva.setBounds(650, 300, 130, 20);

        jScrollPane2.setViewportView(jPanel4);
        jPanel4.getAccessibleContext().setAccessibleName("");

        jMenu1.setText("Stampa");

        jMenuItem1.setText("Stampaj");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public BufferedImage createImage(JPanel panel) {

        int w = panel.getWidth();
        int h = panel.getHeight();
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bi.createGraphics();
        panel.paint(g);
        g.dispose();

        return bi;
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        PrinterJob pjob = PrinterJob.getPrinterJob();
        PageFormat preformat = pjob.defaultPage();
        preformat.setOrientation(PageFormat.PORTRAIT);

        Paper paper = preformat.getPaper();

        //pPaper.setImageableArea(5.0, 5.0, pPaper.getWidth() - 10, pPaper.getHeight() - 10);
        //preformat.setPaper(pPaper);
        paper.setSize(595, 842); // a4 in px
        paper.setImageableArea(10, 10, 580, 421);
        preformat.setPaper(paper);

        //Set print component
        pjob.setPrintable(new PrintReport(jPanel4), preformat);
        if (pjob.printDialog()) {
            try {
                pjob.setJobName(brOtpreme.getText() + "_" + kupac.getText());
                pjob.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }

        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brOtpreme;
    private javax.swing.JLabel brRN;
    private javax.swing.JLabel brVozila;
    private javax.swing.JLabel cvrstocaBetona;
    private javax.swing.JLabel cvrstocaCementa;
    private javax.swing.JLabel datum;
    private javax.swing.JLabel gradiliste;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAditiv1;
    private javax.swing.JLabel jLabelAditiv2;
    private javax.swing.JLabel jLabelBrOtpr;
    private javax.swing.JLabel jLabelBrOtpr1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JLabel klasaKonzistencije;
    private javax.swing.JLabel kolicinaBetonaIsporuceno;
    private javax.swing.JLabel kupac;
    private javax.swing.JLabel kupacAdresa;
    private javax.swing.JLabel kupacMB;
    private javax.swing.JLabel kupacPIB;
    private javax.swing.JLabel maxHlorid;
    private javax.swing.JLabel maximalnaVelicinaZrna;
    private javax.swing.JLabel oznakaBetona;
    private javax.swing.JLabel specijalnaSvojstva;
    private javax.swing.JLabel vozac;
    private javax.swing.JLabel vremePunjenja;
    private javax.swing.JLabel vremeZavrsetkaPunjenja;
    private javax.swing.JLabel wbVrednost;
    // End of variables declaration//GEN-END:variables

    private final SarzaService sarzadb;
}
