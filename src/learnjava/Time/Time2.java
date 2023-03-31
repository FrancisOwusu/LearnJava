/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.Time;

/**
 *
 * @author HP
 */
public class Time2 {
    private int hour;
    private int minute;
    private int second;

    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int hour) {
        this(hour, 0, 0);
    }

    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time2(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("Invalid time format.");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void tick() {
        if (second == 59) {
            second = 0;
            incrementMinute();
        } else {
            second++;
        }
    }

    public void incrementMinute() {
        if (minute == 59) {
            minute = 0;
            incrementHour();
        } else {
            minute++;
        }
    }

    public void incrementHour() {
        if (hour == 23) {
            hour = 0;
        } else {
            hour++;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
