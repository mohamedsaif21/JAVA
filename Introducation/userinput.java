import java.util.Scanner;

class UserInput {

    public static void main(String[] args){

        Scanner in = new Scanner (System.in);
        System.out.println("Enter the name:");
        String name = in.next();

        Scanner in2 = new Scanner (System.in);
        System.out.println("Enter the Reg:");
        String regno = in2.nextLine();

        Scanner in3 = new Scanner (System.in);
        System.out.println("Enter the Department:");
        String dpt = in3.nextLine();

        Scanner in4 = new Scanner (System.in);
        System.out.println("Enter the cgpa:");
        float cgpa = Float.parseFloat(in4.nextLine());

        System.out.println("Name: " + name);
        System.out.println("Reg: " + regno);
        System.out.println("Department: " + dpt);
        System.out.println("CGPA: " + cgpa);
    }   
    }
     
     