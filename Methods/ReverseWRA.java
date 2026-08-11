
// To reverse the number (with return with Argument)
package Methods;

import java.util.*;
public class ReverseWRA {
        //obj creation
            public int reverseNumber(int n){
                int rev = 0;
                while(n>0){
                    int rem = n % 10 ;
                    rev = rev*10+rem ;
                    n = n/10;   
                }
                return rev;
            }
public static void main(String[]args){
        ReverseWRA obj = new ReverseWRA();
        Scanner sc = new Scanner(System.in);
        System.out.println("Rev of 12345 is "+obj.reverseNumber(12345));
        System.out.println("Rev of 5678 is "+obj.reverseNumber(5678));
        System.out.println("Rev of 10192 is "+obj.reverseNumber(10192));
        

    }
    
}
