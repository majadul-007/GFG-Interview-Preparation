class Solution {

    
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n) {
        // add your code here

        //sort bot arrays

        Arrays.sort(arr);
        Arrays.sort(dep);



        int i = 0, j = 0;

        int count = 0;
        int maxP = 0;


        while (i < n) {


            //check arrival and departure time less than equal
            if (arr[i] <= dep[j]) {

                count++;
                maxP = Math.max(maxP, count); // Update the maximum platforms if needed.
                i++;//move to next arrival time
            } else if (arr[i] > dep[j]) {
                count--; // Decrement the platform count as a train has left.
                j++; // Move to the next departure time.

            }


        }

        return maxP;

    }

}