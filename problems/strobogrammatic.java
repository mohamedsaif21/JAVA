import java.util.HashMap;

public class Strobogrammatic{

        public ststic boolean isStrobogrammatic(String){
           Hashmap<Character,Character>map=new HashMap<>();
           map.put('0','0');
           map.put('1','1');
           map.put('6','9');
           map.put('8','8');
           map.put('9','6');
           int l = 0;
           int r = s.length()-1;
           
        }
    public static void main(String[] args) {
        
        String s = "6810189";
        boolean result = isStrobogrammatic(s);
        System.out.println("result" + result);
    }
}