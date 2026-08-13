package array;

public class userinputT1 {

    public static void main (String []args){
        
    
        //type 1 - using new keyword
        int size = 5;
        int num[] = new int[size];

        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        num[4] = 50;

        System.out.println(num[0]);
        for(int i=0; i<size; i++){
            System.out.println(num[i]);
        }
        
       
        }
    }
    
