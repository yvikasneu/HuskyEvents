/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Maddala Nikhila Devi
 */
public class User {
    private String name; 
    private String email; 
    private String role; 
    private int id; 
    private int password; 
    
    
    public User(){};

    public User(int id, String name, String email, String role){
        this.name = name; 
        this.id = id; 
        this.role = role; 
        this.email = email; 
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * @return the id
     */
    public int getPassword() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setPassword(int id) {
        this.id = id;
    }
}