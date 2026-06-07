class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //create a hashmap to store the value as key and occurance as value.
        Map<Integer, Integer> valueOccurMap = new HashMap();

        for (int num : nums){
            if (valueOccurMap.containsKey(num)) {
                valueOccurMap.put(num, valueOccurMap.get(num) + 1);
            } else {
                valueOccurMap.put(num, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(valueOccurMap.entrySet());

        list.sort((e1, e2) -> {
            return e2.getValue().compareTo(e1.getValue());
        });

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(list.get(i).getKey());
        }
        
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
