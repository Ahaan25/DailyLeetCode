class Solution {
    public boolean isFascinating(int n) {
        int n1=n;
        int n2=n*2;
        int n3=n*3;
        String s=n1+""+n2+""+n3;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                return false;
            }
            for(int j= i+1; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j) ){
                    return false;
                }
            }
        }
        return true;
    }
}
