class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1, last=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                first=i;
                break;
            }
        }
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]==target){
                last=i;
                break;
            }
        }
        int[] res={first, last};
        return res;
    }
}
