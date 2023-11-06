class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(0,candidates,target,res,temp);
        return res;
    }
    public void helper(int index,int[] candidates, int target,List<List<Integer>> res,List<Integer> temp)
    {
        if(index==candidates.length)
        {
            if(target==0)
            {
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        if(candidates[index]<=target)
        {
            temp.add(candidates[index]);
            helper(index,candidates,target-candidates[index],res,temp);
            temp.remove(temp.size()-1);
        }
        helper(index+1,candidates,target,res,temp);
    }
}
