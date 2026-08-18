// Exercício 2.28: Diameter.java

package Cap2.Questions;

import java.util.Scanner;

public class Diameter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int ray;

        System.out.print("Enter ray: ");
        ray = input.nextInt();

        System.out.printf("Diameter: %d%nCircumference: %.2f%nArea: %.2f%n", ray * ray, 2 * Math.PI * ray, Math.PI * ray * ray);
    }
}
