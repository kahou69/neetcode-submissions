class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];

            if (valueIndex.containsKey(remainder)) {
                return new int[] {valueIndex.get(remainder), i};
            }
            valueIndex.put(nums[i], i);
        }

        return new int[] {};
    }
}
