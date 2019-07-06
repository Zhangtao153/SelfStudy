package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，
 * 使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 *
 * 注意：
 *
 * 答案中不可以包含重复的四元组。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/4sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution005 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        int low,hei,sum;
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i+1; j < nums.length - 2; j++) {
                low = j+1;
                hei = nums.length-1;
                while (low<hei){
                    sum = nums[i]+nums[j]+nums[low]+nums[hei];
                    if (sum==target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[low]);
                        list.add(nums[hei]);
                        set.add(list);
                        low++;
                        hei--;
                        continue;
                    }else if (sum < target){
                        low++;
                    }else {
                        hei--;
                    }
                }
            }
        }

        res.addAll(set);
        return res;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        System.out.println(new Solution005().fourSum(nums,0));


    }
}
