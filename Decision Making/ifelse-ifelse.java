/*0-3 > child
4-12 > kid
13-19 > teenager
20-59 > adult
60- > senior citizen*/

import java.util.Scanner;
class nestedifage {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your age");
        int a = sc.nextInt();
        if (a<=3){
            System.out.println("child");
        }
        else{
            if(a<=12 && a>=4){
             System.out.println("kid");  
        }
        }
        if (a>=13 && a<=19){
            System.out.println("teenager"); 
        }
        if (a>=20 && a<=59){
            System.out.println("adult");
        }
        if(a>=60){
            System.out.println("senior citizen");
        }else {
            System.out.println("old age");
        }
    }
}
      

