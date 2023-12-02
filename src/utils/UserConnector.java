/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import com.sun.jdi.connect.spi.Connection;
import models.User;

/**
 *
 * @author Maddala Nikhila Devi
 */
public class UserConnector {
         public static void addUser(User user) {
        //add to database
        String query = "INSERT INTO USER(name, email, password, role) VALUES(?,?)";
        try (Connection conn = DriverManager.getConnection(config.Config.DB_URL, config.Config.USERNAME, config.Config.PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());            
//            stmt.setString(3, user.getPassword());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
