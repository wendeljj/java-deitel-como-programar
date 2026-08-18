package Cap3.Questions.TargetHeart;

import java.time.LocalDate;

public class HeartRates
{
    private String name;
    private String surname;
    private int dateBirthDay;
    private int dateBirthMonth;
    private int dateBirthYear;

    public HeartRates(String name, String surname, int dateBirthDay, int dateBirthMonth, int dateBirthYear)
    {
        this.name = name;
        this.surname = surname;
        if (dateBirthDay < 32)
            this.dateBirthDay = dateBirthDay;
        if (dateBirthMonth < 13)
            this.dateBirthMonth = dateBirthMonth;
        this.dateBirthYear = dateBirthYear;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setSurname(String name)
    {
        this.surname = surname;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setDateBirthDay(int dateBirthDay)
    {
        this.dateBirthDay = dateBirthDay;
    }

    public int getDateBirthDay()
    {
        return dateBirthDay;
    }

    public void setDateBirthMonth(int dateBirthMonth)
    {
        this.dateBirthMonth = dateBirthMonth;
    }

    public int getDateBirthMonth() {
        return dateBirthMonth;
    }

    public void setDateYear(int dateBirthYear)
    {
        this.dateBirthYear = dateBirthYear;
    }

    public int getDateYear()
    {
        return dateBirthYear;
    }

    public int ageCalc()
    {
        LocalDate today = LocalDate.now();

        int dayToday = today.getDayOfMonth();
        int monthToday = today.getMonthValue();
        int yearToday = today.getYear();

        int dayAge = dayToday - dateBirthDay;
        int monthAge = monthToday - dateBirthMonth;
        int yearAge = yearToday - dateBirthYear;

        if (monthAge < 0 && dayAge < 0)
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

}
