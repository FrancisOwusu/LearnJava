/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.bookingsystem;

/**
 *
 * @author HP
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingSystem {

    private static final String FILE_PATH = "cinema3000_bookings.csv";
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String[] BOOKING_HEADER = {"Transaction ID", "Customer Name", "Date and Time", "Movie ID"};
    private static final String[] MOVIE_HEADER = {"Movie ID", "Title", "Price", "Release Date", "Show Times"};
    private static final int SHOW_TIMES_INDEX = 4;

    private List<Booking> bookings;
    private List<Movie> movies;
    private int theaterSeats;

    

    public BookingSystem(int theaterSeats) {
        this.theaterSeats = theaterSeats;
        bookings = new ArrayList<>();
        movies = new ArrayList<>();
    }

    public void readDataFromFile() {
        try ( BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            boolean isBookingHeader = true;
            boolean isMovieHeader = true;
            while ((line = br.readLine()) != null) {
                if (isBookingHeader) {
                    isBookingHeader = false;
                } else if (isMovieHeader) {
                    isMovieHeader = false;
                } else {
                    String[] data = line.split(COMMA_DELIMITER);
                    if (data.length == BOOKING_HEADER.length) {
                        bookings.add(new Booking(data[0], data[1], data[2], data[3]));
                    } else if (data.length == MOVIE_HEADER.length) {
                        String[] showTimes = data[SHOW_TIMES_INDEX].split(";");
                        List<String> showTimesList = new ArrayList<>();
                        for (String showTime : showTimes) {
                            showTimesList.add(showTime);
                        }
                        movies.add(new Movie(data[0], data[1], Double.parseDouble(data[2]), data[3], showTimesList));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading data from file: " + e.getMessage());
        }
    }

    public void writeDataToFile() {
        try ( FileWriter fw = new FileWriter(FILE_PATH)) {
            fw.append(String.join(COMMA_DELIMITER, BOOKING_HEADER)).append(NEW_LINE_SEPARATOR);
            for (Booking booking : bookings) {
                fw.append(booking.toString()).append(NEW_LINE_SEPARATOR);
            }
            fw.append(String.join(COMMA_DELIMITER, MOVIE_HEADER)).append(NEW_LINE_SEPARATOR);
            for (Movie movie : movies) {
                fw.append(movie.toString()).append(NEW_LINE_SEPARATOR);
            }
        } catch (IOException e) {
            System.out.println("Error writing data to file: " + e.getMessage());
        }
    }

    public void displayAvailableMovies() {
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
    }

    public void bookTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the ID of the movie you want to book a ticket for: ");
        String movieId = scanner.nextLine();
        System.out.println("Please enter the date and time of the show you want to book a ticket for (yyyy-MM-dd HH:mm): ");
        String showDateTime = scanner.nextLine();
        Movie selectedMovie = null;
        for (Movie movie : movies) {
            if (movie.getId().equals(movieId)) {

            }
        }

    }
}
