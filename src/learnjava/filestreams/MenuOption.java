/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.filestreams;

/**
 *
 * @author HP
 */
public enum MenuOption {
  //declare content of enum types
    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);
    
    private final int value;//current menu option
    
    //constructor
    private MenuOption(int value){
        this.value = value;
    }
}//end enum MenuOption
