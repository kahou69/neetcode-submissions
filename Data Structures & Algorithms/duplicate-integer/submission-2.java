class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> dup = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (!dup.containsKey(nums[i])) {
                dup.put(nums[i], i);
            } else {
                return true;  // Return true if a duplicate is found
            }
        }
        
        return false;  // Return false if no duplicates
    }
}
