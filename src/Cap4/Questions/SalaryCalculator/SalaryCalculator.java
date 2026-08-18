package Cap4.Questions.SalaryCalculator;

// Ex 4.20: SalaryCalculator.java

import java.util.Scanner;

public class SalaryCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int counter = 1;

        while (counter <= 3)
        {
            double employeeGrossSalary = 0.0;
            System.out.printf("Enter the employee %d hourly wage: ", counter);
            double employeeHourlyWage = input.nextDouble();
            while (employeeHourlyWage <= 0)
            {
                System.out.printf("Enter a valid hourly wage for employee %d: ", counter);
                employeeHourlyWage = input.nextDouble();
            }
            System.out.printf("Enter the number of hours worked by employee %d: ", counter);
            int employeeHoursWorked = input.nextInt();
            while (employeeHoursWorked <= 0)
            {
                System.out.printf("Enter a valid value for the hours worked by employee %d: ", counter);
                employeeHoursWorked = input.nextInt();
            }

            if (employeeHoursWorked > 40)
            {
                int employeeExtraHoursWorked = employeeHoursWorked - 40;
                double employeeBonusHourlyWage = employeeExtraHoursWorked * (employeeHourlyWage * 1.5);
                double employeeNormalHourlyWage = employeeHourlyWage * 40;
                employeeGrossSalary = employeeNormalHourlyWage + employeeBonusHourlyWage;
            }
            else
                employeeGrossSalary = employeeHourlyWage * employeeHoursWorked;

            System.out.printf("%nGross salary of employee %d: %.2f%n%n", counter, employeeGrossSalary);
            counter++;
        }
    }

}