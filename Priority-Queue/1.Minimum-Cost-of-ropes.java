class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        

        PriorityQueue<Long> pq = new PriorityQueue<>();
        long totalCost = 0;
        
        
      //add all the item in priority queue
        for(int i=0; i<n; i++){
            
            pq.add(arr[i]);
        }
    
    //while queue has more than 1 value    
        while(pq.size() > 1){
            
            long curr = pq.poll() + pq.poll(); //pop out top 2 mimum value
            totalCost += curr; //add it totalcost
            pq.add(curr); //add the minium sum of two to queue again
            
        }
        
        return totalCost;
    }
}