package Lab;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount acc1 = new BankAccount("45678911" , 2000.0);
		acc1.setName("Jeff");
		acc1.makeDeposit(500.0);
		acc1.makeDeposit(200.0);
		acc1.payBill(100.0);
		acc1.showBalance();
		acc1.accrue();
		
		System.out.println(acc1.toString());
		System.out.println(acc1.getName());
	//	BankAccount acc2 = new BankAccount("64378911");

	}

	
}


class BankAccount implements IInterest{
	
	private static int iD = 1000;
	private String accountNumber;
	private static final String routingNumber = "1257001";
	private String name;
	private String SSN;
	private double balance;
	
	
	public BankAccount(String SSN ,double initDeposit){
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
		
		
	}
	
	private void setAccountNumber()
	{
		int random = (int) (Math.random()* 100);
		accountNumber = iD +""+ random + SSN.substring(0,2);
		System.out.println("The account number is " + accountNumber);
		
	}
	
	public void setName(String name)
	{
		
		this.name = name;
	}
	
	public String getName()
	{
		
		return name;
	}
	
	public void payBill(double amount)
	{
		
		balance = balance - amount;
		System.out.println("Paying Bill  of Amount : " + amount);
		showBalance();
		
	}
	
	public void makeDeposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Making deposit  of Amount : " + amount);
		showBalance();
	}
	
	public void showBalance() {
		
		System.out.println("The balance is  " + balance);
	}

	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		balance = balance + (balance * rate)/100;
		showBalance();
	}

	public String toString()
	{
		
		return "Name :" + name + "\nBalance :" + balance + "\n Account :" + accountNumber;
	}
	
	
}