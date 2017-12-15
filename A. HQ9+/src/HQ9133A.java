import java.util.Scanner;

public class HQ9133A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "NO";
        if(input.contains("H"))
            output="YES";
        if(input.contains("Q"))
            output="YES";
        if(input.contains("9"))
            output="YES";

        System.out.print(output);
    }
}
