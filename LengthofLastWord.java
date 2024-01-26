class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                while(i>=0 && s.charAt(i) != ' '){
                    len++;
                    i--;
               }
                break;
            }
        }
        return len;
    }
}
