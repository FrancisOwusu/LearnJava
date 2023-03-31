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
import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter date of birth (yyyy-mm-dd): ");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());

        HeartRates heartRates = new HeartRates(firstName, lastName, dateOfBirth);

        System.out.printf("Name: %s %s\n", heartRates.getFirstName(), heartRates.getLastName());
        System.out.printf("Date of birth: %s\n", heartRates.getDateOfBirth());
        System.out.printf("Age: %d\n", heartRates.getAge());
        System.out.printf("Maximum heart rate: %d bpm\n", heartRates.getMaximumHeartRate());
        System.out.printf("Target heart rate: %d - %d bpm\n", heartRates.getTargetHeartRateLower(),
                heartRates.getTargetHeartRateUpper());
    }
}

