package pattern;

import java.util.*;
public class righthalfpyramid {

    public static void main (String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
/*
*        <----- Row=col(1)
**       <----- Row=col(2)
***      <----- Row=col(3)
****     <----- Row=col(4)
*/
        
/*
****  <----- col=row(4)
***   <----- col=row(3)
**    <----- col=row(2)
*     <----- col=row(1)
*/  
        for(int row = n; row>=1; row--){

            for(int col=row ; col>=1; col--){

                System.out.print("*");
            }
            System.out.println();
        }
       
    
    
}
}
