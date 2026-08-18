// Exercício 2.26: Multiple.java

package Cap2.Questions;

import java.util.Scanner;

public class Multiple
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter number 1: ");
        num1 = input.nextInt();

        System.out.print("Enter number 2: ");
        num2 = input.nextInt();

        if (num1 % num2 == 0)
            System.out.printf("%d is multiple of %d%n", num1, num2);
    }
}
