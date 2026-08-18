// Exercício 2.30: DigitsInteger.java

package Cap2.Questions;

import java.util.Scanner;

public class DigitsInteger
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num, dig1, dig2, dig3, dig4, dig5;

        System.out.print("Enter the number with 5 digits: ");
        num = input.nextInt();

        dig1 = num / 10000;
        dig2 = num % 10000 / 1000;
        dig3 = num % 1000 / 100;
        dig4 = num % 100 / 10;
        dig5 = num %10;

        System.out.printf("%d   %d   %d   %d   %d", dig1, dig2, dig3, dig4, dig5);
    }
}
