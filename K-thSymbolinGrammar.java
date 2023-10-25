class Solution {
    public int kthGrammar(int n, int k) {
        return test(n-1, k-1);
    }
    public int test(int n, int k){
        if(n==0 || k==0){
            return 0;
        }
        int rem=k%2;
        int div=k/2;
        int ans=test(n-1, div);
        if(ans==0){
            if(rem==0){
                return 0;
            }
            else{
                return 1;
            } 
        } 
        else{
            if(rem==0){
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}
