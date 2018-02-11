package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10 ;
		int b = 2;
		printName();
		addNumbers(a,b);
		System.out.println("Multiply is " + multiplyNumbers(a,b));
	

	}
	
	static void printName() {
		
		System.out.println("My name is Jeevan");
	}
	static void addNumbers(int numberA, int numberB) {
		
		int sum = numberA + numberB;
		System.out.println("Sum is  " + sum);
		
	}
	static int multiplyNumbers(int numberA,int numberB) {
		
		return numberA*numberB;
	}

}
