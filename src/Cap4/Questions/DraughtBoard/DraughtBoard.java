package Cap4.Questions.DraughtBoard;

public class DraughtBoard
{
    public static void main(String[] args)
    {
        int count1 = 0;
        int count2 = 0;

        while (count1 < 4)
        {
            count2 = 0;
            while (count2 < 8)
            {
                System.out.print("* ");
                count2++;
            }
            count2 = 0;

            System.out.println();

            while (count2 < 8)
            {
                System.out.print(" *");
                count2++;
            }

            System.out.println();
            count1++;
        }
    }
}
