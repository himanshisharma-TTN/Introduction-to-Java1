package Ques3;

import java.util.Scanner;

class Circle {
    public static float area(float radii){
        return (22/7)*radii*radii;
    }
    public static float circumferemce(float radii){
        return 2*(22/7)*radii;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opt = 0;
        while(true){
            System.out.println("******* Menu *******");
            System.out.println("1. Calculate Area of a Circle");
            System.out.println("2. Calculate Circumference of a Circle");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");
            opt = s.nextInt();
            float radii = 0;
            switch (opt){
                case 1 : System.out.println("Enter Radius");
                        radii = s.nextFloat();
                        System.out.println("Area of Circle : "+ Circle.area(radii));
                        break;
                case 2 : System.out.println("Enter Radius");
                    radii = s.nextFloat();
                    System.out.println("Circumference of Circle : "+ Circle.circumferemce(radii));
                    break;
                case 3: System.exit(1);
            }

        }
    }
}
