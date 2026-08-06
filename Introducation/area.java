import java.util.Scanner;

class area{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Square:");
        double side = sc.nextDouble();

        double area = side * side;
        System.out.println("Area of square is: " + area);
    }
}
