import java.util.Scanner;

public class QueueAtTheSchool266B {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        byte t = sc.nextByte();
        String initial = sc.next();
        char[] queue = initial.toCharArray();
        // or you could just use a string and use the replace function.
        for (int i = 0; i < t ; i++) {
            byte counter = 0;
            while (counter + 1 < n) {
                if (queue[counter] == 'B') {
                    if (queue[counter + 1] == 'G') {
                        char Temp = queue[counter];
                        queue[counter] = queue[counter + 1];
                        queue[counter + 1] = Temp;
                        counter += 2;
                    }else
                        counter++;
                } else {
                    counter++;
                }
            }
        }

        System.out.println(String.valueOf(queue));


    }
}

