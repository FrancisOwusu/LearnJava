/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.gui;
import javax.swing.JOptionPane;
/**
 *
 * @author FrancisOwusu
 */
public class Addition {
    public static void main(String[] arg){
        
        //obtain user input from JOPtionPane
        String firstNumber = JOptionPane.showInputDialog("Enter First Number");
  
    //obtain second input from user
    String secondNumber = JOptionPane.showInputDialog("Enter Second Number");
    
    //convert string to number
    int number1 = Integer.parseInt(firstNumber);
    int number2 = Integer.parseInt(secondNumber);
            
    
    int sum = number1 + number2;
    /*
    
    ERROR_MESSAGE Indicates an error.
INFORMATION_MESSAGE Indicates an informational message.
WARNING_MESSAGE Warns of a potential problem.
QUESTION_MESSAGE Poses a question. This dialog normally requires a
response, such as clicking a Yes or a No button.
PLAIN_MESSAGE no
icon
A dialog that contains a message, but no icon.
    */
    
    
    JOptionPane.showMessageDialog(null,"The sum is" +sum,"sum of two numbers ",JOptionPane.INFORMATION_MESSAGE);
    
    }
}
