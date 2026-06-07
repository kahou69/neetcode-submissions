class Solution {
    public int[] twoSum(int[] nums, int target) {
              Map<Integer,Integer> valueIndexMap = new HashMap();

        for (int i = 0; i < nums.length; i++){
            int remain = target - nums[i];
            
            if (valueIndexMap.containsKey(remain)) {
                return new int[] { valueIndexMap.get(remain), i};
            }

            if (!valueIndexMap.containsKey(nums[i])) {
                valueIndexMap.put(nums[i], i);
            }
        }
        
        return new int[]{};
    }
}
