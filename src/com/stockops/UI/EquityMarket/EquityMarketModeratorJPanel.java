/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.stockops.UI.EquityMarket;

import com.stockops.Business.EcoSystem;
import com.stockops.Establishments.Company;
import com.stockops.Establishments.CompanyManager;
import com.stockops.Investor.EquityHoldings;
import com.stockops.Market.ListingRequest;
import com.stockops.Market.Equity;
import com.stockops.Market.EquityMarketModerator;
import com.stockops.Users.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manju
 */
public class EquityMarketModeratorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MarketManagementJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem business;
    EquityMarketModerator equityMarketModerator;
    Equity selectedEquity;
    public EquityMarketModeratorJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.business=business;
        this.equityMarketModerator = (EquityMarketModerator) account.getUser();
        initComponents();
        populateTableShares();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MarketModeratorHomepage = new javax.swing.JPanel();
        jLblMarketmanagement = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ListingRequestJPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listingRequestTable = new javax.swing.JTable();
        jBtnapprove = new javax.swing.JButton();
        jbtndecline = new javax.swing.JButton();
        jLblMarketmanagement1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        DelistingRequest = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableManagers2 = new javax.swing.JTable();
        jbtndecline1 = new javax.swing.JButton();
        jBtnapprove1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLblMarketmanagement2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        MarketManagementJPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableShares = new javax.swing.JTable();
        jLblCompany = new javax.swing.JLabel();
        jLblprice = new javax.swing.JLabel();
        jLblmarketcap = new javax.swing.JLabel();
        jBtnupdate = new javax.swing.JButton();
        jTxtmarketcap = new javax.swing.JTextField();
        jtxtprice = new javax.swing.JTextField();
        jTxtCompany = new javax.swing.JTextField();
        jLblMarketmanagement3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listing Request");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        MarketModeratorHomepage.setBackground(new java.awt.Color(255, 255, 255));
        MarketModeratorHomepage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblMarketmanagement.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLblMarketmanagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblMarketmanagement.setText("Securities and Exchange Board");
        MarketModeratorHomepage.add(jLblMarketmanagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 6, 384, 31));

        jButton2.setBackground(new java.awt.Color(72, 97, 91));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View Listing Request");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        MarketModeratorHomepage.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 180, 38));

        jButton3.setBackground(new java.awt.Color(72, 97, 91));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Market Management");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        MarketModeratorHomepage.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 167, 38));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setText("Dashboard");
        MarketModeratorHomepage.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        add(MarketModeratorHomepage, "card2");

        ListingRequestJPanel.setBackground(new java.awt.Color(255, 255, 255));
        ListingRequestJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listingRequestTable.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        listingRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RequestId", "Company Name", "Price Per Share", "Stock Qty", "Market Cap", "Approval Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(listingRequestTable);

        ListingRequestJPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 759, 192));

        jBtnapprove.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBtnapprove.setText("Approve");
        jBtnapprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnapproveActionPerformed(evt);
            }
        });
        ListingRequestJPanel.add(jBtnapprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 130, 50));

        jbtndecline.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtndecline.setText("Decline");
        jbtndecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndeclineActionPerformed(evt);
            }
        });
        ListingRequestJPanel.add(jbtndecline, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 120, 50));

        jLblMarketmanagement1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLblMarketmanagement1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblMarketmanagement1.setText("Securities and Exchange Board");
        ListingRequestJPanel.add(jLblMarketmanagement1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 384, 31));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("Listing Requests");
        ListingRequestJPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setText("Requests List:");
        ListingRequestJPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jButton4.setBackground(new java.awt.Color(72, 97, 91));
        jButton4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton4.setText("<< Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        ListingRequestJPanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        add(ListingRequestJPanel, "card3");

        DelistingRequest.setBackground(new java.awt.Color(255, 255, 255));
        DelistingRequest.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableManagers2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tableManagers2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Company Name", "Price Per Share", "Stock Qty", "Market Cap", "Approval Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableManagers2);

        DelistingRequest.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 759, 192));

        jbtndecline1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtndecline1.setText("Decline");
        DelistingRequest.add(jbtndecline1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 102, 63));

        jBtnapprove1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBtnapprove1.setText("Approve");
        DelistingRequest.add(jBtnapprove1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 108, 63));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setText("Requests List:");
        DelistingRequest.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setText("Delisting Requests");
        DelistingRequest.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLblMarketmanagement2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLblMarketmanagement2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblMarketmanagement2.setText("Securities and Exchange Board");
        DelistingRequest.add(jLblMarketmanagement2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 384, 31));

        jButton5.setBackground(new java.awt.Color(72, 97, 91));
        jButton5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton5.setText("<< Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        DelistingRequest.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        add(DelistingRequest, "card4");

        MarketManagementJPanel.setBackground(new java.awt.Color(255, 255, 255));
        MarketManagementJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableShares.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tableShares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Company Name", "Price Per Share", "Stock Qty", "Market Cap", "Assets", "Liabilities"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableShares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSharesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableShares);

        MarketManagementJPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 759, 192));

        jLblCompany.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLblCompany.setText("Company");
        MarketManagementJPanel.add(jLblCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 95, 22));

        jLblprice.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLblprice.setText("Price");
        MarketManagementJPanel.add(jLblprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 95, 34));

        jLblmarketcap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLblmarketcap.setText("Market Cap");
        MarketManagementJPanel.add(jLblmarketcap, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 95, 34));

        jBtnupdate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBtnupdate.setText("Update");
        jBtnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnupdateActionPerformed(evt);
            }
        });
        MarketManagementJPanel.add(jBtnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 170, 70));

        jTxtmarketcap.setEditable(false);
        MarketManagementJPanel.add(jTxtmarketcap, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 180, -1));

        jtxtprice.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jtxtpriceInputMethodTextChanged(evt);
            }
        });
        jtxtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpriceActionPerformed(evt);
            }
        });
        MarketManagementJPanel.add(jtxtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 180, -1));

        jTxtCompany.setEditable(false);
        jTxtCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCompanyActionPerformed(evt);
            }
        });
        MarketManagementJPanel.add(jTxtCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 180, -1));

        jLblMarketmanagement3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLblMarketmanagement3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblMarketmanagement3.setText("Securities and Exchange Board");
        MarketManagementJPanel.add(jLblMarketmanagement3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 384, 31));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel10.setText("Market Management");
        MarketManagementJPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("Listed Companies:");
        MarketManagementJPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jButton6.setBackground(new java.awt.Color(72, 97, 91));
        jButton6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton6.setText("<< Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        MarketManagementJPanel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        add(MarketManagementJPanel, "card5");
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCompanyActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        updateJPanel(ListingRequestJPanel);
        populateListingTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBtnapproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnapproveActionPerformed
        Equity equity = new Equity();
        String selectedCompanyName=String.valueOf(listingRequestTable.getValueAt(listingRequestTable.getSelectedRow(), 1));
        Company selectedCompany = this.business.getEstablishment().getEstablishmentsModerator().getCompanyByName(selectedCompanyName);
        equity.setCompany(selectedCompany);
        selectedCompany.setListingRequestStatus("Listed");
        ListingRequest selectedRequest = this.equityMarketModerator.getListingRequestById(Integer.parseInt(String.valueOf(listingRequestTable.getValueAt(listingRequestTable.getSelectedRow(), 0))));
        selectedRequest.setStatus("Listed");
        equity.setPrice(selectedRequest.getPricePerShare());
        equity.setStockQuantity(selectedRequest.getTotalShares());
        equity.setAvailableQuantity(selectedRequest.getTotalShares());
        this.business.getMarket().getEquityMarket().getEquityList().add(equity);
        this.equityMarketModerator.getListingRequestList().remove(selectedRequest);
        JOptionPane.showMessageDialog(this, "Listing Request Approved!");
        populateListingTable();
    }//GEN-LAST:event_jBtnapproveActionPerformed

    private void tableSharesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSharesMouseClicked
        this.selectedEquity = this.business.getMarket().getEquityMarket().getEquityByName(String.valueOf(tableShares.getValueAt(tableShares.getSelectedRow(), 0)));
        jTxtCompany.setText(selectedEquity.getCompany().getName());
        jtxtprice.setText(String.valueOf(selectedEquity.getPrice()));
        jTxtmarketcap.setText(String.valueOf(selectedEquity.getCompany().getCaptial()));
        
    }//GEN-LAST:event_tableSharesMouseClicked

    private void jBtnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnupdateActionPerformed
        double marketCap = Double.parseDouble(jtxtprice.getText())*this.selectedEquity.getStockQuantity();
        this.selectedEquity.getCompany().calculateAndSetMarketCap(marketCap);
        this.selectedEquity.getPriceHistory().add(this.selectedEquity.getPrice());
        this.selectedEquity.setPrice(Double.parseDouble(jtxtprice.getText()));
        double marketIndex = calculateMarketIndex();
        this.business.getMarket().getEquityMarket().updateMarketMetrics(marketIndex);
        updateAllEquityPrice();
        populateTableShares();
        JOptionPane.showMessageDialog(this, "Updated!");
    }//GEN-LAST:event_jBtnupdateActionPerformed

    private void jtxtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtpriceActionPerformed

    private void jtxtpriceInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jtxtpriceInputMethodTextChanged
        double marketCap = Double.parseDouble(jtxtprice.getText())*this.selectedEquity.getStockQuantity();
        jTxtmarketcap.setText(String.valueOf(marketCap));
    }//GEN-LAST:event_jtxtpriceInputMethodTextChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        updateJPanel(MarketManagementJPanel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        updateJPanel(MarketModeratorHomepage);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        updateJPanel(MarketModeratorHomepage);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        updateJPanel(MarketModeratorHomepage);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jbtndeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndeclineActionPerformed
        String selectedCompanyName=String.valueOf(listingRequestTable.getValueAt(listingRequestTable.getSelectedRow(), 1));
        Company selectedCompany = this.business.getEstablishment().getEstablishmentsModerator().getCompanyByName(selectedCompanyName);
        selectedCompany.setListingRequestStatus("Rejected");
        ListingRequest selectedRequest = this.equityMarketModerator.getListingRequestById(Integer.parseInt(String.valueOf(listingRequestTable.getValueAt(listingRequestTable.getSelectedRow(), 0))));
        selectedRequest.setStatus("Reject");
        JOptionPane.showMessageDialog(this, "Listing Request Rejected Successfully!");
        populateListingTable();
    }//GEN-LAST:event_jbtndeclineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DelistingRequest;
    private javax.swing.JPanel ListingRequestJPanel;
    private javax.swing.JPanel MarketManagementJPanel;
    private javax.swing.JPanel MarketModeratorHomepage;
    private javax.swing.JButton jBtnapprove;
    private javax.swing.JButton jBtnapprove1;
    private javax.swing.JButton jBtnupdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblCompany;
    private javax.swing.JLabel jLblMarketmanagement;
    private javax.swing.JLabel jLblMarketmanagement1;
    private javax.swing.JLabel jLblMarketmanagement2;
    private javax.swing.JLabel jLblMarketmanagement3;
    private javax.swing.JLabel jLblmarketcap;
    private javax.swing.JLabel jLblprice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTxtCompany;
    private javax.swing.JTextField jTxtmarketcap;
    private javax.swing.JButton jbtndecline;
    private javax.swing.JButton jbtndecline1;
    private javax.swing.JTextField jtxtprice;
    private javax.swing.JTable listingRequestTable;
    private javax.swing.JTable tableManagers2;
    private javax.swing.JTable tableShares;
    // End of variables declaration//GEN-END:variables

    private void populateTableShares() {
        DefaultTableModel model = (DefaultTableModel) tableShares.getModel();
        model.setRowCount(0);
        for(Equity equity: this.business.getMarket().getEquityMarket().getEquityList()){
            Object[] row= new Object[6];
            row[0]=equity.getCompany().getName();
            row[1]=equity.getPrice();
            row[2]=equity.getStockQuantity();
            row[3]=equity.getCompany().getCaptial();
            row[4]=equity.getCompany().getAssets();
            row[5]=equity.getCompany().getLiabilities();
            model.addRow(row);
        }
    }

    private void updateJPanel(JPanel jPanel) {
        this.removeAll();
        this.add(jPanel);
        this.revalidate();
        this.repaint();
    }

    private void populateListingTable() {
        DefaultTableModel model = (DefaultTableModel) listingRequestTable.getModel();
        model.setRowCount(0);
        for(ListingRequest listingRequest: this.equityMarketModerator.getListingRequestList()){
            Object[] row= new Object[6];
            row[0]=listingRequest.getRequestId();
            row[1]=listingRequest.getCompany().getName();
            row[2]=listingRequest.getPricePerShare();
            row[3]=listingRequest.getTotalShares();
            row[4]=listingRequest.getCompany().getCaptial();
            row[5]=listingRequest.getStatus();
            model.addRow(row);
        }
    }
    private void updateAllEquityPrice() {
        for(Company company: this.business.getEstablishment().getEstablishmentsModerator().getCompanyList()){
            for(EquityHoldings equityHoldings:company.getEquityHoldings()){
                if(equityHoldings.getEquity()==this.selectedEquity){
                    for(Equity equity:this.business.getMarket().getEquityMarket().getEquityList()){
                        if(company==equity.getCompany()){
                            equity.calculateAndSetPrice();
                        }
                    }
                }
            }
        }
    }
    public double calculateMarketIndex(){
        double marketIndex=0;
        int indexWeightage=0;
        for(Equity equity:this.business.getMarket().getEquityMarket().getEquityList()){
            if(equity.getCompany().getCaptial()<this.business.getEstablishment().getEstablishmentsModerator().getSmallCap()){
                marketIndex+=equity.getPrice();
                indexWeightage+=1;
            }
            else if(equity.getCompany().getCaptial()<this.business.getEstablishment().getEstablishmentsModerator().getMediumCap()){
                marketIndex+=(equity.getPrice()*2);
                indexWeightage+=2;
            }
            else{
                marketIndex+=(equity.getPrice()*3);
                indexWeightage+=3;
            }
        }
        return marketIndex/indexWeightage;
    }
}
