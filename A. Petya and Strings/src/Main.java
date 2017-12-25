import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1; String str2;
        str1=sc.nextLine().toLowerCase(); str2=sc.nextLine().toLowerCase();
        System.out.println((int)((str1.compareTo(str2))*(1.0/Math.abs(str1.compareTo(str2)))));

    }
}
