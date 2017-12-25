import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if(input.charAt(0)>91)
            input=(char)(input.charAt(0)-32)+input.substring(1,input.length());

        System.out.print(input);

    }
}
