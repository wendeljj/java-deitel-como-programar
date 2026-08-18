package Cap4.Questions.LargestNumber;

// Ex 4.21: LargestNumber.java

import java.util.Scanner;

public class LargestNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int largest = 0;

        while (counter < 10)
        {
            System.out.print("Enter a integer: ");
            int number = input.nextInt();
            if (counter == 0)
                largest = number;
            if (number > largest)
                largest = number;
           ++counter;
        }

        System.out.printf("%nLargest integer inserted is: %d%n", largest);

    }
}
