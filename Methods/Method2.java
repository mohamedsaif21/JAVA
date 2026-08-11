package Methods;

public class Method2 {

        public int addvalue(int a,int b){

            int sum = a+b;
            return sum;
        }

        public static void main (String[]args){
            Method2 obj = new Method2();
            int res = obj.addvalue(8,5);
            System.out.println(res);

        }
    
}
