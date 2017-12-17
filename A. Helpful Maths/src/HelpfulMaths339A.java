import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths339A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Input = sc.nextLine();
        char[] Sort;
        Sort = Input.toCharArray();
        Arrays.sort(Sort);
        StringBuilder s = new StringBuilder();
        byte i=0; byte j = (byte)(Input.length()/2);
        while((i<(Input.length()/2)+1)&&(j<Input.length())){
            s.append(Sort[j++]);
            if(i!=(Input.length()/2)) {
                s.append(Sort[i++]);
            }
        }
        System.out.println(s.toString());

    }
}