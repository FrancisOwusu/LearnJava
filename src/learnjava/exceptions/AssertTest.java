/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.exceptions;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class AssertTest {
    
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);

 System.out.print("Enter a number between 0 and 10: ");
int number = input.nextInt();
 // assert that the value is >= 0 and <= 10
 assert (number >= 0 && number <= 10) : "bad number: " + number;

 System.out.printf("You entered %d%n", number);
 }
 } // end class AssertTest
