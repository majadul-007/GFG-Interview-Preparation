class Solution {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        //Your code here

        //Min heap for storing elements by smallest order

        PriorityQueue<Integer> minH = new PriorityQueue<>();


        //add element to min heap
        for (int e : arr) {
            minH.add(e);
        }


        //variable for keep track of small value

        int smallestElement = 0;


        //loop untill k matches

        while (k > 0) {

            smallestElement = minH.poll();

            k--;

        }

        return smallestElement;
    }
}
