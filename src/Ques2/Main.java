package Ques2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "";
        System.out.println("Enter the string : ");
        StringBuilder concatenatedStr = new StringBuilder();
        while(true){
            str = s.nextLine();
            if(str.equalsIgnoreCase("XDONE")) break;
            concatenatedStr.append(str+"\n");
        }

        System.out.println("Entered String by user : "+concatenatedStr);
    }
}
