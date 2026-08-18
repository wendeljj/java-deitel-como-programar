// Exercício 2.34: CalcPopWorld.java

package Cap2.Questions;

public class CalcPopWorld
{
    public static void main(String[] args)
    {
        double worldPeople = 8.3;
        double taxGrow = 0.085;
        double worldPeople1, worldPeople2, worldPeople3, worldPeople4, worldPeople5;

        worldPeople1 = worldPeople + worldPeople * taxGrow;
        worldPeople2 = worldPeople1 + worldPeople1 * taxGrow;
        worldPeople3 = worldPeople2 + worldPeople2 * taxGrow;
        worldPeople4 = worldPeople3 + worldPeople3 * taxGrow;
        worldPeople5 = worldPeople4 + worldPeople4 * taxGrow;

        System.out.printf("Estimated population in 1 year: %.1fbi%nEstimated population in 2 years: %.1fbi%nEstimated population in 3 years: %.1fbi%nEstimated population in 4 years: %.1fbi%nEstimated population in 5 years: %.1fbi%n",
                worldPeople1, worldPeople2, worldPeople3, worldPeople4, worldPeople5);

    }
}
