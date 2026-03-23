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
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        Set<TreeNode> visited = new HashSet<>();
        TreeNode n;
        
        if (root == null) { return arr; }
        
        st.push(root);
        
        while (!st.isEmpty()) {
            n = st.peek();
            
            if (n.right == null && n.left == null) {
                arr.add(n.val);
                visited.add(n);
                st.pop();
                continue;
            }
            
            if ((n.left == null || visited.contains(n.left)) && 
                (n.right == null || visited.contains(n.right))) {
                arr.add(n.val);
                visited.add(n);
                st.pop();
                continue;
            }
            
            if (n.right != null && !visited.contains(n.right)) {
                st.push(n.right);
            }
            
            if (n.left != null && !visited.contains(n.left)) {
                st.push(n.left);
            }
        }   
        
        return arr;
    }
}