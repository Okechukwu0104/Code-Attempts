import java.util.Scanner;

    public class Encrypt{

	public static void main(String...args){
	    Scanner userInput = new Scanner (System.in);

		System.out.println("Enter your first digit: ");
		int firstDigit = userInput.nextInt();

		System.out.println("Enter your second digit: ");
		int secondDigit = userInput.nextInt();

		System.out.println("Enter your third digit: ");
		int thirdDigit = userInput.nextInt();

		System.out.println("Enter your fourth digit: ");
		int fourthDigit = userInput.nextInt();
		System.out.print(" ");

		int newFirstDigit =  ((thirdDigit +7)%10);
		System.out.print(newFirstDigit);

		int newSecondDigit =  ((fourthDigit +7)%10);
		System.out.print(newSecondDigit);

		int newThirdDigit =  ((firstDigit +7)%10);
		System.out.print(newThirdDigit);
	
		int newFourthDigit =  ((secondDigit +7)%10);
		System.out.print(newFourthDigit);
	
	
		

		
	    

	}

    }