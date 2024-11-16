/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package OrganizerMenu.paymentmangement;

import OrganizerMenu.Organizer;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import ocatve.DatabaseManager;

/**
 *
 * @author Anggo
 */
public class view_payment extends javax.swing.JFrame {

    /**
     * Creates new form view_payment
     */
  public view_payment() {
        initComponents();
        loadpayment(""); // Load all payments initially
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
        paymenttable = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dashboard_Label5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Dashboard_Label5.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard_Label5.setText("List of payment");
        getContentPane().add(Dashboard_Label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6, -1, -1));

        Separator6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Separator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 34, 169, 10));

        paymenttable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        paymenttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Payment ID", "Attendee ID", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(paymenttable);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 530, 270));

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setText("BACK");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 129, 32));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mainbackground.png"))); // NOI18N
        jLabel16.setText("jLabel4");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 620, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Organizer log = new Organizer();
        log.setLocationRelativeTo(null);
        log.setVisible(true); // Corrected typo here
         log.getTabPane().setSelectedIndex(2); // Access TAB via the Admin instance
        setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
     private void loadpayment(String searchTerm) {
        DefaultTableModel model = (DefaultTableModel) paymenttable.getModel();
        model.setRowCount(0);  // Clear existing data

        String sql = "SELECT * FROM payments WHERE id = ? OR attendee_id LIKE ? OR event_id LIKE ? OR status LIKE ?";

        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            if (searchTerm.matches("\\d+")) {  // Check if the searchTerm is numeric (ID)
                pstmt.setInt(1, Integer.parseInt(searchTerm));
            } else {
                pstmt.setNull(1, java.sql.Types.INTEGER);
            }

            pstmt.setString(2, "%" + searchTerm + "%");  // Set the search term for attendee_id
            pstmt.setString(3, "%" + searchTerm + "%");  // Set the search term for event_id
            pstmt.setString(4, "%" + searchTerm + "%");  // Set the search term for status

            try (ResultSet rs = pstmt.executeQuery()) {
                int count = 0;
                while (rs.next()) {
                    int id = rs.getInt("id");
                    int attendeeId = rs.getInt("attendee_id");
                    String status = rs.getString("status");

                    model.addRow(new Object[]{id, attendeeId,  status});
                    count++;
                }
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
            java.util.logging.Logger.getLogger(view_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dashboard_Label5;
    private javax.swing.JSeparator Separator6;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable paymenttable;
    // End of variables declaration//GEN-END:variables
}