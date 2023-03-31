/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.Time;

/**
 *
 * @author HP
 */
public class Time2Test {
    public static void main(String[] args) {
        Time2 time = new Time2(23, 59, 59);

        System.out.println("Before: " + time);

        time.tick();
        System.out.println("After tick: " + time);

        time.incrementMinute();
        System.out.println("After incrementMinute: " + time);

        time.incrementHour();
        System.out.println("After incrementHour: " + time);
    }
}

