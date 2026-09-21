class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        float[] times = new float[position.length];
        for(int i = 0; i< position.length; i++){
            times[i] = (float)(target - position[i]) / speed[i];
        }

        float [] [] carPos = new float[position.length][2];
        for(int i = 0; i< position.length; i++){
            carPos[i][0] = times[i];
            carPos[i][1] = position[i];
        }
        Arrays.sort(carPos, (a,b) -> Float.compare(a[1], b[1]));

        Stack<Float> fleets = new Stack<>();
        for(float[] c : carPos){
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
