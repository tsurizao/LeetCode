import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import static java.util.Objects.isNull;

// You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
// Return the head of the merged linked list.

public class MergeTwoSortedLists {

    public static class ListNode {
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        LinkedList<ListNode> combinedList = new LinkedList<>();
        combineListNodes(list1, combinedList);
        combineListNodes(list2, combinedList);
        combinedList.sort(Comparator.comparingInt(o -> o.val));
        for (int i = 0; i < combinedList.size() - 1; i++) {
            combinedList.get(i).next = combinedList.get(i + 1);
            if (combinedList.size() - i == 1) {
                combinedList.get(i + 1).next = null;
            }
        }
        return combinedList.getFirst();
    }

    private static void combineListNodes(ListNode list, LinkedList<ListNode> combinedList) {
        boolean isFirst;
        ListNode nodeToCheck;
        if (list != null) {
            isFirst = true;
            nodeToCheck = new ListNode(list.val, list.next);
            while (true) {
                if (isFirst) {
                    combinedList.add(nodeToCheck);
                    isFirst = false;
                } else {
                    if (nodeToCheck.next == null) {
                        break;
                    }
                    nodeToCheck = new ListNode(nodeToCheck.next.val, nodeToCheck.next.next);
                    combinedList.add(nodeToCheck);
                }
            }
        }
    }
}
