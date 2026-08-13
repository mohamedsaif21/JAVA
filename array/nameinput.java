package array;

import java.util.*;
public class nameinput {

    static void printArray(String[]args){

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];
        System.out.println("Enter the names:");

        for(int i=0; i<size; i++){
            names[i]=sc.next();
            
        }
        printArray(names);
 
    }
    
}
}

