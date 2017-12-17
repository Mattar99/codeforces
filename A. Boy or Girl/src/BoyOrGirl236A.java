import java.util.Scanner;

public class BoyOrGirl236A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        StringBuilder dummyString = new StringBuilder();
         for (int i = 0; i <userName.length() ; i++) {
            while(!(dummyString.toString().contains(userName.charAt(i)+"")))
                dummyString.append(userName.charAt(i));
        }

        if(dummyString.length()%2==0)
            System.out.println("CHAT WITH HER!");
         else
             System.out.println("IGNORE HIM!");

         

    }
}
