package main.java.chen.nz;

/**
 * Created by foxi.chen on 24/03/21.
 *
 * @author foxi.chen
 */
public class InPlaceArrayReplacement {

    /**
     * Given an array arr, replace every element
     * in that array with the greatest element among the elements to its right,
     * and replace the last element with -1.
     * After doing so, return the array.
     * Input: arr = [17,18,5,4,6,1]
     * Output: [18,6,6,6,1,-1]
     * @param arr input array
     * @return replaced array
     */
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int temp;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp = arr[i];
            arr[i] = max;
            max = Math.max(temp, max);
        }
        return arr;
    }

    /**
     * Given a sorted array nums, remove the duplicates in-place
     * such that each element appears only once and returns the new length.
     * Do not allocate extra space for another array, you must do this
     * by modifying the input array in-place with O(1) extra memory.
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2]
     * @param nums input nums
     * @return the length of unique elements in the array
     */
    public int removeDuplicates(int[] nums) {
        // two pointers
        int length = nums.length;
        int i = 0, j = i + 1;
        while( j < length) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
            j++;
        }
        length = i + 1;
        return length;
    }
}
