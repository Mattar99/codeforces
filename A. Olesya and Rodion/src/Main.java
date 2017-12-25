import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       byte n;
       byte t;
       String output="";

       Scanner sc = new Scanner(System.in);
       n=sc.nextByte();
       t=sc.nextByte();

       if(t==10){
                if(n==1){
                    System.out.println(-1);
                }else
                {   output="1";
                    output=output+repeat("0" , (n-1) ) ;
                }
       }else{
           output=repeat(Byte.toString(t),n);
       }

       System.out.println(output);
    }

    public static String repeat(String str, int times) {

        return new String(new char[times]).replace("\0", str);
    }
}
