class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());



        for(int s:stones){


            maxHeap.add(s);
        }

        

        while(maxHeap.size() > 1){

            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();

            if(stone1!= stone2){
                int val = stone1-stone2;
                maxHeap.add(val);
                
            }


        }


        return maxHeap.isEmpty() ?0:(maxHeap.remove());


        
    }
}