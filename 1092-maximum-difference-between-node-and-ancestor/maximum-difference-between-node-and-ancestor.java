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
    private int maxDiff;
    public int maxAncestorDiff(TreeNode root) {

        maxDiff = 0;

        int min = root.val;
        int max = root.val; /**set min and max to an inital value of the root node */

        findDiff(root, min, max); //start the journey

        return maxDiff;
    }

    private void findDiff(TreeNode root, int min, int max){
        if(root == null){
            return;
        }

        maxDiff = Math.max(maxDiff, Math.max(Math.abs(min - root.val), Math.abs(max - root.val)));
        min = Math.min(min, root.val); //update teh minimum value
        max = Math.max(max, root.val); //update teh maximum value

        findDiff(root.left, min, max); // recursively travel the left subtree
        findDiff(root.right, min, max); // recursively travel the right subtree

    }
}