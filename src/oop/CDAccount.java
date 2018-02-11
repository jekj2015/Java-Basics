package oop;

public class CDAccount extends BankAccount implements IRate{
	double interestRate ;
	void compount()
	{
	
		System.out.println("Compounded money is " + this.balance * this.interestRate);
		
	}

}
