import java.util.HashMap;
import java.util.Map;
public class hashmapintro2 {

    public static void main(String[]args){

        HashMap<String,String> map = new HashMap<>();

        map.put("name", "srinath");
    map.put("house no","30");
    map.put("area","melur"); 
    map.put("district","madurai");
    System.out.println("original map: "+map);
    //put(key,updated value)-> to update the element in hashmap
    map.put("house no","75t");
    //system.out.println("after updating house no: "+map);

    //get()->using key get the value
    System.out.println("area: "+map.get("area"));
    //containkey()-> to check key is exit on map
    System.out.println("district contain?"+map.containsKey("district"));
    //containvalue()-> to check value is exit on map
    System.out.println("srinath contain?"+map.containsValue("Mohamed saif"));
    //Find size of the map
    System.out.println("Size:" +map.size());
    //remove() -> to remove any element using key
    map.remove("area");
    //Itrate over map
    for(Map.Entry<String,String> dataset: map.entrySet()){
        String key = dataset.getKey();
        String value = dataset.getValue();
        System.out.println(":" + value);
    }
    System.out.println("Keys on map" + map.keySet());
}
}
    