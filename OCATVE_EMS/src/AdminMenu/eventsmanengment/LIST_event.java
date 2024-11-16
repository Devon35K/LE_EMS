package AdminMenu.eventsmanengment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import AdminMenu.Admin;
import AttendeeMenu.logattendee;
import OrganizerMenu.Organizer;
import ocatve.DatabaseManager;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import ocatve.login;
/**
 *
 * @author Anggo
 */
public class LIST_event extends javax.swing.JFrame {
private int choice;
    /**
     * Creates new form LIST_event
     */
    public LIST_event(int choice) {
         this.choice = choice;
        initComponents();
          loadEvents("");
        
    }

    private LIST_event() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // Getters
    public int getChoice() {
        return choice;
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
        countevent = new javax.swing.JLabel();
        searcheventbutton = new javax.swing.JButton();
        searcheventlabel = new javax.swing.JTextField();
        backbutton = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        eventtable = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dashboard_Label5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Dashboard_Label5.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard_Label5.setText("List of Event");
        getContentPane().add(Dashboard_Label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

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
        getContentPane().add(countevent, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 60, 70));

        searcheventbutton.setBackground(new java.awt.Color(204, 204, 204));
        searcheventbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searcheventbutton.setText("SEARCH");
        searcheventbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searcheventbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(searcheventbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 90, 32));

        searcheventlabel.setBackground(new java.awt.Color(153, 255, 255));
        searcheventlabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searcheventlabelActionPerformed(evt);
            }
        });
        getContentPane().add(searcheventlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 150, 30));

        backbutton.setBackground(new java.awt.Color(204, 204, 204));
        backbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbutton.setText("BACK");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

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
        jScrollPane8.setViewportView(eventtable);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 480, 220));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mainbackground.png"))); // NOI18N
        jLabel16.setText("jLabel4");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void counteventAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_counteventAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_counteventAncestorAdded

    private void searcheventbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searcheventbuttonActionPerformed
        String searchTerm = searcheventlabel.getText().trim();
        loadEvents(searchTerm);
    }//GEN-LAST:event_searcheventbuttonActionPerformed

    private void searcheventlabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searcheventlabelActionPerformed
         
    }//GEN-LAST:event_searcheventlabelActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
         switch (choice) {
        case 1:
            Admin admin = new Admin();
            admin.setLocationRelativeTo(null);
            admin.setVisible(true);  
            admin.getTabPane().setSelectedIndex(1); // Access TAB via the Admin instance
            setVisible(false);
            break;
        case 2:
            Organizer organizer = new Organizer();
            organizer.setLocationRelativeTo(null);
            organizer.setVisible(true);
            organizer.getTabPane().setSelectedIndex(0); // Access TAB via the Admin instance
            setVisible(false);
            break;
        case 3:
            logattendee attendee = new logattendee();
            attendee.setLocationRelativeTo(null);
            attendee.setVisible(true);
            setVisible(false);
            break;
        default:
            // Handle the default case if needed
            System.out.println("Invalid choice: " + choice);
            break;
    }        // TODO add your handling code here:    // TODO add your handling code here:
    }//GEN-LAST:event_backbuttonActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new LIST_event().setVisible(true));java.awt.EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
            int choice = 0; // Default value, should be set according to your logic
            login loginInstance = new login(); // Assuming login is the class name
            if (loginInstance.adminbuttonLOG.isSelected()) {
                choice = 1;
            } else if (loginInstance.organizerbuttonLOG.isSelected()) {
                choice = 2;
            }else if (loginInstance.attendeebuttonLOG.isSelected()) {
                choice = 3;
            }
            
            new LIST_event(choice).setVisible(true);
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dashboard_Label5;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel countevent;
    private javax.swing.JTable eventtable;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JButton searcheventbutton;
    private javax.swing.JTextField searcheventlabel;
    // End of variables declaration//GEN-END:variables
}