import java.util.Scanner;

/**
 * Created by Ania on 2017-04-23.
 */
public class zad7 {
    public static void  main(String [] arg){
        System.out.println("podaj:a");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("podaj:b");
        int b = scanner.nextInt();


        System.out.println("a+b = "+a+b);
        System.out.println("a-b = "+(a-b));
        System.out.println("a*b = "+(a*b));
        System.out.println("a/b = "+(a/b));
        System.out.println("a%b = "+(a%b));



    }
}
