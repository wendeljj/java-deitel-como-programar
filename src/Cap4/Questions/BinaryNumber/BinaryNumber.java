package Cap4.Questions.BinaryNumber;

import java.util.Scanner;

public class BinaryNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary Number (0's and 1's): ");
        int binaryNum = input.nextInt();

        int decimalNum = 0;
        int countNatural = 1;

        while (binaryNum != 0)
        {
            decimalNum += (binaryNum % 10) * countNatural;
            binaryNum /= 10;

            countNatural *= 2;
        }

        System.out.printf("decimalNum is equal to %d", decimalNum);

    }
}
