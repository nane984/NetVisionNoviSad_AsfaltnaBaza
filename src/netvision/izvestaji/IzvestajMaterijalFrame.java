package netvision.izvestaji;

import dbService.OtpremaService;
import dbService.SarzaService;
import java.awt.Color;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.Convert;
import utils.PrintReport;

/**
 *
 * @author branko.scekic
 */
public class IzvestajMaterijalFrame extends javax.swing.JFrame {

    private final OtpremaService otpremaDb;
    private final SarzaService sarzaDb;

    /**
     * Creates new form IzvestajMaterijal
     *
     * @param otpremaDb
     * @param sarzaDb
     */
    public IzvestajMaterijalFrame(OtpremaService otpremaDb, SarzaService sarzaDb) {
        initComponents();
        URL iconURL = getClass().getResource("/img/logo.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        this.otpremaDb = otpremaDb;
        this.sarzaDb = sarzaDb;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelDatumOd = new javax.swing.JLabel();
        jLabelDatumDo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelFilter = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonPregledRNOdustani = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(892, 630));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowSelectionAllowed(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Izvestaj o potrosnji materijala ");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Datum:");

        jLabel3.setText("-");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Filteri:");

        jLabelFilter.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelFilter.setText("-");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDatumOd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDatumDo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDatumOd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDatumDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabelFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );

