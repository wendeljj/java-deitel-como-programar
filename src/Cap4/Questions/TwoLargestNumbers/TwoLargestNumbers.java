package Cap4.Questions.TwoLargestNumbers;

// Ex 4.23: TwoLargestNumbers.java

import java.util.Scanner;

public class TwoLargestNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int largest = 0;
        int secondLargest = 0;

        while (counter < 10)
        {
            System.out.print("Enter a integer: ");
            int number = input.nextInt();
            if (counter == 0)
                largest = number;
            if (number > largest)
            {
                secondLargest = largest;
                largest = number;
            }
            ++counter;
        }

        System.out.printf("%nLargest integer inserted is: %d%nSecond largest integer inserted is: %d%n",
                largest, secondLargest);
    }
}
