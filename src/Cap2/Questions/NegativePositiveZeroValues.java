// Exercício 2.32: NegativePositiveZeroValues.java

package Cap2.Questions;

import java.util.Scanner;

public class NegativePositiveZeroValues
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, num5;
        int positive = 0;
        int negative = 0;
        int zero = 0;

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

        if (num1 > 0)
            positive = positive + 1;

        if (num1 < 0)
            negative = negative + 1;

        if (num1 == 0)
            zero = zero + 1;

        if (num2 > 0)
            positive = positive + 1;

        if (num2 < 0)
            negative = negative + 1;

        if (num2 == 0)
            zero = zero + 1;

        if (num3 > 0)
            positive = positive + 1;

        if (num3 < 0)
            negative = negative + 1;

        if (num3 == 0)
            zero = zero + 1;

        if (num4 > 0)
            positive = positive + 1;

        if (num4 < 0)
            negative = negative + 1;

        if (num4 == 0)
            zero = zero + 1;

        if (num5 > 0)
            positive = positive + 1;

        if (num5 < 0)
            negative = negative + 1;

        if (num5 == 0)
            zero = zero + 1;



        System.out.printf("Negative values: %d%nPositive values: %d%nZeroes: %d%n", negative, positive, zero);

    }
}
