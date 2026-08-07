import java.util.*;

class oddoreven{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        if (a%2==0){ // 10/2 = 0 this is even number if 7/2 = 1 this is odd number
            System.out.println("even");
        }
        else{
            System.out.println("odd"); 
        }
    }
}