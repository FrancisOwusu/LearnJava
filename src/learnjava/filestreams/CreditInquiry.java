package learnjava.filestreams;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import learnjava.filestreams.MenuOption;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author HP
 */
public class CreditInquiry {

    private final static MenuOption[] choices = MenuOption.values();

    public static void main(String[] args) {

        //get user's request (e.g,zero,credit,or debit balance
        MenuOption accountType = getRequest();
    }
    
    
    // obtain request from user
    private static MenuOption getRequest(){
        int request = 4;
        //display request options
       System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
 " 1 - List accounts with zero balances",
 " 2 - List accounts with credit balances",
 " 3 - List accounts with debit balances",
 " 4 - Terminate program");
       
       try{
           Scanner input = new Scanner(System.in);
           do //input user request{
           {
               System.out.printf("%n? ");
request = input.nextInt();
           }while((request < 1) || (request > 4));
           
       }catch(NoSuchElementException noSuchElementException){
       System.err.println("Invalid input. Terminating.");
    }
       return choices[request - 1]; // return enum value for option
    }
    
// read records from file and display only records of appropriate type

    private static void readRecords(MenuOption accountType) {
        // open file and process contents
        try (
                 Scanner input = new Scanner(Paths.get("clients.txt"))) {
            while (input.hasNext()) {// more data to read
                int accountNumber = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                double balance = input.nextDouble();

                // if proper acount type, display record
                // if proper acount type, display record
                if (shouldDisplay(accountType, balance)) {
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber,
                            firstName, lastName, balance);
                } else {
                    input.nextLine(); // discard the rest of the current record
                }
            }
        } catch (NoSuchElementException
                | IllegalStateException | IOException e) {
            System.err.println("Error processing file. Terminating.");
            System.exit(1);
        }
    } // end method readRecords

// use record type to determine if record should be displayed
    private static boolean shouldDisplay(MenuOption accountType, double balance) {
        if ((accountType == MenuOption.CREDIT_BALANCE) && (balance < 0)) {
            return true;
        } else if ((accountType == MenuOption.DEBIT_BALANCE) && (balance > 0)) {
            return true;
        } else if ((accountType == MenuOption.ZERO_BALANCE) && (balance == 0)) {
            return true;
        }

        return false;
    }

}
