/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netvision.prozori;

import dbService.OtpremaService;
import dbService.RecepturaService;
import dbService.SarzaService;
import java.net.URL;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.Convert;

/**
 *
 * @author branko.scekic
 */
public class PregledOtpremaFrame extends javax.swing.JFrame {
    /**
     * Creates new form PregledRadnihNalogaFrame
     *
     * @param otpremaDb
     * @param pregledSarziZaOtpremuFrame
     */
    public PregledOtpremaFrame(OtpremaService otpremaDb, SarzaService sarzaDb) {
        initComponents();

        URL iconURL = getClass().getResource("/img/logo.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        this.otpremaDb = otpremaDb;
        this.sarzaDb = sarzaDb;
        getSveOtpreme();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        filterOtprema = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        filterMarkaAsfalta = new javax.swing.JComboBox<>();
        jLabel67 = new javax.swing.JLabel();
        filterKupac = new javax.swing.JComboBox<>();
        jLabel68 = new javax.swing.JLabel();
        filterGradiliste = new javax.swing.JComboBox<>();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        filterDatumOd = new com.github.lgooddatepicker.components.DatePicker();
        filterDatumDo = new com.github.lgooddatepicker.components.DatePicker();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableOtprema = new javax.swing.JTable();
        jButtonPregledRNOdustani = new javax.swing.JButton();
        jButtonFilterIzlistajRadneNaloge = new javax.swing.JButton();
        pregledRNDetalji = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemPotrosnjaMaterijala = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setResizable(false);

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Pregled otprema");
        jLabel31.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        jPanel12.setBackground(new java.awt.Color(255, 255, 204));

        jLabel53.setText("Broj RN:");

        jLabel66.setText("Marka asfalta:");

        filterMarkaAsfalta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel67.setText("Kupac:");

        filterKupac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel68.setText("Gradilište:");

        filterGradiliste.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel71.setText("Datum od:");

        jLabel72.setText("Datum do:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filterKupac, 0, 552, Short.MAX_VALUE)
                            .addComponent(filterGradiliste, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(filterMarkaAsfalta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(filterOtprema, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 192, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterDatumDo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterDatumOd, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel72)
                            .addComponent(filterDatumDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel71)
                        .addComponent(filterDatumOd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(filterOtprema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(filterMarkaAsfalta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67)
                    .addComponent(filterKupac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterGradiliste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableOtprema.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "br", "marka asfalta", "kupac", "gradiliste", "zadato kg", "isporuceno kg", "datum"
            }
        ));
        jTableOtprema.setFocusable(false);
        jTableOtprema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOtpremaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableOtprema);

        jButtonPregledRNOdustani.setText("Odustani");
        jButtonPregledRNOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPregledRNOdustaniActionPerformed(evt);
            }
        });

        jButtonFilterIzlistajRadneNaloge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/small/Search_24x24.png"))); // NOI18N
        jButtonFilterIzlistajRadneNaloge.setText("Izlistaj otpreme");
        jButtonFilterIzlistajRadneNaloge.setBackground(new java.awt.Color(0, 204, 204));
        jButtonFilterIzlistajRadneNaloge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFilterIzlistajRadneNalogeActionPerformed(evt);
            }
        });

        pregledRNDetalji.setText("Detalji");
        pregledRNDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pregledRNDetaljiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(pregledRNDetalji, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPregledRNOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFilterIzlistajRadneNaloge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonFilterIzlistajRadneNaloge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPregledRNOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pregledRNDetalji, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenu1.setText("Izvestaji");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItemPotrosnjaMaterijala.setText("Potrosnja materijala");
        jMenuItemPotrosnjaMaterijala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPotrosnjaMaterijalaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemPotrosnjaMaterijala);

        jMenuItem2.setText("Potrosnja komponenti");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Potrosnja po otpremi");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setText("Potrosnja po recepturi");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem3.setText("Potrosnja po sarzama");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Potrosnja u Silosima");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem6.setText("Prevoz po vozacima");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPregledRNOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPregledRNOdustaniActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPregledRNOdustaniActionPerformed

    private void jButtonFilterIzlistajRadneNalogeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFilterIzlistajRadneNalogeActionPerformed
        fillTable(otpremaDb.getFilteredData(filterOtprema.getSelectedItem().toString(),
                filterKupac.getSelectedItem().toString(), filterGradiliste.getSelectedItem().toString(),
                filterMarkaAsfalta.getSelectedItem().toString(), filterDatumOd.getText(), filterDatumDo.getText()));
    }//GEN-LAST:event_jButtonFilterIzlistajRadneNalogeActionPerformed

    private void pregledRNDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pregledRNDetaljiActionPerformed
        if (jTableOtprema.getSelectedRow() != -1) {
            //this.setVisible(false);
/*
            if (pregledSarziZaOtpremuFrame != null) {
                pregledSarziZaOtpremuFrame.dispose();
            }
            pregledSarziZaOtpremuFrame = new PregledSarziZaOtpremuFrame(sarzaDb, 
                    otpremaDb.getOtprema(Long.parseLong(jTableOtprema.getValueAt(jTableOtprema.getSelectedRow(), 1).toString())));
            
            pregledSarziZaOtpremuFrame.setVisible(true);

            pregledSarziZaOtpremuFrame.fillData(Long.parseLong(brojRadnogNalogaOtprema.getText()),
                    otpremaDb.getOtprema(Long.parseLong(jTableOtprema.getValueAt(jTableOtprema.getSelectedRow(), 8).toString())),
                    jTableOtprema.getValueAt(jTableOtprema.getSelectedRow(), 1).toString(),
                    jTableOtprema.getValueAt(jTableOtprema.getSelectedRow(), 2).toString());
*/
        } else {
            JOptionPane.showMessageDialog(this, "Niste selektovali radni nalog", "Obavestenje", 0);
        }
    }//GEN-LAST:event_pregledRNDetaljiActionPerformed

    private void jTableOtpremaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOtpremaMouseClicked
        pregledSarzaZaOtpremu();
    }//GEN-LAST:event_jTableOtpremaMouseClicked

    private void jMenuItemPotrosnjaMaterijalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPotrosnjaMaterijalaActionPerformed
        pregledSarzaZaOtpremu();
    }//GEN-LAST:event_jMenuItemPotrosnjaMaterijalaActionPerformed

    private void pregledSarzaZaOtpremu(){
        if (jTableOtprema.getSelectedRow() != -1) {
            if (pregledSarziZaOtpremuFrame != null) {
                pregledSarziZaOtpremuFrame.dispose();
            }
            pregledSarziZaOtpremuFrame = new PregledSarziZaOtpremuFrame(sarzaDb, 
                    otpremaDb.getOtprema(Long.parseLong(jTableOtprema.getValueAt(jTableOtprema.getSelectedRow(), 0).toString())));
            
            pregledSarziZaOtpremuFrame.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(this, "Niste selektovali radni nalog", "Obavestenje", 0);
        }
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        //    izvestajPoKupcuFrame.fillTable(jTableRadniNalozi);
        //    izvestajPoKupcuFrame.setFilter(filterDatumOd.getDateStringOrEmptyString(), filterDatumDo.getDateStringOrEmptyString(), getFilter());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (jTableOtprema.getRowCount() >= 1) {

        } else {
            JOptionPane.showMessageDialog(this, "Popunite filtere za zeljeni izvestaj", "Obavestenje", 0);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        //izvestajPoRecepturamaframe.fillTable(radniNalogDb.getFilteredData(filterRadniNalog.getSelectedItem().toString(), filterStatus.getSelectedIndex(),  
        //         filterKupac.getSelectedItem().toString(), filterGradiliste.getSelectedItem().toString(), filterMarkaBetona.getSelectedItem().toString(),
        //         filterDatumOd.getText(), filterDatumDo.getText()));

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        /*  fillTableRN(radniNalogDb.getFilteredData(filterRadniNalog.getSelectedItem().toString(), filterStatus.getSelectedIndex(),  
                filterKupac.getSelectedItem().toString(), filterGradiliste.getSelectedItem().toString(), filterMarkaBetona.getSelectedItem().toString(),
                filterDatumOd.getText(), filterDatumDo.getText()));
        
        pregledIzvestajaFrame.setFilters(filterRadniNalog.getSelectedItem().toString(), filterMarkaBetona.getSelectedItem().toString(), 
                    filterKupac.getSelectedItem().toString(), filterGradiliste.getSelectedItem().toString(), filterDatumOd.getText(), filterDatumDo.getText());*/
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        /*   izvestajPoVozacimaFrame.fillTable(radniNalogDb.getFilteredData(filterRadniNalog.getSelectedItem().toString(), filterStatus.getSelectedIndex(),  
                filterKupac.getSelectedItem().toString(), filterGradiliste.getSelectedItem().toString(), filterMarkaBetona.getSelectedItem().toString(),
                filterDatumOd.getText(), filterDatumDo.getText()));*/
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private String getFilter() {
        String res = "";
        if (filterOtprema.getSelectedIndex() != 0) {
            res = res + " R.N: " + filterOtprema.getSelectedItem().toString();
        }
        if (filterMarkaAsfalta.getSelectedIndex() != 0) {
            res = res + "  Marka betona: " + filterMarkaAsfalta.getSelectedItem().toString();
        }
        if (filterKupac.getSelectedIndex() != 0) {
            res = res + "  Kupac: " + filterKupac.getSelectedItem().toString();
        }
        if (filterGradiliste.getSelectedIndex() != 0) {
            res = res + "  Gradiliste: " + filterGradiliste.getSelectedItem().toString();
        }

        return res;
    }

    public void getSveOtpreme() {
        List<db.Otprema> result = otpremaDb.getOtpreme();
        fillTable(result);
        filterFillOtprema(result);
        filterFillMarkaAsfalta(otpremaDb.getMarkeAsfalta());
        filterFillKupac(otpremaDb.getKupci());
        filterFillGradilista(otpremaDb.getGradilista());
    }

    private void fillTable(List<db.Otprema> result) {
        int i = 0;
        Object[][] obj = new Object[result.size()][7];
        for (db.Otprema otprema : result) {
            obj[i][0] = otprema.getId();
            obj[i][1] = otprema.getReceptura();
            obj[i][2] = otprema.getKupac();
            obj[i][3] = otprema.getGradiliste();
            obj[i][4] = otprema.getZadatokg();
            obj[i][5] = otprema.getIzdatokg();
            obj[i][6] = Convert.convertDateToStringDate(otprema.getDatum()) + " " + Convert.convertDateToStringTime(otprema.getDatum());
            i++;
        }

        jTableOtprema.removeAll();
        DefaultTableModel model = new DefaultTableModel(obj, new Object[]{"r.b.", "Marka asfalta", "Kupac", "Gradiliste", "Ugovoreno", "Isporuceno", "Datum"});
        jTableOtprema.setModel(model);
        jTableOtprema.setRowMargin(4);
        jTableOtprema.setRowHeight(40);
        jTableOtprema.setShowGrid(true);
        jTableOtprema.getColumnModel().getColumn(0).setMaxWidth(45);
        jTableOtprema.setDefaultEditor(Object.class, null);

    }

    private void filterFillOtprema(List<db.Otprema> result) {

        DefaultComboBoxModel model = (DefaultComboBoxModel) filterOtprema.getModel();
        // removing old data
        model.removeAllElements();
        model.addElement("");

        for (int i = 0; i < result.size(); i++) {
            model.addElement(result.get(i).getId());
        }
        // setting model with new data
        filterOtprema.setModel(model);
    }

    private void filterFillMarkaAsfalta(List<String> result) {

        DefaultComboBoxModel modelmb = (DefaultComboBoxModel) filterMarkaAsfalta.getModel();
        // removing old data
        modelmb.removeAllElements();
        modelmb.addElement("");

        for (int i = 0; i < result.size(); i++) {
            modelmb.addElement(result.get(i));
        }

        // setting model with new data
        filterMarkaAsfalta.setModel(modelmb);
    }

    private void filterFillKupac(List<String> result) {

        DefaultComboBoxModel modelk = (DefaultComboBoxModel) filterKupac.getModel();
        // removing old data
        modelk.removeAllElements();
        modelk.addElement("");

        for (int i = 0; i < result.size(); i++) {
            modelk.addElement(result.get(i));
        }

        // setting model with new data
        filterKupac.setModel(modelk);
    }

    private void filterFillGradilista(List<String> result) {

        DefaultComboBoxModel modelg = (DefaultComboBoxModel) filterGradiliste.getModel();
        // removing old data
        modelg.removeAllElements();
        modelg.addElement("");

        for (int i = 0; i < result.size(); i++) {
            modelg.addElement(result.get(i));
        }
        // setting model with new data
        filterGradiliste.setModel(modelg);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker filterDatumDo;
    private com.github.lgooddatepicker.components.DatePicker filterDatumOd;
    private javax.swing.JComboBox<String> filterGradiliste;
    private javax.swing.JComboBox<String> filterKupac;
    private javax.swing.JComboBox<String> filterMarkaAsfalta;
    private javax.swing.JComboBox<String> filterOtprema;
    private javax.swing.JButton jButtonFilterIzlistajRadneNaloge;
    private javax.swing.JButton jButtonPregledRNOdustani;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemPotrosnjaMaterijala;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableOtprema;
    private javax.swing.JButton pregledRNDetalji;
    // End of variables declaration//GEN-END:variables
    
    private final SarzaService sarzaDb;
    private final OtpremaService otpremaDb;
    
    private PregledSarziZaOtpremuFrame pregledSarziZaOtpremuFrame;
}
