class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // this is a stack to store the pairs of the temperature and the days without a warmer day
        Stack<int[]> weather = new Stack<>();
        // empty list with values of 0
        int[] ans = new int[temperatures.length];
        // loop through all of the temperatures
        for(int i =0; i< temperatures.length; i++){
            // store the temp of the days
            int temp = temperatures[i];
            //while the stack is not empty and the top temp in the steck is less than the current temp, pop the value, and then compute how many days have passed and update teh result
            while( !weather.isEmpty() && weather.peek()[0]< temp){
                int[] pair = weather.pop();
                ans[pair[1]] = i - pair[1];
            }
            // push the current day on to the stack
            weather.push(new int[]{temp,i});
        }
        // return the new filled list
        return ans;
    }
}
