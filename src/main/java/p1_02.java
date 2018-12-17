public class p1_02 {
    public static void main(String[] args){
        int[] nums={101,89,76,258,379,6,38,99,817,108};
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int k=0;k<10;k++){
            if(nums[k]<100){
                System.out.print(nums[k] + ",");
            }
        }
    }
}
