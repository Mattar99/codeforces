import java.util.Scanner;

public class GeorgeAndAccommodation467 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfrooms = sc.nextInt();
        byte counter=0;
        for (int i = 0; i <numberOfrooms ; i++) {
            if(Math.abs(sc.nextInt()-sc.nextInt())>=2)
                counter++;
        }

        System.out.println(counter);
    }
 }


