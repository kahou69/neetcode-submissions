class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);

        return nums;
    }

    public static void mergeSort(int[] nums) {
        int length = nums.length;

        //base case
        if (length <= 1) return ;

        int middle = length / 2;

        // splitting the array 
        // 1st array size until the middle 
        // 2nd array is the remaining

        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //left array
        int j = 0; //right array

        for(; i < length; i++) {
            if (i < middle) {
                leftArray[i] = nums[i];
            } else {
                rightArray[j++] = nums[i];
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, nums);
    }

    public static int[] merge(int[] arr1, int[] arr2, int[] merged) {
        int i = 0, j= 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j])
                merged[k++] = arr1[i++];
            else
                merged[k++] = arr2[j++];
        }

        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

}