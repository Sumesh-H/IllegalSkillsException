/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DrugSupplier;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DrugOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DrugWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumesh
 */
public class DrugSupplierWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DrugSupplierWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount; 
    private DrugOrganization drugOrganization;
    private Enterprise enterprise;
    private Network network;
    public DrugSupplierWorkAreaJPanel(JPanel userProcessContainer, EcoSystem business, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.drugOrganization = (DrugOrganization) organization;
        this.enterprise = enterprise;
        this.network = network;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblWorkAreaDrug.getModel();
        model.setRowCount(0);

        for (WorkRequest request : drugOrganization.getWorkQueue().getWorkRequestList()) {
            if (((DrugWorkRequest) request).getPatient() == null) {
                Object[] row = new Object[6];
                row[0] = ((DrugWorkRequest) request);
                row[1] = ((DrugWorkRequest) request).getQuantity();
                row[2] = request.getSender().getEmployee().getName();
                row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[4] = request.getStatus();
                row[5] = ((DrugWorkRequest) request).getDeliveryTime();

                model.addRow(row);
            }
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblWorkAreaDrug = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnReqChemical = new javax.swing.JButton();
        btnViewLabReq = new javax.swing.JButton();
        btnAddDrug = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        tblWorkAreaDrug.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        tblWorkAreaDrug.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Quantity", "Sender", "Receiver", "Status", "Delivery Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblWorkAreaDrug.setRowHeight(30);
        jScrollPane2.setViewportView(tblWorkAreaDrug);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DRUG SUPPLIER WORK AREA");

        btnAssign.setText("Assign to me");

        btnProcess.setText("Process");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnReqChemical.setText("Request Chemical");
        btnReqChemical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqChemicalActionPerformed(evt);
            }
        });

        btnViewLabReq.setText("View Lab Requests");
        btnViewLabReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLabReqActionPerformed(evt);
            }
        });

        btnAddDrug.setText("Add Drug");
        btnAddDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDrugActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReqChemical))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewLabReq))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddDrug, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(156, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign)
                    .addComponent(btnProcess)
                    .addComponent(btnRefresh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReqChemical)
                    .addComponent(btnViewLabReq)
                    .addComponent(btnAddDrug))
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDrugActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();        
        userProcessContainer.add("AddDrugJPanel", new AddDrugJPanel(userProcessContainer, business, userAccount, drugOrganization, enterprise, network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddDrugActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnViewLabReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLabReqActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();        
        userProcessContainer.add("LabResultsJPanel", new LabResultsJPanel(userProcessContainer, userAccount, enterprise, drugOrganization, network, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewLabReqActionPerformed

    private void btnReqChemicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqChemicalActionPerformed
        // TODO add your handling code here:
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       
        userProcessContainer.add("ViewChemicalsRequestJPanel", new ViewChemicalRequestJpanel(userProcessContainer, userAccount, enterprise, drugOrganization, network));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnReqChemicalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDrug;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReqChemical;
    private javax.swing.JButton btnViewLabReq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblWorkAreaDrug;
    // End of variables declaration//GEN-END:variables
}
