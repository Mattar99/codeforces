import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        short x = 0; short n;
        String operation;
        Scanner sc = new Scanner(System.in);
        n=sc.nextShort();
        for(short i =0;i<n;i++){
            operation = sc.next();
            if(operation.contains("++")){
                x++;
            }else
                x--;
        }
        System.out.println(x);
    }
}
