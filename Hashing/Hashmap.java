import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",120);
        map.put("Us",20);
        map.put("China",150);
        System.out.println(map.containsValue(120));
        System.out.println(map.containsKey("India"));
        
    }
}
