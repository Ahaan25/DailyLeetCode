class Solution {
    public boolean isAnagram(String s, String t) {
        boolean flag=true;
        if(s.length()!=t.length()){
            flag=false;
        }
        else{
            char[] a=s.toCharArray();
            char[] b=t.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0;i<s.length();i++){
                if(a[i]!=b[i]){
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }
}
