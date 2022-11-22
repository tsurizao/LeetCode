import java.util.LinkedList;

public class Main {

    /**
     * -=([{ Current unworkable exercises }])=-
     * - ValidParentheses - need to research Stack / LIFO
     */

    public static void main(String[] args) {
//         Using this space to test solution classes
        LinkedList<MergeTwoSortedLists.ListNode> list1 = new LinkedList<>();
        MergeTwoSortedLists.ListNode node3 = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.ListNode node2 = new MergeTwoSortedLists.ListNode(2, node3);
        MergeTwoSortedLists.ListNode node1 = new MergeTwoSortedLists.ListNode(1, node2);
        list1.add(node1);
        list1.add(node2);
        list1.add(node3);

        LinkedList<MergeTwoSortedLists.ListNode> list2 = new LinkedList<>();
        MergeTwoSortedLists.ListNode node6 = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.ListNode node5 = new MergeTwoSortedLists.ListNode(3, node6);
        MergeTwoSortedLists.ListNode node4 = new MergeTwoSortedLists.ListNode(1, node5);
        list2.add(node4);
        list2.add(node5);
        list2.add(node6);

        MergeTwoSortedLists.mergeTwoLists(node1, node4);
    }
}
