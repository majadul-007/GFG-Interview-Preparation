class Sol
{
    int countRev (String s)
    {
        // your code here 
        
        //check if string is  balanced or not
        if(s.length() % 2 != 0){
        return -1;
    }
    
    
        
        Stack<Character> mySt = new Stack<>();
        int count=0;
        
        for(int i=0; i<s.length(); i++){
            
            char val = s.charAt(i);
            
            
        if(val == '{'){
                
                mySt.push(val);
            }
            
        else if(!mySt.isEmpty()){ //if the val is } then matched
                
              mySt.pop(); //pop it out
        }
        else{
            mySt.push(val);
            count++;
        }
        
    }
        return count + (mySt.size()/2);
    
    
    
}
}