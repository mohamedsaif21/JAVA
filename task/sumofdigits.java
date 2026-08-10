import java.util.*;

public class sumofdigits {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of sum:");
        int n = sc.nextInt();
        int sum = 0;   
    while(n >0 ){

        int a = n%10;
        sum = sum+n;
    }

    System.out.println(sum);
    
        
    }
}
