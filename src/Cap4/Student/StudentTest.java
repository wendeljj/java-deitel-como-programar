package Cap4.Student;

// Figura 4.5: StudentTest.java
// Cria e testa objetos Student.

public class StudentTest
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Roger", 80.0);
        Student student2 = new Student("Lukas", 91.2);

        System.out.printf("%s letter grade is: %s%n",
                student1.getName(), student1.getLetterGrade());

        System.out.printf("%s letter grade is: %s%n",
                student2.getName(), student2.getLetterGrade());
    }
}
