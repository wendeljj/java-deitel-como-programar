package Cap4.ClassAverage;

// Figura 4.10: ClassAverage2.java
// Resolvendo o problema da  média da classe usando a repetição controlada por sentinelaa.

import java.util.Scanner;

public class ClassAverage2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.print("Enter the grade or -1 to quit: ");
        int grade = input.nextInt();

        while (grade != -1)
        {
            total += grade;
            gradeCounter++;

            System.out.print("Enter the grade or -1 to quit: ");
            grade = input.nextInt();
        }

        if (gradeCounter != 0)
        {
            double average = (double)total / gradeCounter;
            System.out.printf("%nTotal of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else
            System.out.println("No grades were entered");
    }
}
