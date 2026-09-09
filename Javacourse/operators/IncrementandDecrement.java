package Javacourse.operators;

public class IncrementandDecrement {

    public static void main(String[] args) {
        
        int a = 7 , b =5 ,c = 3 , d = 8 ;
        int num = 7 , num1 = 6;

        a++;
        b--;
        ++c;
        --d;
        
        int result1 = num1++; // It fetch the value and then increment
        int result = ++num; // Increment the value and then fetch the value

        System.out.println(result);
        System.out.println("Post Increment of a++ , b-- : ");
        System.out.println(a);
        System.out.println(b);
        System.out.println("Pre Increment of ++a , --b : ");
        System.out.println(c);
        System.out.println(d);

        System.out.println("the result 7 ?");
        System.out.println(result1); 

        
    }
    
}
