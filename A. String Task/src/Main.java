import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s = ""; short i=0;
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        s = s.toLowerCase();
        s = s.replaceAll("[aoyeui]", "");
        StringBuilder s1 = new StringBuilder(s);
        while (i < (s.length()*2)) {
            s1.insert(i,'.');
            i+=2;
        }
        System.out.println(s1.toString());
    }
}
