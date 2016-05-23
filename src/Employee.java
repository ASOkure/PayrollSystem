
public abstract class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private Date birthDate;
	
	 // three-argument constructor
	 public Employee( String first, String last, Date dateOfBirth, String ssn )
	 {
	 firstName = first;
	 lastName = last;
	 birthDate = dateOfBirth;
	 socialSecurityNumber = ssn;
	 
	
	 }// end three- argument Employee constructor
	 
	 // set first name
	 
	 public void setFirstName( String first )
	 {
	  firstName = first; // should validate
	  } // end method setFirstName
	 
	  // return first name
	  public String getFirstName()
	  {
	  return firstName;
	  } // end method getFirstName
	 
	  // set last name
	  public void setLastName( String last )
	  {
	  lastName = last; // should validate
	 } // end method setLastName
	 
	  // return last name
	  public String getLastName()
	  {
	  return lastName;
	  } // end method getLastName
	 
	  public void setBirthDate(Date birth)
	  {
		birthDate = birth;  
	  }
	  
	 public Date getBirthDate(){
		return birthDate; 
	 }
	  
	  
	  // set social security number
	  public void setSocialSecurityNumber( String ssn )
	  {
	  socialSecurityNumber = ssn; // should validate
	 } // end method setSocialSecurityNumber
	 
	  // return social security number
	  public String getSocialSecurityNumber()
	  {
	  return socialSecurityNumber;
	  } // end method getSocialSecurityNumber
	  
	  // return String representation of Employee object
	  @Override
	 public String toString()
	  {
	  return String.format( "%s %s\nbirthDate:%s\nsocial security number: %s",
	  getFirstName(), getLastName(),getBirthDate(), getSocialSecurityNumber() );
	  } // end method toString
	 
	// abstract method overridden by concrete subclasses
	  public abstract double earnings(); // no implementation here
	  
}  // end abstract class Employee