package Ques4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner   s = new Scanner(System.in);
        int twoD[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println("Sum of each row ");
        for(int arr[] : twoD){
            int sum = 0;
            for(int num : arr ){
                sum+=num;
            }
            System.out.print(sum+" ");
        }

        System.out.println();
        System.out.println("Sum of each col ");
        for(int i=0;i<twoD[0].length;i++){
            int sum = 0;
            for(int j=0;j<twoD.length;j++){
                sum+=twoD[j][i];
            }
            System.out.print(sum+" ");
        }

    }
}
