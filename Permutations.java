class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        boolean test[]=new boolean[nums.length];
        permutation(nums,result,a,test);
        return result;
        
    }
   public void permutation(int nums[],List<List<Integer>> result,List<Integer> a,boolean test[])
   {
       if(a.size()==nums.length)
       {
           result.add(new ArrayList<>(a));
           return;
       }
       for(int i=0;i<nums.length;i++)
       {
           if(!test[i])
           {
               a.add(nums[i]);
               test[i]=true;
               permutation(nums,result,a,test);
               test[i]=false;
               a.remove(a.size()-1);
           }
       }
   }
}
