class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]>=max){
                secondmax=max;
                max=nums[i];
            }
            else if(nums[i]>=secondmax){
                secondmax=nums[i];
            }
        }
        return (max-1)*(secondmax-1);
    }
}
