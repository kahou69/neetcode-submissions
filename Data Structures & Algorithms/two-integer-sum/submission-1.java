class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> values = new HashMap<>();

       for (int i = 0; i < nums.length; i++) {
        int compliment = target - nums[i];

        if (values.containsKey(compliment)) {
            return new int[] {values.get(compliment), i};
        }
        
        values.put(nums[i], i);
       }
        return new int[] {};
    }
}
