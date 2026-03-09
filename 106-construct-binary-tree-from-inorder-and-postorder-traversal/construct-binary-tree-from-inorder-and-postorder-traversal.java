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
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return dfs(inorder, 0 , inorder.length-1, postorder, 0 , postorder.length-1, map);
        
    }

    TreeNode dfs(int [] inorder , int istart, int iend, int [] postorder , int pstart ,int pend , HashMap<Integer,Integer>map ){


        if(istart>iend || pstart>pend){
            return null;
        }

        TreeNode root = new TreeNode(postorder[pend]);

        int inIndex = map.get(postorder[pend]);

        int numsLeft = inIndex - istart;

         root.left =dfs(inorder,istart, inIndex-1, postorder, pstart, pstart+numsLeft-1,map );

         root.right = dfs(inorder ,inIndex+1, iend, postorder, pstart+numsLeft, pend-1, map );

        return root;


    }
}