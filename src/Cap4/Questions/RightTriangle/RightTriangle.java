package Cap4.Questions.RightTriangle;

import java.util.Scanner;

public class RightTriangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for first side of right triangle: ");
        int s1 = input.nextInt();
        System.out.print("Enter a value for second side of right triangle: ");
        int s2 = input.nextInt();
        System.out.print("Enter a value for third side of right triangle: ");
        int s3 = input.nextInt();

        int hypotenuse = Math.max(s1, Math.max(s2, s3));

        if (hypotenuse == s1)
        {
            if (s2 * s2 + s3 * s3 == s1 * s1)
                System.out.print("These sides form a right triangle!");
            else
                System.out.print("These sides don't form a right triangle!");
        } else if (hypotenuse == s2)
        {
            if (s1 * s1 + s3 * s3 == s2 * s2)
                System.out.print("These sides form a right triangle!");
            else
                System.out.print("These sides don't form a right triangle!");
        } else
        {
            if (s2 * s2 + s1 * s1 == s3 * s3)
                System.out.print("These sides form a right triangle!");
            else
                System.out.print("These sides don't form a right triangle!");
        }
    }
}
