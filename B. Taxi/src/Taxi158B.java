import java.util.Scanner;

public class Taxi158B
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] groups = new int[5];
        for(int i=0;i<n;i++){
            groups[sc.nextInt()]++;
        }
        if(groups[3]>=groups[1]) {

            groups[4] += groups[1];
            groups[3]=groups[3]-groups[1];
            groups[1] = 0;
        }else if(groups[3]<groups[1]){

            groups[4]+=groups[3];
            groups[1]=groups[1]-groups[3];
            groups[3]=0;
        }
        int rest = (int) Math.ceil((groups[1]+groups[2]*2)/4.0);
        System.out.println(groups[4]+groups[3]+rest);
    }
}