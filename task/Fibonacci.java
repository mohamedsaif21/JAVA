import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of :");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
            for(int i = 2 ;i<=5; i++){
                int temp = a+b;
                System.out.print(temp+ " ");
                a = b;
                b = temp;

            }
    }
    
}
