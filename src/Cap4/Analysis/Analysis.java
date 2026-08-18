package Cap4.Analysis;

// Figura 4.12: Analysis.java
// Análise dos resultados do exame utilizando instruções de controle aninhadas.

import java.util.Scanner;

public class Analysis
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
