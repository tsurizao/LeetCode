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
        // If initial node is not null, then it's automatically 1 (1 + whatever returned recursively)
        // then check both left and right of the current node, continues recursively
        // until entire tree is checked.  Math.max chooses the highest number at each recursive call
        // Decided to use ternary operator instead of regular if statement.
        return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
