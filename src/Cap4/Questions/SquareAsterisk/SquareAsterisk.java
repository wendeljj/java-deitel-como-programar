package Cap4.Questions.SquareAsterisk;

import java.util.Scanner;

public class SquareAsterisk
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int line = 0;
        int column = 0;

        int countLine = 1;
        int countColumn = 1;


        while (line <= 0 || line >= 21)
        {
            System.out.print("Enter an integer a range of 1 and 20 for row: ");
            line = input.nextInt();
        }

        while (column <= 0 || column >= 21)
        {
            System.out.print("Enter an integer a range of 1 and 20 for column: ");
            column = input.nextInt();
        }

        int space = line - 2;
        int countSpace = 1;

        while (countColumn <= column)
        {
            if (countColumn == 1 || countColumn == column)
            {
                while (countLine <= line)
                {
                    System.out.print("*");
                    ++countLine;
                }
            } else
            {
                System.out.print("*");
                while (countSpace <= space)
                {
                    System.out.print(" ");
                    ++countSpace;
                }
                System.out.print("*");
            }
            System.out.println();
            countSpace = 1;
            countLine = 1;
            ++countColumn;
        }

    }
}
