/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DrugSupplier;

import Business.Enterprise.Enterprise;
import Business.Organization.DrugOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ChemicalWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keshav
 */
public class ViewRequestsJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewRequestsJpanel
     */
     private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private DrugOrganization drugOrganization;
  public ViewRequestsJpanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, DrugOrganization drugOrganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.drugOrganization = drugOrganization;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblDrugRequests.getModel();
        
        model.setRowCount(0);
        
        
      // for(WorkRequest request : opOrganization.getWorkQueue().getWorkRequestList())
      
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = ((ChemicalWorkRequest) request);
            row[1] = ((ChemicalWorkRequest) request).getQuantity();
            row[2] = request.getReceiver();
            String result = ((ChemicalWorkRequest) request).getStatus();
            row[3] = result == null ? "Waiting" : result;
            if(((ChemicalWorkRequest) request).getDeliveryTime()==null){
                row[4]="Details yet to be updated by supplier";
            }
            else{
            row[4]  = "Expected " +((ChemicalWorkRequest) request).getDeliveryTime();
                    }
            
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

        jScrollPane = new javax.swing.JScrollPane();
        tblDrugRequests = new javax.swing.JTable();
        lblViewRequests = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        tblDrugRequests.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        tblDrugRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CHEMICAL NAME", "REQUIRED QUANTITY", "RECIEVER", "STATUS", "DELIVERY DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDrugRequests.setRowHeight(30);
        jScrollPane.setViewportView(tblDrugRequests);

        lblViewRequests.setFont(new java.awt.Font("Wide Latin", 3, 24)); // NOI18N
        lblViewRequests.setText("View Requests");

        btnBack.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 0, 255));
        btnBack.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(lblViewRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblViewRequests)
                .addGap(134, 134, 134)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(btnBack)
                .addContainerGap(168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblViewRequests;
    private javax.swing.JTable tblDrugRequests;
    // End of variables declaration//GEN-END:variables
}
