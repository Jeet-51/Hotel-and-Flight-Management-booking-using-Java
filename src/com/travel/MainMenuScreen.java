
package com.travel;

import java.awt.Color;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainMenuScreen extends javax.swing.JFrame 
{

    
    public MainMenuScreen() 
    {
        initComponents();
        Color backgroundcolor = new Color (200,204,255);      //combination of colors
        this.getContentPane().setBackground(backgroundcolor);
        setVisible(true);
        setResizable(false);
        
        clockdisplay();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblflightbooking = new javax.swing.JLabel();
        lblhotelbooking = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 100));

        lblflightbooking.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        lblflightbooking.setText("Click here for Flight Booking");
        lblflightbooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblflightbookingMouseClicked(evt);
            }
        });

        lblhotelbooking.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        lblhotelbooking.setText("Click here for Hotel Booking");
        lblhotelbooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhotelbookingMouseClicked(evt);
            }
        });

        lbldate.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        lbldate.setForeground(new java.awt.Color(0, 102, 102));
        lbldate.setText("Date:");

        lbltime.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        lbltime.setForeground(new java.awt.Color(0, 102, 102));
        lbltime.setText("Time:");

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\Java Project\\Project\\flight.jpg")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\Java Project\\Project\\hotel.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 496, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltime, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblflightbooking))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblhotelbooking))
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblflightbooking)
                    .addComponent(lblhotelbooking))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(171, 171, 171)
                .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lbltime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblflightbookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblflightbookingMouseClicked
        try {
            // TODO add your handling code here:
            FlightBooking fb = new FlightBooking();
        } catch (SQLException ex) {
            Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblflightbookingMouseClicked

    private void lblhotelbookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhotelbookingMouseClicked
        // TODO add your handling code here:
        HotelBooking hb = new HotelBooking();
    }//GEN-LAST:event_lblhotelbookingMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblflightbooking;
    private javax.swing.JLabel lblhotelbooking;
    private javax.swing.JLabel lbltime;
    // End of variables declaration//GEN-END:variables

    private void clockdisplay() 
    {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int date = cal.get(Calendar.DATE);
        int year = cal.get(Calendar.YEAR);
        lbldate.setText("Date:"+date+"-"+(month+1)+"-"+year);
        
       
    Thread clocktime = new Thread() //this thread is for timer to run
      {
        public void run()
        {         
      
      try
      {
       
      while (true)
      {
      Calendar c = new GregorianCalendar();
          int hour = c.get(Calendar.HOUR);
      int min = c.get(Calendar.MINUTE);
      int sec = c.get(Calendar.SECOND);
      lbltime.setText("TIME :"+ hour + ":" + min + ":" + sec);
        
            
                sleep(1000);
      }   
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }; //end of thread
        clocktime.start();   //this to clock start
    }
}
