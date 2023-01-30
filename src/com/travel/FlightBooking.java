
package com.travel;

import com.model.dbaseAccount;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class FlightBooking extends javax.swing.JFrame 
{
    ResultSet rs,rsreturn;
    int option;
    public FlightBooking() throws ClassNotFoundException, SQLException 
    {
        initComponents();
        Color backgroundcolor = new Color (0,153,204);      //combination of colors
        this.getContentPane().setBackground(backgroundcolor);
       
       departtableJpanel.setVisible(false); //these is to display table
       returntableJpanel.setVisible(false);//
       cmborigin.setEnabled(false);
       cmbdestination.setEnabled(false);
       departureDateChooser.setEnabled(false);
       returnDateChooser.setEnabled(false);
       buttonsearch.setEnabled(false);
       buttoncancel.setEnabled(false);
        
        buttonconfirm.setVisible(false);
        fillcombobox();
        
         setVisible(true);
        setResizable(false);
    }
    
    ////fillcombobox
    public void fillcombobox() throws ClassNotFoundException, SQLException 
    {
       cmborigin.removeAllItems();
       cmbdestination.removeAllItems();
       
       dbaseAccount dba = new dbaseAccount();
       rs = dba.getSourceCity();
       
       while(rs.next()== true)
       {
           cmborigin.addItem(rs.getString("Source"));
       } 
       rs = dba.getDestinationCity();
       
        while (rs.next()== true)
        {
          cmbdestination.addItem(rs.getString("destination"));
        }
        
       
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        radiooneway = new javax.swing.JRadioButton();
        radioreturn = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cmborigin = new javax.swing.JComboBox<>();
        jlabel3 = new javax.swing.JLabel();
        cmbdestination = new javax.swing.JComboBox<>();
        departureDateChooser = new javax.swing.JLabel();
        returnDateChooser = new javax.swing.JLabel();
        buttonsearch = new javax.swing.JButton();
        buttoncancel = new javax.swing.JButton();
        buttonconfirm = new javax.swing.JButton();
        departtableJpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        departuretable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cmbselectdepartflight = new javax.swing.JComboBox<>();
        returntableJpanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        returntable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cmbreturnflight = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 204));
        setLocation(new java.awt.Point(150, 100));
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setText("Help us Choose Flight for you");

        radiooneway.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radiooneway.setText("One Way");
        radiooneway.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioonewayMouseClicked(evt);
            }
        });
        radiooneway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioonewayActionPerformed(evt);
            }
        });

        radioreturn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioreturn.setText("Return");
        radioreturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioreturnMouseClicked(evt);
            }
        });
        radioreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioreturnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("City of Origin  :");

        cmborigin.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmborigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmborigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboriginActionPerformed(evt);
            }
        });

        jlabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel3.setText("Destination   :");

        cmbdestination.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmbdestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbdestination.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbdestinationItemStateChanged(evt);
            }
        });
        cmbdestination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbdestinationMouseClicked(evt);
            }
        });

        departureDateChooser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        departureDateChooser.setText("Departure Date   : ");

        returnDateChooser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnDateChooser.setText("Return Date   :");

        buttonsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonsearch.setText("SEARCH");
        buttonsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonsearchMouseClicked(evt);
            }
        });
        buttonsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonsearchKeyPressed(evt);
            }
        });

        buttoncancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttoncancel.setText("CANCEL");
        buttoncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttoncancelMouseClicked(evt);
            }
        });

        buttonconfirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonconfirm.setText("Confirm Booking");
        buttonconfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonconfirmMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(radiooneway)
                        .addGap(31, 31, 31)
                        .addComponent(radioreturn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel3)
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmborigin, 0, 94, Short.MAX_VALUE)
                            .addComponent(cmbdestination, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departureDateChooser)
                            .addComponent(returnDateChooser))))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(buttoncancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(buttonconfirm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioreturn)
                    .addComponent(radiooneway))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmborigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel3)
                    .addComponent(cmbdestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(departureDateChooser)
                .addGap(30, 30, 30)
                .addComponent(returnDateChooser)
                .addGap(77, 77, 77)
                .addComponent(buttonsearch)
                .addGap(18, 18, 18)
                .addComponent(buttoncancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(buttonconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        departtableJpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        departuretable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(departuretable);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Select the Departure Flight:");

        cmbselectdepartflight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbselectdepartflightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout departtableJpanelLayout = new javax.swing.GroupLayout(departtableJpanel);
        departtableJpanel.setLayout(departtableJpanelLayout);
        departtableJpanelLayout.setHorizontalGroup(
            departtableJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(departtableJpanelLayout.createSequentialGroup()
                .addGroup(departtableJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(departtableJpanelLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbselectdepartflight, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(departtableJpanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        departtableJpanelLayout.setVerticalGroup(
            departtableJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(departtableJpanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(departtableJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbselectdepartflight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        returntableJpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        returntable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        returntable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(returntable);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Select the Return Flight :");

        javax.swing.GroupLayout returntableJpanelLayout = new javax.swing.GroupLayout(returntableJpanel);
        returntableJpanel.setLayout(returntableJpanelLayout);
        returntableJpanelLayout.setHorizontalGroup(
            returntableJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returntableJpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(returntableJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returntableJpanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returntableJpanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbreturnflight, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        returntableJpanelLayout.setVerticalGroup(
            returntableJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returntableJpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(returntableJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cmbreturnflight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(departtableJpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returntableJpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(departtableJpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(returntableJpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioreturnActionPerformed
     
    }//GEN-LAST:event_radioreturnActionPerformed

    private void buttonsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsearchMouseClicked
        String source ,dest;
        ResultSet  rs1 = null , rs2=null;
        if(option==1)
        {
        source = cmborigin.getSelectedItem().toString();
        dest = cmbdestination.getSelectedItem().toString();
        dbaseAccount dba = new dbaseAccount();
        
        try {
            rs = dba.getDepartureFlight(source, dest);
            rs1=rs;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        departtableJpanel.setVisible(true);
        buttonconfirm.setVisible(true);
        
        //Define Tablemodel
        TableModel tmodel = new DefaultTableModel();
        departuretable.setModel(DbUtils.resultSetToTableModel(rs));   ///this to add the flight 
        try {
            //Adding to combo box
            rs1.beforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            while(rs1.next()==true)
            {
                try {
                    cmbselectdepartflight.addItem(rs1.getString("flightid"));
                } catch (SQLException ex) {
                    Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
        ////////////////////////////////////
        else
        {
            if(option==2)
            {
            source = cmborigin.getSelectedItem().toString();
            dest = cmbdestination.getSelectedItem().toString();
            dbaseAccount dba = new dbaseAccount();
        ///return table 
        try {
        rs = dba.getDepartureFlight(source, dest);
        rsreturn=dba.getReturnFlight(source, dest);
        rs1=rs;
        rs2=rsreturn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        departtableJpanel.setVisible(true);
        returntableJpanel.setVisible(true);
        buttonconfirm.setVisible(true);
        //Define table
        TableModel tmodel = new DefaultTableModel();
        departuretable.setModel(DbUtils.resultSetToTableModel(rs));
        returntable.setModel(DbUtils.resultSetToTableModel(rsreturn));
        try {
            rs1.beforeFirst();
            while(rs1.next()==true)
            {
                cmbselectdepartflight.addItem(rs1.getString("flightid"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
             rs2.beforeFirst();
               while(rs2.next()==true)
                {
                cmbreturnflight.addItem(rs2.getString("flightid"));  
                }       
        }
        catch (SQLException ex)
        {
                    Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
        
        
     
        
    }//GEN-LAST:event_buttonsearchMouseClicked
    ///event_buttonsearchMouseCLicked
    private void buttonconfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonconfirmMouseClicked
       Vector bookingdetails = new Vector();
       bookingdetails.addElement(cmborigin.getSelectedItem());
       bookingdetails.addElement(cmbdestination.getSelectedItem());
       bookingdetails.addElement(departureDateChooser.getDate());
       bookingdetails.addElement(cmbselectdepartflight.getSelectedItem());
       
       if(option==2)
       {
       bookingdetails.addElement(returnDateChooser.getDate());
       bookingdetails.addElement(cmbreturnflight.getSelectedItem()); 
       }
       FINALBOOKING fb = new FINALBOOKING();
      
        try {
            fb.flightdetails(bookingdetails,option);
        } catch (SQLException ex) {
            Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonconfirmMouseClicked

    private void buttoncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttoncancelMouseClicked
       MainMenuScreen m = new MainMenuScreen();
       this.dispose();
    }//GEN-LAST:event_buttoncancelMouseClicked

    private void cmbselectdepartflightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbselectdepartflightActionPerformed
        
    }//GEN-LAST:event_cmbselectdepartflightActionPerformed

    private void radioonewayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioonewayActionPerformed
        
    }//GEN-LAST:event_radioonewayActionPerformed

    private void radioonewayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioonewayMouseClicked
       radioreturn.setEnabled(false);
       cmborigin.setEnabled(true);
       cmbdestination.setEnabled(true);
       departureDateChooser.setEnabled(true);
      returnDateChooser.setEnabled(true);
      buttonsearch.setEnabled(true);
       buttoncancel.setEnabled(true);
       option = 1; //indicating that user has selected return
        
        Date d = new Date();
        departureDateChooser.setDate((d));
     
    }//GEN-LAST:event_radioonewayMouseClicked

    private void cmbdestinationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbdestinationItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbdestinationItemStateChanged

    private void cmbdestinationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbdestinationMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbdestinationMouseClicked

    private void radioreturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioreturnMouseClicked
    radiooneway.setEnabled(false);
       cmborigin.setEnabled(true);
       cmbdestination.setEnabled(true);
       departureDateChooser.setEnabled(true);
      returnDateChooser.setEnabled(true);
      buttonsearch.setEnabled(true);
       buttoncancel.setEnabled(true);
       option = 2;  //indicating that user has selected return
       
       Date d = new Date();
        departureDateChooser.setDate((d));
        returnDateChooser.setDate((d));
    }//GEN-LAST:event_radioreturnMouseClicked

    private void buttonsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonsearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonsearchKeyPressed

    private void cmboriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboriginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboriginActionPerformed

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
            java.util.logging.Logger.getLogger(FlightBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                try {
                    new FlightBooking().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttoncancel;
    private javax.swing.JButton buttonconfirm;
    private javax.swing.JButton buttonsearch;
    private javax.swing.JComboBox<String> cmbdestination;
    private javax.swing.JComboBox<String> cmborigin;
    private javax.swing.JComboBox<String> cmbreturnflight;
    private javax.swing.JComboBox<String> cmbselectdepartflight;
    private javax.swing.JPanel departtableJpanel;
    private javax.swing.JLabel departureDateChooser;
    private javax.swing.JTable departuretable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JRadioButton radiooneway;
    private javax.swing.JRadioButton radioreturn;
    private javax.swing.JLabel returnDateChooser;
    private javax.swing.JTable returntable;
    private javax.swing.JPanel returntableJpanel;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    
}
