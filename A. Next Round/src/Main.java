
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        byte n;
        byte k;
        Scanner sc = new Scanner(System.in);

        byte[] Scores = new byte[50];
        n = sc.nextByte();
        k = sc.nextByte();

        for(byte i=0;i<n;i++){
            Scores[i]=sc.nextByte();
        }

        byte temp = Scores[k-1];
        byte j=0;
        byte count=0;
        while((j<Scores.length)&&(Scores[j]>0)&&(Scores[j]>=temp)){
            count++;
            j++;
        }
        System.out.println(count);


    }
}