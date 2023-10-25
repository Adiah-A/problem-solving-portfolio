class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> minHeap = 
            new PriorityQueue<>((a, b) -> frequencyMap.get(a) - frequencyMap.get(b));
        
        for(Integer key : frequencyMap.keySet()){
            minHeap.offer(key);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        int[] result = new int[k];

        int i = 0;

        while(minHeap.size() > 0){
            result[i] = minHeap.poll();
            i++;
        }


        return result;
    }
}