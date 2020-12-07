
public class Customer {

	
	private String name;
	private int age;
	  
	/** A parametrized constructor */
	
	public Customer(String n, int a) {
	name = n;
	age = a;
	}
	public Customer(Customer c) {
	name = c.getName();
	age = c.getAge();
	}
	
	
	  
	/** An Overridden  toString method: String 
	 * representation for Customer including the name and age */
	
	
	public String toString() {
	return name +", " +age +"y/o";
	}
	  
	/** getters   and any other methods that are needed for your design.  */
	
	
	public String getName() {
	return name;
	}
	public int getAge() {
	return age;
	}
	  
	/** •	setters  and any other methods that are needed for your design.  */
	
	
	public void setName(String n) {
	name = n;
	}
	public void setAge(int a) {
	age = a;
	}
	
}
