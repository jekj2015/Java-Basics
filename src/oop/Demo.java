package oop;

class Person
{
	
	String name;
	int age;
	String email;
	String mobile;
	void contact()
	{
		
		System.out.println("Contact details for " + name + " is " + email + ",Cell-- " + mobile);
		
	}
	
	
	
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		p1.name = "Joe";
		p1.email = "Joe@test.com";
		p1.mobile = "9983199490";
		
		p1.contact();

	}

}
