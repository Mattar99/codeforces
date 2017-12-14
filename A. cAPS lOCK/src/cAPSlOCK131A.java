import java.util.Scanner;



public class cAPSlOCK131A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output=input;

        if (input.matches("^[a-z][A-Z]*$")) {
            output=input.substring(0,1).toUpperCase();
            output+=input.substring(1,input.length()).toLowerCase();
        }

        if (input.matches("^[A-Z]*$")) {
            output = input.toLowerCase();

        }

        System.out.println(output);
    }

}





