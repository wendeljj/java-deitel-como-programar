package Cap4.Student;

// Figura 4.4: Student.java
// Classe Student que armazena o nome e a média de um aluno.

public class Student
{
    private String name;
    private double avarage;

    // construtor inicializa variáveis de instância
    public Student(String name, double avarage)
    {
        this.name = name;

        // valida que a média é > 0.0 e <= 100.0; caso contrário,
        // armazena o valor padrão da média da variável de instância (0.0)
        if (avarage >= 0.0)
            if (avarage <= 100.0)
                this.avarage = avarage; // atribui à variável de instância
    }

    // define o nome de Student
    public void setName(String name)
    {
        this.name = name;
    }

    // recupera o nome de Student
    public String getName()
    {
        return name;
    }

    // define a média de Student
    public void setAvarage(double avarage)
    {
        if (avarage >= 0.0)
            if (avarage <= 100.0)
                this.avarage = avarage;
    }

    // recuper a média de Student
    public double getAvarage()
    {
        return avarage;
    }

    public String getLetterGrade()
    {
        String letterGrade = "";

        if (avarage >= 90.0)
            letterGrade = "A";
        else if (avarage >= 80.0)
            letterGrade = "B";
        else if (avarage >= 70.0)
            letterGrade = "C";
        else if (avarage >= 60.0)
            letterGrade = "D";
        else
            letterGrade = "F";

        return letterGrade;
    }

}
