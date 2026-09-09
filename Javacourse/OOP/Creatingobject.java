package Javacourse.OOP;

//TASK : Create a calculator

class Calculator {
    // every object as 2 things Properties and Methods
    public int add(int a1, int a2){ //Methods
        //System.out.println("In Add");
        int r = a1 + a2;
        return r;
    }
}
public class Creatingobject {

    public static void main(String[] args) {
        
        int a1 =10;
        int a2 =20; // a and b are Primitive Variables
        //int result = a+b; = 30
        
        Calculator calc = new Calculator();  // Reference Variable
        int result = calc.add(a1,a2);

        System.out.println(result);

    }
    
}

//
// Object - Properties and Behaviors

// Class JVM create it  