        jButtonPregledRNOdustani.setText("Odustani");
        jButtonPregledRNOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPregledRNOdustaniActionPerformed(evt);
            }
        });

        jButton1.setText("Stampaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPregledRNOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jButtonPregledRNOdustani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPregledRNOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPregledRNOdustaniActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPregledRNOdustaniActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PrinterJob pjob = PrinterJob.getPrinterJob();
        PageFormat preformat = pjob.defaultPage();
        preformat.setOrientation(PageFormat.PORTRAIT);

        Paper paper = preformat.getPaper();

        
        paper.setImageableArea(15.0, 15.0, paper.getWidth() - 20, paper.getHeight() - 20);
        

       // paper.setSize(595, 842); // a4 in px
       // paper.setImageableArea(10, 10, 580, 421);
        preformat.setPaper(paper);
        
        
        //Set print component
        pjob.setPrintable(new PrintReport(jPanel3), preformat);
        if (pjob.printDialog()) {
            try {
                pjob.setJobName("Izvestaj materijal"+ "_" +jLabelDatumOd.getText()+"_"+jLabelDatumDo.getText());
                pjob.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }

        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
 /*
    public void fillTable(JTable table) {
        double agrZadato04 = 0;
        double agrIzdato04 = 0;
        double agrZadato48 = 0;
        double agrIzdato48 = 0;
        double agrZadato816 = 0;
        double agrIzdato816 = 0;
        double cementZadato = 0;
        double cementIzdato = 0;
        double vodaZadato = 0;
        double vodaIzdato = 0;
        double a1Zadato = 0;
        double a1Izdato = 0;
        double a2Zadato = 0;
        double a2Izdato = 0;
        double a3Zadato = 0;
        double a3Izdato = 0;
        
        
        radniNalozi = new String[table.getRowCount()];
        for (int i = 0; i < table.getRowCount(); i++) {
            radniNalozi[i] = table.getValueAt(i, 1).toString();
        }
       
        for (int i = 0; i < radniNalozi.length; i++) {
            List<dbOld.Otprema> otprema = otpremaDb.getOtpremeZaRN(Long.parseLong(radniNalozi[i]));
            //System.out.println("za radniNalog " + radniNalozi[i]);

            for (int j = 0; j < otprema.size(); j++) {
                //System.out.println("___za otpremu br " + otprema.get(j).getBrotpreme() + " id " + otprema.get(j).getId());
                List<dbOld.Sarza> sarza = sarzaDb.getSarzeZaRadniNalogIOtpremu(Long.parseLong(radniNalozi[i]), otprema.get(j).getId());

                for (int k = 0; k < sarza.size(); k++) {
                    //System.out.println("___ ______sarza br " + sarza.get(k).getId());
                    agrZadato04 +=  sarza.get(k).getAgregatzadato04();
                    agrIzdato04 +=  sarza.get(k).getAgregatizdato04();
                    agrZadato48 +=  sarza.get(k).getAgregatzadato48();
                    agrIzdato48 +=  sarza.get(k).getAgregaizdato48();
                    agrZadato816 +=  sarza.get(k).getAgregatzadato816();
                    agrIzdato816 +=  sarza.get(k).getAgregatizdato816();
                    
                    cementZadato += sarza.get(k).getCementzadato();
                    cementIzdato += sarza.get(k).getCementizdato();
                    
                    vodaZadato += sarza.get(k).getVodazadato();
                    vodaIzdato += sarza.get(k).getVodaizdato();
                    
                    a1Zadato += sarza.get(k).getAditiv1zadato();
                    a1Izdato += sarza.get(k).getAditiv1izdato();
                    a2Zadato += sarza.get(k).getAditiv2zadato();
                    a2Izdato += sarza.get(k).getAditiv2izdato();
                    a3Zadato += sarza.get(k).getAgregatzadato1632();
                    a3Izdato += sarza.get(k).getAgregatizdato1632();
                }
            }

        }

        fillTable(agrZadato04, agrIzdato04, 
                agrZadato48, agrIzdato48, 
                agrZadato816, agrIzdato816,
                cementZadato, cementIzdato,
                vodaZadato, vodaIzdato,
                a1Zadato, a1Izdato,
                a2Zadato, a2Izdato,
                a3Zadato, a3Izdato);
    }

    private void fillTable(double agrZadato04, double agrIzdato04, 
            double agrZadato48, double agrIzdato48,
            double agrZadato816, double agrIzdato816,
            double cementZadato, double cementIzdato,
            double vodaZadato, double vodaIzdato,
            double a1Zadato, double a1Izdato,
            double a2Zadato, double a2Izdato,
            double a3Zadato, double a3Izdato) {
        
        Object[][] obj = new Object[10][5];

        obj[0][0] = "agregat";
        obj[0][1] = "agregat 0-4";
        obj[0][2] = Convert.format2decimals(agrZadato04) + " kg";
        obj[0][3] = Convert.format2decimals(agrIzdato04) + " kg";
        obj[0][4] = Convert.format2decimals(agrIzdato04 - agrZadato04) + " kg";
        
        obj[1][0] = "";
        obj[1][1] = "agregat 4-8";
        obj[1][2] = Convert.format2decimals(agrZadato48) + " kg";
        obj[1][3] = Convert.format2decimals(agrIzdato48) + " kg";
        obj[1][4] = Convert.format2decimals(agrIzdato48 - agrZadato04) + " kg";
        
        obj[2][0] = "";
        obj[2][1] = "agregat 8-16";
        obj[2][2] = Convert.format2decimals(agrZadato816) + " kg";
        obj[2][3] = Convert.format2decimals(agrIzdato816) + " kg";
        obj[2][4] = Convert.format2decimals(agrIzdato816 - agrZadato816) + " kg";
        
        obj[3][0] = "ukupno agregat";
        obj[3][1] = "";
        obj[3][2] = Convert.format2decimals(agrZadato04 + agrZadato48 + agrZadato816) + " kg";
        obj[3][3] = Convert.format2decimals(agrIzdato04 + agrIzdato48 + agrIzdato816) + " kg";
        obj[3][4] = Convert.format2decimals((agrIzdato04 + agrIzdato48 + agrIzdato816) - (agrZadato04 + agrZadato48 + agrZadato816)) + " kg";
        
        obj[4][0] = "cemet ukupno";
        obj[4][1] = "";
        obj[4][2] = Convert.format2decimals(cementZadato) + " kg";
        obj[4][3] = Convert.format2decimals(cementIzdato) + " kg";
        obj[4][4] = Convert.format2decimals(cementIzdato - cementZadato) + " kg";
        
        obj[5][0] = "voda ukupno";
        obj[5][1] = "";
        obj[5][2] = Convert.format2decimals(vodaZadato) + " kg";
        obj[5][3] = Convert.format2decimals(vodaIzdato) + " kg";
        obj[5][4] = Convert.format2decimals(vodaIzdato - vodaZadato) + " kg";
        
        obj[6][0] = "aditiv";
        obj[6][1] = "A1";
        obj[6][2] = Convert.format2decimals(a1Zadato) + " kg";
        obj[6][3] = Convert.format2decimals(a1Izdato) + " kg";
        obj[6][4] = Convert.format2decimals(a1Izdato - a1Zadato) + " kg";
        
        obj[7][0] = "";
        obj[7][1] = "A2";
        obj[7][2] = Convert.format2decimals(a2Zadato) + " kg";
        obj[7][3] = Convert.format2decimals(a2Izdato) + " kg";
        obj[7][4] = Convert.format2decimals(a2Izdato - a2Zadato) + " kg";
        
        obj[8][0] = "";
        obj[8][1] = "A3";
        obj[8][2] = Convert.format2decimals(a3Zadato) + " kg";
        obj[8][3] = Convert.format2decimals(a3Izdato) + " kg";
        obj[8][4] = Convert.format2decimals(a3Izdato - a3Zadato) + " kg";
        
        obj[9][0] = "aditiv ukupno";
        obj[9][1] = "";
        obj[9][2] = Convert.format2decimals(a1Zadato + a2Zadato + a3Zadato) + " kg";
        obj[9][3] = Convert.format2decimals(a1Izdato + a2Izdato + a3Izdato) + " kg";
        obj[9][4] = Convert.format2decimals((a1Izdato + a2Izdato + a3Izdato) - (a1Zadato + a2Zadato + a3Zadato)) + " kg";
        
        jTable1.removeAll();
        DefaultTableModel model = new DefaultTableModel(obj, new Object[]{"Vrsta" ,"Materijal", "zadata vrednost", "izdato vrednost", "odstupanje"});
        jTable1.setModel(model);
        jTable1.setRowMargin(4);
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.getColumnModel().getColumn(0).setMinWidth(110);
        jTable1.setDefaultEditor(Object.class, null);
        jTable1.getTableHeader().setBackground(Color.WHITE);
        jScrollPane1.getViewport().setBackground(Color.WHITE);
    }

    */
    public void setFilter(String datumOd, String datumDo, String filter){
        jLabelDatumOd.setText(datumOd);
        jLabelDatumDo.setText(datumDo);
        jLabelFilter.setText(filter);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonPregledRNOdustani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDatumDo;
    private javax.swing.JLabel jLabelDatumOd;
    private javax.swing.JLabel jLabelFilter;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private String[] radniNalozi;

}
