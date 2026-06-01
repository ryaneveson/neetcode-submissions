class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // We will want to use Bucket Sort
        Map<Integer, Integer> count = new HashMap<>();
        // Loop through all of the numbers in the array and create your frequency map
        for (int i : nums){
            //count or get default does this
            // it checks to see if we have the current number already stored in the map. if we do it grabs the count and stores it
            // if we do not it defualts it to 0 and adds one to the count creating a new key in the hash map for the value
            count.put(i, count.getOrDefault(i,0) + 1);
        }
        // create a priority queue for the min heap
        // remember the notes. min heap will keep smallest value at the root.
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)-> a[0] - b[0]);
        // the formula in the prioqueue is what makes this a min heap
        // this for loop will go through the map and offer each value pair in to the min heap
        //if there is ever a case when the value in the heap is greater then k, the heap will poll the root
        // this wil get rid of the smallest value keeping the largest values in the heap
        // using the min heap lets us remove the smallest number in the fastest time complexity
        for(Map.Entry<Integer,Integer> entry: count.entrySet()){
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
            if(heap.size() > k){
                heap.poll();
            }
        }
        // now we will create a new array and poll the k amount
        // of values in to the new array and return this as the answer
        int[] res = new int [k];
        for (int i = 0; i< k; i++){
            res[i]=heap.poll()[1];
        }
        // this is the final array that will store the values, not the frequencies
        return res;
    }
}
