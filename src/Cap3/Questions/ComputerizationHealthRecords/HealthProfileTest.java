package Cap3.Questions.ComputerizationHealthRecords;

import java.util.Scanner;

public class HealthProfileTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name for person1: ");
        String name = input.nextLine();

        System.out.print("Enter the surname for person1: ");
        String surname = input.nextLine();

        System.out.print("Enter the sex for person1 (M or F): ");
        char sex = input.next("[a-zA-Z]").charAt(0);

        System.out.print("Enter the day of birth for person1: ");
        int dayBirth = input.nextInt();

        System.out.print("Enter the month of birth for person1: ");
        int monthBirth = input.nextInt();

        System.out.print("Enter the year of birth for person1: ");
        int yearBirth = input.nextInt();

        System.out.print("Enter the height for person1: ");
        double height = input.nextDouble();

        System.out.print("Enter the weight for person1: ");
        double weight = input.nextDouble();

        String nameSurname = String.format("%s %s", name, surname);

        String dateBirth = String.format("%02d/%02d/%d", dayBirth, monthBirth, yearBirth);

        HealthProfile person1 = new HealthProfile(
                name, surname, sex, dayBirth, monthBirth, yearBirth, height, weight);

        System.out.printf("person1%nname: %s%nsex: %c%ndate of birth: %s%nheight: %.2fm%nweight: %.2fkg%nage: %d years%nIMC: %.2f%nmaximum heart rate: %d%ntarget heart rate: %.2f - %.2f",
                nameSurname, sex, dateBirth, height, weight, person1.ageCalc(), person1.ImcCalc(), person1.maxHeartRate(), person1.targetminHeartRate(), person1.targetmaxHeartRate());
    }
}
