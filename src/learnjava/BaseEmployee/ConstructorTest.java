/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.BaseEmployee;

/**
 *
 * @author HP
 */
public class ConstructorTest {
    
    @SuppressWarnings("unused")
    public static void main(String[] args){
        		
		CommissionEmployee employee1 = new CommissionEmployee(
				"Bob", "Lewis", "333-33-3333", 5000, .04);
		
		System.out.println();
                
                BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee("Owusu", "Osei", "GH",50000, 0.5, 3000);
    }
}
