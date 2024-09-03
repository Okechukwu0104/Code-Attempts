import java.util.Scanner;

    public class Triangle{

	public static void main (String args[]){
		Scanner userInput = new Scanner (System.in);

		System.out.print("Input the base length of the triangle");
		int side = userInput.nextInt();
		
	if (side <= 10){

		for (int countOne = -1; countOne < side; countOne++){

		for(int countTwo =-1; countTwo < countOne; countTwo++){

			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println(" ");
		}
	} else System.out.print("Pls input between 1-10");
		
	}

    }