/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminMenu.attendeemanagement;

import AdminMenu.Admin;
import AdminMenu.eventsmanengment.*;
import AttendeeMenu.logattendee;
import OrganizerMenu.Organizer;
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
public class ADD_attendee extends javax.swing.JFrame {
    private int choice;
    private String name;
    private String email;
    private int eventId; // Add event ID as a member variable
    /**
     * Creates new form ADD_ADMIN
     */
    public ADD_attendee(int choice,String name, String email) {
        this.choice = choice;
        this.name = name;
        this.email = email;
        initComponents();
        loadEvents(""); // Load events when the form is initialized
    }

    private ADD_attendee() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        public int getChoice() {
        return choice;
    }
        // Getters
    public String getUsername() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        eventIDLabel = new javax.swing.JTextField();
        attendeeNameLabel = new javax.swing.JTextField();
        attendeeEmailLabel = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        cancelbutton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Dashboard_Label5 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        eventtable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("DELETE EVENT");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/attendee.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 103, 100));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 50, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("EVENT to register");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Contact:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 319, 80, -1));

        eventIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eventIDLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventIDLabelActionPerformed(evt);
            }
        });
        jPanel1.add(eventIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 140, -1));

        attendeeNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attendeeNameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendeeNameLabelActionPerformed(evt);
            }
        });
        jPanel1.add(attendeeNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 140, -1));

        attendeeEmailLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attendeeEmailLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendeeEmailLabelActionPerformed(evt);
            }
        });
        jPanel1.add(attendeeEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 140, -1));

        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registerButton.setText("REGISTER");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 102, 40));

        cancelbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelbutton.setText("CANCEL");
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 90, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("ADD ATTENDEE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        Dashboard_Label5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Dashboard_Label5.setText("List of Events");
        jPanel1.add(Dashboard_Label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        eventtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Event ID", "Name", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(eventtable);

        jPanel1.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 310, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 340, 410));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mainbackground.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 380, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
      // Get values from the GUI components
        String name = attendeeNameLabel.getText().trim();
        String email = attendeeEmailLabel.getText().trim();
        String eventIdText = eventIDLabel.getText().trim();

        try {
            int eventId = Integer.parseInt(eventIdText);
            // Call the method to add the attendee
            addAttendee(name, email, eventId);  
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Event ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
   switch (choice) {
        case 1:
            Admin admin = new Admin();
            admin.setLocationRelativeTo(null);
            admin.setVisible(true);
           
            admin.getTabPane().setSelectedIndex(2); // Access TAB via the Admin instance
            setVisible(false);
            break;
        case 2:
            Organizer organizer = new Organizer();
            organizer.setLocationRelativeTo(null);
            organizer.setVisible(true);
            organizer.getTabPane().setSelectedIndex(1); // Access TAB via the Admin instance
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
    }
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void eventIDLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventIDLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventIDLabelActionPerformed

    private void attendeeNameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendeeNameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attendeeNameLabelActionPerformed

    private void attendeeEmailLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendeeEmailLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attendeeEmailLabelActionPerformed

    /**
     * @param args the command line arguments
     */
    
     private void addAttendee(String name, String email, int eventId) {
    // Validate input fields
    if (name == null || email == null || name.trim().isEmpty() || email.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Name and Email cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check if the event ID exists in the database
    if (!isEventIdValid(eventId)) {
        JOptionPane.showMessageDialog(null, "Invalid Event ID.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Insert attendee into the database
    DatabaseManager.insertAttendee(name.trim(), email.trim());

    // Retrieve the ID of the newly inserted attendee
    int attendeeId = getAttendeeId(name.trim(), email.trim());
    if (attendeeId != -1) {
        // You can add payment details if needed
        // DatabaseManager.insertPayment(attendeeId, eventId, 0.0, "Not Paid", "Pending");
    }

    // Clear the fields
    attendeeNameLabel.setText("");
    attendeeEmailLabel.setText("");
    eventIDLabel.setText(""); // Clear event ID field
}

private boolean isEventIdValid(int eventId) {
    String sql = "SELECT COUNT(*) FROM events WHERE id = ?";
    try (Connection connection = DatabaseManager.getConnection();
         PreparedStatement pstmt = connection.prepareStatement(sql)) {

        pstmt.setInt(1, eventId);

        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1) > 0; // Return true if count > 0, meaning event exists
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Failed to validate event ID: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    return false; // Return false if event ID is not valid or query fails
}
    
    private int getAttendeeId(String name, String email) {
        // Retrieve the ID of the newly inserted attendee based on name and email
        String sql = "SELECT id FROM attendees WHERE name = ? AND email = ?";
        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, email);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("id");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to retrieve attendee ID: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return -1; // Return -1 if attendee ID not found
    }
    
    
    private void loadEvents(String searchTerm) {
    if (eventtable == null || eventtable.getModel() == null) {
        System.out.println("eventtable or its model is null");
        return;
    }

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
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("date"),
                });
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Failed to load events: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    // ... existing Nimbus look and feel setup code ...

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        
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
            
            new ADD_attendee(choice, "", "").setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dashboard_Label5;
    private javax.swing.JTextField attendeeEmailLabel;
    private javax.swing.JTextField attendeeNameLabel;
    private javax.swing.JButton cancelbutton;
    private javax.swing.JTextField eventIDLabel;
    private javax.swing.JTable eventtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables

    private Organizer newOrganizer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
