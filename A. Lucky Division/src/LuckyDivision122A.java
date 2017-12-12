import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class LuckyDivision122A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] data = new int[]{4,7,44,47,74,77,444,447,474,477,777,774,747,744};
        String output="";

        for(int i =0 ; i<data.length;i++){
            if(input==data[i]) {
                output = "YES";
                break;
            }
            else{
                for(int j =0; j<10;j++){
                    if(input%data[j]==0){
                        output="YES";
                        break;
                    }else
                        output="NO";
                }
            }
        }
        System.out.println(output);
    }
}
