class Solution {
    public int[] findErrorNums(int[] arr) {
        int A=0, B=0;
        int n=arr.length;
        for (int i=0; i<n; i++) {
            if (arr[Math.abs(arr[i])-1]>0) {
                arr[Math.abs(arr[i])-1]*=-1;
            } 
            else {
                A=Math.abs(arr[i]);
            }
        }
        for (int i=0; i<n; i++) {
            if (arr[i]>0) {
                B=i+1;
                break;
            }
        }
        return new int[]{A, B};
    }
}
