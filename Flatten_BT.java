// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Flatten_BT {
	public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        
        flatten(root.left);
        flatten(root.right);
        

        TreeNode temp=root.right;
        root.right=root.left;
        root.left=null;
        while(root.right!=null){
            root=root.right; 
        }
        root.right=temp;
     
    }
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
}
}
