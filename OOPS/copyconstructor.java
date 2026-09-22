package OOPS;

public class copyconstructor {

    class Student{

        String Name;
        int age;
        Student (String name){
            System.out.println("The object is created");
            this Name = name;
        }
        
        Student (String name , int age){

            this Name = name;
            this age = age;
        }
    }

        class Main{

            public static void main(String[] args) {
                
                Student s1 = new Student("srinath");
                Student s2 = new Student("son");
            }
        }
    
}
