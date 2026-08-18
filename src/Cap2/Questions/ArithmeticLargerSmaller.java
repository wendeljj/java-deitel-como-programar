// Exercício 2.17: ArithmeticLargerSmaller.java

package Cap2.Questions;

import java.util.Scanner;

public class ArithmeticLargerSmaller
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, sum, avg, product;
        int smaller = 0;
        int larger = 0;

        System.out.print("Enter the first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;

        avg = sum / 3;

        product = num1 * num2 * num3;

        if (num1 >= num2)
        {
            larger = num1;
            smaller = num2;
        }

        if(num1 < num2)
        {
            larger = num2;
            smaller = num1;
        }

        if (larger < num3)
            larger = num3;

        if (smaller > num3)
            smaller = num3;

        System.out.printf("sum: %d%navg: %d%nproduct: %d%nsmallest: %d%nlargest: %d%n", sum, avg, product, smaller, larger);
    }
}
