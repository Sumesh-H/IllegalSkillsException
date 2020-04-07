/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DrugSupplier;

/**
 *
 * @author keshav
 */
public class ViewChemicalRequestJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewChemicalRequestJpanel
     */
    public ViewChemicalRequestJpanel() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblReorder = new javax.swing.JTable();
        lblChemicalRequests = new javax.swing.JLabel();
        btnInventory = new javax.swing.JButton();
        btnViewRequests = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAddChemicals = new javax.swing.JButton();

        tblReorder.setBorder(new javax.swing.border.MatteBorder(null));
        tblReorder.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        tblReorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CHEMICAL NAME", "SERIAL NUMBER ", "AVAILABILE QUANTITY", "REQUIRED QUANTITY", "REORDER STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReorder.setRowHeight(30);
        jScrollPane1.setViewportView(tblReorder);

        lblChemicalRequests.setText("Chemical Requests");

        btnInventory.setText("Inventory");

        btnViewRequests.setText("View Requests");

        btnViewDetails.setText("View Details");

        btnBack.setText("Back");

        btnAddChemicals.setText("Add Chemicals");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnViewRequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(155, 155, 155))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(379, 379, 379)
                        .addComponent(lblChemicalRequests)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(btnAddChemicals, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChemicalRequests)
                    .addComponent(btnBack))
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInventory)
                        .addGap(63, 63, 63)
                        .addComponent(btnViewRequests)
                        .addGap(58, 58, 58)
                        .addComponent(btnViewDetails)))
                .addGap(128, 128, 128)
                .addComponent(btnAddChemicals)
                .addContainerGap(243, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddChemicals;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JButton btnViewRequests;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChemicalRequests;
    private javax.swing.JTable tblReorder;
    // End of variables declaration//GEN-END:variables
}