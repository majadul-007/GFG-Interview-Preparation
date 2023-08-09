class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int mLen =0;
        
        int sum=0;
        int i =-1;
        map.put(sum, i);
        
        while(i< arr.length-1){
            
            i++;
            sum += arr[i];
            
            if(map.containsKey(sum) == false){
                
                map.put(sum, i);
            }
            else{
                
                int len = i- map.get(sum);
                
                if(len > mLen){
                    mLen = len;
                }
            }
        }
        
        return mLen;
    }
}