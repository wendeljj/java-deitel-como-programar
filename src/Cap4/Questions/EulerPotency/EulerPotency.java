package Cap4.Questions.EulerPotency;

import java.util.Scanner;

public class EulerPotency
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer quantity for sequence of Euler: ");
        int qtyNumber = input.nextInt();

        while (qtyNumber <= 0)
        {
            System.out.println("Enter a valid number!\n");
            System.out.print("Enter a integer quantity for sequence of Euler: ");
            qtyNumber = input.nextInt();
        }

        System.out.print("Enter an integer for exponent of base for Euler: ");
        int exponent = input.nextInt();

        while (exponent <= 0)
        {
            System.out.println("Enter a valid number!\n");
            System.out.print("Enter an integer for exponent of base for Euler: ");
            exponent = input.nextInt();
        }

        int count = 1;
        double euler = 1;
        double factorial = 1;

        while (count < qtyNumber)
        {
            double exponentFinal = Math.pow(exponent, count);

            factorial *= count;
            euler += exponentFinal / factorial;
            count++;
        }

        System.out.printf("e^%d = %.2f", exponent, euler);

    }
}
