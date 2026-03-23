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
        ArrayList<Integer> arr1= new ArrayList<>();
        ArrayList<Integer> arr2= new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();
        boolean result=false;
        st1.push(root1);
        st2.push(root2);
        if(root1==null && root2==null){result = true;}
        if(root1!=null && root2==null){result =  false;}
        
        if(root1==null && root2!=null){result = false;}
        while(!st1.isEmpty() ){
            root1 = st1.pop();
            
            if(root1.right!=null){
                st1.push(root1.right);
            }
            if(root1.left!=null){
                st1.push(root1.left);
            }
            if(root1.left==null && root1.right==null){
                arr1.add(root1.val);
            }}
            while(!st2.isEmpty()){
                root2=st2.pop();

            
            if(root2.right!=null){
                st2.push(root2.right);
            }
            if(root2.left!=null){
                st2.push(root2.left);
            }
            if(root2.left==null && root2.right==null){
                arr2.add(root2.val);
            }


        }
        if(arr1.equals(arr2)){
            result = true;
        }
        else{
            result=false;
        }
        return result;
    }
}