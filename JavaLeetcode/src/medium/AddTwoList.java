package JavaLeetcode.src.medium;

public class AddTwoList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = sumOfNodes(l1, l2);
        return result;
    }

    private ListNode sumOfNodes(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            int digit = sum % 10;
            carry = sum / 10;
            current.next = new ListNode(digit);
            current = current.next;
        }

        return dummyHead.next;
    }

    public void printListNode(ListNode head) {
        ListNode current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.val);
            current = current.next;
        }
        System.out.print("]");
    }

    public void testSolution() {
        System.out.println("Running Tests for 2.AddTwoList");
        ListNode t1_l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode t1_l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.println("l1 = [2,4,3], l2 = [5,6,4] 342+465=807 output=[7,0,8]");
        ListNode t1_result = addTwoNumbers(t1_l1, t1_l2);
        System.out.print("Expected output: [7,0,8] ");
        printListNode(t1_result);
        System.out.println();
        assertListNodeEquals(t1_result, new ListNode(7, new ListNode(0, new ListNode(8))));

        ListNode t2_l1 = new ListNode(0);
        ListNode t2_l2 = new ListNode(0);
        System.out.println("l1 = [0], l2 = [0] 0+0=0 output=[0]");
        ListNode t2_result = addTwoNumbers(t2_l1, t2_l2);
        System.out.print("Expected output: [0] ");
        printListNode(t2_result);
        System.out.println();
        assertListNodeEquals(t2_result, new ListNode(0));

        ListNode t3_l1 = new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode t3_l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        System.out.println("l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] 9999999+9999=10009998 output=[8,9,9,9,0,0,0,1]");
        ListNode t3_result = addTwoNumbers(t3_l1, t3_l2);
        System.out.print("Expected output: [8,9,9,9,0,0,0,1] ");
        printListNode(t3_result);
        System.out.println();
        assertListNodeEquals(t3_result, new ListNode(8, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1)))))))));

        ListNode t4_l1 = new ListNode(2, new ListNode(4, new ListNode(9)));
        ListNode t4_l2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));
        System.out.println("l1 = [2,4,9], l2 = [5,6,4,9] 942+9645=10587 output=[7,0,4,0,1]");
        ListNode t4_result = addTwoNumbers(t4_l1, t4_l2);
        System.out.print("Expected output: [7,0,4,0,1] ");
        printListNode(t4_result);
        System.out.println();
        assertListNodeEquals(t4_result,
                new ListNode(7, new ListNode(0, new ListNode(4, new ListNode(0, new ListNode(1))))));
    }

    public void assertListNodeEquals(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                System.out.println("TEST FAILURE: Expected: " + p1.val + " Actual: " + p2.val);
                throw new AssertionError("ListNode values do not match");
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        if (p1 != null || p2 != null) {
            throw new AssertionError("ListNode lengths do not match");
        }
    }

}
