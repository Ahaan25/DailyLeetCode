/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        Stack<TreeNode> stack = new Stack<>();
        dfsToFindPathToDestination(root, target, stack);
        return getNumsAtDistanceKusingStack(stack, K);
    }
    
    private boolean dfsToFindPathToDestination(TreeNode root, TreeNode target, Stack<TreeNode> stack) {
        if (root == null){
            return false;
        }
        stack.push(root);
		
        if (root == target){
            return true;
        }
        
        boolean isFound = dfsToFindPathToDestination(root.left, target, stack) || dfsToFindPathToDestination(root.right, target, stack);
			
		if (isFound){
            return true;
        }
        stack.pop();
        return false;
    }
    
    private List<Integer> getNumsAtDistanceKusingStack(Stack<TreeNode> stack, int k) {
        List<Integer> result = new ArrayList<>();
        TreeNode lastSeenNode = stack.pop();
        getNumsAtDistanceK(lastSeenNode, k--, result);
        while(k >= 0 && !stack.isEmpty()) {
            TreeNode currentNode = stack.pop();
            if (k == 0) {
                result.add(currentNode.val);
                break;
            }
            if (lastSeenNode == currentNode.left){
                getNumsAtDistanceK(currentNode.right, --k, result);
            }
            else{
                getNumsAtDistanceK(currentNode.left, --k, result);
            }
            lastSeenNode = currentNode;
        }
        return result;
    }
    
    private void getNumsAtDistanceK(TreeNode node, int k, List<Integer> result) {
        if (node == null){
            return;
        }
        if (k == 0) {
            result.add(node.val);
            return;
        }
        getNumsAtDistanceK(node.left, k-1, result);
        getNumsAtDistanceK(node.right, k-1, result);
    }
}
