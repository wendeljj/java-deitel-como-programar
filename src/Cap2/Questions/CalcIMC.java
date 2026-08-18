// Exercício 2.33: CalcIMC.java

package Cap2.Questions;

import java.util.Scanner;

public class CalcIMC
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double imc, weight, height;

        System.out.printf("BMI VALUES%nUnderweight: less than 18.5%nNormal:      between 18.5 and 24.9%nOverweight:  between 25 and 29.9%nObese:       30 or greater%n%n");

        System.out.print("Enter your weight: ");
        weight = input.nextDouble();

        System.out.print("Enter your height: ");
        height = input.nextDouble();

        imc = weight / (height * height);

        System.out.printf("IMC: %.2f", imc);
    }
}
