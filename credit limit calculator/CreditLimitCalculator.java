import java.util.Scanner;

    public class CreditLimitCalculator{

	public static void main(String...args){
	Scanner userInput = new Scanner (System.in);

	System.out.print("Input your Account Number: ");
	String accountNumber = userInput.nextLine();

	System.out.print("Input your Balance at month Beginning: ");
	float beginningBalance = userInput.nextInt();

	System.out.print("Input total charges on items this month: ");
	int charges = userInput.nextInt();
	
	System.out.print("Input the Total creits applied to this account: ");
	float credits = userInput.nextInt();

	System.out.print("Input the Allowed Credit Limit: ");
	float creditAllowed = userInput.nextInt();


	float creditResult = (beginningBalance + charges) - credits;

	
	if (creditResult > creditAllowed)System.out.print("Credit limit Exceeded");
	else System.out.print("New Balance: "+creditResult);

	}

    }