import java.util.Arrays;
import java.util.Scanner;

public class Queue545D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] t = new long[n];
        long count=0;
        long total=0;
        for (int i = 0; i <n ; i++) {
            t[i]=sc.nextLong();
        }
        Arrays.sort(t);
        for (int i = 0; i <n ; i++) {
            if(total<=t[i]){
                count++;
                total+=t[i];
            }else
                continue;

        }
        System.out.println(count);
    }
}
