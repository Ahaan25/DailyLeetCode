class Solution {
    public int countVowelPermutation(int n) {
        int mod = 1000000007;
        long a = 1, e = 1, i = 1, o = 1, u = 1;

        for(int j=1; j<n; j++) {
            int a_next = (int)e;
            int e_next = (int)((a + i) % mod);
            int i_next = (int)((a + e + o + u) % mod);
            int o_next = (int)((i + u) % mod);
            int u_next = (int)a;

            a = a_next;
            e = e_next;
            i = i_next;
            o = o_next;
            u = u_next;
        }

        return (int)((a + e + i + o + u) % mod);
    }
}
