/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.BaseEmployee;

/**
 *
 * @author HP
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;		// base salary per week
    
      public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate,double baseSalary) {
        
          // explicit call to superclass CommissionEmployee constructor
          super(first, last, ssn, sales, rate);
    }

    @Override
 	// return String representation of CommissionEmployee object
		public String toString() {
			
			return String.format ("%s %s\n%s: %.2f", "base-salaried",
					super.toString(), "base salary", getBaseSalary());
		} // end method toString
	
      
      
//    private final String firstName;
//private final String lastName;
//    private final String socialSecurityNumber;
//    private double grossSales; // gross weekly sales
//    private double commissionRate; // commission percentage
//    private double baseSalary; // base salary per week
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String getSocialSecurityNumber() {
//        return socialSecurityNumber;
//    }
//    
//    public double getGrossSales() {
//        return grossSales;
//    }
//
//    public void setGrossSales(double grossSales) {
//        this.grossSales = grossSales;
//    }
//
//    public double getCommissionRate() {
//        return commissionRate;
//    }
//
//    public void setCommissionRate(double commissionRate) {
//        this.commissionRate = commissionRate;
//    }
//
//    public double getBaseSalary() {
//        return baseSalary;
//    }
//
//    public void setBaseSalary(double baseSalary) {
//        this.baseSalary = baseSalary;
//    }
//
//
//
//    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.socialSecurityNumber = socialSecurityNumber;
//        this.grossSales = grossSales;
//        this.commissionRate = commissionRate;
//        this.baseSalary = baseSalary;
//    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double salary) {
         baseSalary=(salary < 0.0) ? 0.0 : salary;
        //this.baseSalary = baseSalary;
    }

    @Override
  public double earnings(){
      return getBaseSalary() + super.earnings();
  }

}
