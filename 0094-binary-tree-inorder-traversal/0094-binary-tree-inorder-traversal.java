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
        List<Integer> inorderlist= new ArrayList<>();
      
      inorder(inorderlist,root);
        return inorderlist;
    }
    public static void inorder(  List<Integer> inorderlist,TreeNode root)
    {
          if(root==null)
        {
            return ;
        }
        inorder(inorderlist,root.left);
        inorderlist.add(root.val);
        inorder(inorderlist,root.right);
        
    } 
}