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

    public static ListNode deleteDuplicates(ListNode head) {

        LinkedList<ListNode> sortedList = new LinkedList<>();
        sortedList.add(head);

        for (int i = 0; sortedList.get(i).next != null; i++) {
            sortedList.add(sortedList.get(i).next);
        }

        for (int i = 0; i < sortedList.size(); i++) {
            if (sortedList.size() > 1) {
                for (int j = i + 1; j < sortedList.size(); j++) {
                    if (sortedList.get(i).val == sortedList.get(j).val) {
                        sortedList.get(i).next = sortedList.get(j).next;
                    }
                }
            }
        }

        return sortedList.get(0);
    }
}
