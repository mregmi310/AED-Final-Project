/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.UI.Brokers;

import com.stockops.Brokerage.CommodityBroker;
import com.stockops.Brokerage.CommodityBuyRequest;
import com.stockops.Brokerage.CommoditySellRequest;
import com.stockops.Business.EcoSystem;
import com.stockops.Investor.CommodityHoldings;
import com.stockops.Investor.InvestorAbstract;
import com.stockops.Investor.RetailInvestor;
import com.stockops.Market.Commodity;
import com.stockops.Users.AppUser;
import com.stockops.Users.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mridulregmi
 */
public class CommodityBrokerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommodityBrokerJPanel
     */
    CommodityBroker commodityBroker;
    EcoSystem business;
    UserAccount user;
    public CommodityBrokerJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        this.user=account;
        this.commodityBroker=(CommodityBroker)this.user.getUser();
        this.business=business;
        initComponents();
        populateCommoditiesTable();
        populateBuyRequestTable();
        populateSellRequestTable();
        
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commodityTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sellRequestTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        buyRequestTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jLabel1.setText("jLabel1");

        commodityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Symbol", "Unit", "Price"
            }
        ));
        jScrollPane1.setViewportView(commodityTable);

        jButton3.setText("Sell Requests");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Buy Requests");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jButton3)
                        .addGap(47, 47, 47)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(724, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(425, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");

        sellRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RequestId", "Buyer", "Commodity", "Quantity", "Units", "Price"
            }
        ));
        jScrollPane3.setViewportView(sellRequestTable);

        jButton1.setText("Process Sell Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Sell Request:");

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Reject Sell Request");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel3))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButton1)
                        .addGap(132, 132, 132)
                        .addComponent(jButton7)))
                .addContainerGap(653, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton5)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton7))
                .addContainerGap(394, Short.MAX_VALUE))
        );

        add(jPanel2, "card3");

        buyRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RequestId", "Buyer", "Commodity", "Quantity", "Units", "Price"
            }
        ));
        jScrollPane2.setViewportView(buyRequestTable);

        jLabel2.setText("Buy Request:");

        jButton2.setText("Process Buy Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("Reject Buy Request");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton6)))
                .addContainerGap(664, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton6)
                .addGap(140, 140, 140)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton8))
                .addContainerGap(309, Short.MAX_VALUE))
        );

        add(jPanel3, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CommodityBuyRequest buyRequest = this.commodityBroker.getBuyRequestById(Integer.parseInt(String.valueOf(buyRequestTable.getValueAt(buyRequestTable.getSelectedRow(), 0))));
        CommodityHoldings holdingToAdd = new CommodityHoldings();
        Boolean addNewFlag =true;
        for(CommodityHoldings commodityHoldings:((RetailInvestor)buyRequest.getBuyer()).getCommodityHoldings()){
            if(commodityHoldings.getCommodity()==buyRequest.getCommodity()){
                holdingToAdd=commodityHoldings;
                addNewFlag=false;
            }
        }
        double price = ((holdingToAdd.getBuyingPrice()*holdingToAdd.getQuantity())+(buyRequest.getQuantity()*buyRequest.getCommodity().getPrice()))/(holdingToAdd.getQuantity()+buyRequest.getQuantity());
        holdingToAdd.setQuantity(holdingToAdd.getQuantity()+buyRequest.getQuantity());
        holdingToAdd.setBuyingPrice(price);
        if(addNewFlag){
            holdingToAdd.setCommodity(buyRequest.getCommodity());
            ((RetailInvestor)buyRequest.getBuyer()).getCommodityHoldings().add(holdingToAdd);
        }
        this.commodityBroker.getBuyRequests().remove(this.commodityBroker.getBuyRequestById(buyRequest.getId()));
        populateBuyRequestTable();
        populateSellRequestTable();        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CommoditySellRequest sellRequest = this.commodityBroker.getSellRequestById(Integer.parseInt(String.valueOf(sellRequestTable.getValueAt(sellRequestTable.getSelectedRow(), 0))));
        CommodityHoldings holdingToSell = new CommodityHoldings();
        for(CommodityHoldings commodityHoldings:((RetailInvestor)sellRequest.getSeller()).getCommodityHoldings()){
            if(commodityHoldings.getCommodity()==sellRequest.getCommodity()){
                holdingToSell=commodityHoldings;
            }
        }
        holdingToSell.setQuantity(holdingToSell.getQuantity()-sellRequest.getQuantity());
        if(holdingToSell.getQuantity()==0){
            ((RetailInvestor)sellRequest.getSeller()).getCommodityHoldings().remove(holdingToSell);
        }
        this.commodityBroker.getSellRequests().remove(sellRequest);
        populateBuyRequestTable();
        populateSellRequestTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        changePage(jPanel2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        changePage(jPanel3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        changePage(jPanel1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        changePage(jPanel1);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        CommoditySellRequest sellRequest = this.commodityBroker.getSellRequestById(Integer.parseInt(String.valueOf(sellRequestTable.getValueAt(sellRequestTable.getSelectedRow(), 0))));
        InvestorAbstract seller = sellRequest.getSeller();
        seller.setBalance(seller.getBalance()+(sellRequest.getQuantity()*sellRequest.getCommodity().getPrice()));
        sellRequest.getSeller().getCommoditySellRequests().remove(sellRequest);
        this.commodityBroker.getSellRequests().remove(sellRequest);
        JOptionPane.showMessageDialog(this, "Request Rejected and Deleted!");
        populateSellRequestTable();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        CommodityBuyRequest buyRequest = this.commodityBroker.getBuyRequestById(Integer.parseInt(String.valueOf(buyRequestTable.getValueAt(buyRequestTable.getSelectedRow(), 0))));
        InvestorAbstract buyer=buyRequest.getBuyer();
        buyer.setBalance(buyer.getBalance()+(buyRequest.getQuantity()*buyRequest.getCommodity().getPrice()));
        buyRequest.getBuyer().getCommodityBuyRequests().remove(buyRequest);
        this.commodityBroker.getBuyRequests().remove(buyRequest);
        JOptionPane.showMessageDialog(this, "Request Rejected and Deleted!");
        populateBuyRequestTable();
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable buyRequestTable;
    private javax.swing.JTable commodityTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable sellRequestTable;
    // End of variables declaration//GEN-END:variables

    private void populateCommoditiesTable() {
        DefaultTableModel model = (DefaultTableModel) commodityTable.getModel();
        model.setRowCount(0);
        for(Commodity commodity:this.business.getMarket().getCommodityMarket().getCommodityList()){
            Object[] row=new Object[4];
            row[0]=commodity.getName();
            row[1]=commodity.getSymbol();
            row[2]=commodity.getUnit();
            row[3]=commodity.getPrice();
            model.addRow(row);
        }
    }

    private void populateBuyRequestTable() {
       DefaultTableModel model = (DefaultTableModel) buyRequestTable.getModel();
       model.setRowCount(0);
       for(CommodityBuyRequest commodityBuyRequest:this.commodityBroker.getBuyRequests()){
           Object[] row= new Object[6];
           row[0] = commodityBuyRequest.getId();
           row[1] = commodityBuyRequest.getBuyer().getName();
           row[2] = commodityBuyRequest.getCommodity().getName();
           row[3] = commodityBuyRequest.getQuantity();
           row[4] = commodityBuyRequest.getCommodity().getUnit();
           row[5] = commodityBuyRequest.getCommodity().getPrice()*commodityBuyRequest.getQuantity();
           model.addRow(row);
       }
    }

    private void populateSellRequestTable() {
        DefaultTableModel model = (DefaultTableModel) sellRequestTable.getModel();
       model.setRowCount(0);
       for(CommoditySellRequest commoditySellRequest:this.commodityBroker.getSellRequests()){
           Object[] row= new Object[6];
           row[0] = commoditySellRequest.getId();
           row[1] = commoditySellRequest.getSeller().getName();
           row[2] = commoditySellRequest.getCommodity().getName();
           row[3] = commoditySellRequest.getQuantity();
           row[4] = commoditySellRequest.getCommodity().getUnit();
           row[5] = commoditySellRequest.getCommodity().getPrice()*commoditySellRequest.getQuantity();
           model.addRow(row);
       }
    }

    private void changePage(JPanel jPanel) {
        this.removeAll();
        this.add(jPanel);
        this.revalidate();
        this.repaint();
    }
}