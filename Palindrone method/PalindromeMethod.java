



import java.util.Scanner;

public class PalindroneMethod{

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
	
	else return 0;

    }


    public static String isPalindrone(int number, int reversedNumber)

	if(number == reversedNumber) return "This is a palindrone"
	else return "This is not a palindrone"



}







