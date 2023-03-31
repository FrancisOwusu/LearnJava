/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava;

/**
 *
 * @author HP
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe", 5000.0);
        Employee emp2 = new Employee("Jane", "Doe", 6000.0);

        System.out.printf("%s %s's yearly salary is $%.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%s %s's yearly salary is $%.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());

        emp1.giveRaise(10.0);
        emp2.giveRaise(10.0);

        System.out.printf("%s %s's yearly salary after raise is $%.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%s %s's yearly salary after raise is $%.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());
    }
}
