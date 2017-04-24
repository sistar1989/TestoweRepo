import java.util.Scanner;

/**
 * Created by Ania on 2017-04-23.
 */
public class zad8 {
    public static void main(String [] arg){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a%2==0)
            System.out.println("Podana liczna jest parzysta");
        else
            System.out.println("Podana liczna jest nie parzysta");
    }
}
