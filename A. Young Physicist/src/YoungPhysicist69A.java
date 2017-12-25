import java.util.Scanner;
public class YoungPhysicist69A {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] vector = new int[3];
    int number = sc.nextInt();
        for (int i = 0; i <(3*number) ; i++) {
            vector[i%3]+= sc.nextInt();
        }
    if(vector[0]!=0 || vector[1]!=0 || vector[2]!=0 )
        System.out.print("NO");
     else
         System.out.print("YES");

    }
}
