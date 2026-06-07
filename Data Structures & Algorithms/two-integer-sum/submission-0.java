class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> values = new HashMap<>();

       for (int i = 0; i < nums.length; i++) {
        int compliment = target - nums[i];

        if (values.containsKey(compliment)) {
            return new int[] {Math.min(i, values.get(compliment)), Math.max(i, values.get(compliment))};
        }
        
        values.put(nums[i], i);
       }
        return new int[] {};
    }
}
