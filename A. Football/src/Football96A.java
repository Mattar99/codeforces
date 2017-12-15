import java.util.Scanner;

public class Football96A {

    public static void main(String[] args) {
        String input; Scanner sc = new Scanner(System.in); input=sc.nextLine();
        if(input.contains("0000000")||input.contains("1111111")){
            System.out.println("YES");
        }else
        System.out.println("NO");
    }
}
