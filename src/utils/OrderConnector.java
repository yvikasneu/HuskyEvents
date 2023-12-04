/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;


    
import java.sql.Connection;
import java.sql.DriverManager;
import models.Order;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.User;

/**
 *
 * @author pooja
 */
public class OrderConnector {
    public static boolean addOrder(Order order) {
        //add to database
        String query = "INSERT INTO HuskyEvents.Orders(user_id, event_id) VALUES(?,?)";
        try (java.sql.Connection conn = DriverManager.getConnection(config.Config.DB_URL, config.Config.USERNAME, config.Config.PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, order.getUser_id());            
            stmt.setInt(2, order.getEvent_id());
            int rows = stmt.executeUpdate();
            return true;
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    public static boolean deleteOrder(Order order) {
        String query = "delete from HuskyEvents.Orders where id = ?";

        try (java.sql.Connection conn = DriverManager.getConnection(config.Config.DB_URL, config.Config.USERNAME, config.Config.PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, order.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static Order getOrder(int event_id, int user_id) {
        String query = "SELECT * FROM HuskyEvents.Orders WHERE event_id = " + event_id + " AND user_id = " + user_id + ";";
       try (java.sql.Connection conn = DriverManager.getConnection(config.Config.DB_URL, config.Config.USERNAME, config.Config.PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next()){
                Order u = new Order(); 
                u.setId(rs.getInt("id"));
                u.setEvent_id(rs.getInt("event_id"));
                u.setUser_id(rs.getInt("user_id"));
                return u;
            }
            
            return null;
            
                    
    } catch (SQLException e) {
        e.printStackTrace();
        return null;

    }
    }
}
