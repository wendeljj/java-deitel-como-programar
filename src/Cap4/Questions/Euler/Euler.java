package Cap4.Questions.Euler;

import java.util.Scanner;

public class Euler
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer quantity for sequence of Euler: ");
        int qtyNumbers = input.nextInt();

        while (qtyNumbers <= 0)
        {
            System.out.println("Enter a valid value!\n");
            System.out.print("Enter a integer quantity for sequence of Euler: ");
            qtyNumbers = input.nextInt();
        }

        double euler = 1.0;
        int factorial = 1;
        int count = 1;
        while (count < qtyNumbers)
        {
            factorial *= count;
            euler += 1.0 / factorial;
            count++;
        }

        System.out.printf("e = %.2f", euler);
    }
}
