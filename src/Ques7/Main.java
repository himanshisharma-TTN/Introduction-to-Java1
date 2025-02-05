package Ques7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 0;
        try {
            System.out.println("Enter the number : ");
            num = s.nextInt();
            int res = 4/num;
            System.out.println("4 divided by "+num+" is "+res);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception Occurs "+e.toString());
        }catch (Exception e){
            System.out.println("Exception Occurs "+e.toString());
        }finally {
            System.out.println("Finally the System resources are free now");
        }
    }
}
