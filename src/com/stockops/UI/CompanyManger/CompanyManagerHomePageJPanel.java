/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.UI.CompanyManger;

import com.stockops.Business.EcoSystem;
import com.stockops.Establishments.Company;
import com.stockops.Establishments.CompanyManager;
import com.stockops.Market.ListingRequest;
import com.stockops.Users.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author knd18
 */
public class CompanyManagerHomePageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CompanyManagerHomePageJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem business;
    CompanyManager manager;
    Company selectedCompany;
    public CompanyManagerHomePageJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business ) {
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.business=business;
        this.manager = (CompanyManager)account.getUser();
        initComponents();
        setComponent(homepage);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homepage = new javax.swing.JPanel();
        btnListingReq = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnNewIM = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRegisterNewCom = new javax.swing.JButton();
        registerNew = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JTextField();
        txtAsset = new javax.swing.JTextField();
        txtLiab = new javax.swing.JTextField();
        txtMarkCap = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRegisterComp = new javax.swing.JTable();
        btnRequestListing = new javax.swing.JButton();
        requestListing = new javax.swing.JPanel();
        txtNumberOfShares = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        marketSelectionBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPricePerShare = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setLayout(new java.awt.CardLayout());

        homepage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnListingReq.setText("Lisiting Requests");
        homepage.add(btnListingReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jButton1.setText("Add New Investment Manager");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        homepage.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 213, -1, -1));

        btnNewIM.setText("Assigning New Investment Manager");
        homepage.add(btnNewIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel1.setText("Welcome Comapny Manager ");
        homepage.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 471, -1));

        btnRegisterNewCom.setText("Register New Company");
        btnRegisterNewCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterNewComActionPerformed(evt);
            }
        });
        homepage.add(btnRegisterNewCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        add(homepage, "card2");

        registerNew.setMaximumSize(new java.awt.Dimension(1000, 1000));
        registerNew.setPreferredSize(new java.awt.Dimension(1000, 1000));
        registerNew.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("New Company Registration ");
        registerNew.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 25, 664, 38));

        jLabel3.setText("Enter the below details to register your company");
        registerNew.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 69, 664, -1));

        jLabel4.setText("Company Name");
        registerNew.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 115, 148, -1));

        jLabel5.setText("Assets");
        registerNew.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 147, -1, -1));

        jLabel6.setText("Liabilities");
        registerNew.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 179, 148, -1));

        jLabel7.setText("Market Cap ");
        registerNew.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 211, 148, -1));

        txtCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyNameActionPerformed(evt);
            }
        });
        registerNew.add(txtCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 110, 60, -1));

        txtAsset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAssetActionPerformed(evt);
            }
        });
        registerNew.add(txtAsset, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 142, 60, -1));

        txtLiab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLiabActionPerformed(evt);
            }
        });
        registerNew.add(txtLiab, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 174, 60, -1));

        txtMarkCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarkCapActionPerformed(evt);
            }
        });
        registerNew.add(txtMarkCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 206, 60, -1));

        jButton2.setText("Register ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        registerNew.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 250, -1, -1));

        tableRegisterComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Company Name", "Assets", "Liabilities", "Market Cap", "Liscence Request", "Listing Request", "Investment Manager"
            }
        ));
        jScrollPane1.setViewportView(tableRegisterComp);

        registerNew.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 324, 692, 138));

        btnRequestListing.setText("Request Listing");
        btnRequestListing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestListingActionPerformed(evt);
            }
        });
        registerNew.add(btnRequestListing, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 479, -1, 40));

        add(registerNew, "card3");

        txtNumberOfShares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberOfSharesActionPerformed(evt);
            }
        });

        jLabel8.setText("Select market:");

        jLabel9.setText("Enter Number of Shares:");

        jLabel10.setText("Price Per Share:");

        txtPricePerShare.setText("jLabel11");

        jButton3.setText("Request");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout requestListingLayout = new javax.swing.GroupLayout(requestListing);
        requestListing.setLayout(requestListingLayout);
        requestListingLayout.setHorizontalGroup(
            requestListingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestListingLayout.createSequentialGroup()
                .addGroup(requestListingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(requestListingLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(requestListingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(requestListingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marketSelectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumberOfShares, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPricePerShare)))
                    .addGroup(requestListingLayout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jButton3)))
                .addContainerGap(702, Short.MAX_VALUE))
        );
        requestListingLayout.setVerticalGroup(
            requestListingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestListingLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(requestListingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(marketSelectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(requestListingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumberOfShares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(requestListingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPricePerShare))
                .addGap(58, 58, 58)
                .addComponent(jButton3)
                .addContainerGap(275, Short.MAX_VALUE))
        );

        add(requestListing, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterNewComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterNewComActionPerformed
        setComponent(registerNew);
        populateRegisterTable();
    }//GEN-LAST:event_btnRegisterNewComActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanyNameActionPerformed

    private void txtAssetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAssetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAssetActionPerformed

    private void txtLiabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLiabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLiabActionPerformed

    private void txtMarkCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarkCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarkCapActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Company company = new Company();
        company.setName(txtCompanyName.getText());
        Double assets = Double.parseDouble(txtAsset.getText());
        Double liab = Double.parseDouble(txtLiab.getText());
        company.setLiabilities(liab);
        company.setAssets(assets);
        company.setLiscenceStatus("Pending");
        company.setListingRequestStatus("Not Initiated");
        company.setCaptial(assets-liab);
        txtMarkCap.setText(String.valueOf(assets-liab));
        this.manager.getCompanyList().add(company);
        this.business.getEstablishment().getEstablishmentsModerator().getCompanyList().add(company);
        populateRegisterTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRequestListingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestListingActionPerformed
        String selectedCompanyName=String.valueOf(tableRegisterComp.getValueAt(tableRegisterComp.getSelectedRow(), 0));
        Company selectedCompanyForListing = this.business.getEstablishment().getEstablishmentsModerator().getCompanyByName(selectedCompanyName);
        if(selectedCompanyForListing.getLiscenceStatus().equals("Approved")){
            this.selectedCompany = selectedCompanyForListing;
            setComponent(requestListing);
            marketSelectionBox.addItem(this.business.getMarket().getEquityMarket().getMarketName());
        }
        else{
            JOptionPane.showMessageDialog(this, "This company does not have a lisence to run a business");
        }

    }//GEN-LAST:event_btnRequestListingActionPerformed

    private void txtNumberOfSharesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberOfSharesActionPerformed

        int numberOfShares = Integer.parseInt(txtNumberOfShares.getText());
        txtPricePerShare.setText(String.valueOf(selectedCompany.getCaptial()/numberOfShares));
        
    }//GEN-LAST:event_txtNumberOfSharesActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int numberOfShares = Integer.parseInt(txtNumberOfShares.getText());
        Double pricePerShare = selectedCompany.getCaptial()/numberOfShares;
        ListingRequest listingRequest = new ListingRequest(this.selectedCompany, pricePerShare, numberOfShares);
        this.selectedCompany.setListingRequestStatus("Pending");
        this.business.getMarket().getEquityMarket().getEquityMarketModerator().getListingRequestList().add(listingRequest);
        int requestCount =this.business.getMarket().getEquityMarket().getEquityMarketModerator().getRequestCount();
        listingRequest.setRequestId(requestCount);
        this.business.getMarket().getEquityMarket().getEquityMarketModerator().setRequestCount(requestCount+1);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListingReq;
    private javax.swing.JButton btnNewIM;
    private javax.swing.JButton btnRegisterNewCom;
    private javax.swing.JButton btnRequestListing;
    private javax.swing.JPanel homepage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> marketSelectionBox;
    private javax.swing.JPanel registerNew;
    private javax.swing.JPanel requestListing;
    private javax.swing.JTable tableRegisterComp;
    private javax.swing.JTextField txtAsset;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtLiab;
    private javax.swing.JTextField txtMarkCap;
    private javax.swing.JTextField txtNumberOfShares;
    private javax.swing.JLabel txtPricePerShare;
    // End of variables declaration//GEN-END:variables

    private void setComponent(JPanel jPanel) {
        this.removeAll();
        this.add(jPanel);
        this.revalidate();
        this.repaint();
    }

    private void populateRegisterTable() {
        DefaultTableModel model = (DefaultTableModel) tableRegisterComp.getModel();
        model.setRowCount(0);
        for(Company company: this.manager.getCompanyList()){
            Object[] row= new Object[7];
            row[0]=company.getName();
            row[1]=company.getAssets();
            row[2]=company.getLiabilities();
            row[3]=company.getCaptial();
            row[4]=company.getLiscenceStatus();
            row[5]=company.getListingRequestStatus();
            if(company.getInvestmentManager()==null){
                row[6]="Not Assigned";
            }
            else{
                row[6]=company.getInvestmentManager().getName();
            }
            model.addRow(row);
        }
    }

    private void populateListingTable() {
        DefaultTableModel model = (DefaultTableModel) tableRegisterComp.getModel();
        model.setRowCount(0);
        for(Company company: this.manager.getCompanyList()){
            Object[] row= new Object[7];
            row[0]=company.getName();
            row[1]=company.getAssets();
            row[2]=company.getLiabilities();
            row[3]=company.getCaptial();
            row[4]=company.getLiscenceStatus();
            row[5]=company.getListingRequestStatus();
            if(company.getInvestmentManager()==null){
                row[6]="Not Assigned";
            }
            else{
                row[6]=company.getInvestmentManager().getName();
            }
            model.addRow(row);
        }
    }
}