package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BankAccount a = new BankAccount();
		a.accountNumber = "123666";
	//	a.name = "Jeevan";
		a.setName("Jeevan K J");
		a.setSsn("1277888");
		a.setRate();
		a.increaseRate();
		System.out.println("get Name function" + a.getName());
		System.out.println("SSN is " + a.getSsn());
		
		a.balance = 25000.0;
		//System.out.println(a.toString());
		//a.deposit(2000);
		//a.deposit(5000);
		//a.withdraw(3000);
		//System.out.println(a.toString());
		
		
		/*
		 
		 //Polymorphism through method overloading
		BankAccount b = new BankAccount("Checking");
		b.accountNumber = "456";
		BankAccount c = new BankAccount("Saving", 1000);
		c.accountNumber = "789";
		c.checkBalance();*/
		
	/*	System.out.println(a.routingNumber);
		System.out.println(b.routingNumber);
		System.out.println(c.routingNumber); */
		
	/*	CDAccount cd1 = new CDAccount();
		cd1.balance = 350.0;
		cd1.ssn = "7566565";
		cd1.name = "Jeevan2";
		cd1.accountType = "CD Account";
		cd1.interestRate = 10.0;
		
		//Polymorphism through function overriding;
        System.out.println(cd1.toString());
        cd1.compount(); */
		
		
	
	}

}
