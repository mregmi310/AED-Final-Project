/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterfaceSEBI;

/**
 *
 * @author manju
 */
public class Marketmanagement extends javax.swing.JPanel {

    /**
     * Creates new form Marketmanagement_UI
     */
    public Marketmanagement() {
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

        jLabel1 = new javax.swing.JLabel();
        jLblMarketmanagement = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableManagers = new javax.swing.JTable();
        jLblCompany = new javax.swing.JLabel();
        jtxtprice = new javax.swing.JTextField();
        jLblName = new javax.swing.JLabel();
        jTxtCompany = new javax.swing.JTextField();
        jlblStockQty = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLblprice = new javax.swing.JLabel();
        jTxtStockqty = new javax.swing.JTextField();
        jLblmarketcap = new javax.swing.JLabel();
        jTxtmarketcap = new javax.swing.JTextField();
        jBtnupdate = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listing Request");

        jLblMarketmanagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblMarketmanagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblMarketmanagement.setText("Market Management");

        tableManagers.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tableManagers.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableManagers);

        jLblCompany.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLblCompany.setText("Company");

        jLblName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLblName.setText("Name");

        jTxtCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCompanyActionPerformed(evt);
            }
        });

        jlblStockQty.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jlblStockQty.setText("Stock Qty");

        jLblprice.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLblprice.setText("Price");

        jLblmarketcap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLblmarketcap.setText("Market Cap");

        jBtnupdate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBtnupdate.setText("Update");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(jLblMarketmanagement, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblStockQty, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblmarketcap, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblprice, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblName, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtmarketcap)
                            .addComponent(jTxtStockqty)
                            .addComponent(jTxtCompany, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(txtname)
                            .addComponent(jtxtprice)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(jBtnupdate)))
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLblMarketmanagement, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblprice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblStockQty, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtStockqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblmarketcap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtmarketcap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jBtnupdate)
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCompanyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblCompany;
    private javax.swing.JLabel jLblMarketmanagement;
    private javax.swing.JLabel jLblName;
    private javax.swing.JLabel jLblmarketcap;
    private javax.swing.JLabel jLblprice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtCompany;
    private javax.swing.JTextField jTxtStockqty;
    private javax.swing.JTextField jTxtmarketcap;
    private javax.swing.JLabel jlblStockQty;
    private javax.swing.JTextField jtxtprice;
    private javax.swing.JTable tableManagers;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}