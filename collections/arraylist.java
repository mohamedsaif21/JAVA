
import java.util.ArrayList;

public class arraylist {
    
    public static void main(String []args){
        //Declare ArrayList-String 
        ArrayList<String> list = new ArrayList<>();
        //add() -> To insert the element end of the Array
        list.add("hello");
        //addFirst() -> To add the elment in front of the array
        list.addFirst("ravi");
        //addFirst() -> To add the elment in end of the array
        list.addLast("Hiiii");
        list.addLast("Ravi");
        list.add("I");
        list.add("am");
        list.add("goa");
        //set() -> to replces an elment in a specific inedex position
        list.set(4,"Bad");
        //To print the Array List

        System.out.println("List:"+list);
    

    }
    
    
}
