/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava;

/**
 *
 * @author HP
 */
public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;
    
    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    public double calculateMonthlyInterest(){
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
        return savingsBalance;
    }
    
    public static void modifyInterestRate(double newRate){
        annualInterestRate = newRate;
    }
    
    public double getSavingsBalance(){
        return savingsBalance;
    }
}

