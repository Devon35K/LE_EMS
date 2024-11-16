/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminMenu.repormangement;

import AdminMenu.Admin;
import ocatve.DatabaseManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Anggo
 */
public class financialSUM extends javax.swing.JFrame {

    /**
     * Creates new form financialSUM
     */
    public financialSUM() {
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

        Dashboard_Label5 = new javax.swing.JLabel();
        Separator6 = new javax.swing.JSeparator();
        backbutton = new javax.swing.JButton();
        username_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        netprofit = new javax.swing.JTextField();
        username_label1 = new javax.swing.JLabel();
        username_label2 = new javax.swing.JLabel();
        username_label3 = new javax.swing.JLabel();
        searcheventbutton = new javax.swing.JButton();
        eventid = new javax.swing.JTextField();
        eventname = new javax.swing.JTextField();
        totalpayment = new javax.swing.JTextField();
        suppliescoust = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dashboard_Label5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Dashboard_Label5.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard_Label5.setText("FINANCIAL SUMMARY");
        getContentPane().add(Dashboard_Label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        Separator6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Separator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 210, 20));

        backbutton.setBackground(new java.awt.Color(204, 204, 204));
        backbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbutton.setText("BACK");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 129, 32));

        username_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username_label.setForeground(new java.awt.Color(255, 255, 255));
        username_label.setText("Total Supplies Cost");
        getContentPane().add(username_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 140, 35));

        password_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password_label.setForeground(new java.awt.Color(255, 255, 255));
        password_label.setText("Net Profit/Loss");
        getContentPane().add(password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 180, 35));
        getContentPane().add(netprofit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 130, 35));

        username_label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username_label1.setForeground(new java.awt.Color(255, 255, 255));
        username_label1.setText("Name");
        getContentPane().add(username_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 99, 35));

        username_label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username_label2.setForeground(new java.awt.Color(255, 255, 255));
        username_label2.setText("Total Payments Received");
        getContentPane().add(username_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, 35));

        username_label3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username_label3.setForeground(new java.awt.Color(255, 255, 255));
        username_label3.setText("Event ID");
        getContentPane().add(username_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 99, 35));

        searcheventbutton.setBackground(new java.awt.Color(204, 204, 204));
        searcheventbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searcheventbutton.setText("SEARCH");
        searcheventbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searcheventbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(searcheventbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 120, 32));
        getContentPane().add(eventid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 110, 35));
        getContentPane().add(eventname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 130, 35));
        getContentPane().add(totalpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 130, 35));
        getContentPane().add(suppliescoust, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 130, 35));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mainbackground.png"))); // NOI18N
        jLabel16.setText("jLabel4");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
 Admin admin = new Admin();
 admin.setLocationRelativeTo(null);
        admin.setVisible(true);
        admin.getTabPane().setSelectedIndex(5); // Access TAB via the Admin instance
        setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_backbuttonActionPerformed

    private void searcheventbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searcheventbuttonActionPerformed
 String eventIdStr = eventid.getText().trim();

        if (eventIdStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Event ID cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int eventId = Integer.parseInt(eventIdStr);

            try (Connection connection = DatabaseManager.getConnection()) {
                // Retrieve Event Name
                String eventNameQuery = "SELECT name FROM events WHERE id = ?";
                try (PreparedStatement pstmt = connection.prepareStatement(eventNameQuery)) {
                    pstmt.setInt(1, eventId);
                    try (ResultSet rs = pstmt.executeQuery()) {
                        if (rs.next()) {
                            eventname.setText(rs.getString("name"));
                        } else {
                            JOptionPane.showMessageDialog(this, "Event not found.", "Error", JOptionPane.ERROR_MESSAGE);
                            // Clear fields if event not found
                            totalpayment.setText("0.00");
                            suppliescoust.setText("0.00");
                            netprofit.setText("0.00");
                            return;
                        }
                    }
                }

                // Retrieve Total Payments Received
                String paymentsQuery = "SELECT COALESCE(SUM(amount), 0) AS total_payments FROM payments WHERE event_id = ?";
                try (PreparedStatement pstmt = connection.prepareStatement(paymentsQuery)) {
                    pstmt.setInt(1, eventId);
                    try (ResultSet rs = pstmt.executeQuery()) {
                        if (rs.next()) {
                            totalpayment.setText(String.format("%.2f", rs.getDouble("total_payments")));
                        } else {
                            totalpayment.setText("0.00");
                        }
                    }
                }

                // Retrieve Total Supplies Cost
                String suppliesQuery = "SELECT COALESCE(SUM(price), 0) AS total_supplies FROM supplies WHERE event_id = ?";
                try (PreparedStatement pstmt = connection.prepareStatement(suppliesQuery)) {
                    pstmt.setInt(1, eventId);
                    try (ResultSet rs = pstmt.executeQuery()) {
                        if (rs.next()) {
                            suppliescoust.setText(String.format("%.2f", rs.getDouble("total_supplies")));
                        } else {
                            suppliescoust.setText("0.00");
                        }
                    }
                }

                // Calculate Net Profit/Loss
                double totalPayments = Double.parseDouble(totalpayment.getText());
                double totalSupplies = Double.parseDouble(suppliescoust.getText());
                double netProfitLoss = totalPayments - totalSupplies;
                netprofit.setText(String.format("%.2f", netProfitLoss));

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid Event ID format.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searcheventbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(financialSUM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(financialSUM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(financialSUM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(financialSUM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new financialSUM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dashboard_Label5;
    private javax.swing.JSeparator Separator6;
    private javax.swing.JButton backbutton;
    private javax.swing.JTextField eventid;
    private javax.swing.JTextField eventname;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JTextField netprofit;
    private javax.swing.JLabel password_label;
    private javax.swing.JButton searcheventbutton;
    private javax.swing.JTextField suppliescoust;
    private javax.swing.JTextField totalpayment;
    private javax.swing.JLabel username_label;
    private javax.swing.JLabel username_label1;
    private javax.swing.JLabel username_label2;
    private javax.swing.JLabel username_label3;
    // End of variables declaration//GEN-END:variables
}
