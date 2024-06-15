import java.util.Scanner;

public class arraybasic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int num= sc.nextInt();
        int[] numbers=new int[num];
        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter The Number: ");
            numbers[i]=sc.nextInt();
        }
        System.out.println("Element in Array are:-");
        //For-Each Loop
        for(int i : numbers){
            System.out.println(i);
        }
        //For Loop
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        
    }
}