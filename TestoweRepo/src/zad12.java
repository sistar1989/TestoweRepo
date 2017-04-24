import java.util.Scanner;

/**
 * Created by Ania on 2017-04-23.
 */
public class zad12 {
    public static void main(String [] arg){
        Scanner scanner = new Scanner(System.in);
        String password;
        do{
            System.out.println("Podaj hasło");
            password = scanner.next();

        }while(!password.equals("Akademia") && !password.equals("akademia"));
        System.out.println("Gratuluję! Podałeś poprawne hasło.");
    }
}
