package Ques1;

public class Person {
    static String FirstName = "Fname";
    static String LastName = "Lname";
    static int age = 0;

    Person(String FirstName,String LastName, int age ){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.age=age;
    }

    static {
        System.out.println(FirstName);
        System.out.println(LastName);
        System.out.println(age);
    }
    public static void printData () {
        System.out.println(FirstName);
        System.out.println(LastName);
        System.out.println(age);
    }
}
