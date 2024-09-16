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
//root.left
//root.data
//root.right
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
      //  LVR(V-value)
       List<Integer> result= new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null)
        {
            if(curr.left==null)
            {
                result.add(curr.val);
                curr=curr.right;
            }
            else
            {
                TreeNode prev=curr.left;
                while(prev.right!=null)
                {
                    prev=prev.right;
                }
                prev.right=curr;
                TreeNode temp=curr;
                curr=curr.left;
                    temp.left=null;
            }
        }
        return result;
    }}