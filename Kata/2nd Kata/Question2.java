import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int numberInput = userInput.nextInt();
        
        isPrimeNumber(numberInput);
    }




    public static void isPrimeNumber(int numberInput) {
        int counter = 0;

        for (int count = 1; count <= numberInput; count++) {
            if (numberInput % count == 0) {
                counter++;
            }
        }



        if (counter == 2) {
            System.out.print("It's a prime number");
        } else {
            System.out.print("It's not a prime number");
        }
    }
}
