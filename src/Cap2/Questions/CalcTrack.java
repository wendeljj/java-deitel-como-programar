// Exercício 2.35: CalcTrack.java

package Cap2.Questions;

import java.util.Scanner;

public class CalcTrack
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double dailyCost, kmPerDay, gasPrice, kmPerLiter, parkingCostPerDay, tollPerDay;

        System.out.print("Total kilometers driven per day: ");
        kmPerDay = input.nextDouble();

        System.out.print("Price per liter of gasoline: ");
        gasPrice = input.nextDouble();

        System.out.print("Average kilometers per liter: ");
        kmPerLiter = input.nextDouble();

        System.out.print("Parking fees per day: ");
        parkingCostPerDay = input.nextDouble();

        System.out.print("Daily toll: ");
        tollPerDay = input.nextDouble();

        dailyCost = kmPerDay / kmPerLiter * gasPrice + parkingCostPerDay + tollPerDay;

        System.out.printf("Daily cost of driving: %.2f%n", dailyCost);
    }
}
