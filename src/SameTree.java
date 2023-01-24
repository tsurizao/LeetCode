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

    // Simple solution that uses recursion, if at any point a method call
    // returns false, the original method returns false as well.
    public boolean sameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        System.out.println("P VAL = " + p.val + " Q VAL = " + q.val);
        return p.val == q.val && sameTree(p.left, q.left) && sameTree(p.right, q.right);
    }
}
