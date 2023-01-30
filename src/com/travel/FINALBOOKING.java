/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travel;

import com.model.dbaseAccount;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeet Rakesh Patel
 */
public class FINALBOOKING extends javax.swing.JFrame 
{


    ResultSet rs;
    double totalfare;
    int op;//will use it in insert function
    Vector v1;//will use it in insert function
    public FINALBOOKING() 
    {
        initComponents();
         Color backgroundcolor = new Color(200,204,255);
        this.getContentPane().setBackground(backgroundcolor); 
        
        setVisible(true);
        setResizable(false);
    }
    
    
    
    public void flightdetails(Vector v,int option) throws SQLException
    {
        String code,code1,departtime = null,departfare = null,returntime = null,returnfare = null;
       
       op = option;
       v1 =v;
        code = String.valueOf(v.get(3));//we have passed flight code in index 3 of vector
        
        // now to get deart time and fare for selected flight
        dbaseAccount dba = new dbaseAccount(); //this is our class in com.model
                try {
                    rs = dba.finaldepart(code); //calling function from database
                                                           
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            rs.beforeFirst();
            while (rs.next()== true)
            {           
                
                departtime = rs.getString("departtime");
                departfare = rs.getString("fare");
            }                            
               
       
       lbldepartflight.setText(String.valueOf(v.get(0)) +" to  "+ String.valueOf(v.get(1)));
       
       lbldepartflightcode.setText(lbldepartflightcode.getText() +" " + String.valueOf(v.get(3)) );
      
       DateFormat df = new  SimpleDateFormat("dd-MM-yyyy");//if we dont do this, system will display the current time also
       lbldepartflightdate.setText(lbldepartflightdate.getText() +" " + String.valueOf(df.format( v.get(2))) );
       
    
        
      lbldepartflighttime.setText(lbldepartflighttime.getText() +" " + departtime  );
      lbldepartfare.setText(lbldepartfare.getText() +" " + departfare  );
      totalfare = 1.18 * (Integer.parseInt(departfare));
      lbltotalfare.setText(lbltotalfare.getText() +" " + totalfare  );
      
    
     if (option ==2) //fetching additional data for return
    {
        returnpanel.setVisible(true);
         code1 = String.valueOf(v.get(5));//we have passed flight code in index 3 of vector
        
        // now to get deart time and fare for selected flight
        dbaseAccount dba1 = new dbaseAccount(); //this is our class in com.model
                try {
                    rs = dba1.finalreturn(code1); //calling function from database
                                                           
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            rs.beforeFirst();
            while (rs.next()== true)
            {           
                
                returntime = rs.getString("departtime");
                returnfare = rs.getString("fare");
            }     
            
            lblreturnflight.setText(String.valueOf(v.get(1)) +" to  "+ String.valueOf(v.get(0)));
       
       lblreturnflightcode.setText(lblreturnflightcode.getText() +" " + String.valueOf(v.get(5)) );
      
       DateFormat df1 = new  SimpleDateFormat("dd-MM-yyyy");//if we dont do this, system will display the current time also
       lblreturnflightdate.setText(lblreturnflightdate.getText() +" " + String.valueOf(df1.format( v.get(4))) );
       
    
        
      lblreturnflighttime.setText(lblreturnflighttime.getText() +" " + returntime  );
      lblreturnfare.setText(lblreturnfare.getText() +" " + returnfare  );
      lbltotalfare.setText("Total Fare (including 18% GST):");
      totalfare = 1.18 * ( totalfare + Integer.parseInt(returnfare));
      lbltotalfare.setText(lbltotalfare.getText() +" " + totalfare  );
    
    
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbldepartflight = new javax.swing.JLabel();
        lbldepartflightcode = new javax.swing.JLabel();
        lbldepartflightdate = new javax.swing.JLabel();
        lbldepartflighttime = new javax.swing.JLabel();
        lbldepartfare = new javax.swing.JLabel();
        returnpanel = new javax.swing.JPanel();
        lblreturnflight = new javax.swing.JLabel();
        lblreturnflightcode = new javax.swing.JLabel();
        lblreturnflightdate = new javax.swing.JLabel();
        lblreturnflighttime = new javax.swing.JLabel();
        lblreturnfare = new javax.swing.JLabel();
        cmbsalutation = new javax.swing.JComboBox<>();
        txtfirstname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        lbltotalfare = new javax.swing.JLabel();
        buttoncomplete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 100));

        jLabel1.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Complete your Booking");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Salutation :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("First Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Last Name :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Contact Number :");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbldepartflight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldepartflight.setForeground(new java.awt.Color(255, 0, 102));
        lbldepartflight.setText(" Depart Flight");

        lbldepartflightcode.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbldepartflightcode.setText("Flight code:");

        lbldepartflightdate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbldepartflightdate.setText("Departure Date:");

        lbldepartflighttime.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbldepartflighttime.setText("Departure time:");

        lbldepartfare.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbldepartfare.setText("Fare:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbldepartflight))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldepartflightdate)
                            .addComponent(lbldepartflightcode)
                            .addComponent(lbldepartflighttime)
                            .addComponent(lbldepartfare))))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbldepartflight)
                .addGap(36, 36, 36)
                .addComponent(lbldepartflightcode)
                .addGap(31, 31, 31)
                .addComponent(lbldepartflightdate)
                .addGap(34, 34, 34)
                .addComponent(lbldepartflighttime)
                .addGap(38, 38, 38)
                .addComponent(lbldepartfare)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        returnpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblreturnflight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblreturnflight.setForeground(new java.awt.Color(255, 0, 102));
        lblreturnflight.setText(" Return Flight");

        lblreturnflightcode.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblreturnflightcode.setText("Flight Code:\n");

        lblreturnflightdate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblreturnflightdate.setText("Return Date:");

        lblreturnflighttime.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblreturnflighttime.setText("Return Time:");

        lblreturnfare.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblreturnfare.setText("Fare:");

        javax.swing.GroupLayout returnpanelLayout = new javax.swing.GroupLayout(returnpanel);
        returnpanel.setLayout(returnpanelLayout);
        returnpanelLayout.setHorizontalGroup(
            returnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnpanelLayout.createSequentialGroup()
                .addGroup(returnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(returnpanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblreturnflight))
                    .addGroup(returnpanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(returnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblreturnflightdate)
                            .addComponent(lblreturnflightcode)
                            .addComponent(lblreturnflighttime)
                            .addComponent(lblreturnfare))))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        returnpanelLayout.setVerticalGroup(
            returnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblreturnflight)
                .addGap(37, 37, 37)
                .addComponent(lblreturnflightcode)
                .addGap(29, 29, 29)
                .addComponent(lblreturnflightdate)
                .addGap(33, 33, 33)
                .addComponent(lblreturnflighttime)
                .addGap(36, 36, 36)
                .addComponent(lblreturnfare)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmbsalutation.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmbsalutation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.", "Ms", "Mrs." }));
        cmbsalutation.setToolTipText("");
        cmbsalutation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsalutationActionPerformed(evt);
            }
        });

        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });

        lbltotalfare.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbltotalfare.setText("Total Fare(includong 18% GST):");

        buttoncomplete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttoncomplete.setText("Complete Booking ");
        buttoncomplete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttoncompleteMouseClicked(evt);
            }
        });
        buttoncomplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncompleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(353, 353, 353))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbsalutation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtfirstname, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtlastname)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lbltotalfare))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(returnpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(buttoncomplete)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbsalutation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(returnpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lbltotalfare)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttoncomplete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtlastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlastnameActionPerformed

    private void buttoncompleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttoncompleteMouseClicked
       int x=0;
       dbaseAccount dba2 = new dbaseAccount();
        try {
            //we need to pass all data as string
            x = dba2.insertdata(String.valueOf( v1.get(0)),String.valueOf(v1.get(1)),
                    String.valueOf(v1.get(3)),String.valueOf(v1.get(5)),totalfare, String.valueOf(cmbsalutation.getSelectedItem()), 
                    txtfirstname.getText(), txtlastname.getText(),txtcontact.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FINALBOOKING.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FINALBOOKING.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (x != 0 )
        JOptionPane.showMessageDialog(null, "Data Updated Successfully");
        else
          JOptionPane.showMessageDialog(null, "Data not updated"); 
    }//GEN-LAST:event_buttoncompleteMouseClicked

    private void cmbsalutationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsalutationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsalutationActionPerformed

    private void buttoncompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncompleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttoncompleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FINALBOOKING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FINALBOOKING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FINALBOOKING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FINALBOOKING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FINALBOOKING().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttoncomplete;
    private javax.swing.JComboBox<String> cmbsalutation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbldepartfare;
    private javax.swing.JLabel lbldepartflight;
    private javax.swing.JLabel lbldepartflightcode;
    private javax.swing.JLabel lbldepartflightdate;
    private javax.swing.JLabel lbldepartflighttime;
    private javax.swing.JLabel lblreturnfare;
    private javax.swing.JLabel lblreturnflight;
    private javax.swing.JLabel lblreturnflightcode;
    private javax.swing.JLabel lblreturnflightdate;
    private javax.swing.JLabel lblreturnflighttime;
    private javax.swing.JLabel lbltotalfare;
    private javax.swing.JPanel returnpanel;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    // End of variables declaration//GEN-END:variables
}
