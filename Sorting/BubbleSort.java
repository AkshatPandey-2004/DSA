import java.util.Scanner;

public class BubbleSort{
    public static int[] bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=)
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arr=bubblesort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}