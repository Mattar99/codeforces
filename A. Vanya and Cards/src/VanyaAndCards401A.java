import java.util.Scanner;

public class VanyaAndCards401A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , x = sc.nextInt();
        int total=0;
        int[] values = new int[n];
        for (int i = 0; i < n ; i++) {
            values[i]=sc.nextInt();
            total+=values[i];
        }

        if(total==x){
            System.out.println(1);
        }else{
            if(total<0) {
                total = -1 * total;
                double count = Math.ceil((double) total / x);
                System.out.println((int)count);
            }else if(total>0){
                double count = Math.ceil((double) total / x);
                System.out.println((int)(count));
            }else
            System.out.println(0);
        }




    }
}
