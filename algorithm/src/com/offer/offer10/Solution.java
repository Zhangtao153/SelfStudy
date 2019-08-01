package com.offer.offer10;


import java.util.HashMap;

/**
 * @author zth
 * @Date 2019-08-01 19:08
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 * （先后次序不同算不同的结果）
 */
public class Solution {
    public static int JumpFloor(int target) {
        int result = 0;
        if (target <= 0){
            try {
                throw new Exception("台阶数大于等于1");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (target == 1){
            return 1;
        }else if (target == 2){
            return 2;
        }else {
            int pre = 2;
            int prePre = 1;
            for (int i = 3; i <=target ; i++) {
                result = pre +prePre;
                prePre = pre;
                pre =  result;
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(JumpFloor(2));
    }
}
