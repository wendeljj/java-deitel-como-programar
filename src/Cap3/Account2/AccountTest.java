// Figura 3.6: AccountTest.java
// Usando o construtor de Account para inicializar a instânica name
// variável no momento em que cada objeto Account é criado.


package Cap3.Account2;

public class AccountTest
{
    public static void main(String[] args)
    {
        // cria dois objetos Account
        Account account1 = new Account("Jane Green");
        Account account2 = new Account("John Blue");

        // exibe o valor inicial de nome para cada Account
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());
    }
}
