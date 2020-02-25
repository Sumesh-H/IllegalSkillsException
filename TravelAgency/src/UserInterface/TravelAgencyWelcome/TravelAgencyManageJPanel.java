/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgencyWelcome;

import Business.Airliner;
import Business.Flight;
import Business.TravelAgency;
import UserInterface.ManageAirline.CreateFlightJPanel;
import UserInterface.ManageAirline.ManageAirlinerJPanel;
import static UserInterface.ManageAirline.ManageAirlinerJPanel.isEmpty;
import UserInterface.ManageAirline.ViewFlightDetailsJPanel;
import UserInterface.ManageAirline.ViewFlightsJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumesh
 */
public class TravelAgencyManageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TravelAgencyManageJPanel
     */
    private JPanel cardSequenceJPanel;
    private TravelAgency travelAgency;
    public TravelAgencyManageJPanel(JPanel cardSequenceJPanel, TravelAgency travelAgency) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.travelAgency = travelAgency;
        populateTable();
        
    }

    public void populateTable() {
    DefaultTableModel dtm = (DefaultTableModel)tbltravelagency.getModel();
        dtm.setRowCount(0);
        for(Airliner airliner:travelAgency.getAirlinerDirectory().getAirlinerList()) {
            int i=0;
            int count = 0;
            for(Flight flight:airliner.getFlightList()) {
            
            if(airliner.getAirlinerName().equals(flight.getAirlinerName())){
            Object[] row = new Object[8];
            row[0]=airliner.getAirlinerName();
            row[1]=flight;
            row[2]=airliner.getFlightList().get(i).getSource();
            row[3]=airliner.getFlightList().get(i).getDestination();
            row[4]=airliner.getFlightList().get(i).getDepartureTime();
            row[5]=airliner.getFlightList().get(i).getArrivalTime();
            row[6]=airliner.getFlightList().get(i).getFlightPrice();
            row[7]=airliner.getFlightList().get(i).getTotalSeats();
            dtm.addRow(row);
            count++;
            }
            i++;
            }
            airliner.setAirlinerNoOfAirplanes(count);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tbltravelagency = new javax.swing.JTable();
        btnManageAirliner = new javax.swing.JButton();
        btnBookFlight = new javax.swing.JButton();
        btnBookingDetails = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Travel Agency");

        tbltravelagency.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner", "Flight Number", "Source", "Destination", "Departure time", "Arrival Time", "Price", "Total Seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbltravelagency);

        btnManageAirliner.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnManageAirliner.setForeground(new java.awt.Color(153, 0, 0));
        btnManageAirliner.setText("Manage Airliner");
        btnManageAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAirlinerActionPerformed(evt);
            }
        });

        btnBookFlight.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnBookFlight.setForeground(new java.awt.Color(153, 0, 0));
        btnBookFlight.setText("Book Flight");
        btnBookFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookFlightActionPerformed(evt);
            }
        });

        btnBookingDetails.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnBookingDetails.setForeground(new java.awt.Color(153, 0, 0));
        btnBookingDetails.setText("Booking Details");
        btnBookingDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnManageAirliner)
                .addGap(40, 40, 40)
                .addComponent(btnBookFlight)
                .addGap(27, 27, 27)
                .addComponent(btnBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(425, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(379, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBookFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(31, 31, 31)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(98, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAirlinerActionPerformed
        // TODO add your handling code here:
        ManageAirlinerJPanel manageAirlinerJPanel = new ManageAirlinerJPanel(cardSequenceJPanel, travelAgency);
        cardSequenceJPanel.add("ManageAirlinerJPanel", manageAirlinerJPanel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_btnManageAirlinerActionPerformed

    private void btnBookFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookFlightActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbltravelagency.getSelectedRow();
        int numbersOfRows = tbltravelagency.getSelectedRowCount();
        if(numbersOfRows<=0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first to view flight details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(numbersOfRows>1){
            JOptionPane.showMessageDialog(null, "You are not allowed to book more than one flight!!!"+"\n"+"Please Select only one flight that you want to book!!!","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Flight flight = (Flight)tbltravelagency.getValueAt(selectedRow, 1);
            BookFlightJPanel bookFlightJPanel = new BookFlightJPanel(cardSequenceJPanel,flight,travelAgency);
            cardSequenceJPanel.add("BookFlightJpanel",bookFlightJPanel);
            CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
            layout.next(cardSequenceJPanel);
        }
    }//GEN-LAST:event_btnBookFlightActionPerformed

    private void btnBookingDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingDetailsActionPerformed
        // TODO add your handling code here:
        PastBookingsJPanel pastBookingsJPanel= new PastBookingsJPanel(cardSequenceJPanel,travelAgency);
        cardSequenceJPanel.add("PastBookingsJPanel" , pastBookingsJPanel);
        CardLayout cardLayout = (CardLayout) cardSequenceJPanel.getLayout();
        cardLayout.next(cardSequenceJPanel);
    }//GEN-LAST:event_btnBookingDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookFlight;
    private javax.swing.JButton btnBookingDetails;
    private javax.swing.JButton btnManageAirliner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbltravelagency;
    // End of variables declaration//GEN-END:variables
}
