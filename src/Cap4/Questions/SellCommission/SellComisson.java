package Cap4.Questions.SellCommission;

// Ex 4.19: SellComission.java

import java.util.Scanner;

public class SellComisson
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double totalSales = 0.0;
        int entrySoldItems = 0;
        double fixedWeeklySalary = 200.0;
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;

        while (entrySoldItems != -1)
        {
            System.out.print("Item    Value\n1       239.99\n2       129.75\n3        99.95\n4       350.89\nEnter the number of item (-1 to finish): ");
            entrySoldItems = input.nextInt();

            if (entrySoldItems != - 1)
            {
                if (entrySoldItems == 1) {
                    totalSales += item1;
                    System.out.println("Item 1 successfully inserted.");
                } else if (entrySoldItems == 2) {
                    totalSales += item2;
                    System.out.println("Item 2 successfully inserted.");
                } else if (entrySoldItems == 3) {
                    totalSales += item3;
                    System.out.println("Item 3 successfully inserted.");
                } else if (entrySoldItems == 4) {
                    totalSales += item4;
                    System.out.println("Item 4 successfully inserted.");
                } else
                    System.out.println("This item is not on the list.");
            } else
                System.out.println("Successfully finished.");
        }

        double finalSalary = fixedWeeklySalary + 0.09 * totalSales;
        System.out.printf("%nSeller's Income: %.2f%n", finalSalary);

    }
}