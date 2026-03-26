import java.util.*;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        boolean result = true;

        if (root == null) return true;

        TreeNode root1 = root.right;
        TreeNode root2 = root.left;

        Stack<TreeNode> st1 = new Stack<>();

        st1.push(root1);
        st1.push(root2);

        while (!st1.isEmpty()) {
            root2 = st1.pop();
            root1 = st1.pop();

            if (root1 == null && root2 == null) continue;

            if (root1 == null || root2 == null) {
                result = false;
                break;
            }

            if (root1.val != root2.val) {
                result = false;
                break;
            }

            // push mirror nodes
            st1.push(root1.left);
            st1.push(root2.right);

            st1.push(root1.right);
            st1.push(root2.left);
        }

        return result;
    }
}