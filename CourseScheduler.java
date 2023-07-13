class Solution {
    HashMap<Integer, List<Integer>> map;
    int[] keyexhaust;
    int[] dp;
    public boolean findCycle(int st){
        System.out.println(st+"|");
        if(dp[st] == 1){
            return true;
        } 
        if(keyexhaust[st] == 1){
            return false;
        } 
        keyexhaust[st] = 1;
        boolean b;
        List<Integer> arr;
        if(map.containsKey(st)){
            arr = map.get(st);
            for(Integer itg : arr){
                b = findCycle(itg);
                if(!b){
                    return false;
                } 
                dp[itg] = 1;
            }
        }
        return true;
    }
        
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        map = new HashMap<>();
        keyexhaust = new int[numCourses];
        dp = new int[numCourses];
        
        for(int[] ip : prerequisites){
            List<Integer> arr = new ArrayList<>();
            if(map.containsKey(ip[0])){
                arr = map.get(ip[0]);
            }
            arr.add(ip[1]);
            map.put(ip[0], arr);
        }
        for(int i=0; i<numCourses; i++){
            Arrays.fill(keyexhaust, 0);
            boolean b = findCycle(i);
            System.out.println(i+"->"+b);
            if(!b){
                return false;
            } 
            dp[i] = 1;
        }
        return true;
    }
}
