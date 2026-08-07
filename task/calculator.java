import java.util.*;

class calculator{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        float a = sc.nextFloat();
        System.out.println("Enter the operation:");
        char op = sc.next().charAt(0);
        System.out.println("Enter b :");
        float b = sc.nextFloat();

        switch (op){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid operation!!");
                break;
        
        }
    }


}