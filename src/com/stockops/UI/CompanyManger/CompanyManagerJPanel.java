/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.UI.CompanyManger;

import com.stockops.Business.EcoSystem;
import com.stockops.Establishments.Company;
import com.stockops.Establishments.CompanyManager;
import com.stockops.Establishments.InvestmentManager;
import com.stockops.Establishments.JobRequest;
import com.stockops.Market.Equity;
import com.stockops.Market.ListingRequest;
import com.stockops.Users.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author knd18
 */
public class CompanyManagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CompanyManagerHomePageJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem business;
    CompanyManager manager;
    Company selectedCompany;
    public CompanyManagerJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business ) {
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.business=business;
        this.manager = (CompanyManager)account.getUser();
        initComponents();
        setComponent(homepage);
        populateRegisterTable();
        jLabel1.setText(this.manager.getName());
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
        btnNewIM = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRegisterNewCom = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRegisterComp = new javax.swing.JTable();
        btnRequestListing = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        registerNew = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JTextField();
        txtAsset = new javax.swing.JTextField();
        txtLiab = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        requestListing = new javax.swing.JPanel();
        txtNumberOfShares = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPricePerShare = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        InvestmentManager = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboCompanyName = new javax.swing.JComboBox<>();
        lblAssets = new javax.swing.JLabel();
        lblLiibli = new javax.swing.JLabel();
        lblMarkcap = new javax.swing.JLabel();
        lblExperince = new javax.swing.JLabel();
        lblsalary = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblApplications = new javax.swing.JTable();
        listingStatusJpanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListingStatus = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setLayout(new java.awt.CardLayout());

        homepage.setBackground(new java.awt.Color(255, 255, 255));
        homepage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNewIM.setBackground(new java.awt.Color(72, 97, 91));
        btnNewIM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNewIM.setForeground(new java.awt.Color(255, 255, 255));
        btnNewIM.setText("Assigning Investment Manager");
        btnNewIM.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        btnNewIM.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNewIM.setPreferredSize(new java.awt.Dimension(177, 25));
        btnNewIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewIMActionPerformed(evt);
            }
        });
        homepage.add(btnNewIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 240, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setText("Welcome Company Manager ");
        homepage.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 471, -1));

        btnRegisterNewCom.setBackground(new java.awt.Color(72, 97, 91));
        btnRegisterNewCom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegisterNewCom.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterNewCom.setText("Register New Company");
        btnRegisterNewCom.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        btnRegisterNewCom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegisterNewCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterNewComActionPerformed(evt);
            }
        });
        homepage.add(btnRegisterNewCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 200, 30));

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

        homepage.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 692, 138));

        btnRequestListing.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRequestListing.setText("Request Listing");
        btnRequestListing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestListingActionPerformed(evt);
            }
        });
        homepage.add(btnRequestListing, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 40));

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel21.setText("My Companies");
        homepage.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        add(homepage, "card2");

        registerNew.setBackground(new java.awt.Color(255, 255, 255));
        registerNew.setMaximumSize(new java.awt.Dimension(1000, 1000));
        registerNew.setPreferredSize(new java.awt.Dimension(1000, 1000));
        registerNew.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("New Company Registration ");
        registerNew.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 664, 38));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Enter the below details to register your company");
        registerNew.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 664, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Company Name:");
        registerNew.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 148, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Assets (USD):");
        registerNew.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Liabilities (USD):");
        registerNew.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 148, -1));

        txtCompanyName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyNameActionPerformed(evt);
            }
        });
        registerNew.add(txtCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 200, -1));

        txtAsset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAsset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAssetActionPerformed(evt);
            }
        });
        registerNew.add(txtAsset, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 200, -1));

        txtLiab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtLiab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLiabActionPerformed(evt);
            }
        });
        registerNew.add(txtLiab, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 200, -1));

        jButton2.setBackground(new java.awt.Color(72, 97, 91));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Register ");
        jButton2.setAutoscrolls(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        registerNew.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 150, 40));

        jButton1.setBackground(new java.awt.Color(72, 97, 91));
        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        registerNew.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        add(registerNew, "card3");

        requestListing.setBackground(new java.awt.Color(255, 255, 255));

        txtNumberOfShares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberOfSharesActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Enter Number of Shares:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Price Per Share:");

        jButton3.setBackground(new java.awt.Color(72, 97, 91));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Request");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(72, 97, 91));
        jButton5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton5.setText("<< Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(requestListingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumberOfShares, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPricePerShare, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(requestListingLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton5))
                    .addGroup(requestListingLayout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(658, Short.MAX_VALUE))
        );
        requestListingLayout.setVerticalGroup(
            requestListingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestListingLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton5)
                .addGap(95, 95, 95)
                .addGroup(requestListingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumberOfShares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(requestListingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPricePerShare, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        add(requestListing, "card4");

        InvestmentManager.setBackground(new java.awt.Color(255, 255, 255));
        InvestmentManager.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Select Company");
        InvestmentManager.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 171, 118, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Select Manager");
        InvestmentManager.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 118, -1));

        jComboCompanyName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCompanyNameActionPerformed(evt);
            }
        });
        InvestmentManager.add(jComboCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 168, -1, -1));
        InvestmentManager.add(lblAssets, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 549, 50, 14));
        InvestmentManager.add(lblLiibli, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 575, 50, 19));
        InvestmentManager.add(lblMarkcap, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 603, 50, 14));
        InvestmentManager.add(lblExperince, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 549, 50, 14));
        InvestmentManager.add(lblsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 575, 50, 19));

        jButton4.setBackground(new java.awt.Color(72, 97, 91));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Assign Investment Mangaer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        InvestmentManager.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 250, 50));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel19.setText("Assigning Investment Manager");
        InvestmentManager.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 86, 697, -1));

        jButton6.setBackground(new java.awt.Color(72, 97, 91));
        jButton6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton6.setText("<< Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        InvestmentManager.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 6, -1, -1));

        tblApplications.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Experience", "Salary Expected"
            }
        ));
        jScrollPane3.setViewportView(tblApplications);

        InvestmentManager.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 248, 672, 146));

        add(InvestmentManager, "card5");

        listingStatusJpanel.setBackground(new java.awt.Color(255, 255, 255));

        tblListingStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Company", "Stock Quantity", "Stock Price", "Listing Status"
            }
        ));
        jScrollPane2.setViewportView(tblListingStatus);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 30)); // NOI18N
        jLabel7.setText("My Companies Listing Status:");

        jButton9.setBackground(new java.awt.Color(72, 97, 91));
        jButton9.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton9.setText("<< Back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listingStatusJpanelLayout = new javax.swing.GroupLayout(listingStatusJpanel);
        listingStatusJpanel.setLayout(listingStatusJpanelLayout);
        listingStatusJpanelLayout.setHorizontalGroup(
            listingStatusJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listingStatusJpanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(listingStatusJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        listingStatusJpanelLayout.setVerticalGroup(
            listingStatusJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listingStatusJpanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton9)
                .addGap(45, 45, 45)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(263, Short.MAX_VALUE))
        );

        add(listingStatusJpanel, "card6");
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterNewComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterNewComActionPerformed
        setComponent(registerNew);
        populateRegisterTable();
    }//GEN-LAST:event_btnRegisterNewComActionPerformed

    private void txtCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanyNameActionPerformed

    private void txtAssetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAssetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAssetActionPerformed

    private void txtLiabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLiabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLiabActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            Company company = new Company();
            if(this.business.getEstablishment().getEstablishmentsModerator().getCompanyByName(txtCompanyName.getText())!=null){
                JOptionPane.showMessageDialog(this, "Company With the Given Name Already Exists!");
            }
            else{
                company.setName(txtCompanyName.getText());
                Double assets = Double.parseDouble(txtAsset.getText());
                Double liab = Double.parseDouble(txtLiab.getText());
                company.setLiabilities(liab);
                company.setAssets(assets);
                company.setLiscenceStatus("Pending");
                company.setListingRequestStatus("Not Initiated");
                company.setCaptial(assets-liab);
                company.setBalance(assets-liab);
                company.setCompanyManager(manager);
                this.manager.getCompanyList().add(company);
                this.business.getEstablishment().getEstablishmentsModerator().getCompanyList().add(company);
                populateRegisterTable();
                JOptionPane.showMessageDialog(this, "Company "+company.getName() +" successfully registered! \n"+"    Market Cap:"+String.valueOf(assets-liab));
                setComponent(homepage);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Assets and Liabilities Should Be Numbers!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRequestListingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestListingActionPerformed
        String selectedCompanyName=String.valueOf(tableRegisterComp.getValueAt(tableRegisterComp.getSelectedRow(), 0));
        Company selectedCompanyForListing = this.business.getEstablishment().getEstablishmentsModerator().getCompanyByName(selectedCompanyName);
        if(selectedCompanyForListing.getLiscenceStatus().equals("Approved")){
            if(selectedCompanyForListing.getListingRequestStatus().equals("Approved")){
                JOptionPane.showMessageDialog(this, "This company is already listed");
            }
            else{
                this.selectedCompany = selectedCompanyForListing;
                setComponent(requestListing);
            }
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
        try{
            int numberOfShares = Integer.parseInt(txtNumberOfShares.getText());
            Double pricePerShare = selectedCompany.getCaptial()/numberOfShares;
            ListingRequest listingRequest = new ListingRequest(this.selectedCompany, pricePerShare, numberOfShares);
            this.selectedCompany.setListingRequestStatus("Pending");
            for(ListingRequest listReq: this.business.getMarket().getEquityMarket().getEquityMarketModerator().getListingRequestList()){
                if(listReq.getCompany().getName().equals(selectedCompany.getName())){
                    this.business.getMarket().getEquityMarket().getEquityMarketModerator().getListingRequestList().remove(listReq);
                }
            }
            this.business.getMarket().getEquityMarket().getEquityMarketModerator().getListingRequestList().add(listingRequest);
            int requestCount =this.business.getMarket().getEquityMarket().getEquityMarketModerator().getRequestCount();
            listingRequest.setRequestId(requestCount);
            this.business.getMarket().getEquityMarket().getEquityMarketModerator().setRequestCount(requestCount+1);
            txtPricePerShare.setText(String.valueOf(pricePerShare));
            JOptionPane.showMessageDialog(this, "Request Sent!");
            populateListingTable();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Number of shares should be an integer!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnNewIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewIMActionPerformed
        jComboCompanyName.removeAllItems();
        for(Company company: this.manager.getCompanyList()){
            jComboCompanyName.addItem(company.getName());
        }
        setComponent(InvestmentManager);      
    }//GEN-LAST:event_btnNewIMActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setComponent(homepage);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setComponent(homepage);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        setComponent(homepage);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        setComponent(homepage);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCompanyNameActionPerformed
        populateJobRequestTable();
    }//GEN-LAST:event_jComboCompanyNameActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            Company selectedCompany = this.business.getEstablishment().getEstablishmentsModerator().getCompanyByName(String.valueOf(jComboCompanyName.getSelectedItem()));
            InvestmentManager applicant = this.business.getEstablishment().getEstablishmentsModerator().getInvestmentManagerByName(String.valueOf(tblApplications.getValueAt(tblApplications.getSelectedRow(), 0)));
            if(selectedCompany.getInvestmentManager()!=null){
                selectedCompany.getInvestmentManager().setAssignedCompany(null);
            }
            selectedCompany.setInvestmentManager(applicant);
            applicant.setAssignedCompany(selectedCompany);
            JOptionPane.showMessageDialog(this, "Investment Manager Successfully Assigned");
            selectedCompany.getJobRequest().remove(selectedCompany.getJobRequest().get(tblApplications.getSelectedRow()));
            populateJobRequestTable();
            populateListingTable();
            populateListingRequestTable();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Something went wrong");
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InvestmentManager;
    private javax.swing.JButton btnNewIM;
    private javax.swing.JButton btnRegisterNewCom;
    private javax.swing.JButton btnRequestListing;
    private javax.swing.JPanel homepage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboCompanyName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAssets;
    private javax.swing.JLabel lblExperince;
    private javax.swing.JLabel lblLiibli;
    private javax.swing.JLabel lblMarkcap;
    private javax.swing.JLabel lblsalary;
    private javax.swing.JPanel listingStatusJpanel;
    private javax.swing.JPanel registerNew;
    private javax.swing.JPanel requestListing;
    private javax.swing.JTable tableRegisterComp;
    private javax.swing.JTable tblApplications;
    private javax.swing.JTable tblListingStatus;
    private javax.swing.JTextField txtAsset;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtLiab;
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

    private void populateListingRequestTable() {
        DefaultTableModel model = (DefaultTableModel)tblListingStatus.getModel();
        model.setRowCount(0);
        for(Company company: this.manager.getCompanyList()){
            Object[] row=new Object[4];
            row[0]=company.getName();
            row[3]=company.getListingRequestStatus();
            if(!company.getListingRequestStatus().equals("Listed")){
                row[1]="NA";
                row[2]="NA";
            }
            else{
                for(Equity equity: this.business.getMarket().getEquityMarket().getEquityList()){
                    if(equity.getCompany()==company){
                        row[1]=equity.getSymbol();
                        row[2]=equity.getPrice();
                    }
                }
            }
            model.addRow(row);
        }
        
    }

    private void populateJobRequestTable() {
        Company selectedCompany = this.business.getEstablishment().getEstablishmentsModerator().getCompanyByName(String.valueOf(jComboCompanyName.getSelectedItem()));
        if(selectedCompany==null){
            selectedCompany=this.manager.getCompanyList().get(0);
        }
        DefaultTableModel model = (DefaultTableModel) tblApplications.getModel();
        model.setRowCount(0);
        for(JobRequest jobRequest: selectedCompany.getJobRequest()){
            if(jobRequest.getApplicant().getAssignedCompany()==null){
                Object[] row= new Object[3];
                row[0]=jobRequest.getApplicant().getName();
                row[1]=jobRequest.getExperience();
                row[2]=jobRequest.getSalaryRequest();
                model.addRow(row);
            }
        }
    }
}
