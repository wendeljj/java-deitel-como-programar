package Cap4.Questions.AnalysisRequiem;

// Ex 4.24: AnalysisRequiem.java

import java.util.Scanner;

public class AnalysisRequiem
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentController = 1;

        while (studentController <= 10)
        {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            while (result != 1 && result != 2)
            {
                System.out.print("Enter a valid result! (1 = pass, 2 = fail): ");
                result = input.nextInt();
            }


            if (result == 1)
                passes++;
            else
                failures++;

            studentController++;
        }

        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
}
