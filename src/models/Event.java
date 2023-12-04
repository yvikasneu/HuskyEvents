/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;

/**
 *
 * @author Kamatam Sai Pujitha
 */
public class Event {
    private String title; 
    private String description; 
    private File file; 
    private float price; 
    private String location; 
    private int maxSlots; 
    private int avaibleSlots;
    private Date date; 
    private int id; 
    private BufferedImage image; 
    private int category_id;

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the file
     */
    public File getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the maxSlots
     */
    public int getMaxSlots() {
        return maxSlots;
    }

    /**
     * @param maxSlots the maxSlots to set
     */
    public void setMaxSlots(int maxSlots) {
        this.maxSlots = maxSlots;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the avaibleSlots
     */
    public int getAvaibleSlots() {
        return avaibleSlots;
    }

    /**
     * @param avaibleSlots the avaibleSlots to set
     */
    public void setAvaibleSlots(int avaibleSlots) {
        this.avaibleSlots = avaibleSlots;
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
     * @return the image
     */
    public BufferedImage getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(BufferedImage image) {
        this.image = image;
    }

    /**
     * @return the category_id
     */
    public int getCategory_id() {
        return category_id;
    }

    /**
     * @param category_id the category_id to set
     */
    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
    
}