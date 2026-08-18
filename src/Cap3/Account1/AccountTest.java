// Figura 3.2: AccountTest.java
// Cria e manipula um objeto Account
package Cap3.Account1;

import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        // cria um objeto Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // cria um objeto Account e o atribui a myAccount
        Account myAccount = new Account();

        // exibe o valor inicial do nome (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // solicita e lê o nome
        System.out.print("Enter the name: ");
        String theName = input.nextLine(); // lê uma linha de texto
        myAccount.setName(theName); // insere theName em myAccount
        System.out.println();

        // exibe o nome armazenado no objeto myAccount
        System.out.printf("Name in object myAccount is: %s%n",
                myAccount.getName());
    }
}
