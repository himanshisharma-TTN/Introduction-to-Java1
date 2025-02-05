package Ques8;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("Ques8.MyClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
