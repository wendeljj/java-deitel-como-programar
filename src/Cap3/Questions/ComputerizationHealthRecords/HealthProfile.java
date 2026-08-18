package Cap3.Questions.ComputerizationHealthRecords;

import java.time.LocalDate;

public class HealthProfile
{
    private String name;
    private String surname;
    private char sex;

    private int dayBirth;
    private int monthBirth;
    private int yearBirth;

    private double height;
    private double weight;

    public HealthProfile(String name, String surname, char sex,
                         int dayBirth, int monthBirth, int yearBirth, double height, double weight)
    {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSex(char sex)
    {
        this.sex = sex;
    }

    public char getSex()
    {
        return sex;
    }

    public void getDayBirth(int dayBirth)
    {
        this.dayBirth = dayBirth;
    }

    public int setDayBirth()
    {
        return dayBirth;
    }

    public void getMonthBirth(int monthBirth)
    {
        this.monthBirth = monthBirth;
    }

    public int setMonthBirth()
    {
        return monthBirth;
    }

    public void getYearBith(int yearBirth)
    {
        this.yearBirth = yearBirth;
    }

    public int setYearBirth()
    {
        return yearBirth;
    }

    public void getHeight(double height)
    {
        this.height = height;
    }

    public double setHeight()
    {
        return height;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getWeight()
    {
        return weight;
    }

    public int ageCalc()
    {
        LocalDate today = LocalDate.now();

        int todayDay = today.getDayOfMonth();
        int todayMonth = today.getMonthValue();
        int todayYear = today.getYear();

        int dayAge = todayDay - dayBirth;
        int monthAge = todayMonth - monthBirth;
        int yearAge = todayYear - yearBirth;

        if (monthAge < 0  && dayAge < 0)
            return yearAge - 1;
        else
            return yearAge;
    }

    public int maxHeartRate()
    {
        return 220 - ageCalc();
    }

    public double targetminHeartRate()
    {
        double minRate = (double) ((double)maxHeartRate() * 0.50);
        return minRate;
    }

    public double targetmaxHeartRate()
    {
        double maxRate = (double) ((double)maxHeartRate() * 0.85);
        return maxRate;
    }

    public double ImcCalc()
    {
        return weight / (height * height);
    }

}
