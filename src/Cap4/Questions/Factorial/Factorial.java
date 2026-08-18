package Cap4.Questions.Factorial;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer bigger than zero: ");
        int integer = input.nextInt();

        while (integer <= 0)
        {
            System.out.println("Enter a valid value!\n");
            System.out.print("Enter a integer bigger than zero: ");
            integer = input.nextInt();
        }

        int count = 1;
        int factorial = integer;

        while (count < integer)
        {
            factorial *= (integer - count);
            count++;
        }

        System.out.printf("%d! is equal to %d", integer, factorial);
    }
}
