package Cap4.Questions.Palindromes;

import java.util.Scanner;

public class Palindromes
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 5 digit integer: ");
        int number = input.nextInt();

        if (number < 10000 || number > 99999)
        {
            while (number < 10000 || number > 99999)
            {
                System.out.println("Invalid input!\n");
                System.out.print("Enter a 5 digit integer: ");
                number = input.nextInt();
            }
        }

        int d1 = number / 10000;
        int d2 = (number / 1000) % 10;
        int d4 = (number / 10) % 10;
        int d5 = number % 10;

        if  (d1 == d5 && d2 == d4)
            System.out.printf("%d is a palindrome", number);
        else
            System.out.printf("%d isn't a palindrome", number);
    }
}
