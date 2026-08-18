package Cap4.Questions.Calculate;

// Exercício 4.6: Calculate.java
// Calcula a soma dos inteiros de 1 a 10

public class Calculate
{
    public static void main(String[] args)
    {
        int sum = 0;
        int count = 1;

        while (count <= 10)
        {
            sum += count;
            count++;
        }

        System.out.printf("Sum of integers 1 - 10: %d%n", sum);
    }
}
