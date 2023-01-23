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
    public boolean sameTreeInorderTraversal(TreeNode p, TreeNode q) {
        Stack<TreeNode> stackA = new Stack<>();
        Stack<TreeNode> stackB = new Stack<>();
        List<Integer> valuesA = new ArrayList<>();
        List<Integer> valuesB = new ArrayList<>();
        boolean areSame = true;

        validNodes(p, (Stack<TreeNode>) stackA, valuesA);
        validNodes(q, (Stack<TreeNode>) stackB, valuesB);
        System.out.println("Values A size = " + valuesA.size());
        System.out.println("Values B size = " + valuesB.size());
        if(valuesA.size() != valuesB.size()){
            System.out.println("Checking sizes");
            return false;
        }
        for(int i = 0;i < valuesA.size();i++){
            System.out.println(valuesA.get(i) + " " + valuesB.get(i));
            if (valuesA.get(i) != valuesB.get(i)) {
                areSame = false;
                break;
            }
        }
        return areSame;
    }

    private void validNodes(TreeNode q, Stack<TreeNode> valStackB, List<Integer> valuesB) {
        while (q != null || !valStackB.empty()) {
            if (q != null) {
                valStackB.push(q);
                q = q.left;
            }
            if (q == null) {
                q = valStackB.peek();
                valuesB.add(q.val);
                q = q.right;
                if(q == null){
                    valuesB.add(0);
                }
                valStackB.pop();
            }
        }
    }
}
