/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.filestreams;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Formatter;
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
}
