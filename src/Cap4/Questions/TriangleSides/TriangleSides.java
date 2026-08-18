package Cap4.Questions.TriangleSides;

import java.util.Scanner;

public class TriangleSides
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for first side of triangle: ");
        int s1 = input.nextInt();
        System.out.print("Enter a value for second side of triangle: ");
        int s2 = input.nextInt();
        System.out.print("Enter a value for third side of triangle: ");
        int s3 = input.nextInt();

        int biggest = Math.max(s1, Math.max(s2, s3));

        if (biggest == s1)
        {
            if (s2 + s3 > biggest)
                System.out.println("These sides form a triangle!");
            else
                System.out.println("These sides don't form a triangle!");
        } else if (biggest == s2)
        {
            if (s1 + s3 > biggest)
                System.out.println("These sides form a triangle!");
            else
                System.out.println("These sides don't form a triangle!");
        } else
        {
            if (s2 + s1 > biggest)
                System.out.println("These sides form a triangle!");
            else
                System.out.println("These sides don't form a triangle!");
        }
    }
}
