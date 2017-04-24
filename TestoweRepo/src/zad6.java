import java.util.Scanner;

/**
 * Created by Ania on 2017-04-22.
 */
public class zad6 {
    public  static void main(String [] arg){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max;
        if(a>b)
            max = a;
        else
            max =b;
        if (c>max)
            max= c;
        System.out.println(max);


    }
}
