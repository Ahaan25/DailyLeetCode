class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs==null || strs.length==0){
            return "";
        }
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int cnt=0;
        while(cnt<first.length()){
            if(first.charAt(cnt)==last.charAt(cnt)){
                cnt++;
            }
            else{
                break;
            }
        }
        return cnt == 0 ? "" : first.substring(0, cnt);
    }
}
