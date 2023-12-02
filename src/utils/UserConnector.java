/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.User;

/**
 *
 * @author Maddala Nikhila Devi
 */
public class UserConnector {
    public static void addUser(User user) {
        //add to database
        String query = "INSERT INTO HuskyEvents.users(name, email, password, role) VALUES(?,?,?,?)";
        try (java.sql.Connection conn = DriverManager.getConnection(config.Config.DB_URL, config.Config.USERNAME, config.Config.PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, user.getName());            
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getRole());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public static User loginUser(User user) {
        //add to database
        String query = "SELECT * FROM HuskyEvents.users WHERE Email = '" + user.getEmail() + "';";
        System.out.println(query);
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
          
    public static void main(String[] args) {
       var res =  UserConnector.loginUser(new User(0,"null", "test@gmail.com", "1234", "null"));
        System.out.println(res.getEmail() + " " + res.getPassword());
    }
}