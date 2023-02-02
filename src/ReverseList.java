import javax.security.auth.login.CredentialNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        if(head == null){
            return null;
        }
        ListNode node = head;
        ArrayList<ListNode> nodeList = new ArrayList<>();
        while (node != null) {
            nodeList.add(node);
            node = node.next;
        }
        Collections.reverse(nodeList);
        for (int i = 0; i < nodeList.size(); i++) {
            if(nodeList.get(i) == nodeList.get(nodeList.size() - 1)){
                nodeList.get(i).next = null;
                continue;
            }
            nodeList.get(i).next = nodeList.get(i + 1);
        }
        return nodeList.get(0);
    }
}
