/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import models.Comment;

/**
 *
 * @author Likhitha
 */
public class CommentConnector {
    public static ArrayList<Comment> getAllCommentssByEvent(int id) {
        ArrayList<Comment> comments = new ArrayList<>();
        
        String query = "SELECT * FROM HuskyEvents.Comments WHERE event_id = "+ Integer.toString(id) + " ORDER BY id DESC;";
        try (Connection conn = DriverManager.getConnection(config.Config.DB_URL, config.Config.USERNAME, config.Config.PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Comment u = new Comment();
                u.setAuthor(rs.getString("author"));
                u.setComment(rs.getString("comment"));
                u.setEvent_id(rs.getInt("event_id"));
                u.setId(rs.getInt("id"));
                
                comments.add(u);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return comments;
    }
    
     public static boolean addComment(Comment comment) {
        //add to database
        String query = "INSERT INTO HuskyEvents.Comments(author, comment, event_id) VALUES(?,?,?)";
        try (java.sql.Connection conn = DriverManager.getConnection(config.Config.DB_URL, config.Config.USERNAME, config.Config.PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, comment.getAuthor());            
            stmt.setString(2, comment.getComment());
            stmt.setInt(3, comment.getEvent_id());
            int rows = stmt.executeUpdate();
            return true;
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    
    public static void main(String[] args) {
        var comments = CommentConnector.getAllCommentssByEvent(2);
        System.out.println(comments);
    }
}
