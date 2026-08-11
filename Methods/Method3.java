package Methods;

public class Method3 {

        public void addvalue (int a,int b){

            int sum = a+b;
            System.out.println(sum);
        }

        public static void main (String[]args){
            Method3 obj = new Method3();
            obj.addvalue(8,5);
            obj.addvalue(3,9);
            

        }
    
}
