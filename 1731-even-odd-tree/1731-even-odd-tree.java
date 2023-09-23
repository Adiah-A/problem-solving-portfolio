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
    public boolean isEvenOddTree(TreeNode root) {
        //do a Breadth First search traversal to go form 1 level to teh other
        //Create a queue
        //Creat a count = 0;
        //Create a boolean isEven = false;
        //Push the root to it
        //do a loop while the queue is not empty
        //if count % 2 == 0, set isEven to true
        //if count 
        //int currNumEven = Integer.MIN_VALUE;
        //int currNumOdd = Integer.MAX_VALUE;
        //for teh size of teh queue at teh beginning of teh while loop, 
        //poll each node
        //int nodeValue = node.val;
        // if isEven == true and nodeValue % 2 != 0 and  curNumOdd < nodeValue {
            //currNum == nodevalue
            //if(node.left != null){
                //queue.add(node.left);
            //}
            //if(node.right != null){
                //queue.add(node.right);
            //}
        //}else if(isEven == false and nodeValue % 2 == 0 and  curNumEven > nodeValue){
            //currNum == nodevalue
            //if(node.left != null){
                //queue.add(node.left);
            //}
            //if(node.right != null){
                //queue.add(node.right);
            //}
        //}else{
            //return false;
        //}

        //increment count;

        //return true otherwise

        Queue<TreeNode> queue = new ArrayDeque<>();
        int levelCount = 0;
        boolean isEvenLevel = false;

        queue.offer(root);

        while(!queue.isEmpty()){
            if(levelCount % 2 == 0){
                isEvenLevel = true;
            }else{
                isEvenLevel = false;
            }

            int currNumOdd = Integer.MIN_VALUE; // FOR WHEN NUMBERS ARE TO BE ODD AND INCREASING
            int currNumEven = Integer.MAX_VALUE; // FOR WHEN NUMBERS ARE TO BE EVEN AND DECREASING
            int size = queue.size();

            for(int i = 0 ; i < size; i++){
                TreeNode currNode = queue.poll();
                int nodeValue = currNode.val;

                if(isEvenLevel && nodeValue % 2 != 0 && nodeValue > currNumOdd){
                    currNumOdd = nodeValue;

                    if(currNode.left != null){
                        queue.offer(currNode.left);
                    }

                    if(currNode.right != null){
                        queue.offer(currNode.right);
                    }

                }else if(!isEvenLevel && nodeValue % 2 == 0 && nodeValue < currNumEven){
                    currNumEven = nodeValue;

                    if(currNode.left != null){
                        queue.offer(currNode.left);
                    }

                    if(currNode.right != null){
                        queue.offer(currNode.right);
                    }

                }else{
                    return false;
                }

            }

            levelCount ++;

        }

        return true;


    }
}