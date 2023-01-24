import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SameTree {

    // Class defined by exercise, is required to properly access node fields
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // This is repurposed from BinaryTreeInorderTraversal coding challenge.
    public boolean sameTree(TreeNode p, TreeNode q) {

    }
}
