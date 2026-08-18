package Cap4.Questions.Cryptography;

import java.util.Scanner;

public class Cryptography
{
    public static void main(String[] args)
    {
        var input = new Scanner(System.in);
        String password = "";

        do
        {
            System.out.print("Enter a integer with fourth digts to criptography: ");
            password = input.nextLine();
        } while (password.length()!= 4 || !password.matches("\\d+"));

        int validatedPassword = Integer.parseInt(password);

        int digit1 = (validatedPassword / 1000 + 7) % 10;
        int digit2 = (validatedPassword % 1000 / 100 + 7) % 10;
        int digit3 = (validatedPassword % 1000 % 100 / 10 + 7) % 10;
        int digit4 = (validatedPassword % 1000 % 100 % 10 + 7) % 10;

        int encryptedPassword = Integer.parseInt(String.format("%d%d%d%d", digit3, digit4, digit1, digit2));


        System.out.printf("%04d\n", encryptedPassword);

    }
}
