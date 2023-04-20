/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.filestreams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static learnjava.filestreams.CreateTextFile.output;

/**
 *
 * @author HP
 */
public class ReadTextFile {

    public static Scanner input;

    public static void main(String[] args) {
openFile();
readRecords();
closeFile();
    }

    //open file clients.txt
    public static void openFile() {
        try {
            input = new Scanner(Paths.get("clients.txt"));
        } catch (IOException ex) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);

        }

    }

    // read record from file
    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                "First Name", "Last Name", "Balance");
        try {
            //display  record contents
            while (input.hasNext()) {// while there is more to read
                System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed.Terming");
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. terminating");
        }
    }
    
     public static void closeFile(){
        if(output !=null){
            output.close();
        }
    }
}
