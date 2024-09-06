

import java.util.Scanner;


 public class SquareRoot{

	public static void main(String args[]){

 	    Scanner userInput = new Scanner(System.in);
	    System.out.print("input a positive double number");
		double value = userInput.nextInt();
		
		double result = squareRoot(value);
		System.out.print(result);

	}

	public static double squareRoot(double number){
		double answer = Math.sqrt(number);

		return answer;

	
	}

	
    }