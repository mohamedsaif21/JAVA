import java.util.Scanner;

/*take an array of number as input and cheack if it is an array sorted in ascending order.
eg: {1,2,4,7} is sorted in ascending order.
{3,4,6,2} is not sorted in ascending order. */

public class ascendingorder {


     public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the numbers");
        int [] nums = new int [n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }


}
}
