class Solution {
    public int[] findArray(int[] pref) {
        if(pref.length == 1) return pref;
        int[] res = new int[pref.length];
        res[0] = pref[0];
        res[1] = pref[0]^pref[1];
        int prev = res[0] ^ res[1];
        int el=0;
        for(int i = 2; i< pref.length;i++){
            res[i] = prev ^ pref[i];
            prev = prev ^ res[i];
        }
        return res;
    }
}
