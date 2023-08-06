class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here

        //maxHeap for storing largest element

        PriorityQueue<Integer> maxH = new PriorityQueue<>(Collections.reverseOrder());


        //add all the element to maxH
        for (int e : arr) {

            maxH.add(e);
        }


        int largestE = 0;
        int[] res = new int[k];

        //loop through until k

        for (int i = 0; i < k; i++) {

            largestE = maxH.poll();
            res[i] = largestE; //put the largest element in res array

        }

        return res;
    }
}