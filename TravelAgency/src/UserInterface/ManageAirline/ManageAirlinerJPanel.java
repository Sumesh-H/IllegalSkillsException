/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirline;

import Business.Airliner;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumesh
 */
public class ManageAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinerJPanel
     */
    private JPanel cardSequenceJPanel;
    private TravelAgency travelAgency;
    public ManageAirlinerJPanel(JPanel cardSequenceJPanel, TravelAgency travelAgency) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.travelAgency = travelAgency;
//        populateAirlinersTable();
    }
    
//    public void populateAirlinersTable(){
//        DefaultTableModel dtm = (DefaultTableModel) tblMngAirline.getModel();
//        dtm.setRowCount(0);
//        for(Airliner airliner: travelAgency.getAirlinerDirectory().getAirlinerList()) {
//            Object[] row = new Object[1];
//            row[0]=airliner;
//            row[1]=airliner.getAirlinerHeadquaters();
//            row[2]=airliner.getAirlinerFleetSize();            
//            dtm.addRow(row);
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMngAirline = new javax.swing.JTable();
        btnAddAirliner = new javax.swing.JButton();
        btnViewAirliner = new javax.swing.JButton();
        btnDeleteAirliner = new javax.swing.JButton();
        txtSearchAirliner = new javax.swing.JTextField();
        btnSearchAirliner = new javax.swing.JButton();
        btnClearSearch = new javax.swing.JButton();
        btnAddFlight = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Airliners");

        tblMngAirline.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Names", "Headquaters", "Fleet Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMngAirline);
        if (tblMngAirline.getColumnModel().getColumnCount() > 0) {
            tblMngAirline.getColumnModel().getColumn(0).setResizable(false);
            tblMngAirline.getColumnModel().getColumn(1).setResizable(false);
            tblMngAirline.getColumnModel().getColumn(2).setResizable(false);
        }

        btnAddAirliner.setText("Add New Airliner");
        btnAddAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAirlinerActionPerformed(evt);
            }
        });

        btnViewAirliner.setText("View Airliner Details");
        btnViewAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAirlinerActionPerformed(evt);
            }
        });

        btnDeleteAirliner.setText("Delete Airliner");

        btnSearchAirliner.setText("Search");

        btnClearSearch.setText("Clear Search");

        btnAddFlight.setText("Add Flight");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 58, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddAirliner)
                                .addGap(18, 18, 18)
                                .addComponent(btnViewAirliner)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteAirliner)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearchAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnClearSearch)
                                    .addComponent(btnSearchAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 183, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnClearSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAirlinerActionPerformed
        // TODO add your handling code here:
        CreateAirlinerJPanel panel = new CreateAirlinerJPanel(cardSequenceJPanel, travelAgency);
        cardSequenceJPanel.add("CreateAirlinerJPanel",panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);        
    }//GEN-LAST:event_btnAddAirlinerActionPerformed

    private void btnViewAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAirlinerActionPerformed
        // TODO add your handling code here:
        int slectedRow = tblMngAirline.getSelectedRow();
        if(slectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select row to view flight details!!");
        }
        else{
        Airliner airliner = (Airliner)tblMngAirline.getValueAt(slectedRow,0);
           ViewAirlinerDetailsJPanel panel = new ViewAirlinerDetailsJPanel(cardSequenceJPanel,airliner);
           cardSequenceJPanel.add("ViewAirlinerDetailsJPanel",panel);
           CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
           layout.next(cardSequenceJPanel);
        }
    }//GEN-LAST:event_btnViewAirlinerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAirliner;
    private javax.swing.JButton btnAddFlight;
    private javax.swing.JButton btnClearSearch;
    private javax.swing.JButton btnDeleteAirliner;
    private javax.swing.JButton btnSearchAirliner;
    private javax.swing.JButton btnViewAirliner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMngAirline;
    private javax.swing.JTextField txtSearchAirliner;
    // End of variables declaration//GEN-END:variables
}
