class Solution {
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n) {
        // Your code here

        if ( head == null) {
            return -1;
        }

        Node dummy = new Node(0);

        dummy.next = head;

        Node first = dummy, second = dummy;

        for (int i = 0; i <= n; i++) {
            if (second == null) {
                return -1;
            }
            second = second.next;
        }

        // Move both pointers until the second pointer reaches the end
        while (second != null) {
            second = second.next;
            first = first.next;
        }



        return first.next.data;
    }
}
