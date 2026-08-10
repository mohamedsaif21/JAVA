

import java.util.*;

public class helppenny {

    public static void main (String[] args){

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc1.nextInt();
        System.out.println("Enter the value of m:");
        int m = sc2.nextInt();
        System.out.println("The multplication of "+n+" is");
            for(int i=1; i<=m; i++){
                System.out.println(i+"*"+n+"="+i*n);
            }
        
    }
    
}
