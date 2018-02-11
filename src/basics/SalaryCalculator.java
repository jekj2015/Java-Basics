package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String career;
		System.out.println("Program Starting");
		career = "Software Developer";
		System.out.println("My Career is : " + career);
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		double salary = hoursPerWeek * weeksPerYear * rate ;
		System.out.println("My Salary as a " + career + " at the rate of 42.50 per hours is " + salary );

	}

}
