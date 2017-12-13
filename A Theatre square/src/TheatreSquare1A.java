import java.math.BigDecimal;
import java.util.Scanner;

public class TheatreSquare1A {

    public static void main(String[] args) {

        double n ; double m ; double a ;
        double output;
        Scanner sc = new Scanner(System.in);

         n = sc.nextLong();
         m = sc.nextLong();
         a = sc.nextLong();

        output = Math.ceil((n/a)) * Math.ceil(m/a);

        System.out.println(new BigDecimal(output).toPlainString());

    }
}
