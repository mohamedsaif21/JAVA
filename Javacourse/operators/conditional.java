package Javacourse.operators;

public class conditional {

    public static void main(String[] args) {
        
        int x =8;
        int y =7;
        int z =9;

        // if(x>y && x>z ){
        // //8>17 && 8>9 - F && F => F 
        //     System.out.println(x);
        // }else{
        //      if(y>x && y>z){
        //     //17>8 && 17>9 - T && T => T
        //     System.out.println(y);     
        // }

        if(x>y && x>z ){
        //8>7 && 8>9 - T && F => F 
             System.out.println(x);
        }
        else{
            if(y>x && y>z){
            //7>8 && 7>9 - F && F => F 
            System.out.println(y);
            }
        else{ // TO CASE OR FALSE SO IT PRINT Z
            System.out.println(z);
        }
    }    
}
}
