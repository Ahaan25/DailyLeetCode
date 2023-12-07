class Solution {
    public String largestOddNumber(String num) {
        StringBuilder s = new StringBuilder(num);
        int i = s.length()-1;
        while(s.charAt(i)%2 == 0 ){
            s.deleteCharAt(i);
            if (i==0){
                break;
            }
            i--;
        }
        return s.toString();
    }
}
