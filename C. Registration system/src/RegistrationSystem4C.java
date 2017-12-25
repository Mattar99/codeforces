import java.util.HashMap;
import java.util.Scanner;
public class RegistrationSystem4C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>(n);
        // will break if the user enter a name with a digit
        for (int i = 0; i <n ; i++) {
            String holder = sc.next();

            if(hashMap.containsKey(holder)){
                hashMap.put(holder,hashMap.get(holder)+1);
                System.out.println(holder+hashMap.get(holder));
            }else {
                hashMap.put(holder, 0);
                System.out.println("OK");
            }
        }
    }
}
