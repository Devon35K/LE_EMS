/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminMenu.eventsmanengment;

import AdminMenu.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import ocatve.DatabaseManager;
/**
 *
 * @author Anggo
 */
public class DELETE_event extends javax.swing.JFrame {

    /**
     * Creates new form DELETE_event
     */
    public DELETE_event() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eventNameLabel = new javax.swing.JTextField();
        dateNameLabel = new javax.swing.JTextField();
        timeNameLabel = new javax.swing.JTextField();
        durationNameLabel = new javax.swing.JTextField();
        venueNameLabel = new javax.swing.JTextField();
        descriptionNameLabel = new javax.swing.JTextField();
        deleetebutton = new javax.swing.JButton();
        cancelBT = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        IDNameLabel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchBT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/deleteevnt.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 100, 100));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 177, 50, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Date:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 209, 50, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Time:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 239, 50, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setText("Duration:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 269, 70, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Venue:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 300, 50, 18));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Description");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 329, 80, -1));

        eventNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eventNameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventNameLabelActionPerformed(evt);
            }
        });
        jPanel1.add(eventNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 177, 170, -1));

        dateNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateNameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateNameLabelActionPerformed(evt);
            }
        });
        jPanel1.add(dateNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 207, 170, -1));

        timeNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        timeNameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeNameLabelActionPerformed(evt);
            }
        });
        jPanel1.add(timeNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 237, 170, -1));

        durationNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        durationNameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationNameLabelActionPerformed(evt);
            }
        });
        jPanel1.add(durationNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 267, 170, -1));

        venueNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        venueNameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venueNameLabelActionPerformed(evt);
            }
        });
        jPanel1.add(venueNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 297, 170, -1));

        descriptionNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descriptionNameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionNameLabelActionPerformed(evt);
            }
        });
        jPanel1.add(descriptionNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 327, 170, -1));

        deleetebutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleetebutton.setText("DELETE");
        deleetebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleetebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(deleetebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 90, 40));

        cancelBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelBT.setText("CANCEL");
        cancelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 90, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setText("EVENT ID:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 143, 80, -1));

        IDNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IDNameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDNameLabelActionPerformed(evt);
            }
        });
        jPanel1.add(IDNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 139, 77, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("DELETE EVENT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        searchBT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBT.setText("SEARCH");
        searchBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTActionPerformed(evt);
            }
        });
        jPanel1.add(searchBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 80, 26));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, 430));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventNameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventNameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventNameLabelActionPerformed

    private void dateNameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateNameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateNameLabelActionPerformed

    private void timeNameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeNameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeNameLabelActionPerformed

    private void durationNameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationNameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationNameLabelActionPerformed

    private void venueNameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venueNameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_venueNameLabelActionPerformed

    private void descriptionNameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionNameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionNameLabelActionPerformed

    private void deleetebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleetebuttonActionPerformed
        int eventId = Integer.parseInt(IDNameLabel.getText()); 
        deleteEvent(eventId);
    }//GEN-LAST:event_deleetebuttonActionPerformed

    private void cancelBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTActionPerformed
Admin admin = new Admin();
admin.setLocationRelativeTo(null);
        admin.setVisible(true);
        admin.getTabPane().setSelectedIndex(1); // Access TAB via the Admin instance
        setVisible(false); 
    }//GEN-LAST:event_cancelBTActionPerformed

    private void IDNameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDNameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDNameLabelActionPerformed

    private void searchBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTActionPerformed
        int eventId = Integer.parseInt(IDNameLabel.getText());
        searchEvent(eventId);
        
    }//GEN-LAST:event_searchBTActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Method to search and display event details based on the ID
private void searchEvent(int eventId) {
    String eventIdStr = IDNameLabel.getText();
    if (eventIdStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter an Event ID to search.", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
       
        String sql = "SELECT * FROM events WHERE id = ?";

        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setInt(1, eventId);
          ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                eventNameLabel.setText(rs.getString("name"));
                dateNameLabel.setText(rs.getString("date"));
                timeNameLabel.setText(rs.getString("time"));
                durationNameLabel.setText(rs.getString("duration"));
                venueNameLabel.setText(rs.getString("venue"));
                descriptionNameLabel.setText(rs.getString("description"));
            } else {
                JOptionPane.showMessageDialog(this, "Event not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to search for the event.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid Event ID format.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void deleteEvent(int eventId) {
    String eventIdStr = IDNameLabel.getText();
    if (eventIdStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Event ID cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        String sql = "DELETE FROM events WHERE id = ?";
        
        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            
            pstmt.setInt(1, eventId);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Event deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearFields(); // Clear fields after deletion
            } else {
                JOptionPane.showMessageDialog(this, "Event not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to delete the event.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid Event ID format.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void clearFields() {
        eventNameLabel.setText("");
        dateNameLabel.setText("");
        timeNameLabel.setText("");
        durationNameLabel.setText("");
        venueNameLabel.setText("");
        descriptionNameLabel.setText("");
        IDNameLabel.setText("");
    }
      
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
            java.util.logging.Logger.getLogger(DELETE_event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DELETE_event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DELETE_event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DELETE_event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DELETE_event().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDNameLabel;
    private javax.swing.JButton cancelBT;
    private javax.swing.JTextField dateNameLabel;
    private javax.swing.JButton deleetebutton;
    private javax.swing.JTextField descriptionNameLabel;
    private javax.swing.JTextField durationNameLabel;
    private javax.swing.JTextField eventNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton searchBT;
    private javax.swing.JTextField timeNameLabel;
    private javax.swing.JTextField venueNameLabel;
    // End of variables declaration//GEN-END:variables
}
