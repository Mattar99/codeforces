import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String n1;
        String n2;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextLine();
        n2 = sc.nextLine();
        for (byte i = 0; i < n1.length(); i++) {
            System.out.print(n1.charAt(i)^n2.charAt(i));
        }
    }
}
