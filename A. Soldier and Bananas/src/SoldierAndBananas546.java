import java.util.Scanner;

public class SoldierAndBananas546 {

    public static void main(String[] args) {
        //gauss and consecutive numbers
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt(); int w = sc.nextInt();
        double cost = k*(((double)w/2)*(w+(1)));
        if((n-cost)<0)
        System.out.print((long)Math.abs(n-cost));
        else
            System.out.print(0);
    }
}
