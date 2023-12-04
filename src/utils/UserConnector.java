/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.*;
import java.util.ArrayList;
import models.User;
import models.User;

/**
 *
 * @author Maddala Nikhila Devi
 */
public class UserConnector {
    
    public static boolean addUser(User user) {
        //add to database
        String query = "INSERT INTO HuskyEvents.users(name, email, password, role) VALUES(?,?,?,?)";
        try (java.sql.Connection conn = DriverManager.getConnection(config.Config.DB_URL, config.Config.USERNAME, config.Config.PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, user.getName());            
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getRole());
            int rows = stmt.executeUpdate();
            return true;
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
public static User loginUser(User user) {
       String query = "SELECT * FROM HuskyEvents.users WHERE Email = '" + user.getEmail() + "';";
       try (java.sql.Connection conn = DriverManager.getConnection(config.Config.DB_URL, config.Config.USERNAME, config.Config.PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next()){
                User u = new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("password"), rs.getString("role"));
                
                if(u.getPassword().equals(user.getPassword())){
                  return u;
                }else {
                  return null;
                }
            }
            
            return null;
                    
           
    } catch (SQLException e) {
        e.printStackTrace();
        return null;

    }
}


    /**
     * Edit given user details in the database
     * @param oldUser existing user in database
     * @param newUser modified user details to be added
     */
    public static User editUser(User oldUser, User newUser) {
        String query = "UPDATE HuskyEvents.users SET name=?, email=?, password=? WHERE id=?";

        try (Connection conn = DriverManager.getConnection(config.Config.DB_URL, config.Config.USERNAME, config.Config.PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, newUser.getName());
            stmt.setString(2, newUser.getEmail());
            stmt.setString(3, newUser.getPassword());
            stmt.setInt(4, oldUser.getId());
            stmt.executeUpdate();
            
            return newUser;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
          
}