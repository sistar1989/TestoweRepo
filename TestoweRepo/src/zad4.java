import java.util.Scanner;

/**
 * Created by Ania on 2017-04-22.
 */
public class zad4 {
    public static  void  main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a>0)
            System.out.println("liczna dodatnia");
        if (a==0)
            System.out.print("podałeś liczbę zero");
        else
            System.out.println("liczna ujemna");
    }


}
