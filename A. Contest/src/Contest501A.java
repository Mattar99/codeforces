import java.util.Scanner;

public class Contest501A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b = sc.nextInt() , c=sc.nextInt() , d=sc.nextInt();

        if(Math.max((a*3)/10,a-(a/250)*c)>Math.max((b*3)/10,b-(b/250)*d)){
            System.out.print("Misha");
        }else if (Math.max((a*3)/10,a-(a/250)*c)<Math.max((b*3)/10,b-(b/250)*d))
            System.out.print("Vasya");
        else
            System.out.print("Tie");

    }
}
