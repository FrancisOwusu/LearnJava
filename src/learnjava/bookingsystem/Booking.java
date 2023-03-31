/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.bookingsystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author HP
 */
public class Booking {
    private String transactionId;
    private String customerName;
    private LocalDateTime showDateTime;
    private String movieId;
    
    public Booking(String transactionId, String customerName, String showDateTime, String movieId) {
        this.transactionId = transactionId;
        this.customerName = customerName;
        this.showDateTime = LocalDateTime.parse(showDateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        this.movieId = movieId;
    }
    
    public String getTransactionId() {
        return transactionId;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public LocalDateTime getShowDateTime() {
        return showDateTime;
    }
    
    public String getMovieId() {
        return movieId;
    }
    
    @Override
    public String toString() {
        return transactionId + "," + customerName + "," + showDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + "," + movieId;
    }
}
