package Cap3.Questions.Employee;


public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Roberto", "Carlos", 1518.70);
        Employee employee2 = new Employee("Ruth", "Silva", 2281.82);

        System.out.printf("%n%s annual salary: %.2f%n", employee1.getName(), employee1.getAnnualSalary());
        System.out.printf("%s annual salary: %.2f%n", employee2.getName(), employee2.getAnnualSalary());

        employee1.calculateIncreaseSalary(10);
        employee2.calculateIncreaseSalary(10);

        System.out.printf("%n%s annual salary after increase: %.2f%n", employee1.getName(), employee1.getAnnualSalary());
        System.out.printf("%s annual salary after increase: %.2f%n", employee2.getName(), employee2.getAnnualSalary());
    }

}
