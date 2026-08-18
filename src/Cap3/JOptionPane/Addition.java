// Exercício estudo de caso GUI e imagens gráficas: Addition.java

package Cap3.JOptionPane;

import javax.swing.JOptionPane;

public class Addition
{
    public static void main(String[] args)
    {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number 1"));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number 2"));

        int sum = number1 + number2;

        String message = String.format("Sum is %d", sum);

        JOptionPane.showMessageDialog(null, message);
    }
}
