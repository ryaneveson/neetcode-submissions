class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        //Fine all the times that it will take for the cars to get to the target
        double[] times = new double[position.length];
        for(int i = 0; i< position.length; i++){
            times[i] = (double)(target - position[i]) / speed[i];
        }
        //now add the times and the position to a pair of ints and then sort them in ascending order
        double [] [] carPos = new double[position.length][2];
        for(int i = 0; i< position.length; i++){
            carPos[i][0] = times[i];
            carPos[i][1] = position[i];
        }
        Arrays.sort(carPos, (a,b) -> Double.compare(a[1], b[1]));
        //this is a stack that stores all the cars in order. if there is a car that has a longer time, it will act as a bottle neck and therefore you will have to pop all of the faster cars that are coming behind it will be absorbed in to this car. this is why we have to do it in ascending order.
        Stack<Double> fleets = new Stack<>();
        for(double[] c : carPos){
            if(fleets.isEmpty()){
                fleets.push(c[0]);
            }else{
                while(!fleets.isEmpty() && c[0]>= fleets.peek()){
                    fleets.pop();
                }
                fleets.push(c[0]);
            }
        }
        return fleets.size();
    }
}
