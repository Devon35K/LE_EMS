package ocatve;

import javax.swing.*;
import java.sql.*;

public class DatabaseManager {

    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_NAME = "EventDB";
    private static final String FULL_DB_URL = URL + DB_NAME;
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void initializeDatabase() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            // Create database if it does not exist
            statement.executeUpdate("CREATE DATABASE IF NOT EXISTS " + DB_NAME);
            statement.executeUpdate("USE " + DB_NAME);
            System.out.println("Switched to database " + DB_NAME);

            // Create tables
            String createEventTable = "CREATE TABLE IF NOT EXISTS events (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(255) NOT NULL," +
                    "date DATE NOT NULL," +  // Changed to DATE type
                    "time TIME NOT NULL," +
                    "duration VARCHAR(50) NOT NULL," +
                    "venue VARCHAR(255) NOT NULL," +
                    "description TEXT" +
                    ")";
            statement.execute(createEventTable);

            String createAttendeeTable = "CREATE TABLE IF NOT EXISTS attendees (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(255) NOT NULL," +
                    "email VARCHAR(255) NOT NULL UNIQUE" +
                    ")";
            statement.execute(createAttendeeTable);

            String createPaymentTable = "CREATE TABLE IF NOT EXISTS payments (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "attendee_id INT NOT NULL," +
                    "event_id INT NOT NULL," +
                    "amount DOUBLE NOT NULL," +
                    "status VARCHAR(255) NOT NULL," +
                    "FOREIGN KEY (attendee_id) REFERENCES attendees(id)," +
                    "FOREIGN KEY (event_id) REFERENCES events(id)" +
                    ")";
            statement.execute(createPaymentTable);

            String createSupplyTable = "CREATE TABLE IF NOT EXISTS supplies (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(255) NOT NULL," +
                    "quantity DOUBLE NOT NULL," +
                    "price DOUBLE NOT NULL," +
                    "total DOUBLE NOT NULL," +
                    "event_id INT NOT NULL," +
                    "FOREIGN KEY (event_id) REFERENCES events(id)" +
                    ")";
            statement.execute(createSupplyTable);

            String createOrganizerTable = "CREATE TABLE IF NOT EXISTS organizers (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "username VARCHAR(255) NOT NULL UNIQUE," +
                    "contact VARCHAR(255) NOT NULL," +
                    "password VARCHAR(255) NOT NULL" +
                    ")";
            statement.execute(createOrganizerTable);

            String createFeedbackTable = "CREATE TABLE IF NOT EXISTS feedbacks (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "eventid INT NOT NULL," +
                    "attendeeid INT NOT NULL," +
                    "feedback_text TEXT NOT NULL," +
                    "FOREIGN KEY (attendeeid) REFERENCES attendees(id)," +
                    "FOREIGN KEY (eventid) REFERENCES events(id)" +
                    ")";
            statement.execute(createFeedbackTable);

            System.out.println("Tables created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to initialize the database.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(FULL_DB_URL, USER, PASSWORD);
    }
    
 public static boolean eventExists(String name, String date, String time, String duration, String venue, String description) {
        boolean exists = false;
        try (Connection conn = DriverManager.getConnection(FULL_DB_URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(
                 "SELECT COUNT(*) FROM events WHERE name = ? AND date = ? AND time = ? AND duration = ? AND venue = ? AND description = ?")) {

            pstmt.setString(1, name);
            pstmt.setString(2, date);
            pstmt.setString(3, time);
            pstmt.setString(4, duration);
            pstmt.setString(5, venue);
            pstmt.setString(6, description);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                exists = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exists;
    }
 
public static void insertPayment(int attendeeId, int eventId, double amount, String status, String method) {
    String sql = "INSERT INTO payments (attendee_id, event_id, amount, status, method) VALUES (?, ?, ?, ?, ?)";
    try (Connection connection = getConnection();
         PreparedStatement pstmt = connection.prepareStatement(sql)) {

        pstmt.setInt(1, attendeeId);
        pstmt.setInt(2, eventId);
        pstmt.setDouble(3, amount);
        pstmt.setString(4, status);
        pstmt.setString(5, method);  // Set the method field

        pstmt.executeUpdate();

        JOptionPane.showMessageDialog(null, "Payment inserted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Payment inserted successfully.");

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to insert the payment into the database.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public static void insertFeedback(int eventId, int attendeeId, String feedbackText) {
        String sql = "INSERT INTO feedbacks (eventid, attendeeid, feedback_text) VALUES (?, ?, ?)";
        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, eventId);
            pstmt.setInt(2, attendeeId);
            pstmt.setString(3, feedbackText);

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Feedback inserted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Feedback inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to insert the feedback into the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void insertSupply(String name, double quantity, double price, double total, int eventId) {
        String sql = "INSERT INTO supplies (name, quantity, price, total, event_id) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setDouble(2, quantity);
            pstmt.setDouble(3, price);
            pstmt.setDouble(4, total);
            pstmt.setInt(5, eventId);

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Supply inserted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Supply inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to insert the supply into the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void insertAttendee(String name, String email) {
        String sql = "INSERT INTO attendees (name, email) VALUES (?, ?)";
        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, email);

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Attendee inserted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Attendee inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to insert the attendee into the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void insertEvent(String name, String date, String time, String duration, String venue, String description) {
        String sql = "INSERT INTO events (name, date, time, duration, venue, description) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, date);
            pstmt.setString(3, time);
            pstmt.setString(4, duration);
            pstmt.setString(5, venue);
            pstmt.setString(6, description);
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Event inserted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Event inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to insert the event into the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void insertOrganizer(String username, String contact, String password) {
        String sql = "INSERT INTO organizers (username, contact, password) VALUES (?, ?, ?)";
        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, username);
            pstmt.setString(2, contact);
            pstmt.setString(3, password);
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Organizer inserted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Organizer inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to insert the organizer into the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static boolean isEventIdValid(int eventId) {
        String query = "SELECT COUNT(*) FROM events WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, eventId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0; // Check if the event exists
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Added error logging
        }
        return false; // If an exception occurs or no records are found
    }

    public static boolean isAttendeeIdValid(int attendeeId) {
        String query = "SELECT COUNT(*) FROM attendees WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, attendeeId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0; // Check if the attendee exists
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Added error logging
        }
        return false; // If an exception occurs or no records are found
    }

    public static void main(String[] args) {
        DatabaseManager.initializeDatabase();
        login log = new login();
        log.setLocationRelativeTo(null);
        log.setVisible(true);  // Display the login form
    }
}
