
public class PayrollSystemTest {
	public static void main( String[] args )
	 {
		 Date BasedPlusCommissionEmployeeDOB = new Date(7, 24, 1983); 
		 Date CommissionEmployeeDOB = new Date(5, 14, 1943);
		 Date HourlyEmployeeDOB = new Date(6, 19, 1979);
		 Date SalariedEmployeeDOB = new Date(5, 11, 1983);
		 		
		 
		
		 // create subclass objects
		SalariedEmployee salariedEmployee =
		new SalariedEmployee( "John", "Smith", SalariedEmployeeDOB, "111-11-1111", 800.00 );
	 
		HourlyEmployee hourlyEmployee =
				new HourlyEmployee( "Karen", "Price",HourlyEmployeeDOB,"222-22-2222", 16.75, 40 );
				
		CommissionEmployee commissionEmployee =
				new CommissionEmployee(
				"Sue", "Jones", CommissionEmployeeDOB,"333-33-3333", 10000, .06 );
				
		BasePlusCommissionEmployee basePlusCommissionEmployee =
				new BasePlusCommissionEmployee(
				"Bob", "Lewis",BasedPlusCommissionEmployeeDOB, "444-44-4444", 5000, .04, 300 );
	
	 
				System.out.println( "Employees processed individually:\n" );
				
				 System.out.printf( "%s\n%s: $%,.2f\n\n",
				 salariedEmployee, "earned", salariedEmployee.earnings() );
				 
				 System.out.printf( "%s\n%s: $%,.2f\n\n",
				 hourlyEmployee, "earned", hourlyEmployee.earnings() );
				
				 System.out.printf( "%s\n%s: $%,.2f\n\n",
				 commissionEmployee, "earned", commissionEmployee.earnings() );
				 
				 System.out.printf( "%s\n%s: $%,.2f\n\n",
				 basePlusCommissionEmployee,
				 "earned", basePlusCommissionEmployee.earnings() );
	         
				 // create four element employee array
				 Employee[] employees = new Employee[ 4 ];
				
				 // initialize array with Employees
				 employees[ 0 ] = salariedEmployee;
				 employees[ 1 ] = hourlyEmployee;
				 employees[ 2 ] = commissionEmployee;
				 employees[ 3 ] = basePlusCommissionEmployee;
	 
				 System.out.println( "Employees processed polymorphically:\n" );
				 
				  // generically process each element in array employees
				  for ( Employee currentEmployee : employees )
				  {
	            System.out.println(currentEmployee);//invoke toString.	 
				//Date dateToday = new Date(12, 23, 2015);
				
	            
				// determine whether element is a BasePlusCommissionEmployee
				  if(currentEmployee instanceof BasePlusCommissionEmployee)
				  {
					   // downcast Employee reference to
					   // BasePlusCommissionEmployee reference
					   BasePlusCommissionEmployee employee =
							   ( BasePlusCommissionEmployee ) currentEmployee;
	 
							   employee.setBaseSalary( 1.10 * employee.getBaseSalary() );
							   
							    System.out.printf(
							    "new base salary with 10%% increase is: $%,.2f\n",
							    employee.getBaseSalary() );
							    } // end if
				  System.out.printf( "earned $%,.2f\n\n",  currentEmployee.earnings() );
	                   //} // end for
						
				 
				  Date dateToday = new Date(12, 24, 2015);
					System.out.printf("The date today is :%s\n", dateToday.toString());
		            
		           if(dateToday.getMonth() == currentEmployee.getBirthDate().getMonth())
		           {
		        	   
		        	   System.out.printf( "earned $%,.2f. %s %\n\n", currentEmployee.earnings() 
		      				+ 100.00, "Note: added a $100 bonus to your payroll amount for birthday!!!"); 
		           }   
		           else
		           {
		        	   System.out.printf( "earned $%,.2f\n\n",currentEmployee.earnings());
		           }	
				  
				  }
				  
				  
				  // get type name of each object in employees array
						   for ( int j = 0; j < employees.length; j++ )
						   {
						   System.out.printf( "Employee %d is a %s\n", j,
						   employees[ j ].getClass().getName() );
                 } // end main
 }

				  	
}// end class PayrollSystemTest