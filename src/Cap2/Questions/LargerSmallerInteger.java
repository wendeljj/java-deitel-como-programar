// Exercício 2.24: LargerSmallerInteger.java

package Cap2.Questions;

import java.util.Scanner;

public class LargerSmallerInteger
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, num5;
        int larger = 0;
        int smaller = 0;

        System.out.print("Enter the first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        num3 = input.nextInt();

        System.out.print("Enter the fourth integer: ");
        num4 = input.nextInt();

        System.out.print("Enter the fifth integer: ");
        num5 = input.nextInt();

        if (num1 >= num2)
        {
            larger = num1;
            smaller = num2;
        }

        if (num1 < num2)
        {
            larger = num2;
            smaller = num1;
        }

        if (larger < num3)
            larger = num3;

        if (smaller > num3)
            smaller = num3;

        if (larger < num4)
            larger = num4;

        if (smaller > num4)
            smaller = num4;

        if (larger < num5)
            larger = num5;

        if (smaller > num5)
            smaller = num5;

        System.out.printf("larger: %d%nsmaller: %d%n", larger, smaller);

    }
}
