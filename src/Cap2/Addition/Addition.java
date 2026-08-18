package Cap2.Addition;

import java.util.Scanner; //programa utiliza a classe Scanner

public class Addition
{
    public static void main(String[] args)
    {
        //cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        int number1,
         number2,
         sum;

        System.out.print("Enter the first Integer: ");
        number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

        System.out.print("Enter the second Integer: ");
        number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário

        sum = number1 + number2; // soma os números, depois armazena o total em sum

        System.out.printf("Sum is %d%n", sum);
    }
}
