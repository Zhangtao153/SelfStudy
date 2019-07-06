package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？
 * 找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution003 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if (nums.length<3){
            return res;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]>0){
                break;
            }
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int low = i+1;
            int hei = nums.length-1;

            while (low<hei){
                if (nums[i]+nums[low]+nums[hei] >0 || (hei<nums.length-1 && nums[hei]==nums[hei+1])){
                    hei--;
                }else if ( nums[i]+nums[low]+nums[hei] <0 || (low>i+1 && nums[low]==nums[low-1])){
                    low++;
                }else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[low++]);
                    list.add(nums[hei--]);
                    res.add(list);
                }
            }
        }
        return res;
    }



    public static void main(String[] args){
        int[] nums1 = new int[]{-2,0,0,2,2};
        System.out.println(new Solution003().threeSum(nums1));


    }
}
