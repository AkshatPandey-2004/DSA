//Importing HashSet
import java.util.HashSet;

public class Hashset{
    public static void main(String[] args) {
        //Declare HashSet
        HashSet<Integer> hs=new HashSet<>();
        //Inserting in HashSet
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(2);
        //Printing HashSet
        System.out.println(hs);
        //Search - contains
        if(hs.contains(1)){
            System.out.println("1 is in the set");
        }

        if(!hs.contains(6)){
            System.out.println("6 is not in the set");
        }

        //Delete 
        hs.remove(1);
        if(!hs.contains(1)){
            System.out.println("1 is not in the set");
        }

         for(Integer i:hs){
            System.out.println(i);
         }
    }
}