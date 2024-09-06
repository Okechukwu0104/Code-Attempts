



import java.util.Scanner;

public class IntegerReverse{

    public static void main(String args[]){

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = userInput.nextInt();

        int reversedNumber = reverseInteger(number);
        System.out.println("Reversed number: " + reversedNumber);
    }


    public static int reverseInteger(int number){
	int reversed = 0;
	while(number != 0){
	  int digit = number%10;
		reversed = reversed *10 + digit;
		number = number / 10;
		continue;
		
	}if (number == 0)return reversed;
	
	return 0;







    }

}







