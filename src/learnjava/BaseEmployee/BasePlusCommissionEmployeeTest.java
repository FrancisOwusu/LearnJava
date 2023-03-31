/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.BaseEmployee;

/**
 *
 * @author HP
 */
public class BasePlusCommissionEmployeeTest {
    
    public static void main(String[] args) {
        
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Francis", "Osei Owusu", "G1257", 15000, 0.5, 2000);
        // get commission employee data
		System.out.println(
				"Employee information obtained by get methods: \n" );
		System.out.printf("%s %s\n", "First name is",
				employee.getFirstName());
		System.out.printf("%s %s\n", "Last name is",
				employee.getLastName());
		System.out.printf("%s %s\n", "Social security number is ",
				employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f\n", "Gross sales is",
				employee.getGrossSales());
		System.out.printf("%s %.2f\n", "Commission rate is",
				employee.getCommissionRate());
		System.out.printf("%s %.2f\n", "Base salary is", 
				employee.getBaseSalary());
		
		employee.setBaseSalary(1000);
		
		System.out.printf("\n%s: \n\n%s\n",
				"Updated employee information obtained by toString", employee);
    }
}
