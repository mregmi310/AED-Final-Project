/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.UI.CompanyManger;

/**
 *
 * @author knd18
 */
public class CompanyManagerHomePageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CompanyManagerHomePageJPanel
     */
    public CompanyManagerHomePageJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegisterNewCom = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLiscenceRe = new javax.swing.JButton();
        btnListingReq = new javax.swing.JButton();
        btnNewIM = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1000, 1000));

        btnRegisterNewCom.setText("Register New Company");
        btnRegisterNewCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterNewComActionPerformed(evt);
            }
        });

        jLabel1.setText("Welcome Comapny Manager ");

        btnLiscenceRe.setText("Liscence Request");
        btnLiscenceRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiscenceReActionPerformed(evt);
            }
        });

        btnListingReq.setText("Lisiting Requests");

        btnNewIM.setText("Assigning New Investment Manager");

        jButton1.setText("Add New Investment Manager");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListingReq)
                            .addComponent(btnLiscenceRe)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btnRegisterNewCom))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(btnNewIM))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(btnRegisterNewCom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLiscenceRe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListingReq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewIM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(212, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterNewComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterNewComActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterNewComActionPerformed

    private void btnLiscenceReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiscenceReActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLiscenceReActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLiscenceRe;
    private javax.swing.JButton btnListingReq;
    private javax.swing.JButton btnNewIM;
    private javax.swing.JButton btnRegisterNewCom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}