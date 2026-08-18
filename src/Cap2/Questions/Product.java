//Exercício 2.6: Product.Java

package Cap2.Questions;

import java.util.Scanner;

public class Product // programa que calcula o produto de três valores do tipo inteiro
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int x, y, z,
                result;

        System.out.print("Enter the first integer: ");
        x = input.nextInt();

        System.out.print("Enter the second integer: ");
        y = input.nextInt();

        System.out.print("Enter the third integer: ");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("Product is %d", result);
    }
}
