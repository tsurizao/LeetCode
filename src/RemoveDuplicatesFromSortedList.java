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

    public static ListNode deletedDuplicates(ListNode head) {

        LinkedList<ListNode> sortedList = new LinkedList<>();
        sortedList.add(head);

        for(int i = 0;i < sortedList.size();i++){
            sortedList.add(sortedList.get(i).next);
        }

        return sortedList.get(0);
    }
}
