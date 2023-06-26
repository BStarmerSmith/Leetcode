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
        System.out.printf("\nl1_sum: %d l2_sum: %d result: %d", l1_sum, l2_sum, result);
        int[] resultArray = splitIntToArray(result);
        ListNode resultNode = new ListNode(resultArray[0]);
        ListNode current = resultNode;
        for (int i = 1; i < resultArray.length; i++) {
            current.next = new ListNode(resultArray[i]);
            current = current.next;
        }
        System.out.print("\nresultNode: ");
        ListNode resultNodeRev = reverseLinkedList(resultNode);
        printListNode(resultNodeRev);
        return resultNodeRev;
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
        String number = "";
        System.out.print("[");
        while (current != null) {
            System.out.print(current.val);
            current = current.next;
        }System.out.print("]");
    }

    public void testSolution() {
        ListNode t1_l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode t1_l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.println("l1 = [2,4,3], l2 = [5,6,4] 342+465=807 output=[7,0,8]");
        addTwoNumbers(t1_l1, t1_l2);
        System.out.println();

        ListNode t2_l1 = new ListNode(0);
        ListNode t2_l2 = new ListNode(0);
        System.out.println("l1 = [0], l2 = [0] 0+0=0 output=[0]");
        addTwoNumbers(t2_l1, t2_l2);
        System.out.println();

        ListNode t3_l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode t3_l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        System.out.println("l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] 9999999+9999=10009998 output=[8,9,9,9,0,0,0,1]");
        addTwoNumbers(t3_l1, t3_l2);
        System.out.println();
    }

}
