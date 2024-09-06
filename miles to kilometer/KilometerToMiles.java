import java.util.Scanner;

public class KilometerToMiles{

	public static void main(String args[]){
	    Scanner userInput = new Scanner (System.in);
		System.out.print("Input a value");
		double milesInput = userInput.nextInt();
		
		float result1 =(float) mileToKilometer(milesInput);
		float result2 =(float) kilometerToMile(milesInput); 

		System.out.println(result1+ " Kilometers");
		System.out.println(result2 + " Miles");

	}

    public static double mileToKilometer(double miles){
	
	double milesResult = miles * 1.60934;
	return (milesResult);

    }


    public static double kilometerToMile(double kilometer){
	double kilometerResult = kilometer * 0.62137;
	return (kilometerResult);


    }

}