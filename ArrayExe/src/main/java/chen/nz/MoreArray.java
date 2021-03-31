package main.java.chen.nz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by foxi.chen on 1/04/21.
 *
 * @author foxi.chen
 */
public class MoreArray {

    /**
     * Students are asked to stand in non-decreasing order of heights for an annual photo.
     *
     * Return the minimum number of students that must move
     * in order for all students to be standing in non-decreasing order of height.
     *
     * Notice that when a group of students is selected they can reorder in any possible way between themselves
     * and the non selected students remain on their seats.
     *
     * Input: heights = [1,1,4,2,1,3]
     * Output: 3
     * Explanation:
     * Current array : [1,1,4,2,1,3]
     * Target array  : [1,1,1,2,3,4]
     * On index 2 (0-based) we have 4 vs 1 so we have to move this student.
     * On index 4 (0-based) we have 1 vs 3 so we have to move this student.
     * On index 5 (0-based) we have 3 vs 4 so we have to move this student.
     *
     * @param heights
     * @return
     */
    public int heightChecker(int[] heights) {
        int[] reorder = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int changed = 0;
        for (int i = 0; i < heights.length; i++) {
            if(reorder[i] != heights[i]) changed++;
        }
        return changed;
    }

    /**
     * no sort version
     * @param heights
     * @return
     */
    public int heightCheckerNoSort(int[] heights) {
        // according to the constraint, the max size of the input array is 100
       int[] heightFreq = new int[101];
        for (int height :
            heights) {
            heightFreq[height]++;
        }
        int result = 0, currentHeight = 0;
        for (int i = 0; i < heights.length; i++) {
            while (heightFreq[currentHeight] == 0) {
                // skip invalid height or the already finished height
                currentHeight++;
            }
            // in non-decreased order, if the height is not in the correct position, add the result
            if(currentHeight != heights[i]) {
                result++;
            }
            heightFreq[currentHeight]--;
        }

        return result;
    }
}
