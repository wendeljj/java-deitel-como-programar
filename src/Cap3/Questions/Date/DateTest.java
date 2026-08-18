package Cap3.Questions.Date;

public class DateTest
{
    public static void main(String[] args)
    {
        Date date1 = new Date(12, 3, 2012);

       String formatDate = date1.displayDate();

        System.out.printf("date1: %s", formatDate);
    }
}
