import java.util.Scanner;

public class InsertionSort {
    public static int[] insertionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>=arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
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
        arr=insertionsort(arr);
        System.out.println("After Sorting:- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
