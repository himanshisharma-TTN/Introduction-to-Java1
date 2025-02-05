package Ques1;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Himanshi","Sharma",21);
        Person.printData();
        System.out.println("Name : "+Person.FirstName+" "+Person.LastName);
        System.out.println("Age :" + Person.age);
    }
}

