import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {
        Byte n;
        ArrayList Words = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextByte();

        for (int i = 0; i <= n; i++) {
            Words.add(scanner.nextLine());
        }
        Iterator it = Words.iterator();
        while (it.hasNext()) {

            String Temp = it.next().toString();
            if(Temp.length() > 10 ){
                System.out.println(Temp.charAt(0)+""+(Temp.length()-2)+""+Temp.charAt(Temp.length()-1));

            }
            else
                System.out.println(Temp);
            }
        }
    }







