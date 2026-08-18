// Figura 3.9: AccountTest.java
// Entrada e saída de números de ponto flutuante com objetos Account.

package Cap3.Account3;

import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f %n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n",
                account2.getName(), account2.getBalance());

        System.out.print("Enter the deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

        System.out.print("Enter the deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());
    }
}
