/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgencyWelcome;

import Business.Airliner;
import Business.Customer;
import Business.Flight;
import Business.Seats;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author krish
 */
public class BookFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookFlightJPanel
     */
    private JPanel panel;
    private Flight flight;
    private TravelAgency travelAgency;
    public BookFlightJPanel(JPanel panel,Flight flight,TravelAgency travelAgency) {
        initComponents();
        this.panel = panel;
        this.flight = flight;
        this.travelAgency = travelAgency;
        flightNumberTextField.setEnabled(false);
        flightNumberTextField.setText(flight.getFlightNumber());
        
        populateSeats();
    }

     private boolean emailPattern() {
        Pattern p = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher m = p.matcher(customerEmailTextField.getText());
        boolean b = m.matches();
        return b;
    }
    
    private boolean phoneNumberPattern() {
        Pattern p = Pattern.compile("[0-9]*");
        Matcher m = p.matcher(customerPhoneNumberTextField.getText());
        boolean b = m.matches();
        return b;
    }
    
    public void populateSeats(){
        for(Seats seat : flight.getSeatList()){
            if(seat.isSeatAvailability() == true)
            comboSeat.addItem(seat.getSeatNumber());
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

        jPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        flightNumLabel = new javax.swing.JLabel();
        flightNumberTextField = new javax.swing.JTextField();
        cusNameLabel = new javax.swing.JLabel();
        customerNameTextField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        customerPhoneNumberTextField = new javax.swing.JTextField();
        eMailLabel = new javax.swing.JLabel();
        customerEmailTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboSeat = new javax.swing.JComboBox<>();
        bookBtn = new java.awt.Button();
        seatArrangementPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-back-30.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Confirm Your Booking!!!");

        flightNumLabel.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        flightNumLabel.setText("Flight Number :");

        flightNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightNumberTextFieldActionPerformed(evt);
            }
        });

        cusNameLabel.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        cusNameLabel.setText("Name :");

        phoneLabel.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        phoneLabel.setText("Phone Numebr :");

        eMailLabel.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        eMailLabel.setText("Email :");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jLabel6.setText("Seat :");

        comboSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSeatActionPerformed(evt);
            }
        });

        bookBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bookBtn.setLabel("Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("1A");
        jButton1.setEnabled(false);
        jButton1.setFocusTraversalPolicyProvider(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("1C");
        jButton2.setEnabled(false);
        jButton2.setFocusTraversalPolicyProvider(true);

        jButton3.setText("1B");
        jButton3.setEnabled(false);
        jButton3.setFocusTraversalPolicyProvider(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("1F");
        jButton4.setEnabled(false);
        jButton4.setFocusTraversalPolicyProvider(true);

        jButton5.setText("1D");
        jButton5.setEnabled(false);
        jButton5.setFocusTraversalPolicyProvider(true);

        jButton6.setText("1E");
        jButton6.setEnabled(false);
        jButton6.setFocusTraversalPolicyProvider(true);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Window");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Aisle");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Middle");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Window");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Middle");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Aisle");

        javax.swing.GroupLayout seatArrangementPanelLayout = new javax.swing.GroupLayout(seatArrangementPanel);
        seatArrangementPanel.setLayout(seatArrangementPanelLayout);
        seatArrangementPanelLayout.setHorizontalGroup(
            seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatArrangementPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatArrangementPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatArrangementPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        seatArrangementPanelLayout.setVerticalGroup(
            seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatArrangementPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton5)
                        .addComponent(jButton6)
                        .addComponent(jButton3)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11))
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cusNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(flightNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eMailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flightNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerPhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(seatArrangementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flightNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cusNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eMailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(customerPhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(seatArrangementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1123, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        panel.remove(this);
        CardLayout layout = (CardLayout) panel.getLayout();
        layout.previous(panel);
        Component[] comps= panel.getComponents();
        for(Component c:comps)
        {
            if(c instanceof SearchFlightToBookJPanel)
            {
                SearchFlightToBookJPanel panel=(SearchFlightToBookJPanel) c;
                panel.populate();
            }
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void flightNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightNumberTextFieldActionPerformed

    private void comboSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSeatActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        String customerName = customerNameTextField.getText();
        String customerEmail = customerEmailTextField.getText();
        String flightNumber = flightNumberTextField.getText();
        String seatNumber = (String)comboSeat.getSelectedItem();
        long customerContact = 0;
        try{
            customerContact = Long.parseLong(customerPhoneNumberTextField.getText());
            
            if(!phoneNumberPattern())
            {
                JOptionPane.showMessageDialog(null, "Please Enter a valid Phone Number");
                customerPhoneNumberTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
                phoneLabel.setForeground(Color.RED);
                return;
            }else if(!emailPattern()) 
            {
                JOptionPane.showMessageDialog(null, "Email should be the form of xxx123@xxx.xxx");
                customerEmailTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
                eMailLabel.setForeground(Color.RED);
                return;
            }else if(customerName.equals(" "))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your Name");
                customerNameTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
                cusNameLabel.setForeground(Color.RED);
                return;
            }
            else{
                int currentArrival=0;
                int currentDeparture=0;
                int previousArrival=0;
                int previousDeparture=0;
                boolean b =true;
                int countList = travelAgency.getCustomerDirectory().getCustomerList().size();
                if(countList>0){
                    for(Customer customer : travelAgency.getCustomerDirectory().getCustomerList()) {
                        if(customer.getCustomerName().equalsIgnoreCase(customerName) && customer.getCustomerEmail().equals(customerEmail)){
                            for(Airliner airliner : travelAgency.getAirlinerDirectory().getAirlinerList()){
                                for(Flight flight : airliner.getFlightList()){

                                    if(flight.getFlightNumber().equals(customer.getFlightNumber()) && flight.getFlightNumber().equals(flightNumber)){
                                            currentArrival = Integer.parseInt(flight.getArrivalTime().substring(0, 2));
                                            currentDeparture =Integer.parseInt(flight.getDepartureTime().substring(0, 2)); 
                                            previousArrival = Integer.parseInt(flight.getArrivalTime().substring(0, 2));
                                            previousDeparture =Integer.parseInt(flight.getDepartureTime().substring(0, 2));
                                    }else if(flight.getFlightNumber().equals(flightNumber) && !flight.getFlightNumber().equals(customer.getFlightNumber())){
                                        b=false;
                                        currentArrival = Integer.parseInt(flight.getArrivalTime().substring(0, 2));
                                        currentDeparture =Integer.parseInt(flight.getDepartureTime().substring(0, 2)); 
                                    }
                                    if(flight.getFlightNumber().equals(customer.getFlightNumber()) && !flight.getFlightNumber().equals(flightNumber) ){
                                            b=false;
                                            previousArrival = Integer.parseInt(flight.getArrivalTime().substring(0, 2));
                                            previousDeparture =Integer.parseInt(flight.getDepartureTime().substring(0, 2));
                                    }
                                }
                            }
                        }
                    }
                }else{
                    for(Airliner airliner : travelAgency.getAirlinerDirectory().getAirlinerList()){
                        for(Flight flight : airliner.getFlightList()){
                            if(flight.getFlightNumber().equals(flightNumber)){
                                currentArrival = Integer.parseInt(flight.getArrivalTime().substring(0, 2));
                                currentDeparture =Integer.parseInt(flight.getDepartureTime().substring(0, 2)); 
                            }
                        }
                    }
                }
                
                if(b== false){
                    
                    if((currentDeparture >= previousDeparture  && currentDeparture <= previousArrival) || (currentArrival >= previousDeparture  && currentArrival <= previousArrival)){
                        
                        //if(currentdeparture < previousdeparture){
                            JOptionPane.showMessageDialog(null, "No Overlapping allowed");
                            return;
                    
                    //}
                        
                    }
//                    if((currentDeparture > previousDeparture  && currentDeparture < previousArrival) || (currentArrival > previousDeparture  && currentArrival < previousArrival)){
//                        
//                        //if(currentdeparture < previousdeparture){
//                            JOptionPane.showMessageDialog(null, "No Overlapping allowed");
//                            return;
//                    
//                    //}
//                        
//                    }
//                    else if((previousDeparture > currentDeparture  && previousDeparture < currentArrival) || (previousArrival > currentDeparture  && previousArrival < currentArrival)){
//                        
//                        //if(currentdeparture < previousdeparture){
//                            JOptionPane.showMessageDialog(null, "No Overlapping allowed");
//                            return;
//                    
//                    //}
//                        
//                    }
                }
                
                travelAgency.getCustomerDirectory().addCustomer(customerName, customerContact, customerEmail, flightNumber, seatNumber);
                flight.setAvailableSeats(flight.getTotalSeats()-1);
                JOptionPane.showMessageDialog(null, "Flight booked successfully\n"+"Airline: "+flight.getAirlinerName()+"\n"+"Flight Number: "+flight.getFlightNumber()+"\n"+"Seat Number: "+seatNumber);
                for(Seats seat:flight.getSeatList()){
                    if(seat.getSeatNumber().equals(seatNumber))
                     seat.setSeatAvailability(false);
                }
                comboSeat.removeItem(seatNumber);
                customerNameTextField.setText("");
                customerEmailTextField.setText("");
                customerPhoneNumberTextField.setText("");
                comboSeat.setSelectedIndex(0);
            }
            
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter your Phone Number ");
            return;
        }
    }//GEN-LAST:event_bookBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private java.awt.Button bookBtn;
    private javax.swing.JComboBox<String> comboSeat;
    private javax.swing.JLabel cusNameLabel;
    private javax.swing.JTextField customerEmailTextField;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JTextField customerPhoneNumberTextField;
    private javax.swing.JLabel eMailLabel;
    private javax.swing.JLabel flightNumLabel;
    private javax.swing.JTextField flightNumberTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JPanel seatArrangementPanel;
    // End of variables declaration//GEN-END:variables
}
