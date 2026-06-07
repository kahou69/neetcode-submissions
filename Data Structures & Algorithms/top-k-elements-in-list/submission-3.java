class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       //create a hashmap to store the value as key and occurance as value.
        Map<Integer, Integer> valueOccurMap = new HashMap();

        //time O(n)
        for (int num : nums){
            valueOccurMap.put(num, valueOccurMap.getOrDefault(num, 0) + 1);
        }

        //creates a priority queue to store array of int , with combination of {value, key} sorting by value descedning order
        Queue<int[]> queue = new PriorityQueue<>((a,b) -> {
            return b[0] - a[0];
        });

        for(Map.Entry<Integer,Integer> entry : valueOccurMap.entrySet()) {
            queue.offer(new int[] {entry.getValue(), entry.getKey()});
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = queue.poll()[1];
        }

        return ans;
    }
}
