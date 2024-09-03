import java.util.Scanner;

    public class TaxCalculator{

	public static void main (String args[]){
		
	    Scanner userInput = new Scanner (System.in);

		
		System.out.println("Input the first person's Name: ");
		String first = userInput.next();

		System.out.println("Input the first persons earnings: ");
		float earningsOne = userInput.nextFloat();
	System.out.println(" ");
		System.out.println("Input the second person's Name: ");
		String second = userInput.next();

		System.out.println("Input the second persons earnings: ");
		float earningsTwo = userInput.nextFloat();
	System.out.println(" ");
		System.out.println("Input the third person's Name: ");
		String third = userInput.next();

		System.out.println("Input the third persons earnings: ");
		float earningsThree = userInput.nextFloat();


System.out.println(" ");

		System.out.println("	TAXES");

		if (earningsOne <= 30000){
			float result = (float) (earningsOne * 0.15);
			System.out.println (first +"Your Tax =" + result);
		


		}else{
			float result = (float) (earningsOne * 0.2);
			System.out.println (first +"\nYour Tax =" + result);
	
		}
		System.out.println(" ");
	
		if (earningsTwo <= 30000){
			float result = (float) (earningsTwo * 0.15);
			System.out.println (second +"\nYour Tax =" + result);
		


		}else{
			float result = (float) (earningsTwo * 0.2);
			System.out.println (second + "\nYour Tax =" + result);
		}
		System.out.println(" ");
	
		if (earningsThree <= 30000){
			float result = (float) (earningsThree * 0.15);
			System.out.println (third +"\nYour Tax =" + result);
		


		}else{
			float result = (float) (earningsThree * 0.20);
			System.out.println (third + "\nYour Tax = " + result);
		}







	    }

	


    }