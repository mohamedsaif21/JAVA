package array.task;

import java.util.*;
public class reversearray {
    

    public static void reverseArr(int [] num) {
        int l=0;
        int r=num.length - 1;

        while(l<r){   
        int temp = num[l];
        num[l] = num[r];
        num[r] = temp;
        l++;
        r--;
        }
    
    }
     public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int num[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        reverseArr(num);

        System.out.println("The reversed array is:");
         for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        
        System.out.println();
}
}

