ADD TWO NUMBERS 
You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. 
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Approach 
Approach 1: Elementary Math
Algorithm: 
1. Initialize current node to temp variable of the returning list.
2. Initialize carry to 0.
3. Loop through lists l1 and l2 until you reach both ends and carry is 0
  Set x to node l1's value. If l1 has reached the end of l1, set to 0.
  Set y to node l2's value. If l2 has reached the end of l2, set to 0. 
  Set sum = x + y + carry 
  Update carry = sum/10.
  Create a new node with the digit value of (sum mod 10) and set it to current node's next, then advance current node to next.
  Advance both l1 and l2.
4. Return temp's next node 
--------
TAKE CAUTION UNDER THESE CASE:
1. When one list is longer than the other. 
2. When one list is null, which means an empty list.
3. The sum could have an extra carry of one at the end, which is easy to forget.

