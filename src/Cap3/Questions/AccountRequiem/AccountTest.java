// Figura 3.9: AccountTest.java
// Entrada e saída de números de ponto flutuante com objetos Account.

package Cap3.Questions.AccountRequiem;

import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        Account.displayAccount(account1);
        Account.displayAccount(account2);

        System.out.print("Enter the deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        Account.displayAccount(account1);
        Account.displayAccount(account2);

        System.out.print("Enter the deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        Account.displayAccount(account1);
        Account.displayAccount(account2);
    }
}
