import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte[][] input = new byte[5][5];
        int minimum=0;

        for(byte i =0;i<input.length;i++) {
            for (byte j = 0; j < input.length; j++) {
                input[i][j] = sc.nextByte();

                if (input[i][j] == 1) {
                    minimum = Math.abs(2 - i) + Math.abs(2 - j);
                }
            }
        }
        System.out.println(minimum);
    }
}
