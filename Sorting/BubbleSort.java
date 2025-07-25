import java.util.Scanner;

public class BubbleSort{
    public static int[] bubblesort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            int swap=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swap++;
                }
            }
            //break if the array is already is sorted
            // if(swap==0){
            //     System.out.println("Already Sorted");
            //     break;
            // }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arr=bubblesort(arr);
        System.out.println("After Sorting:- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}