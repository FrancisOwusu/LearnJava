/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.bookingsystem;

/**
 *
 * @author HP
 */
import java.util.List;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Movie {
    private String id;
    private String title;
    private double price;
    private String releaseDate;
    private List<String> showTimes;
    
    public Movie(String id, String title, double price, String releaseDate, List<String> showTimes) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.releaseDate = releaseDate;
        this.showTimes = showTimes;
    }
    
    public String getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getReleaseDate() {
        return releaseDate;
    }
    
    public List<String> getShowTimes() {
        return showTimes;
    }
    
    public void bookShowTime(String showTime) {
        showTimes.remove(showTime);
    }
    
    @Override
    public String toString() {
        return id + "," + title + "," + price + "," + releaseDate + "," + String.join(";", showTimes);
    }
}


