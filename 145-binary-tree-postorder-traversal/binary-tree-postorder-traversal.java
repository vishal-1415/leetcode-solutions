/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>(); //Postorder → Left → Right → Root
        PostOrder(root,result);

        return result;             // TC:O(n) SC:O(1)
    }
    private void PostOrder(TreeNode root ,List<Integer> result){
        if(root == null){
            return;
        }
        PostOrder(root.left ,result);
        PostOrder(root.right ,result);
        result.add(root.val);
    }
}