/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package OrganizerMenu.paymentmangement;

import OrganizerMenu.Organizer;
import ocatve.DatabaseManager;

import javax.swing.*;
/**
 *
 * @author Anggo
 */
public class add_payment extends javax.swing.JFrame {

    /**
     * Creates new form add_payment
     */
    public add_payment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        password_label = new javax.swing.JLabel();
        paybutton = new javax.swing.JButton();
        cancelbutton = new javax.swing.JButton();
        username_label = new javax.swing.JLabel();
        amount_field = new javax.swing.JTextField();
        admin_label = new javax.swing.JLabel();
        change_field = new javax.swing.JTextField();
        password_label1 = new javax.swing.JLabel();
        username_label1 = new javax.swing.JLabel();
        computebutton = new javax.swing.JButton();
        password_label2 = new javax.swing.JLabel();
        status_field = new javax.swing.JTextField();
        eventid_field = new javax.swing.JTextField();
        attendeeid_field2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password_label.setForeground(new java.awt.Color(255, 255, 255));
        password_label.setText("Attendee Id");
        getContentPane().add(password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 99, 35));

        paybutton.setBackground(new java.awt.Color(153, 153, 153));
        paybutton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        paybutton.setText("Pay");
        paybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybuttonActionPerformed(evt);
            }
        });
        getContentPane().add(paybutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 98, 33));

        cancelbutton.setBackground(new java.awt.Color(153, 153, 153));
        cancelbutton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        cancelbutton.setText("cancel");
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 101, 33));

        username_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username_label.setForeground(new java.awt.Color(255, 255, 255));
        username_label.setText("event id");
        getContentPane().add(username_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 99, 35));
        getContentPane().add(amount_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 140, 35));

        admin_label.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        admin_label.setForeground(new java.awt.Color(255, 255, 255));
        admin_label.setText("Payment");
        getContentPane().add(admin_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));
        getContentPane().add(change_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 90, 30));

        password_label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password_label1.setForeground(new java.awt.Color(255, 255, 255));
        password_label1.setText("Change");
        getContentPane().add(password_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 99, 35));

        username_label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username_label1.setForeground(new java.awt.Color(255, 255, 255));
        username_label1.setText("Amount");
        getContentPane().add(username_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 99, 35));

        computebutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        computebutton.setText("COMPUTE");
        computebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(computebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, 30));

        password_label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password_label2.setForeground(new java.awt.Color(255, 255, 255));
        password_label2.setText("status");
        getContentPane().add(password_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 99, 35));
        getContentPane().add(status_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 140, 35));
        getContentPane().add(eventid_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 140, 35));
        getContentPane().add(attendeeid_field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 140, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybuttonActionPerformed
try {
        int attendeeId = Integer.parseInt(eventid_field.getText());
        int eventId = Integer.parseInt(eventid_field.getText());
        double amount = Double.parseDouble(amount_field.getText());

        if (DatabaseManager.isAttendeeIdValid(attendeeId) && DatabaseManager.isEventIdValid(eventId)) {
            String status = amount == 100 ? "Paid" : "Unpaid";
            String method = "Cash"; // Replace with the actual method value if applicable
            DatabaseManager.insertPayment(attendeeId, eventId, amount, status, method);
            
            if (status.equals("Paid")) {
                JOptionPane.showMessageDialog(this, "Payment is fully paid.", "Payment Status", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Attendee ID or Event ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers for Attendee ID, Event ID, and Amount.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred while processing the payment.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_paybuttonActionPerformed

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
        Organizer log = new Organizer();
        log.setLocationRelativeTo(null);
        log.setVisible(true); // Corrected typo here
          log.getTabPane().setSelectedIndex(2); // Access TAB via the Admin instance
        setVisible(false);        // TODO add your handling code here:
        
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void computebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computebuttonActionPerformed
       try {
        double amount = Double.parseDouble(amount_field.getText());
        double paidAmount = 100;
        double change = paidAmount - amount;

        // Set the change in the change field
        change_field.setText(String.format("%.2f", change));

        // Determine and set the payment status
        if (change == 0) {
            status_field.setText("FULLY PAID");
        } else {
            status_field.setText("Not Paid");
        }

    } catch (NumberFormatException e) {
        change_field.setText("Invalid input");
        status_field.setText("Invalid input");
    }
    }//GEN-LAST:event_computebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(add_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_label;
    private javax.swing.JTextField amount_field;
    private javax.swing.JTextField attendeeid_field2;
    private javax.swing.JButton cancelbutton;
    private javax.swing.JTextField change_field;
    private javax.swing.JButton computebutton;
    private javax.swing.JTextField eventid_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel password_label;
    private javax.swing.JLabel password_label1;
    private javax.swing.JLabel password_label2;
    private javax.swing.JButton paybutton;
    private javax.swing.JTextField status_field;
    private javax.swing.JLabel username_label;
    private javax.swing.JLabel username_label1;
    // End of variables declaration//GEN-END:variables
}
