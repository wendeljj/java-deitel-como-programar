// Exercício 2.25: OddOrEven.java

package Cap2.Questions;

import java.util.Scanner;

public class OddOrEven
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter the number: ");
        num = input.nextInt();

        if(num % 2 == 0)
            System.out.printf("%d is even", num);

        if (num % 2 != 0)
            System.out.printf("%d is odd", num);
    }
}
