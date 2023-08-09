class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        
        HashMap<Integer, Integer> myMap = new HashMap<>();
        
        
        int i=0;
        
        while(i< arr.length -1){
            
            i++;
            
            if(myMap.containsKey(x-arr[i])){
                return true;
            }
            else{
                myMap.put( arr[i], i);
            }
        }
        
        return false;
    }
}