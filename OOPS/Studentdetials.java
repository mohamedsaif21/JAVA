package OOPS;

class Details {
    String name;
    Integer age;
    Integer rollno;
    String dept;

    class Details1 {
        String name;
        Integer age;
        Integer rollno;
        String dept;
    }
    void Study() {
        System.out.println(name + " is Studying");
    }
    void display(){
        System.out.println( age );
        System.out.println( rollno);
        System.out.println( dept );
    }
    
    void Exam() {
        System.out.println(name + " is writing Exam");
    }
}

public class Studentdetials {
    public static void main(String[] args) {
        
        Details st1 = new Details(); 
        st1.name = "Srinath";
        st1.age = 20;
      //  System.out.println(st1.age);
        st1.display();
        st1.Exam();
        
        Details st2 = new Details();
        st2.name = "Mohamed";
        st2.Study();
        
    }
}
