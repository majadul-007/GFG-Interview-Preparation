class Solution {
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        //Your code here

        if (head == null || head.next == null) {

            return true;
        }

        Node fast = head, slow = head;

        while (fast.next != null && fast.next.next != null) {

            fast = fast.next.next;
            slow = slow.next;
        }


        Node secondHalf = reverseList(slow.next);

        Node firstHalf = head;

        while (secondHalf != null) {

            if (firstHalf.data != secondHalf.data) {
                return false;
            }


            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;



    }

    private Node reverseList(Node head) {

        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;

    }
}

