import java.util.Scanner;

public class Decrypt {

    public static void main(String... args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the encrypted first digit: ");
        int encryptedFirstDigit = userInput.nextInt();

        System.out.println("Enter the encrypted second digit: ");
        int encryptedSecondDigit = userInput.nextInt();

        System.out.println("Enter the encrypted third digit: ");
        int encryptedThirdDigit = userInput.nextInt();

        System.out.println("Enter the encrypted fourth digit: ");
        int encryptedFourthDigit = userInput.nextInt();
        System.out.print(" ");

        


        int originalFirstDigit = (encryptedThirdDigit + 10 - 7) % 10;
        System.out.print(originalFirstDigit);

        int originalSecondDigit = (encryptedFourthDigit + 10 - 7) % 10;
        System.out.print(originalSecondDigit);

        int originalThirdDigit = (encryptedFirstDigit + 10 - 7) % 10;
        System.out.print(originalThirdDigit);

        int originalFourthDigit = (encryptedSecondDigit + 10 - 7) % 10;
        System.out.print(originalFourthDigit);
    }
}
