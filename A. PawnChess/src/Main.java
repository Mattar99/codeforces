
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[][] grid = new char[8][8];
        byte wCount=10; byte bCount=10;
        boolean wEmptypath=true; boolean bEmptypath=true;
        Scanner temp = new Scanner(System.in);
        for(byte i = 0 ; i < 8 ; i++){
            String temp1 = temp.nextLine();
            for(byte j = 0 ; j < 8 ; j++){
                  grid[i][j]=temp1.charAt(j);
            }
        }
        for(byte i = 0 ; i < 8 ; i++){
            for(byte j = 0 ; j < 8 ; j++){
                if(grid[j][i]=='W'){
                    wEmptypath=true;
                    for(byte z=(byte)(j-1);z>=0;z--){
                        if(grid[z][i]=='B'||grid[z][i]=='W'){
                            wEmptypath=false;
                        }
                    }
                    if(wEmptypath==true&&(wCount>(byte)(j-0))) {
                        wCount = (byte) (j - 0);
                    }

                }else if(grid[j][i]=='B'){
                    bEmptypath=true;
                     for(byte z=(byte)(j+1);z<8;z++){
                         if(grid[z][i]=='W'|| grid[z][i]=='B'){
                             bEmptypath=false;
                         }
                     }
                     if((bCount>(byte)(7-j))&& bEmptypath==true){
                         bCount=(byte)(7-j);
                     }

                }else
                    continue;
            }
        }

        if(bCount<wCount){
            System.out.println('B');
        }else
            System.out.println('A');

    }
}
