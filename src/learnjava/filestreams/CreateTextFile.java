/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.filestreams;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class CreateTextFile {

    public static Formatter output;

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    // open file clients.txt
    public static void openFile() {
        try {
            output = new Formatter("clients.txt"); // open the file
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); // terminate the program
        } catch (FileSystemNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate the program
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreateTextFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void addRecords() {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n? ",
                "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.");

        while (input.hasNext()) { // loop until end-of-file indicator
            try {
                // output new record to file; assumes valid input
                output.format("%d %s %s %.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            } catch (FormatterClosedException formatterClosedException) {

                System.err.println("Error writing to file. Terminating.");
                break;
            } catch (NoSuchElementException elementException) {
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // discard input so user can try again
            }
            System.out.print("? ");
        } //end of while
    }//end of method addRecords

    public static void closeFile(){
        if(output !=null){
            output.close();
        }
    }
}
