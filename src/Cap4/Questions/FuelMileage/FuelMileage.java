package Cap4.Questions.FuelMileage;

// Exercício 4.17: FuelMileage.java
// Calcula e exibe a média de consumo de quilometros/litro e exibe a soma de quilometros e litros

import java.util.Scanner;

public class FuelMileage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int kilometersAdded = 0;
        int fuelAdded = 0;
        int fuelSpent = 0;

        System.out.print("Enter the kilometers driven (Enter -1 to finish): ");
        int kilometersDriven = input.nextInt();
        if (kilometersDriven != -1)
        {
            System.out.print("Enter the fuel spent (Enter -1 to finish): ");
            fuelSpent = input.nextInt();
        }
        while (kilometersDriven != -1 && fuelSpent != -1)
        {
            double consumption = (double) kilometersDriven / fuelSpent;
            kilometersAdded += kilometersDriven;
            fuelAdded += fuelSpent;
            System.out.printf("The consumption in kilometers driven / fuel spent: %.2f%n",
                    consumption);
            System.out.printf("Kilometers driven until now: %d%nFuel spent until now: %d%n",
                    kilometersAdded, fuelAdded);

            System.out.print("Enter the kilometers driven (Enter -1 to finish): ");
            kilometersDriven = input.nextInt();
            if (kilometersDriven != -1)
            {
                System.out.print("Enter the kilometers driven (Enter -1 to finish): ");
                fuelSpent = input.nextInt();
            }
        }
    }
}
