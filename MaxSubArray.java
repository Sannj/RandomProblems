package RandomProblems;

import java.util.ArrayList;

/**
 * Created by sanjanabadam on 9/20/16.
 */

/*
Find out the maximum sub-array of non negative numbers from an array.
The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid.

Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).
Example:
A : [1, 2, 5, -7, 2, 3]
The two sub-arrays are [1, 2, 5] [2, 3].
The answer is [1, 2, 5] as its sum is larger than [2, 3]
link - https://www.interviewbit.com/problems/max-non-negative-subarray/

 */
public class MaxSubArray {
    public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
        long maxSum = 0;
        long newSum = 0;
        ArrayList<Integer> maxArray = new ArrayList<Integer>();
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (Integer i : a) {
            if (i >= 0) {
                newSum += i;
                newArray.add(i);
            } else {
                newSum = 0;
                newArray = new ArrayList<Integer>();
            }
            if ((maxSum < newSum) || ((maxSum == newSum) && (newArray.size() > maxArray.size()))) {
                maxSum = newSum;
                maxArray = newArray;
            }
        }
        return maxArray;}

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(24831);
        a.add(53057);
        a.add(19790);
        a.add(-10679);
        a.add(77006);
        a.add(-36098);
        a.add(75319);
        a.add(-45223);
        a.add(-56760);
        a.add(-86126);
        a.add(-29506);
        a.add(76770);
        a.add(29094);
        a.add(87844);
        a.add(40534);
        a.add(-15394);
        a.add(18738);
        a.add(59590);
        a.add(-45159);
        a.add(-64947);
        a.add(7217);
        a.add(-55539);
        a.add(42385);
        a.add(-94885);
        a.add(82420);
        a.add(-31968);
        a.add(-99915);
        a.add(63534);
        a.add(-96011);
        a.add(24152);
        a.add(77295);
        ArrayList<Integer> aa = maxset(a);
        System.out.println(aa);

    }


}
