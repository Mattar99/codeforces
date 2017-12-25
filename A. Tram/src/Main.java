import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        short n = sc.nextShort();
        short[][] ab = new short[n][2];
        int capacity=0;
        int counter=0;

        for (short i = 0 ; i<n;i++){
            for(short j = 0 ; j < 2; j++) {
                ab[i][j] = sc.nextShort();

                if(j==0)
                    capacity-=ab[i][j];
                if(j==1) {
                    capacity += ab[i][j];
                    if (counter < capacity)
                        counter=capacity;
                }
            }
        }

        System.out.println(counter);



    }
}
