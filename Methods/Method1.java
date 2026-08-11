package Methods;


public class Method1 {

    public int addvalue() {
        int a = 10 ; 
        int b = 20 ;
        int sum = a+b;
        return sum;
    }

    public static void main (String[]args){

        Method1 obj = new Method1();
        int res = obj.addvalue();
        System.out.println(res);

    }
    
}
