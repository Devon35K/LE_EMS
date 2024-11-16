/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminMenu.attendeemanagement;

import AdminMenu.Admin;
import ocatve.DatabaseManager;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLException;
/**
 *
 * @author Anggo
 */
public class LIST_attendee extends javax.swing.JFrame {
  
    /**
     * Creates new form LIST_event
     */
    public LIST_attendee() {
       initComponents();
        loadAttendee("");
    }

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dashboard_Label5 = new javax.swing.JLabel();
        Separator6 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        attendeetable = new javax.swing.JTable();
        backbutton = new javax.swing.JButton();
        searchattendeebutton = new javax.swing.JButton();
        searchattendeelabel = new javax.swing.JTextField();
        countanttendee = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dashboard_Label5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Dashboard_Label5.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard_Label5.setText("List of Attendee");
        getContentPane().add(Dashboard_Label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 43, 160, -1));

        Separator6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Separator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 71, 169, 10));

        attendeetable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attendeetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ST2024-0001", "Andre M.", "Adiii@UN"},
                {"ST2024-00002", "Joemar A.", "Joemar@UN"},
                {"ST2024-0003", "Jan P.", "Jan@UN"},
                {"ST20240-0004", "Judi G.", "Judi@UN"},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Attendee ID", "Name", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(attendeetable);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 87, 530, 270));

        backbutton.setBackground(new java.awt.Color(204, 204, 204));
        backbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbutton.setText("BACK");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 377, 129, 32));

        searchattendeebutton.setBackground(new java.awt.Color(204, 204, 204));
        searchattendeebutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchattendeebutton.setText("SEARCH");
        searchattendeebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchattendeebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(searchattendeebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 90, 32));

        searchattendeelabel.setBackground(new java.awt.Color(153, 255, 255));
        searchattendeelabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchattendeelabelActionPerformed(evt);
            }
        });
        getContentPane().add(searchattendeelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 150, 30));

        countanttendee.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        countanttendee.setForeground(new java.awt.Color(255, 255, 255));
        countanttendee.setText("20");
        countanttendee.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                countanttendeeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(countanttendee, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 60, 70));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mainbackground.png"))); // NOI18N
        jLabel16.setText("jLabel4");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 630, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed

            Admin admin = new Admin();
            admin.setLocationRelativeTo(null);
            admin.setVisible(true);
            admin.getTabPane().setSelectedIndex(5); // Access TAB via the Admin instance
            setVisible(false);    
    }//GEN-LAST:event_backbuttonActionPerformed

    private void searchattendeebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchattendeebuttonActionPerformed
                 String searchTerm = searchattendeelabel.getText().trim();
        loadAttendee(searchTerm);
    }//GEN-LAST:event_searchattendeebuttonActionPerformed

    private void searchattendeelabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchattendeelabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchattendeelabelActionPerformed

    private void countanttendeeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_countanttendeeAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_countanttendeeAncestorAdded

    /**
     * @param args the command line arguments
     */
    
       
private void loadAttendee(String searchTerm) {
        DefaultTableModel model = (DefaultTableModel) attendeetable.getModel();
        model.setRowCount(0);  // Clear existing data

        String sql = "SELECT * FROM attendees WHERE id = ? OR name LIKE ? OR email LIKE ?";

        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, "%" + searchTerm + "%");
            pstmt.setString(2, "%" + searchTerm + "%");
            pstmt.setString(3, "%" + searchTerm + "%");

            try (ResultSet rs = pstmt.executeQuery()) {
                int count = 0;
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");

                    model.addRow(new Object[]{id, name, email});
                    count++;
                }
                countanttendee.setText(String.valueOf(count));  // Update the count label
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
            java.util.logging.Logger.getLogger(LIST_attendee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LIST_attendee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LIST_attendee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LIST_attendee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LIST_attendee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dashboard_Label5;
    private javax.swing.JSeparator Separator6;
    private javax.swing.JTable attendeetable;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel countanttendee;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton searchattendeebutton;
    private javax.swing.JTextField searchattendeelabel;
    // End of variables declaration//GEN-END:variables
}
