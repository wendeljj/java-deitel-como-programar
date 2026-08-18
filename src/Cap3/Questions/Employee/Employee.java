package Cap3.Questions.Employee;

public class Employee
{
    private String name;
    private String surname;
    private double monthlySalary;

    public Employee(String name, String surname, double monthlySalary)
    {
        this.name = name;
        this.surname = surname;
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
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

    public void setMonthlySalary(double monthlySalary)
    {
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    public double getAnnualSalary()
    {
        return monthlySalary * 12;
    }

    public double calculateIncreaseSalary(double percentage)
    {
        return monthlySalary = monthlySalary * (1 + percentage / 100);
    }
}
