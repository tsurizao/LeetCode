import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicatesFromSortedList {

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
//    Given the head of a sorted linked list, delete all duplicates
//    such that each element appears only once. Return the linked list sorted as well.

    public ListNode deleteDuplicates(ListNode head) {

        // Save head as node, allows LinkedList to be traversed by saving each iteration as the .next
        ListNode node = head;

        while (node != null && node.next != null) {
            // If the values of node and node.next are the same, we change the current node.next to node.next.next
            // Effectively removing the next node from the chain
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                // If node.val and node.next.val are NOT the same, moves on to the next node
                node = node.next;
            }
        }
        return head;
    }
}
