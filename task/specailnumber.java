import java.util.*;

public class specailnumber {

    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the value of m:");
        int m = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc2.nextInt();

        for (int i = m; i<=n; i++){

            int dig1 = i%10; // 29%10 = 9
            int dig2 = i/10; // 29/10 = 2
            int sum = dig1 + dig2; // 9+2 = 11
            int product = dig1*dig2; // 9*2 = 18
            int res = sum + product; // 11+18 = 30

            if(res==i){

            System.out.println(res+" it is the special number");
        }
            
        }
        
    }

    
}
