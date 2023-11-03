class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        for(int i=0; i<target.length; i++) {
            if(i == 0) {
                int timesPush = target[i] - 1;
                for(int j=0; j<timesPush; j++) {
                    ans.add("Push");
                    ans.add("Pop");
                }
                ans.add("Push");
            }
            else {
                int diff = target[i] - target[i - 1];
                int timesPush = diff - 1;
                int timesPop = timesPush;
                for(int j=0; j<timesPush; j++) {
                    ans.add("Push");
                    ans.add("Pop");
                }
                ans.add("Push");
            }
        }
        return ans;
    }
}
