package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。
 * 返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 *
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution004 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        int sum = 0,hei,low;

        for (int i = 0; i < nums.length-1; i++) {
             low = i+1;
             hei = nums.length-1;
            while (low<hei){
                sum = nums[i]+nums[low]+nums[hei];
                if (Math.abs(target-sum) < Math.abs(target-res)){
                    res = sum;
                }
                if (sum >target){
                    hei--;
                }else if (sum<target){
                    low++;
                }else {
                    return res;
                }
            }
        }
        return res;
    }


    public static void main(String[] args){
        int[] nums1 = new int[]{1,1,1,0};
        System.out.println(new Solution004().threeSumClosest(nums1,-100));


    }
}
