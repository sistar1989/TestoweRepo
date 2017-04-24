import javax.swing.*;

/**
 * Created by Ania on 2017-04-23.
 */
public class Main {
    public static void main(String [] arg){
        String name = JOptionPane.showInputDialog(null, "Podaj swoje imię");
        String surname = JOptionPane.showInputDialog(null,"Podaj swoje nazwisko");
        int lenght = name.length();
        char lastLetter = name.charAt(lenght -1);
        if (lastLetter == 'a'){
            JOptionPane.showMessageDialog(null,"Nazywasz się"+" "+name+" "+surname +" i jesteś kobietą ");
        }
        else{
            JOptionPane.showMessageDialog(null,"Nazywasz się"+" "+name+" "+surname +" i jesteś mężczyzną");

        }


    }
}
