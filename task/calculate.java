
import java.util.*;

public class calculate {

    public static int findArraySum(int []num){
        int sum = 0;
        for(int i=0; i<num.length; i++){
            sum = sum+num[i];
        }
        return sum;

    }
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        
        int res = findArraySum(num);
        System.out.println("sum: "+res);
        }
        findArraySum(num);
    } 
}
