import java.util.Scanner;

public class XeniaAndRingroad339B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long currentPosition = 1, count = 0;

        for (int i = 0; i < m; i++) {
            long test = sc.nextInt();
            count += currentPosition <= test ? test-currentPosition : n-currentPosition+test;
            currentPosition = test;
        }
        System.out.println(count);
    }
}

