package Cap4.Questions.OutputTableFormat;

// Ex 4.22: OutputTableFormat.java

public class OutputTableFormat
{
    public static void main(String[] args)
    {
        int n = 1;

        System.out.println("\nN      10*N      100*N      1000*N\n");

        while (n <= 5)
        {
            System.out.printf("%d      %d        %d        %d%n", 1*n*1, 1*n*10, 1*n*100, 1*n*1000);
            ++n;
        }
    }
}
