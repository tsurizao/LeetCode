package Java;

public class MaximumDepthOfBinaryTree {
    // Given the root of a binary tree, return its maximum depth.
    // A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static int maxDepth(TreeNode root) {
        // If initial node is not null, then it's automatically 1 + whatever returns
        // recursively, either 1 or 0.  Each side is checked each current node, then
        // continues recursively until entire tree is checked.  Math.max chooses the highest
        // of the two recursive calls.  At any point if a null node is found, it adds 0 to the total
        return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
