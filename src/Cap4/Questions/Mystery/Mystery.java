package Cap4.Questions.Mystery;

// Exercício 4.16: Mystery.java
// Realiza a potência por 2 dos valores 1 até 10 e depois imprime a soma deles.

public class Mystery
{
    public static void main()
    {
        int x = 1;
        int total = 0;

        while (x <= 10)
        {
            int y = x * x;
            System.out.println(y);
            total += y;
            ++x;
        }

        System.out.printf("Total is %d%n", total);
    }
}
