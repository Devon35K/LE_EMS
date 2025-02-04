/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AttendeeMenu;

import AdminMenu.attendeemanagement.ADD_attendee;
import AdminMenu.eventsmanengment.LIST_event;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ocatve.DatabaseManager;
import ocatve.login;
/**
 *
 * @author Anggo
 */
public class logattendee extends javax.swing.JFrame {
private int choice = 0; // Define the choice variable at the class level

    /**
     * Creates new form logattendee
     */
    public logattendee() {
        initComponents();
        loadEvents("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searcheventbutton = new javax.swing.JButton();
        eventsearch = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        hiattendee = new javax.swing.JLabel();
        registerbutton = new javax.swing.JButton();
        feedbackbutton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        eventtable = new javax.swing.JTable();
        upcomingevent1 = new javax.swing.JLabel();
        listbutton = new javax.swing.JButton();
        searcheventlabel = new javax.swing.JTextField();
        searcheventbutton2 = new javax.swing.JButton();
        countevent = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        searcheventbutton.setBackground(new java.awt.Color(204, 204, 204));
        searcheventbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searcheventbutton.setText("SEARCH");
        searcheventbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searcheventbuttonActionPerformed(evt);
            }
        });

        eventsearch.setBackground(new java.awt.Color(153, 255, 255));
        eventsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventsearchActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hiattendee.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        hiattendee.setForeground(new java.awt.Color(255, 255, 255));
        hiattendee.setText("Hi Attendee !");
        jPanel1.add(hiattendee, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        registerbutton.setBackground(new java.awt.Color(153, 153, 153));
        registerbutton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        registerbutton.setText("Register");
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(registerbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 98, 33));

        feedbackbutton.setBackground(new java.awt.Color(153, 153, 153));
        feedbackbutton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        feedbackbutton.setText("Feedback");
        feedbackbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(feedbackbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 101, 33));

        exitbutton.setBackground(new java.awt.Color(153, 153, 153));
        exitbutton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        exitbutton.setText("Exit");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(exitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 101, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/attendee.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 52, -1, -1));

        eventtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Event ID", "Name", "Date", "Time", "Hour", "Venue", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(eventtable);

        jPanel1.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 470, 220));

        upcomingevent1.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        upcomingevent1.setForeground(new java.awt.Color(255, 255, 255));
        upcomingevent1.setText("Upcoming Event!");
        jPanel1.add(upcomingevent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        listbutton.setBackground(new java.awt.Color(204, 204, 204));
        listbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listbutton.setText("list");
        listbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(listbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 40, 20));

        searcheventlabel.setBackground(new java.awt.Color(153, 255, 255));
        searcheventlabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searcheventlabelActionPerformed(evt);
            }
        });
        jPanel1.add(searcheventlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 150, 30));

        searcheventbutton2.setBackground(new java.awt.Color(204, 204, 204));
        searcheventbutton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searcheventbutton2.setText("SEARCH");
        searcheventbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searcheventbutton2ActionPerformed(evt);
            }
        });
        jPanel1.add(searcheventbutton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 90, 32));

        countevent.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        countevent.setForeground(new java.awt.Color(255, 255, 255));
        countevent.setText("20");
        countevent.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                counteventAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(countevent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 60, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mainbackground.png"))); // NOI18N
        background.setText("jLabel2");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed
       choice = 3; // Update the choice variable
    ADD_attendee add = new ADD_attendee(choice, "", ""); // Pass the choice value to the constructor
    add.setLocationRelativeTo(null);
    add.setVisible(true); // Corrected typo here
    setVisible(false); 
    }//GEN-LAST:event_registerbuttonActionPerformed

    private void feedbackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackbuttonActionPerformed
             Feedback feedback = new Feedback();
             feedback.setLocationRelativeTo(null);
        feedback.setVisible(true); // Corrected typo here
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_feedbackbuttonActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        // TODO add your handling code here:
        login log = new login();
        log.setLocationRelativeTo(null);
        log.setVisible(true); // Corrected typo here
        setVisible(false);
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void searcheventbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searcheventbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searcheventbuttonActionPerformed

    private void eventsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventsearchActionPerformed

    private void listbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listbuttonActionPerformed
 choice = 3; // Correctly update the choice variable     
        LIST_event list = new LIST_event(choice);
        list.setLocationRelativeTo(null);
        list.setVisible(true); // Corrected typo here
        setVisible(false);

    }//GEN-LAST:event_listbuttonActionPerformed

    private void searcheventlabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searcheventlabelActionPerformed

    }//GEN-LAST:event_searcheventlabelActionPerformed

    private void searcheventbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searcheventbutton2ActionPerformed
        String searchTerm = searcheventlabel.getText().trim();
        loadEvents(searchTerm);
    }//GEN-LAST:event_searcheventbutton2ActionPerformed

    private void counteventAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_counteventAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_counteventAncestorAdded

    /**
     * @param args the command line arguments
     */
    private void loadEvents(String searchTerm) {
        DefaultTableModel model = (DefaultTableModel) eventtable.getModel();
        model.setRowCount(0); // Clear existing data

        String sql = "SELECT * FROM events WHERE id LIKE ? OR name LIKE ? OR date LIKE ?";

        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            String likeSearchTerm = "%" + searchTerm + "%";
            pstmt.setString(1, likeSearchTerm);
            pstmt.setString(2, likeSearchTerm);
            pstmt.setString(3, likeSearchTerm);

            try (ResultSet rs = pstmt.executeQuery()) {
                int count = 0;
                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("date"),
                        rs.getString("time"),
                        rs.getString("duration"),
                        rs.getString("venue"),
                        rs.getString("description")
                    });
                    count++;
                }
                countevent.setText(String.valueOf(count));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to load events: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(logattendee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logattendee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logattendee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logattendee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logattendee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel countevent;
    private javax.swing.JTextField eventsearch;
    private javax.swing.JTable eventtable;
    private javax.swing.JButton exitbutton;
    private javax.swing.JButton feedbackbutton;
    private javax.swing.JLabel hiattendee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JButton listbutton;
    private javax.swing.JButton registerbutton;
    private javax.swing.JButton searcheventbutton;
    private javax.swing.JButton searcheventbutton2;
    private javax.swing.JTextField searcheventlabel;
    private javax.swing.JLabel upcomingevent1;
    // End of variables declaration//GEN-END:variables
}
