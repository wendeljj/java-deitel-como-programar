package Cap3.Questions.Account;

import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);

    Account account1 = new Account("Roberto", 2.00);
    Account account2 = new Account("Lara", -100.00);

    System.out.printf("%s balance: %.2f%n",
            account1.getName(), account1.getBalance());
    System.out.printf("%s balance: %.2f%n",
            account2.getName(), account2.getBalance());

    System.out.printf("%nEnter the deposit for account1: ");
    double deposit = input.nextDouble();
    account1.deposit(deposit);

    System.out.printf("%nEnter the deposit for account2: ");
    deposit = input.nextDouble();
    account2.deposit(deposit);

    System.out.printf("%n%s balance: %.2f",
            account1.getName(), account1.getBalance());
    System.out.printf("%n%s balance: %.2f%n",
            account2.getName(), account2.getBalance());

    System.out.printf("%nEnter the withdraw for account1: ");
    double withdraw = input.nextDouble();
    if (withdraw > account1.getBalance())
        System.out.printf("%nWithdrawal amount exceeded account balance%n");
    account1.withdraw(withdraw);

    System.out.printf("%nEnter the withdraw for account2: ");
    withdraw = input.nextDouble();
    if (withdraw > account2.getBalance())
        System.out.printf("%nWithdrawal amount exceeded account balance%n");
    account2.withdraw(withdraw);

    System.out.printf("%n%s balance: %.2f",
            account1.getName(), account1.getBalance());
    System.out.printf("%n%s balance: %.2f%n",
            account2.getName(), account2.getBalance());
}

}
