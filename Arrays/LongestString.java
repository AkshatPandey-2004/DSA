public class LongestString {
    public static void main(String[] args) {
        String[] array= new String[] {"apple","banana","kiwi","orange"};
        String longest= "" ;
        for(String i : array ){
            if(i.length()>longest.length()){
                longest=i;
            }
        }
        System.out.println(longest);
    }
}
