class Solution {
    public int myAtoi(String s) {
        String str="";
        int i=0;
        if(s.length()==0){
            return 0;
        }
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        int sign=1;
        if(i<s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }
        int x=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            if ((x > Integer.MAX_VALUE / 10) || (x == Integer.MAX_VALUE / 10 && s.charAt(i)-'0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            x=(x*10)+(s.charAt(i)-'0');
            i++;
        }
        return x*sign;        
    }
}
