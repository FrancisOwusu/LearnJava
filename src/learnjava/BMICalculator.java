/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BMICalculator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Create an invoice object
        Scanner input = new Scanner(System.in);
        int num;
        int[] numbers = new int[100];
        int count = 0;
        System.out.print("Enter a number (-1 to end): ");
        num = input.nextInt();

        while (num != -1) {
            numbers[count] = num;
            count++;
            System.out.print("Enter a number (-1 to end): ");
            num = input.nextInt();
        }

        System.out.print("The numbers entered are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    
        Invoice invoice;
        invoice  = new Invoice("123456","Hammer",2,12.50);
       //Display the initial values
        System.out.println("Part number" + invoice.getPartNumber());
        System.out.println("Part description" + invoice.getPartDescription());
       System.out.println("Quantity" + invoice.getQuantity());
       System.out.println("Price per item" + invoice.getPricePerItem());
       
 // Set new values
        invoice.setPartNumber("67890");
        invoice.setPartDescription("Screwdriver");
        invoice.setQuantity(-3); // Quantity should be set to 0
        invoice.setPricePerItem(9.99);
        
        // Display the updated values
        System.out.println("\nUpdated values:");
        System.out.println("Part number: " + invoice.getPartNumber());
        System.out.println("Part description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: " + invoice.getPricePerItem());
        
        // Calculate and display the invoice amount
        System.out.println("\nInvoice amount: " + invoice.getInvoiceAmount());
 
        
        
        // TODO code application logic here
        
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your weight in kilograms: ");
//        double weight = input.nextDouble();
//        System.out.print("Enter your height in meters: ");
//        double height = input.nextDouble();
//
//        double bmi = weight / (height * height);
//
//        System.out.println("Your BMI is " + bmi);
//        
//        
        
        
//              Scanner input = new Scanner(System.in);
//        Map<String, String> genderMap = new HashMap<>();
//        genderMap.put("wife", "spouse");
//        genderMap.put("husband", "spouse");
//        genderMap.put("man", "person");
//        genderMap.put("woman", "person");
//        genderMap.put("daughter", "child");
//        genderMap.put("son", "child");
//
//        System.out.print("Enter a paragraph of text: ");
//        String text = input.nextLine();
//
//        for (String word : genderMap.keySet()) {
//            String replacement = genderMap.get(word);
//            text = text.replaceAll("\\b" + word + "\\b", replacement);
//        }
//
//        System.out.println("Gender-neutral text: " + text);
//    
    } 

   
}
