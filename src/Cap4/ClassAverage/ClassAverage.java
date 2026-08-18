package Cap4.ClassAverage;

// Figura 4.8: ClassAverage.java
// Resolvendo o problema da média da classe usando a repetição controlada por contador.

import java.util.Scanner;

public class ClassAverage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10)
        {
            System.out.print("Enter the grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter += 1;
        }

        int average = total / 10;

        System.out.printf("Class average: %d%n", average);
    }
}