import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLists {

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        LinkedList<ListNode> combinedList = new LinkedList<>();

        boolean isFirst = true;
        ListNode nodeToCheck = new ListNode(list1.val, list1.next);
        while (true) {
            if (isFirst) {
                combinedList.add(nodeToCheck);
                isFirst = false;
            } else {
                if (nodeToCheck.next == null) {
                    combinedList.add(nodeToCheck);
                    break;
                }
                nodeToCheck = new ListNode(nodeToCheck.next.val, nodeToCheck.next.next);
                combinedList.add(nodeToCheck);
            }
        }

        nodeToCheck = new ListNode(list2.val, list2.next);
        isFirst = true;
        while (true) {
            if (isFirst) {
                combinedList.add(nodeToCheck);
                isFirst = false;
            } else {
                if (nodeToCheck.next == null) {
                    combinedList.add(nodeToCheck);
                    break;
                }
                nodeToCheck = new ListNode(nodeToCheck.next.val, nodeToCheck.next.next);
                combinedList.add(nodeToCheck);
            }
        }

        return combinedList.getFirst();
    }
}
