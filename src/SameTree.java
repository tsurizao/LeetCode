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
    public boolean sameTreeInorderTraversal(SameTree.TreeNode rootA, SameTree.TreeNode rootB) {
        // Stack used to store current node being checked. Allows nodes to be stored
        // keeping track of the order in which nodes are being traversed
        Stack<SameTree.TreeNode> valStack = new Stack<>();
        // For storing node values to be returned per Inorder Traversal
        List<Integer> valuesA = new ArrayList<>();
        List<Integer> valuesB = new ArrayList<>();
        boolean areSame = true;


        // Each node is added to a Stack (if it isn't null) then each node.left is traversed
        // If a node.left is found null, the value of node(root) is stored in an Arraylist
        // Then node(root) is set to node.right.  The stack pops the top off, since it is an
        // end point.  Process if repeated on node.right -- checks node.left != null etc etc
        while (rootA != null || !valStack.empty()) {
            // Add to stack and set root to node.left, as long as node isn't null
            if (rootA != null) {
                valStack.push(rootA);
                rootA = rootA.left;
            }
            // If node.left is null, set node to top of stack, add the value of node(root) to
            // arraylist, set node(root) to node.right, pop stack.
            if (rootA == null) {
                rootA = valStack.peek();
                valuesA.add(rootA.val);
                rootA = rootA.right;
                valStack.pop();
            }
        }
        while (rootB != null || !valStack.empty()) {
            // Add to stack and set root to node.left, as long as node isn't null
            if (rootB != null) {
                valStack.push(rootB);
                rootB = rootB.left;
            }
            // If node.left is null, set node to top of stack, add the value of node(root) to
            // arraylist, set node(root) to node.right, pop stack.
            if (rootB == null) {
                rootB = valStack.peek();
                valuesB.add(rootB.val);
                rootB = rootB.right;
                valStack.pop();
            }
        }
        if(valuesA.size() != valuesB.size()){
            return false;
        }
        for(int i = 0;i < valuesA.size();i++){
            if (valuesA.get(i) != valuesB.get(i)) {
                areSame = false;
                break;
            }
        }
        return areSame;
    }
}
