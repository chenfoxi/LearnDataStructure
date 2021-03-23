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
}
