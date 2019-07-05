package com.leetcode.array;

import java.util.Arrays;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 示例 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 * 示例 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * 则中位数是 (2 + 3)/2 = 2.5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution001 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] temp = new int[len];
        if (nums1.length!=0){
            for (int i = 0; i < nums1.length; i++) {
                temp[i]= nums1[i];
            }
            int index = nums1.length-1;

            for (int i = 0; i < nums2.length; i++) {
                int j = index;
                for (j =index ; j >=0 && temp[j] > nums2[i]; j--) {
                    temp[j+1] = temp[j];
                }
                temp[j+1] = nums2[i];
                index ++;

            }
        }else {
            for (int i = 0; i < nums2.length; i++) {
                temp[i]= nums2[i];
            }
        }

        System.out.println(Arrays.toString(temp));
        if (len%2 != 0){
            return temp[len/2];
        }else {
            return (temp[len/2 -1]+temp[len/2 ])/2.0;
        }

    }

    public static void main(String[] args){
        int[] nums1 = new int[]{3,4};
        int []nums2 = new int[]{-2,-1};

        System.out.println(new Solution001().findMedianSortedArrays(nums1,nums2));
    }
}
