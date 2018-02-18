package exceptionsfiles;

import java.util.Scanner;

public class PaymentsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double payment =0.0;
		boolean positivePayment = true;
		
	do {	
		
		System.out.println("Enter input");
		
		Scanner in = new Scanner(System.in);
		
		try { 
			payment = in.nextDouble();
		
	//	System.out.println("Amount is  : " + payment);
		
		if(payment < 0)
		{
			throw new NegativePaymentException(payment);
			
		  }
		}
		catch (NegativePaymentException e)
		{
			System.out.println("Error caught" + e.toString());
			positivePayment = false;
		}

	
	} while(positivePayment);
	}
}
