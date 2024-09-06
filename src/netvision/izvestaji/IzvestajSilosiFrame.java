package netvision.izvestaji;

import dbService.SilosiService;
import java.awt.Color;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;
import utils.Convert;
import utils.PrintReport;

/**
 *
 * @author branko.scekic
 */
public class IzvestajSilosiFrame extends javax.swing.JFrame {

    private final SilosiService silosDb;

    /**
     * Creates new form IzvestajMaterijal
     *
     * @param silosDb
     */
    public IzvestajSilosiFrame(SilosiService silosDb) {
        initComponents();
        URL iconURL = getClass().getResource("/img/logo.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        this.silosDb = silosDb;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelDatumOd = new javax.swing.JLabel();
        jLabelDatumDo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButtonPregledRNOdustani = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(892, 630));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setToolTipText("");
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Opis", "Stanje", "Unos", "Jed.", "Datum", "Vreme"
            }
        ));
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowSelectionAllowed(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Datum:");

        jLabel3.setText("-");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDatumOd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDatumDo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDatumOd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDatumDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Izveštaj o potrošnji u silosu");
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("Stampaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonPregledRNOdustani.setText("Odustani");
        jButtonPregledRNOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPregledRNOdustaniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPregledRNOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPregledRNOdustani, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPregledRNOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPregledRNOdustaniActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPregledRNOdustaniActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //setPodaciZaglavlje();
        //printReport(jTable1);
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
        pjob.setPrintable(new PrintReport(jPanel3), preformat);
        if (pjob.printDialog()) {
            try {
                pjob.setJobName("Izvestaj silosi"+ "_" +jLabelDatumOd.getText()+"_"+jLabelDatumDo.getText());
                pjob.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }

        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    public void fillTable() {
        List<dbOld.Silosi> silos = silosDb.getSilosi(0, jLabelDatumOd.getText(), jLabelDatumDo.getText());

        double silos1PocetnoStanje = 0;
        boolean silos1PocetnoSt = true;
        double silos1Potroseno = 0;
        double silos1Stanje = 0;
        double silos1Unos = 0;

        double silos2PocetnoStanje = 0;
        boolean silos2PocetnoSt = true;
        double silos2Potroseno = 0;
        double silos2Stanje = 0;
        double silos2Unos = 0;

        for (int i = 0; i < silos.size(); i++) {

            if (silos.get(i).getBrsilosa() == 1 && !silos.get(i).getNulirano()) {
                if(silos1PocetnoSt){
                    silos1PocetnoStanje = Convert.format2decimals(silos.get(i).getStanje());
                    silos1PocetnoSt = false;
                }
                silos1Stanje = Convert.format2decimals(silos.get(i).getStanje());
            }
            if (silos.get(i).getBrsilosa() == 2 && !silos.get(i).getNulirano()) {
                if(silos2PocetnoSt){
                    silos2PocetnoStanje = Convert.format2decimals(silos.get(i).getStanje());
                    silos2PocetnoSt = false;
                }
                silos2Stanje = Convert.format2decimals(silos.get(i).getStanje());
            }
            
            if (i < silos.size() - 1) {
                if (silos.get(i).getBrsilosa() == 1) {
                    if(Convert.format2decimals(silos1PocetnoStanje - silos.get(i).getStanje()) < 0){
                        silos1PocetnoStanje = Convert.format2decimals(silos.get(i).getStanje());
                    }
                    if (Convert.format2decimals(silos1PocetnoStanje - silos.get(i).getStanje()) > 0 ) {
                        if(!silos.get(i).getNulirano()){
                            silos1Potroseno += Convert.format2decimals(silos1PocetnoStanje - silos.get(i).getStanje());
                        }
                        silos1PocetnoStanje = Convert.format2decimals(silos.get(i).getStanje());
                    }
                    silos1Unos += Convert.format2decimals(silos.get(i).getUnos());
                } else if (silos.get(i).getBrsilosa() == 2) {
                    if(Convert.format2decimals(silos1PocetnoStanje - silos.get(i).getStanje()) < 0){
                        silos2PocetnoStanje = Convert.format2decimals(silos.get(i).getStanje());
                    }
                    if (Convert.format2decimals(silos2PocetnoStanje - silos.get(i).getStanje()) > 0) {
                        if(!silos.get(i).getNulirano()){
                            silos2Potroseno += Convert.format2decimals(silos2PocetnoStanje - silos.get(i).getStanje());
                        }
                        silos2PocetnoStanje = Convert.format2decimals(silos.get(i).getStanje());
                    }
                    silos2Unos += Convert.format2decimals(silos.get(i).getUnos());
                }
            }

            
        }

        Object[][] obj = new Object[2][4];

        obj[0][0] = "Silos br. 1";
        obj[0][1] = silos1Potroseno;
        obj[0][2] = silos1Unos;
        obj[0][3] = silos1Stanje;

        obj[1][0] = "Silos br. 2";
        obj[1][1] = silos2Potroseno;
        obj[1][2] = silos2Unos;
        obj[1][3] = silos2Stanje;

        jTable1.removeAll();
        DefaultTableModel model = new DefaultTableModel(obj, new Object[]{"", "Potroseno", "Dodato", "Trenutno u silosu"});
        jTable1.setModel(model);
        jTable1.setRowMargin(4);
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.getColumnModel().getColumn(0).setMinWidth(110);
        jTable1.setDefaultEditor(Object.class, null);
        jTable1.getTableHeader().setBackground(Color.WHITE);
        jScrollPane1.getViewport().setBackground(Color.WHITE);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonPregledRNOdustani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDatumDo;
    private javax.swing.JLabel jLabelDatumOd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private Map<String, Object> podaci;

    public void setFilter(String dateOd, String dateDo) {
        jLabelDatumOd.setText(Convert.formatDateToString(dateOd));
        jLabelDatumDo.setText(Convert.formatDateToString(dateDo));
        fillTable();
    }
}
