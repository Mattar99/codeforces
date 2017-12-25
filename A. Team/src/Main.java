import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        short n ; byte petya; byte vasya; byte tanya;
        short count=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextShort();
        for(short i=0;i<n;i++){
            petya=sc.nextByte();vasya=sc.nextByte();tanya=sc.nextByte();
            if(tanya+vasya+petya>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
