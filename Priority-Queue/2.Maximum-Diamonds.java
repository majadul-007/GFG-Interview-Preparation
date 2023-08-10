//User function Template for Java

class Solution {
    static long maxDiamonds(int[] A, int N, int K) {


        //priority queue for get the maximum diamond

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        long maxD = 0;

        //push the diamonds to max heap

        for (int i = 0; i < A.length; i++) {

            pq.add(A[i]);
        }



        for (int i = 0; i < K; i++) {

            int curr = pq.poll(); //remove the max value
            maxD += curr; //add it to result
            pq.add(curr / 2); //add A[i]/2 value to the same index in max heap

        }

        return maxD;
    }
};