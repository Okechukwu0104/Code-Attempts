import java.util.Scanner;


public class SortThreeNumbers{

    public static void main(String args[]){
	Scanner userInput = new Scanner(System.in);

	System.out.print("Input first number: ");
	double num1 = userInput.nextDouble();

	System.out.print("Input second number: ");
	double num2 = userInput.nextDouble();

	System.out.print("Input third number: ");
	double num3 = userInput.nextDouble();

	displaySortedNumbers(num1, num2, num3);
	

    }

	
	public static void displaySortedNumbers(double num1, double num2, double num3){

	double largest = num1 ;
	double smallest = num1;
	double middle = num1;
	if (num2 > largest)largest = num2;
	if (num3 > largest)largest = num3;
	
	if (num2 < smallest)smallest = num2;
	if (num3 < smallest)smallest = num3;

	if (num1 !=smallest && num1 != largest)middle = num1;
	else if (num2 != smallest && num1!= largest)middle = num2;
	else num3 = middle;
		
	
	System.out.print(largest + ", ");
	System.out.print(middle+ ", ");
	System.out.print(smallest);
	
	
	

	}

}