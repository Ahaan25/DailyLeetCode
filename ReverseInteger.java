class Solution {
    public int reverse(int x) {
        int rev=0;
        int sign = x < 0 ? -1 : 1;
        if(x==Integer.MIN_VALUE){
            return 0;
        }
        x=x*sign;
        while(x>0){
            int temp=x%10;
            if(rev>Integer.MAX_VALUE/10){
                return 0;
            }
            rev=rev*10;
            if(rev>(Integer.MAX_VALUE-temp)){
                return 0;
            }
            rev=rev+temp;
            x=x/10;
        }
        return rev*sign;
    
    }
}
