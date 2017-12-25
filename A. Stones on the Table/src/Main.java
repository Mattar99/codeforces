import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        byte n= sc.nextByte();
        String input=sc.next();
        byte count=0;
        char[] stones = input.toCharArray();
        for(byte i=0;i<n-1;i++){
            if(stones[i]==stones[i+1]){
                count++;
                stones[i]='\0';
            }
        }
        System.out.println(count);
    }
}
