package Ques5;

public class Employe {
    private String firstname;
    private String lastname;
    private int age;
    private String designation;

    Employe(){
        firstname = "Fname";
        lastname = "Lname";
        age = 0;
        designation = "Traniee";
    }
    Employe(String fname,String lname,int age, String designation){
        firstname = fname;
        lastname = lname;
        this.age = age;
        this.designation = designation;
    }
    Employe(Employe e){
        this.firstname = e.firstname;
        this.lastname = e.lastname;
        this.age = e.age;
        this.designation = e.designation;
    }

    void setFirstName(String name){
        firstname = name;
    }
    void setLastName(String name){
        lastname = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setDesignation(String designation){
        this.designation=designation;
    }

    @Override
    public String toString() {
        return "Employee Name : "+ firstname+" "+lastname+"\n Age is : "+age+" \n Designation : "+designation;
    }
}
