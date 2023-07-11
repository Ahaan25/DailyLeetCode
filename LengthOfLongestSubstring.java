class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int m=0;
        int[] charIndex=new int[128];
        Arrays.fill(charIndex, -1);
        int l = 0;
        
        for (int r=0; r<n; r++) {
            if (charIndex[s.charAt(r)]>=l) {
                l=charIndex[s.charAt(r)] + 1;
            }
            charIndex[s.charAt(r)]=r;
            m = Math.max(m, r-l+1);
        }
        return m;
    }
}
