/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.UI.Moderators.Comodity;

import com.stockops.Business.EcoSystem;
import com.stockops.Market.Commodity;
import com.stockops.Market.Equity;
import com.stockops.Users.UserAccount;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author knd18
 */
public class CommodityModaratorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ComodityModarator
     */
    UserAccount account;
    EcoSystem business;
    Commodity selectedCommodity;
    public CommodityModaratorJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        this.account=account;
        this.business=business;
        populateCommodityListTable();
        btnModCom.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtComName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSymbol = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUnit = new javax.swing.JTextField();
        btnModCom = new javax.swing.JButton();
        btnComdity = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Symbol", "Price", "Unit"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 98, 472, 122));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Comodity Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 269, -1, -1));

        txtComName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtComName, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 277, 63, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Symbol");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 330, -1, -1));

        txtSymbol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSymbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSymbolActionPerformed(evt);
            }
        });
        jPanel1.add(txtSymbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 321, 63, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Price");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 378, 70, -1));

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 373, 63, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Unit");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 427, 41, -1));

        txtUnit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 422, 63, -1));

        btnModCom.setBackground(new java.awt.Color(85, 65, 118));
        btnModCom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModCom.setForeground(new java.awt.Color(255, 255, 255));
        btnModCom.setText("Modify Comodity");
        btnModCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModComActionPerformed(evt);
            }
        });
        jPanel1.add(btnModCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 504, -1, -1));

        btnComdity.setBackground(new java.awt.Color(85, 65, 118));
        btnComdity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnComdity.setForeground(new java.awt.Color(255, 255, 255));
        btnComdity.setText("Add Comodity");
        btnComdity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComdityActionPerformed(evt);
            }
        });
        jPanel1.add(btnComdity, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 504, -1, -1));

        jPanel2.setBackground(new java.awt.Color(85, 65, 118));
        jPanel2.setToolTipText("");
        jPanel2.setPreferredSize(new java.awt.Dimension(1300, 80));
        jPanel2.setVerifyInputWhenFocusTarget(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Comodity Moderator");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stockops/UI/Moderators/Comodity/como.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 490, 270));

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void txtSymbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSymbolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSymbolActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        this.selectedCommodity = this.business.getMarket().getCommodityMarket().getCommodityByName(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
        txtComName.setText(selectedCommodity.getName());
        txtSymbol.setText(selectedCommodity.getSymbol());
        txtPrice.setText(String.valueOf(selectedCommodity.getPrice()));
        txtUnit.setText(selectedCommodity.getUnit());
        btnModCom.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnModComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModComActionPerformed
        this.selectedCommodity.setName(txtComName.getText());
        this.selectedCommodity.setSymbol(txtSymbol.getText());
        this.selectedCommodity.setPrice(Float.parseFloat(txtPrice.getText()));
        this.selectedCommodity.setUnit(txtUnit.getText());
        populateCommodityListTable();
        btnModCom.setEnabled(false);
    }//GEN-LAST:event_btnModComActionPerformed

    private void btnComdityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComdityActionPerformed
        Commodity commodity = new Commodity();
        commodity.setName(txtComName.getText());
        commodity.setSymbol(txtSymbol.getText());
        commodity.setPrice(Integer.valueOf(txtPrice.getText()));
        commodity.setUnit(txtUnit.getText());
        this.business.getMarket().getCommodityMarket().getCommodityList().add(commodity);
        populateCommodityListTable();
    }//GEN-LAST:event_btnComdityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComdity;
    private javax.swing.JButton btnModCom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtComName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSymbol;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables

    private void populateCommodityListTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for(Commodity commodity: this.business.getMarket().getCommodityMarket().getCommodityList()){
            Object[] row= new Object[5];
            row[0]=commodity.getName();
            row[1]=commodity.getSymbol();
            row[2]=commodity.getPrice();
            row[3]=commodity.getUnit();
            model.addRow(row);
        }
    }
}
