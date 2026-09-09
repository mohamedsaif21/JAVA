package Javacourse.statments;

public class NestedWhileLoop {

    public static void main(String[] args) {
        
        int i = 1; // i -> variable name

        while (i<=4) 
        {
            System.out.println("Hello i am Loop " + i);
            int j =1;
            while (j<=3){
                System.out.println("hii " + j);
                j++;
            }
            i++;   
        }
        System.out.println("Bye" + i);
        
    } 
    
    }
    

