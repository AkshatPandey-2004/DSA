public class MInMaxinArray {
    public static void main(String[] args) {
        int[] nums =new int[]{3,4,1,2};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            else if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.printf("Max: %d \nMin: %d", max,min);
    }
}
