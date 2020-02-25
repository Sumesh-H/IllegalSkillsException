/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirline;

import Business.Airliner;
import Business.Flight;
import Business.TravelAgency;
import static UserInterface.ManageAirline.ManageAirlinerJPanel.isEmpty;
import UserInterface.ManageAirline.ViewFlightDetailsJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ViewFlightsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFlightsJPanel
     */
    private JPanel cardSequenceJPanel;
    private TravelAgency travelAgency;
    private Airliner airliner;
    private Flight flight;
    public ViewFlightsJPanel(JPanel cardSequenceJPanel, Airliner airliner,TravelAgency travelAgency) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.airliner = airliner;
        this.travelAgency = travelAgency;
        populateAirlinersTable();
    }
    
    public void populateAirlinersTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblMngFlights.getModel();
        dtm.setRowCount(0);
        for(Flight f: airliner.getFlightList()) {
            Object[] row = new Object[2];
            row[0]=f;
            row[1]=f.getFlightPrice();                        
            dtm.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMngFlights = new javax.swing.JTable();
        btnViewFlightDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Flights");

        tblMngFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Name", "Flight Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMngFlights);
        if (tblMngFlights.getColumnModel().getColumnCount() > 0) {
            tblMngFlights.getColumnModel().getColumn(0).setResizable(false);
        }

        btnViewFlightDetails.setText("View Flight Details");
        btnViewFlightDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFlightDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(btnViewFlightDetails)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnViewFlightDetails)
                .addContainerGap(224, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewFlightDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFlightDetailsActionPerformed
        // TODO add your handling code here:
         if (isEmpty(tblMngFlights)) {
            JOptionPane.showMessageDialog(null, "Please create an Airliner First!");
        } else {
            int selectedRow = tblMngFlights.getSelectedRow();
            if(selectedRow<0){
                JOptionPane.showMessageDialog(null, "Please select row to create flight!");
            } else {
                int column = 0;
                int row = tblMngFlights.getSelectedRow();
                String value = tblMngFlights.getModel().getValueAt(row, column).toString();
            
                Flight flight = (Flight)tblMngFlights.getValueAt(selectedRow, 0);
                ViewFlightDetailsJPanel panel = new ViewFlightDetailsJPanel(cardSequenceJPanel, flight,travelAgency);                
                cardSequenceJPanel.add("ViewAirlinerDetailsJPanel", panel);
                CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
                layout.next(cardSequenceJPanel);
                
            }
        }
    }//GEN-LAST:event_btnViewFlightDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewFlightDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblMngFlights;
    // End of variables declaration//GEN-END:variables
}
