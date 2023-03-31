/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava;

/**
 *
 * @author HP
 */
public class DateTest {
    public static void main(String[] args) {
        Date  myDate = new Date(3, 15, 2023);

        System.out.print("The date is: ");
        myDate.displayDate();

        myDate.setMonth(12);
        myDate.setDay(31);
        myDate.setYear(2022);

        System.out.print("The new date is: ");
        myDate.displayDate();
    }
}