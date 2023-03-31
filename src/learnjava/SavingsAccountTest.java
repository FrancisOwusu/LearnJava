/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava;

/**
 *
 * @author HP
 */
public class SavingsAccountTest {
    /*
    
    
    Create class SavingsAccount. Use a static variable annualInterestRate
to store the annual interest rate for all account holders. Each object of the class contains a
private instance variable savingsBalance indicating the amount the saver currently has on deposit.
Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the
savingsBalance by annualInterestRate divided by 12—this interest should be added to savings-
Balance. Provide a static method modifyInterestRate that sets the annualInterestRate to a new
value. Write a program to test class SavingsAccount. Instantiate two savingsAccount objects,
saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate
to 4%, then calculate the monthly interest for each of 12 months and print the new balances for
both savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print
the new balances for both savers.
    */
    public static void main(String[] args){
               SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);

        SavingsAccount.modifyInterestRate(0.04);

        for (int i = 1; i <= 12; i++) {
            double interest1 = saver1.calculateMonthlyInterest();
            double interest2 = saver2.calculateMonthlyInterest();

            System.out.printf("Month %d:\n", i);
            System.out.printf("Saver 1 balance: %.2f (interest earned: %.2f)\n", saver1.getSavingsBalance(), interest1);
            System.out.printf("Saver 2 balance: %.2f (interest earned: %.2f)\n", saver2.getSavingsBalance(), interest2);
        }

        SavingsAccount.modifyInterestRate(0.05);

        double interest1 = saver1.calculateMonthlyInterest();
        double interest2 = saver2.calculateMonthlyInterest();

        System.out.println("\nAfter changing interest rate:");
        System.out.printf("Saver 1 balance: %.2f (interest earned: %.2f)\n", saver1.getSavingsBalance(), interest1);
        System.out.printf("Saver 2 balance: %.2f (interest earned: %.2f)\n", saver2.getSavingsBalance(), interest2);
    }
}
