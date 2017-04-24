import javax.swing.*;

/**
 * Created by Ania on 2017-04-24.
 */
public class Age {
    public static void main(String [] arg){
        int age = Integer.parseInt(JOptionPane.showInputDialog("Podaj swój wiek"));
        if (age > 18){
            JOptionPane.showMessageDialog(null, "Jesteś pełnoletni");
        }
        else{
            JOptionPane.showMessageDialog(null, "Nie jesteś pełnoletni");
        }
    }
}
