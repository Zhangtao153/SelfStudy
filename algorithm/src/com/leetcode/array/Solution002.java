package com.leetcode.array;

/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 * 输入: [1,8,6,2,5,4,8,3,7]
 * 输出: 49
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution002 {
   /* public int maxArea(int[] height) {
        int max =0;
        int hei;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[i]>height[j]){
                    hei = height[j];
                }else {
                    hei=height[i];
                }
                if (max < hei*(j-i)){
                    max = hei*(j-i);
                }
            }
        }
        return max;
    }*/

    public int maxArea(int[] height) {
        int max =0;
        int left = 0;
        int right = height.length-1;
        while (left< right){

            max = Math.max(max,(Math.min(height[left],height[right])*(right-left)));
            if (height[left] > height[right]){
                right--;
            }else {
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{1,8,6,2,5,4,8,3,7};

        System.out.println(new Solution002().maxArea(nums1));
    }
}
