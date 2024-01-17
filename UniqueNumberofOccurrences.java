class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        int minVal=Integer.MAX_VALUE;
        int maxVal=Integer.MIN_VALUE;
        for (int v:arr) {
            minVal=Math.min(minVal, v);
            maxVal=Math.max(maxVal, v);
        }
        int range=maxVal-minVal+1;
        int[] occ=new int[range];
        for (int v:arr) {
            occ[v-minVal]++;
        }
        Arrays.sort(occ);
        for (int i=0; i<range-1; i++) {
            if (occ[i]!=0 && occ[i]==occ[i+1]) {
                return false; 
            }
        }
        return true;
    }
}
