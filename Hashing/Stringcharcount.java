import java.util.HashMap;

public class Stringcharcount {
    public static void main(String[] args) {
        HashMap<Character, Integer> map=new HashMap<>();
        String s="abccccdd";
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        System.out.println(1/2);
        int ct=0;
        for(char i: map.keySet()){
            if(map.get(i)%2!=0){
                ct+=map.get(i)-1;
                map.put(i,map.get(i)%2);
            }
            else{
                ct+=map.get(i);
            }
            // ct+=(map.get(i)/2);
            // map.put(i,map.get(i)%2);
        }
        if(map.containsValue(1)){
            ct+=1;
        }
    }
}
