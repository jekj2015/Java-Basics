package oop;

public class BankAccount implements IRate {
	
	String accountNumber;
	private static final String routingNumber = "0999999" ;
	private String name;
	private String ssn;
	String accountType;
	Double balance;
	
	BankAccount()
	{
		
	System.out.println("New account created");	
		
	}
	
	BankAccount(String accountType)
	{
		
	System.out.println("New account" + accountType);	
		
	}
	
	BankAccount(String accountType ,double initDeposit)
	{
		
	System.out.println("New account" + accountType);	
	System.out.println("Initial Deposit of " + initDeposit);
	String Msg ="";
	if(initDeposit < 1000)
	{
		Msg = "The minimum deposit should be greater than 1000";
		
	}
	else
		{
		
		Msg = "Thanks for the Initial deposit";
		
		balance =  initDeposit;
		}
	
		System.out.println(Msg);
	
		
	}
	
	//Getters & Setters
	// Allow the users to define name
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		
		return name;
		
	}
	
	
	void deposit(double amount)
	{
		
		balance = balance + amount;
		showActivity("DEPOSIT");
		
	}
	
	void withdraw(double amount)
	{
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	void checkBalance()
	
	{
	
		System.out.println("Balance is " + balance);
	}
	
	void getStatus()
	{
		
	}
	
	private void showActivity(String act)
	{
	
		System.out.println("The current activity is " + act);
		System.out.println("Your new balance is " +  balance);
		
	}
	
	public String toString()
	{
		return "[ Name:"+ name + ",SSN: " +ssn + ",Balance: "+balance + ",Routing #"+ routingNumber+ "]";
	} 
	
	//Interface methods
	public void setRate()
	{
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate()
	{
		System.out.println("INCREASING RATE");
	}

}
