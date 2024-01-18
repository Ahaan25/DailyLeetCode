class Solution {
    public int climbStairs(int n) {
        int[] stair=new int[n+2];
        stair[0]=1;
        stair[1]=1;
        for (int i=0; i<n; i++) {
            stair[i+1]+=stair[i];
            stair[i+2]+=stair[i];
        }
        return stair[n-1];
    }
}
