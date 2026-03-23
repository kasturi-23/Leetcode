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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = getLeaves(root1);
        ArrayList<Integer> arr2 = getLeaves(root2);
        
        return arr1.equals(arr2);
    }
    
    public ArrayList<Integer> getLeaves(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        
        if (root == null) return arr;
        
        st.push(root);
        
        while (!st.isEmpty()) {
            TreeNode node = st.pop();
            
            if (node.right != null) {
                st.push(node.right);
            }
            if (node.left != null) {
                st.push(node.left);
            }
            if (node.left == null && node.right == null) {
                arr.add(node.val);
            }
        }
        
        return arr;
    }
}