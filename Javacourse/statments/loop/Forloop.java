package Javacourse.statments.loop;

public class Forloop {

    public static void main(String[] args) {
        /*int i = 5; //Init ialization
        
        for(int i=0;i<=3;i++) //(Initialization;Condition;Increment)
        //while (i<=4)  //Condition
        {
            System.out.println("Hello i am Loop " + i);

            ++; //Increment */
//task: Calendar
        //nested for loop
        for (int i=1;i<=5;i++) {

            System.out.println("Day " + i);
            //we are using the inner loop
            for(int j=1;j<=9;j++){

                System.out.println("  " + (j+8) + " - " + (j+9)); // Concatenation
                
            }
            
        }
             
        }
    }