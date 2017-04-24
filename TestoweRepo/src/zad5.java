import java.util.Scanner;

/**
 * Created by Ania on 2017-04-22.
 */
public class zad5 {
    public  static  void  main(String [] arg){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age >= 18)
            System.out.println("Jesteś pełnoletni");
        else
            System.out.println("Jesteś nie pełnoletni i nie możesz korzystać z ttego serwisu!");
    }
}
