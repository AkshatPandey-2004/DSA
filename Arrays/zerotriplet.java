public class zerotriplet {
    public static void main(String[] args){
        int[] nums=new int[] {0,1,2,3,-1,-3};
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        System.out.printf("Index %d %d %d\n",i,j,k);
                    }
                }
            }
        }
    }
}
