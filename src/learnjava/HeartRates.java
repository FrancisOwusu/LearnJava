/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava;

/**
 *
 * @author HP
 */
import java.time.LocalDate;

public class HeartRates {
    /*
    (Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see that
your heart rate stays within a safe range suggested by your trainers and doctors. According to the American
Heart Association (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), the
formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years.
Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are
estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness
and gender of the individual. Always consult a physician or qualified health-care professional before
beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes
should include the person’s first name, last name and date of birth (consisting of separate attributes for
the month, day and year of birth). Your class should have a constructor that receives this data as parameters.
For each attribute provide set and get methods. The class also should include a method that
calculates and returns the person’s age (in years), a method that calculates and returns the person’s
maximum heart rate and a method that calculates and returns the person’s target heart rate. Write a
Java app that prompts for the person’s information, instantiates an object of class HeartRates and
prints the information from that object—including the person’s first name, last name and date of
birth—then calculates
    */
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - dateOfBirth.getYear();
        if (currentDate.getMonthValue() < dateOfBirth.getMonthValue() ||
                (currentDate.getMonthValue() == dateOfBirth.getMonthValue() &&
                        currentDate.getDayOfMonth() < dateOfBirth.getDayOfMonth())) {
            age--;
        }
        return age;
    }

    public int getMaximumHeartRate() {
        int age = getAge();
        return 220 - age;
    }

    public int getTargetHeartRateLower() {
        int maxHeartRate = getMaximumHeartRate();
        return (int) Math.round(0.5 * maxHeartRate);
    }

    public int getTargetHeartRateUpper() {
        int maxHeartRate = getMaximumHeartRate();
        return (int) Math.round(0.85 * maxHeartRate);
    }
}

