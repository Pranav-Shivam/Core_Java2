package LeetCode;

import java.util.*;
public class Merge_K_Sorted_Array_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        PriorityQueue<ListNode> heap = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
        for (ListNode node : lists) {
            if (node != null) heap.add(node);
        }

        ListNode head = new ListNode(0);
        ListNode current = head;

        while (!heap.isEmpty()) {
            ListNode next = heap.poll();
            current.next = next;
            if (next.next != null) heap.add(next.next);
            current = current.next;
        }

        return head.next;
    }
}
