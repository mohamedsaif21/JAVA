import java.util.*;

class finanacial{

    public static void main(String[]args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value:");
        int a = sc.nextInt();
            if(a<0){
                System.out.println("loss");
            }else if(a>0){
                System.out.println("profit");
            }else if(a == 0){
                System.out.println("no profit or loss");
            }
        }

        
    }

