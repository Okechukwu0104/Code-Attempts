import java.util.Scanner;

    public class Pyramid{
	public static void main(String args[]){
	    Scanner userInput = new Scanner(System.in);

	    System.out.print("Input a number");
           	int number = userInput.nextInt();

		for(int count = number; count>0; count--){
		System.out.print(count);
		for(int count2 = 1; count2 < number; count2++ );
	
				
		System.out.println();
		}
	    

	}

    }