/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DrugSupplier;

import Business.ChemicalInventoryManagement.ChemicalCompound;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DrugOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ChemicalWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keshav
 */
public class ViewChemicalRequestJpanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private DrugOrganization drugOrganization ;
    private Enterprise enterprise;
    private Network network;
    /**
     * Creates new form ViewChemicalRequestJpanel
     */
     public ViewChemicalRequestJpanel(JPanel userProcessContainer,UserAccount userAccount,Enterprise enterprise, DrugOrganization drugOrganization,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.drugOrganization = drugOrganization;
        this.enterprise = enterprise;
        this.network = network;
        reorderTable();
    }
   
    public void reorderTable(){
        int rowCount = tblReorder.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblReorder.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
      for(ChemicalCompound cc : drugOrganization.getChemList()){
            Object row[] = new Object[6];
            row[0] = cc;
            row[1] = cc.getSerialNumber();
            row[2] = cc.getAvailQuantity();
            row[3] = cc.getRequiredQuantity();
            row[4] = cc.getReorderStatus();
            model.addRow(row);
        }
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
        btnInventory = new javax.swing.JButton();
        btnViewRequests = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtChemicalName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAvailableQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRequiredQuantity = new javax.swing.JTextField();
        btnAddChemicals = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

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

        btnInventory.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnInventory.setText("Inventory Check");
        btnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryActionPerformed(evt);
            }
        });

        btnViewRequests.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnViewRequests.setText("View Requests");
        btnViewRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestsActionPerformed(evt);
            }
        });

        btnViewDetails.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("REQUEST CHEMICAL PORTAL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Serial No. :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Chemical Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Available Quantity :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Required Quantity :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtAvailableQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(txtChemicalName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRequiredQuantity))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtChemicalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAvailableQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRequiredQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnAddChemicals.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnAddChemicals.setText("Add Chemicals");
        btnAddChemicals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddChemicalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddChemicals, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnViewRequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnViewRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddChemicals, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddChemicalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddChemicalsActionPerformed
        // TODO add your handling code here:
        ChemicalCompound m=new ChemicalCompound();
        String name=txtChemicalName.getText().trim();      
        if(name.isEmpty())
        {
         JOptionPane.showMessageDialog(null,"Chemical Name is empty");
            return;   
        }
        m.setChemicalName(txtChemicalName.getText());
        try
        {
        int availableQuantity= Integer.parseInt(txtAvailableQuantity.getText());
        m.setAvailQuantity(availableQuantity);
        }
        catch(NumberFormatException e)
        {
             JOptionPane.showMessageDialog(null,"available quantity must be a integer");
            return;   
        }
        try
        {
        int serialNumber= Integer.parseInt(txtSerialNumber.getText());
        m.setSerialNumber(serialNumber);
        }
         catch(NumberFormatException e)
        {
             JOptionPane.showMessageDialog(null,"Serial number  must be a integer");
            return;   
        }
        try{
        int requiredQuantity= Integer.parseInt(txtRequiredQuantity.getText());
        m.setRequiredQuantity(requiredQuantity);
        }
         catch(NumberFormatException e){

            JOptionPane.showMessageDialog(null,"Required quantity must be integer!");
            return;
        }
        drugOrganization.addChemical(m);
        m.setReorderStatus("N");

        DefaultTableModel dtm =(DefaultTableModel) tblReorder.getModel();

        dtm.setRowCount(0);
        for(ChemicalCompound cc : drugOrganization.getChemList()){
            Object row[] = new Object[5];
            row[0] = cc;
            row[1] = cc.getSerialNumber();
            row[2] = cc.getAvailQuantity();
            row[3] = cc.getRequiredQuantity();
            row[4] = cc.getReorderStatus();
            dtm.addRow(row);
        }

        JOptionPane.showMessageDialog(null, "Chemical Added Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
        txtSerialNumber.setText("");
        txtChemicalName.setText("");
        txtAvailableQuantity.setText("");
        txtRequiredQuantity.setText("");
        
        
    
    }//GEN-LAST:event_btnAddChemicalsActionPerformed

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
        // TODO add your handling code here:
                int i=0;
        for(ChemicalCompound mi : drugOrganization.getChemList()){
            i++;
            
        }
        if(i<=0)
        {
            JOptionPane.showMessageDialog(null,"No chemicals are present for invetory check  ");
            return;
        }
       for(ChemicalCompound cc : drugOrganization.getChemList()){

            if(cc.getAvailQuantity()<=cc.getRequiredQuantity()){
                if(!cc.getReorderStatus().equals("Y")){
                    ChemicalWorkRequest request=new ChemicalWorkRequest();

                    cc.setReorderStatus("Y");
                    request.setChemicalName(cc.getChemicalName());
                    request.setQuantity(cc.getRequiredQuantity());
                    request.setSender(userAccount);

                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    for(Enterprise enterprise :network.getEnterpriseDirectory().getEnterpriseList() ){
//                        System.out.println("***** Organization Name:" +enterprise.getName());
                        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
//                            System.out.println("***** Organization Name:" +organization.getName());
                            if(organization.getName().equalsIgnoreCase("ChemicalOrganization")){
//                                System.out.println("True");
//
//                                System.out.println("***** organization Name"+organization.getName());

                                organization.getWorkQueue().getWorkRequestList().add(request);
                              
                            }
                        }

                    }

                }

            }
        } 
        JOptionPane.showMessageDialog(null, "Inventory status checked and updated!", "Warning", JOptionPane.INFORMATION_MESSAGE);
       reorderTable();                                                 

    }//GEN-LAST:event_btnInventoryActionPerformed

    private void btnViewRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestsActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewRequestJPanel", new ViewRequestsJpanel(userProcessContainer, userAccount, enterprise, drugOrganization));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnViewRequestsActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int row = tblReorder.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ChemicalCompound cc = (ChemicalCompound)tblReorder.getValueAt(row, 0);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("UpdateEntryJPanel", new ViewChemicalDetailsJpanel(userProcessContainer, userAccount, enterprise,cc));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DrugSupplierWorkAreaJPanel dwjp = (DrugSupplierWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddChemicals;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JButton btnViewRequests;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReorder;
    private javax.swing.JTextField txtAvailableQuantity;
    private javax.swing.JTextField txtChemicalName;
    private javax.swing.JTextField txtRequiredQuantity;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}
