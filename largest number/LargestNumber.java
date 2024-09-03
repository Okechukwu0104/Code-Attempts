import java.util.Scanner;

public class LargestNumber {
    public static void main(String...args) {
        Scanner userInput = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            int number = userInput.nextInt();

            if (number > largest) largest = number;

        }

        System.out.println("The largest number is: " + largest );
    }
}
