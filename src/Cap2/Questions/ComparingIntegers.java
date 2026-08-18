// Exercício 2.16: ComparisionIntegers.java

package Cap2.Questions;

import java.util.Scanner;

public class ComparingIntegers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enter the first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        num2 = input.nextInt();

        if (num1 > num2)
            System.out.printf("%d is larger%n", num1);

        if (num1 < num2)
            System.out.printf("%d is larger%n", num2);

        if (num1 == num2)
            System.out.printf("These numbers are equal%n");
    }
}
