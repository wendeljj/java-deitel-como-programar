// Exercício 2.29: IntegerValueCharacter.java

package Cap2.Questions;

public class IntegerValueCharacter
{
    public static void main(String[] args)
    {
        System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
        System.out.printf("The chacters: %c %c %c %c %c %c %c %c %c %c %c %c %c %c%nHas the values: %d %d %d %d %d %d %d %d %d %d %d %d %d %d%n",
                'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' ',
                ((int) 'A'), ((int) 'B'), ((int) 'C'), ((int) 'a'), ((int) 'b'), ((int) 'c'),
                ((int) '0'), ((int) '1'), ((int) '2'), ((int) '$'), ((int) '*'),
                ((int) '+'), ((int) '/'), ((int) ' '));
    }
}
