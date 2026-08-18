package Cap4.Questions.CreditLimit;

// Ex 4.18: CreditLimit.java

import java.util.Scanner;

public class CreditAccountTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int accountLimitCredit= 1000;

        System.out.print("Enter the account number: ");
        int accountNum = input.nextInt();
        System.out.print("Enter the balance at the beginning of the month: ");
        int accountInitialBalance = input.nextInt();
        System.out.print("Enter the total of all items charged in the month: ");
        int accountMonthlyBilling = input.nextInt();
        System.out.print("Enter the total of all credits applied in the month: ");
        int accountAppliedCredit = input.nextInt();

        CreditAccount account1 = new CreditAccount(accountNum, accountInitialBalance,
                accountMonthlyBilling, accountAppliedCredit, accountLimitCredit);

        int finalBalance = account1.getInitialBalance() + account1.getMonthlyBilling() - account1.getAppliedCredit();
        System.out.printf("%nNew Balance: %d%n", finalBalance);

        if (finalBalance > accountLimitCredit)
            System.out.println("Credit limit exceeded");

    }
}