/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import models.Event;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author vikas
 */
public class EventConnector {
     public static boolean addEvent(Event event) {
        //add to database
        String query = "INSERT INTO HuskyEvents.Events(title, description, date, location, max_slots, available_slots, price, image_data, category_id) VALUES(?,?,?,?,?,?,?,?,?)";
        try (java.sql.Connection conn = DriverManager.getConnection(config.Config.DB_URL, config.Config.USERNAME, config.Config.PASSWORD)) {
            
            
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, event.getTitle());            
            stmt.setString(2, event.getDescription());
            stmt.setDate(3,  new java.sql.Date(event.getDate().getTime()));
            stmt.setString(4, event.getLocation());            
            stmt.setInt(5, event.getMaxSlots());            
            stmt.setInt(6, event.getMaxSlots());
            stmt.setFloat(7, event.getPrice());
            FileInputStream fis = new FileInputStream(event.getFile());
            stmt.setBinaryStream(8, fis, (int) event.getFile().length());
            stmt.setInt(9, event.getCategory_id());            
            int rows = stmt.executeUpdate();
            return true;
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
     
     
    
    public static ArrayList<Event> getAllEvents() {
        ArrayList<Event> events = new ArrayList<>();

        String query = "SELECT * FROM HuskyEvents.Events WHERE date >= NOW();";
        try (Connection conn = DriverManager.getConnection(config.Config.DB_URL, config.Config.USERNAME, config.Config.PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Event u = new Event();
                u.setTitle(rs.getString("title"));
                u.setDescription(rs.getString("description"));
                u.setLocation(rs.getString("location"));
                u.setDate(rs.getDate("date"));
                u.setMaxSlots(rs.getInt("max_slots"));
                u.setAvaibleSlots(rs.getInt("available_slots"));
                u.setId(rs.getInt("id"));
                u.setPrice(rs.getInt("price"));
                u.setCategory_id(rs.getInt("category_id"));
                var myBlob = rs.getBinaryStream("image_data"); 
                BufferedImage im = ImageIO.read(myBlob);
                u.setImage(im);
                events.add(u);
            }
            rs.close();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

        return events;
}
    
    public static ArrayList<Event> getAllRegisteredEvents(int user_id) {
        ArrayList<Event> events = new ArrayList<>();

        String query = "SELECT HuskyEvents.Events.* FROM HuskyEvents.Orders JOIN HuskyEvents.Events ON HuskyEvents.Orders.event_id = HuskyEvents.Events.id WHERE HuskyEvents.Orders.user_id = " + user_id + ";" ;
        try (Connection conn = DriverManager.getConnection(config.Config.DB_URL, config.Config.USERNAME, config.Config.PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Event u = new Event();
                u.setTitle(rs.getString("title"));
                u.setDescription(rs.getString("description"));
                u.setLocation(rs.getString("location"));
                u.setDate(rs.getDate("date"));
                u.setMaxSlots(rs.getInt("max_slots"));
                u.setAvaibleSlots(rs.getInt("available_slots"));
                u.setId(rs.getInt("id"));
                u.setPrice(rs.getInt("price"));
                u.setCategory_id(rs.getInt("category_id"));
                var myBlob = rs.getBinaryStream("image_data"); 
                BufferedImage im = ImageIO.read(myBlob);
                u.setImage(im);
                events.add(u);
            }
            rs.close();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

        return events;
}
    
    
    public static ArrayList<Event> getAllEventsByCategory(int id) {
        ArrayList<Event> events = new ArrayList<>();

        String query = "SELECT * FROM HuskyEvents.Events WHERE category_id = "+ Integer.toString(id) + ";";
        try (Connection conn = DriverManager.getConnection(config.Config.DB_URL, config.Config.USERNAME, config.Config.PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Event u = new Event();
                u.setTitle(rs.getString("title"));
                u.setDescription(rs.getString("description"));
                u.setLocation(rs.getString("location"));
                u.setDate(rs.getDate("date"));
                u.setMaxSlots(rs.getInt("max_slots"));
                u.setAvaibleSlots(rs.getInt("available_slots"));
                u.setId(rs.getInt("id"));
                u.setPrice(rs.getInt("price"));
                u.setCategory_id(rs.getInt("category_id"));
                var myBlob = rs.getBinaryStream("image_data"); 
                BufferedImage im = ImageIO.read(myBlob);
                u.setImage(im);
                events.add(u);
            }
            rs.close();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

        return events;
    }
    
    
    public static void main(String[] args) {
        var events = EventConnector.getAllEventsByCategory(0);
        System.out.print(events);
    }

    
}
