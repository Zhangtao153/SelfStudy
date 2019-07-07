package com.leetcode.bit;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * 说明：解集不能包含重复的子集。
 *
 * 示例:
 *
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subsets
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution001 {
    /**
     * 解法一
     * 集合的每个元素，都有可以选或不选，用二进制和位运算，可以很好的表示
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        // 集合元素的组合数 = 1 << num.length
        for (int i = 0;i<(1 << nums.length);i++){
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if (((i>>j) & 1) == 1) list.add(nums[j]);
            }
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args){
        int[] array = new int[]{1,2,3};
        System.out.println(new Solution001().subsets(array));
    }
}
