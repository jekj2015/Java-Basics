package Lab;

public class Student {
	
	String name;
	String SSN;
	String email;
	private static int ID = 10;
	String userid;
	private String phone;
	private String city;
	private String state;
	
	
	Student(String name, String ssn)
	{
	
	this.name = name;
	this.SSN =  ssn;
	
	System.out.println("New Studenr Created Name : " + name + " SSN : " + ssn);
	setUserID();
	setEmail();
	}
	
	
	private void setUserID()
	{
		
	 int random =  (int) (Math.floor(Math.random() * (9000 - 4000 + 1)) + 4000);	
	 this.userid = ID + "" + random + SSN.substring(5, 9);
	 ID++;
	 System.out.println("User ID is : " + userid);
		
	}
	private void setEmail()
	{
	  
		this.email = name + userid + "@Test.com";
		 System.out.println("Email ID is : " + email);
		
	}
	
	public void enroll() {
		
		System.out.println("Student Enrolled");
	}
	
	public void pay() {
		
		
	}

	public void checkBalance() {
	
	
}
	
	public void showCourses() {
		
		
}
	
	public void setDetails(String phone, String city , String state) {
		
		this.phone = phone;
		this.city = city;
		this.state = state;
	}

}
