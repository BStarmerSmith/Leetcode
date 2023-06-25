package JavaLeetcode.src.medium;

public class AddTwoList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1_rev = reverseLinkedList(l1);
        printListNode(l1_rev);
        ListNode l2_rev = reverseLinkedList(l2);
        printListNode(l2_rev);
        int l1_sum = sumOfNodes(l1_rev);
        int l2_sum = sumOfNodes(l2_rev);
        int result = l1_sum + l2_sum;
        System.out.println(result);
        System.out.printf("\nl1_sum: %d l2_sum: %d result: %d", l1_sum, l2_sum, result);
        int[] result_list = splitIntToArray(result);
        ListNode final_node = new ListNode(result_list[result_list.length - 1]);
        ListNode current = final_node;
        for (int i = result_list.length - 2; i >= 0; i--) {
            current.next = new ListNode(result_list[i]);
            current = current.next;
        }
        ListNode final_node_rev = reverseLinkedList(final_node);
        printListNode(final_node);
        return final_node_rev;
    }

    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;  // Return the new head of the reversed linked list
    }

    private int sumOfNodes(ListNode head) {
        ListNode current = head;
        String number = "";

        while (current != null) {
            number += current.val;
            current = current.next;
        }
        return Integer.parseInt(number);
    }

    private int[] splitIntToArray(int number) {
        int length = String.valueOf(number).length();
        int[] digits = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public void printListNode(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void testSolution() {
        ListNode t1_l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode t1_l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.println("Nodes 2 -> 4 -> 3 and Nodes 5 -> 6 -> 4");
        addTwoNumbers(t1_l1, t1_l2);

        ListNode t2_l1 = new ListNode(0);
        ListNode t2_l2 = new ListNode(0);
        System.out.println("Nodes 0 and Nodes 0");
        addTwoNumbers(t2_l1, t2_l2);

        ListNode t3_l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode t3_l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        System.out.println("l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]");
        addTwoNumbers(t3_l1, t3_l2);
    }

}
