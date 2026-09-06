class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        //get the biggest element in the array
        int r = Arrays.stream(piles).max().getAsInt();
        // set that amount to the result as this is the worst case
        int result = r;

        while (l<=r){
            //find the mid point between best and worst cases
            int k = (l+r)/2;
            // create a total amount of time variable to track the amount of time take to eat bananas
            long totalTime =0;
            for(int p : piles){
                // loop thorugh all the piles to see how long it takes in total
                totalTime += Math.ceil((double) p /k);
            }
            // if the total time is less than the amount we have. shrink the result value to k, if it is bigger, shift the left value to k. this is simple binary searhc to find the target value that is optimal
                if(totalTime <= h){
                    result = k;
                    r = k-1;
                }else{
                    l = k+1;
                }
            }
        return result;
    }
}
