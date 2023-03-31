/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CreditLimitCalculator {
    
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the customer's information
        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();

        System.out.print("Enter balance at the beginning of the month: ");
        int beginningBalance = input.nextInt();

        System.out.print("Enter total of all items charged this month: ");
        int totalCharges = input.nextInt();

        System.out.print("Enter total of all credits applied this month: ");
        int totalCredits = input.nextInt();

        System.out.print("Enter allowed credit limit: ");
        int creditLimit = input.nextInt();

        // Calculate the new balance
        int newBalance = beginningBalance + totalCharges - totalCredits;

        // Check if the new balance exceeds the credit limit
        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded for account number " + accountNumber);
        } else {
            System.out.println("New balance for account number " + accountNumber + " is " + newBalance);
        }
    }
}
/*
In this program, we first prompt the user to enter the customer's account number, beginning balance, total charges, total credits, and credit limit.

Then, we calculate the new balance by adding the beginning balance and total charges, and subtracting the total credits.

Finally, we check whether the new balance exceeds the credit limit using an if statement. If the new balance is greater than the credit limit, we print a message saying the credit limit has been exceeded. Otherwise, we print the new balance.

Note that this program assumes that all inputs are valid integers and does not perform any error checking or validation. In a real-world application, it would be important to handle invalid inputs and edge cases to ensure the program behaves as expected.

*/


