class Solution {
    public int dominantIndex(int[] nums) {
        int pos=0, max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
                pos=i;
            }
        }
        Arrays.sort(nums);
        if(nums[nums.length-1]>=2*nums[nums.length-2]){
            return pos;
        }
        return -1;
    }
}
