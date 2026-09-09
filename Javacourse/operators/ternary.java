package Javacourse.operators;

public class ternary {

    public static void main(String[] args) {
        
        int n = 4;
        int result = 0;
        /*if(n%2==0)
            result = 10;
        else
            result = 20;
        */ //this is need to be changed ternary operator

        result = n%2==0 ? 10 : 20 ;
            //4%2==0  4 div 2 = 0 reminder 0 == 0 true , print 10
        System.out.println(result);


    }
    
}
