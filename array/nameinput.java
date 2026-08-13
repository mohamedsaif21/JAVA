
import java.util.*;
public class nameinput {

    static void printArray(String[] names){

        System.out.println("names:");
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]+" ");
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        //Declaring array
        String names[] = new String[size];
        System.out.println("Enter the names:");
        //user input for array
        for(int i=0; i<size; i++){
            names[i]=sc.next();    
        }
        //calling method to print array
        printArray(names);
 
    }
    
}