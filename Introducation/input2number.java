import java.util.Scanner;
class inputno{

    public static void main(String[] args){

        /*
       Write a program to take two numbers as input from the user and print the sum of those numbers. 
       Also, print the average of those two numbers with 2 decimal places.

        */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1 = in.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num2 = in2.nextInt();
        System.out.println("The sum is :" + (num1 + num2));
        System.out.printf("The sum is: %.2f", (double)(num1 + num2) / 2);
    }
}