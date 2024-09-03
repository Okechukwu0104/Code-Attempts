import java.util.Scanner;

public class PassOrFail {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int scoreInput;

        while (true) {
            System.out.print("Enter Score: ");
            scoreInput = userInput.nextInt();

            if (scoreInput == -1) {
                break;
            }


            if (scoreInput >= 60 && scoreInput <= 100) {
                System.out.println("You passed the exam");
            } else {
                System.out.println("You didn't pass the exam");
            }
        }

        
    }
}
