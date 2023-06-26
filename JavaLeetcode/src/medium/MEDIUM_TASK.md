## 2. Add Two Numbers

[Link to file](AddTwoList.java)
[Link to helper file](ListNode.java)


You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. You need to add the two numbers and return the sum as a linked list.

The problem can be summarized as follows:
- Given two linked lists `l1` and `l2`, where each node represents a single digit of a non-negative integer.
- The digits are stored in reverse order, meaning the least significant digit is at the head of the list.
- You need to add the two numbers represented by the linked lists and return the sum as a new linked list.
- Leading zeros, except the number 0 itself, should not be included in the linked list.

## Example

**Input:**

```
l1 = [2,4,3]
l2 = [5,6,4]
```

**Output:**

```
[7,0,8]
```

**Explanation:** The linked lists represent the numbers 342 and 465, respectively. Adding them gives the sum 807, which is represented by the linked list [7,0,8].

## Constraints

The problem has the following constraints:
- The number of nodes in each linked list is in the range [1, 100].
- The value of each node is in the range [0, 9].
- It is guaranteed that the linked list represents a number that does not have leading zeros.
