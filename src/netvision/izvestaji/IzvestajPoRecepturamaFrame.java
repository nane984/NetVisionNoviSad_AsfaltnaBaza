package netvision.izvestaji;

import dbService.OtpremaService;
import dbService.SarzaService;
import java.awt.Color;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import utils.StatusOtprema;

/**
 *
 * @author branko.scekic
 */
public class IzvestajPoRecepturamaFrame extends javax.swing.JFrame {

    /**
     * Creates new form IzvestajMaterijal
     *
     * @param otpremaDb
     * @param sarzaDb
     */
    public IzvestajPoRecepturamaFrame(OtpremaService otpremaDb, SarzaService sarzaDb) {
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

        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(892, 630));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
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
        jLabel1.setText("Izvestaj o potrosnji materijala po marki betona");

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
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(231, 231, 231))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabelDatumOd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelDatumDo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap()))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabelDatumOd, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelDatumDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabelFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
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
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPregledRNOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPregledRNOdustaniActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPregledRNOdustaniActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      //  setPodaciZaglavlje();
        printReport(jTable1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void printReport(JTable jTable) {
        try {
            DefaultTableModel de = (DefaultTableModel) jTable.getModel();
            JasperReport jr = JasperCompileManager.compileReport("C:\\NetVision\\reports\\ReportRecepture.jrxml");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jr, podaci, new JRTableModelDataSource(de));
            JasperViewer.viewReport(jasperPrint, false);

        } catch (JRException ex) {
            Logger.getLogger(PregledIzvestajaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*
    private void setPodaciZaglavlje(){
        podaci = new HashMap();
        podaci.put("datum", jLabelDatumOd.getText()+" - "+jLabelDatumDo.getText());
        podaci.put("filteri", jLabelFilter.getText());
    }
    
    
    public void fillTable(List<dbOld.Radninalog> rn) {

        Set<String> radniNalog = new HashSet<>();

        for (int i=0; i<rn.size();i++) {
            radniNalog.add(rn.get(i).getMarkabetona());
        }
        
        for(String rb : radniNalog){
            System.out.println(rb);
        }

        List<String> list = new ArrayList<>(radniNalog);

        int[] agrIzdato04 = new int[radniNalog.size()];
        int[] agrIzdato48 = new int[radniNalog.size()];
        int[] agrIzdato816 = new int[radniNalog.size()];
        double[] cementIzdato = new double[radniNalog.size()];
        double[] vodaIzdato = new double[radniNalog.size()];
        double[] a1Izdato = new double[radniNalog.size()];
        double[] a2Izdato = new double[radniNalog.size()];
        double[] a3Izdato = new double[radniNalog.size()];
        double[] m3Izdato = new double[radniNalog.size()];
        String[] rezimRada = new String[radniNalog.size()];

        for (int i = 0; i < radniNalog.size(); i++) {

            for (dbOld.Radninalog radnal : rn) {
                if (radnal.getMarkabetona().equals(list.get(i))) {

                    for (int k = 0; k < radnal.getBrojotpreme(); k++) {

                        dbOld.Otprema otp = otpremaDb.getOtpremaBrRNOtp(radnal.getRn(), k + 1, jLabelDatumDo.getText());
                        if (otp.getId()!=null) {
                            List<dbOld.Sarza> sarza = sarzaDb.getSarzeZaOtpremu(otp.getId());

                            for (int j = 0; j < sarza.size(); j++) {
                                agrIzdato04[i] += sarza.get(j).getAgregatizdato04();
                                agrIzdato48[i] += sarza.get(j).getAgregaizdato48();
                                agrIzdato816[i] += sarza.get(j).getAgregatizdato816();

                                cementIzdato[i] += sarza.get(j).getCementizdato();
                                vodaIzdato[i] += sarza.get(j).getVodaizdato();
                                a1Izdato[i] += sarza.get(j).getAditiv1izdato();
                                a2Izdato[i] += sarza.get(j).getAditiv2izdato();
                                a3Izdato[i] += sarza.get(j).getAgregatzadato1632();
                            }
                            m3Izdato[i] += otp.getIzdatom3();
                            if(otp.getStatus()==3){
                                rezimRada[i] = StatusOtprema.getStatus(otp.getStatus()) + "  "+otp.getIzdatom3();
                            }
                            
                        }
                    }
                }
            }
        }

        fillTable(list, agrIzdato04, agrIzdato48,
                agrIzdato816, cementIzdato,
                vodaIzdato, a1Izdato,
                a2Izdato, a3Izdato, 
                m3Izdato, rezimRada);

    }

    private void fillTable(List<String> list, int[] agrIzdato04, int[] agrIzdato48,
            int[] agrIzdato816, double[] cementIzdato,
            double[] vodaIzdato, double[] a1Izdato,
            double[] a2Izdato, double[] a3Izdato,
            double[] m3Izdato, String[] rezimRada) {

        Object[][] obj = new Object[list.size()][11];

        for (int i = 0; i < list.size(); i++) {
            obj[i][0] = list.get(i);
            obj[i][1] = Convert.format2decimals(agrIzdato04[i]) + " kg";
            obj[i][2] = Convert.format2decimals(agrIzdato48[i]) + " kg";
            obj[i][3] = Convert.format2decimals(agrIzdato816[i]) + " kg";
            obj[i][4] = Convert.format2decimals(cementIzdato[i]) + " kg";
            obj[i][5] = Convert.format2decimals(vodaIzdato[i]) + " kg";
            obj[i][6] = Convert.format2decimals(a1Izdato[i]) + " kg";
            obj[i][7] = Convert.format2decimals(a2Izdato[i]) + " kg";
            obj[i][8] = Convert.format2decimals(a3Izdato[i]) + " kg";
            obj[i][9] = Convert.format2decimals(m3Izdato[i]) + " m3";
            obj[i][10] = rezimRada[i];
        }

        jTable1.removeAll();
        DefaultTableModel model = new DefaultTableModel(obj, new Object[]{"Marka bet", "04", "48", "816", "cem", "vod", "a1", "a2", "a3", "m3", "rad"});
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
    public void setFilter(String datumOd, String datumDo, String filter) {
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
    private final OtpremaService otpremaDb;
    private final SarzaService sarzaDb;
    private Map<String, Object> podaci;
}
