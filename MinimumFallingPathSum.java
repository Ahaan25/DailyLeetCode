class Solution {
    public int minFallingPathSum(int[][] A) {
        int n=A.length;
        int[] prev=new int[n];
        for (int col=0; col<n; col++) {
            prev[col]=A[0][col];
        }
        for (int row=1; row<n; row++) {
            int[] curr=new int[n];
            for (int col=0; col<n; col++) {
                curr[col]=A[row][col]+Math.min(Math.min(prev[Math.max(0, col-1)], prev[col]), prev[Math.min(n-1, col+1)]);
            }
            prev=curr;
        }
        int minPathSum=Integer.MAX_VALUE;
        for (int value:prev) {
            minPathSum=Math.min(minPathSum, value);
        }
        return minPathSum;
    }
}
