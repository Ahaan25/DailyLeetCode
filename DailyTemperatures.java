class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] res=new int[temp.length];
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=temp.length-1; i>=0; i--) {
            int curTemp=temp[i];
            while(!stack.isEmpty() && curTemp>=temp[stack.peekLast()]) {
                stack.pollLast();
            }
            if(!stack.isEmpty()) {
                res[i]=stack.peekLast()-i;
            }
            stack.offerLast(i);
        }
        return res;
    }
}
