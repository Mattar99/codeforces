import java.util.Scanner;

public class NearlyLuckyNumber110A {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong(); int counter = 0 ;
    String string = Long.toString(n);
        for (int i = 0; i <  string.length() ; i++) {
            if(string.charAt(i)=='4' || string.charAt(i)=='7')
                counter+=1;
        }
        if(counter==7 || counter ==4)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
