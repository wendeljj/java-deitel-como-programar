package Cap3.Questions.TargetHeart;

import java.util.Scanner;

public class HeartRatesTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of person1: ");
        String name = input.nextLine();
        System.out.print("Enter the surname of person1: ");
        String surname = input.nextLine();
        System.out.print("Enter the day of birth of person1: ");
        int dayBirth = input.nextInt();
        System.out.print("Enter the month of birth of person1: ");
        int monthBirth = input.nextInt();
        System.out.print("Enter the Year of birth of person1: ");
        int yearBirth = input.nextInt();

        String fullName = String.format("%s %s",name, surname);

        HeartRates person1 = new HeartRates(name, surname, dayBirth, monthBirth, yearBirth);

        System.out.printf("%n%s%nage: %d%nmaximum heart rate: %d%ntarget heart rate: %.2f - %.2f",
                fullName, person1.ageCalc(), person1.maxHeartRate(), person1.targetminHeartRate(), person1.targetmaxHeartRate());
    }
}
