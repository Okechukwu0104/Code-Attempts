import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }

        System.out.println("The two largest numbers are: " + largest + " and " + secondLargest);
    }
}
