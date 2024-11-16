/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminMenu.organizermaegement;

import AdminMenu.Admin;
import ocatve.DatabaseManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author Anggo
 */
public class EDIT_organizer extends javax.swing.JFrame {

    /**
     * Creates new form EDIT_event
     */
    public EDIT_organizer() {
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
        organizerNameLabel = new javax.swing.JTextField();
        organizerContactLabel = new javax.swing.JTextField();
        organizerPasswordLabel = new javax.swing.JTextField();
        savebutton = new javax.swing.JButton();
        cancelBT = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        organizerIDLabel = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/staff.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 100));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Password:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 90, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Contact:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, -1));

        organizerNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        organizerNameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizerNameLabelActionPerformed(evt);
            }
        });
        jPanel1.add(organizerNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 190, -1));

        organizerContactLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        organizerContactLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizerContactLabelActionPerformed(evt);
            }
        });
        jPanel1.add(organizerContactLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 190, -1));

        organizerPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        organizerPasswordLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizerPasswordLabelActionPerformed(evt);
            }
        });
        jPanel1.add(organizerPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 190, -1));

        savebutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        savebutton.setText("Save");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(savebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 102, 40));

        cancelBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelBT.setText("CANCEL");
        cancelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 90, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("EDIT ORGANIZER");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setText("Organizer ID:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, -1));

        organizerIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        organizerIDLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizerIDLabelActionPerformed(evt);
            }
        });
        jPanel1.add(organizerIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 100, -1));

        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 80, 26));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 310));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mainbackground.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 380, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void organizerNameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizerNameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizerNameLabelActionPerformed

    private void organizerContactLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizerContactLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizerContactLabelActionPerformed

    private void organizerPasswordLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizerPasswordLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizerPasswordLabelActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        // Validate inputs
    if (organizerIDLabel.getText().trim().isEmpty() ||
        organizerNameLabel.getText().trim().isEmpty() ||
        organizerContactLabel.getText().trim().isEmpty() ||
        organizerPasswordLabel.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int organizerID = Integer.parseInt(organizerIDLabel.getText().trim());

        // Call the update method
        updateOrganizer(organizerID);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid Organizer ID.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_savebuttonActionPerformed

    private void cancelBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTActionPerformed
        Admin admin = new Admin();
        admin.setLocationRelativeTo(null);
        admin.setVisible(true);
        admin.getTabPane().setSelectedIndex(4); // Access TAB via the Admin instance
        setVisible(false);  
    }//GEN-LAST:event_cancelBTActionPerformed

    private void organizerIDLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizerIDLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizerIDLabelActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
         int organizerID = Integer.parseInt(organizerIDLabel.getText());
        searchOrganizer(organizerID);
    }//GEN-LAST:event_searchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
      private void searchOrganizer(int organizerID) {
        String sql = "SELECT * FROM organizers WHERE id = ?";

        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setInt(1, organizerID);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                organizerNameLabel.setText(rs.getString("username"));
                organizerContactLabel.setText(rs.getString("contact"));
                organizerPasswordLabel.setText(rs.getString("password"));
            } else {
                JOptionPane.showMessageDialog(null, "Organizer not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void updateOrganizer(int organizerID) {
    String name = organizerNameLabel.getText().trim();
    String contact = organizerContactLabel.getText().trim();
    String password = organizerPasswordLabel.getText().trim();

    String sql = "UPDATE organizers SET username = ?, contact = ?, password = ? WHERE id = ?";

    try (Connection connection = DatabaseManager.getConnection();
         PreparedStatement pstmt = connection.prepareStatement(sql)) {

        pstmt.setString(1, name);
        pstmt.setString(2, contact);
        pstmt.setString(3, password);
        pstmt.setInt(4, organizerID);

        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Organizer updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                organizerNameLabel.setText("");
                organizerContactLabel.setText("");
                organizerPasswordLabel.setText("");
                organizerIDLabel.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "No organizer found with the given ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
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
            java.util.logging.Logger.getLogger(EDIT_organizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EDIT_organizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EDIT_organizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EDIT_organizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EDIT_organizer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBT;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField organizerContactLabel;
    private javax.swing.JTextField organizerIDLabel;
    private javax.swing.JTextField organizerNameLabel;
    private javax.swing.JTextField organizerPasswordLabel;
    private javax.swing.JButton savebutton;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
