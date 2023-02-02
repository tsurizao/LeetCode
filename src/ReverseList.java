import javax.security.auth.login.CredentialNotFoundException;
import java.util.ArrayList;

public class ReverseList {

    /**
     * Given the head of a singly linked list, reverse the list, and return the reversed list.
     * .
     * .
     * Definition for singly-linked list...
     */

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode node = head;
        ArrayList<ListNode> nodeList = new ArrayList<>();
        while (node != null) {
            nodeList.add(node);
            node = node.next;
        }
        for (int i = nodeList.size() - 1; i > 0; i--) {
            nodeList.get(i).next = nodeList.get(i - 1);
        }
        return nodeList.get(nodeList.size() - 1);
    }
}
