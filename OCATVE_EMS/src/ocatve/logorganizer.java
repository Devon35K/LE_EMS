/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ocatve;

import AdminMenu.organizermaegement.ADD_organizer;
import OrganizerMenu.Organizer;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import AdminMenu.Admin;
import OrganizerMenu.Organizer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anggo
 */
public class logorganizer extends javax.swing.JFrame {

    /**
     * Creates new form logorganizer
     */
    public logorganizer() {
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
        username_field = new javax.swing.JTextField();
        hiorganizer_label = new javax.swing.JLabel();
        organizer_label = new javax.swing.JLabel();
        password_text_filed = new javax.swing.JPasswordField();
        password_label = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        cancelbutton = new javax.swing.JButton();
        signinbutton = new javax.swing.JButton();
        organizerpic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(username_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 181, 157, 35));

        hiorganizer_label.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        hiorganizer_label.setForeground(new java.awt.Color(255, 255, 255));
        hiorganizer_label.setText("Hi Organizer!");
        jPanel1.add(hiorganizer_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        organizer_label.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        organizer_label.setForeground(new java.awt.Color(255, 255, 255));
        organizer_label.setText("ORGANIZER");
        jPanel1.add(organizer_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        password_text_filed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_text_filedActionPerformed(evt);
            }
        });
        jPanel1.add(password_text_filed, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 226, 157, 35));

        password_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password_label.setForeground(new java.awt.Color(255, 255, 255));
        password_label.setText("Password :");
        jPanel1.add(password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 226, 99, 35));

        username_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username_label.setForeground(new java.awt.Color(255, 255, 255));
        username_label.setText("Username :");
        jPanel1.add(username_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 181, 99, 35));

        cancelbutton.setBackground(new java.awt.Color(153, 153, 153));
        cancelbutton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        cancelbutton.setText("cancel");
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 279, 101, 33));

        signinbutton.setBackground(new java.awt.Color(153, 153, 153));
        signinbutton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        signinbutton.setText("Sign In");
        signinbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(signinbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 279, 98, 33));

        organizerpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/organizer.png"))); // NOI18N
        jPanel1.add(organizerpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 65, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void password_text_filedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_text_filedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_text_filedActionPerformed

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
        // TODO add your handling code here:
        login log = new login();
        log.setLocationRelativeTo(null);
        log.setVisible(true); // Corrected typo here
        setVisible(false);
        
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void signinbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbuttonActionPerformed
   
        // Retrieve the input from text fields
        String username = username_field.getText().trim();
        String password = new String(password_text_filed.getPassword()).trim();

        // Check if input fields are not empty
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username and password cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Find the organizer from the database
        ADD_organizer organizer = findOrganizerByName(username);
        if (organizer != null && organizer.getPassword().equals(password)) {
            System.out.println("Login successful as " + username);
            // Open the organizer's main menu
            Organizer organizerMenu = new Organizer();
            organizerMenu.setLocationRelativeTo(null);
            organizerMenu.setVisible(true);
            setVisible(false);
        } else {
            // Show error message if credentials are invalid
            JOptionPane.showMessageDialog(this, "Invalid username or password. Please input the correct username or password.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_signinbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    
   public static ADD_organizer findOrganizerByName(String name) {
        String sql = "SELECT * FROM organizers WHERE username = ?";
        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new ADD_organizer(rs.getString("username"), rs.getString("contact"), rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to retrieve organizer information.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
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
            java.util.logging.Logger.getLogger(logorganizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logorganizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logorganizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logorganizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logorganizer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbutton;
    private javax.swing.JLabel hiorganizer_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel organizer_label;
    private javax.swing.JLabel organizerpic;
    private javax.swing.JLabel password_label;
    private javax.swing.JPasswordField password_text_filed;
    private javax.swing.JButton signinbutton;
    private javax.swing.JTextField username_field;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables

  
}
