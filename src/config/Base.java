/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import javax.swing.JPanel;
import models.User;

/**
 *
 * @author Likhitha
 */
public class Base {
    private static Base instance;
    private JPanel parentLayoutPanel; 
    private JPanel mainCenterPnl;
    private User user;
    
    
    private Base(){
    }
    
    public static Base getInstance(){
        if(instance == null){
            instance = new Base(); 
        }
        
        return instance;
    }

    /**
     * @return the parentLayoutPanel
     */
    public JPanel getParentLayoutPanel() {
        return parentLayoutPanel;
    }

    /**
     * @param parentLayoutPanel the parentLayoutPanel to set
     */
    public void setParentLayoutPanel(JPanel parentLayoutPanel) {
        this.parentLayoutPanel = parentLayoutPanel;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the mainCenterPnl
     */
    public JPanel getMainCenterPnl() {
        return mainCenterPnl;
    }

    /**
     * @param mainCenterPnl the mainCenterPnl to set
     */
    public void setMainCenterPnl(JPanel mainCenterPnl) {
        this.mainCenterPnl = mainCenterPnl;
    }
    
    
    
    
}