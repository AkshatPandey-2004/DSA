import java.util.Scanner;

public class SelectionSort {
    public static int[] selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp;
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

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
        arr=selectionsort(arr);
        System.out.println("After Sorting:- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
