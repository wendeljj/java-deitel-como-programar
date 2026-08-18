// Exercício 2.15: Arithmetic.java

package Cap2.Questions;

import java.util.Scanner;

public class Arithmetic
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1, number2, sum,
                product, difference, quotient;

        System.out.print("Enter the first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;
        product = number1 * number2;
        difference = number1 - number2;
        quotient = number1 / number2;

        System.out.printf("Sum = %d%nProduct = %d%nDifference = %d%nQuotitent = %d%n", sum, product, difference, quotient);
    }
}
