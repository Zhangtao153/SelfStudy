package com.offer.offer14;

import static java.lang.Math.pow;

/**
 * @author zth
 * @Date 2019-08-08 23:37
 * 动态规划、贪婪算法
 */
public class CuttingRope {
    /**
     * 动态规划法
     * @param length 绳子的长度
     * @return 最大乘积
     */
    public int maxProductAfterCutting_solution1(int length){
        if (length<2) return 0;
        if (length==2) return 1;
        if (length==3) return 2;

        // 用于存储最大乘积
        int[] products = new int[length+1];
        // 如下几个为特例，并非乘积。因为自身比乘积大
        products[0] = 0;
        products[1] = 1;
        products[2] = 2;
        products[3] = 3;

        int max = 0;
        int product = 0;

        // 从下到上计算长度为 i 时最大乘积
        for (int i = 4; i <= length; i++) {
            max = 0;
            for (int j = 1; j <= i / 2; j++) {
                product = products[j]*products[i-j];
                if (max < product){
                    max = product;
                }
            }
            products[i] = max;
        }

        return products[length];
    }

    /**
     * 贪婪算法求解
     * @param length
     * @return
     */
    public int maxProductAfterCutting_solution2(int length){
        if (length<2) return 0;
        if (length==2) return 1;
        if (length==3) return 2;

        // 尽可能多地剪去长度为 3 的绳子段
        int timesOf3 = length/3;
        // 当绳子最后长度为 4 的时候，不能再减去 3
        if (length - timesOf3*3 == 1){
            timesOf3--;
        }
        int timesOf2 = (length-timesOf3*3)/2;

        return (int)(pow(3,timesOf3)*pow(2,timesOf2));
    }


    // =====测试代码======
    void test(String testName, int length, int expected) {
        if (testName != null)
            System.out.print(testName + ":");
        if (maxProductAfterCutting_solution1(length) == expected) {
            System.out.println("    动态规划:" + "passed  ");
        } else {
            System.out.println("    动态规划:" + "failed  ");
        }

        if (maxProductAfterCutting_solution2(length) == expected) {
            System.out.println("贪婪算法:" + "passed  ");
        } else {
            System.out.println("贪婪算法:" + "failed  ");
        }
    }

    void test1() {
        test("test1", 1, 0);
    }

    void test2() {
        test("test2", 2, 1);
    }

    void test3() {
        test("test3", 3, 2);
    }

    void test4() {
        test("test4", 4, 4);
    }

    void test5() {
        test("test5", 5, 6);
    }

    void test6() {
        test("test6", 10, 36);
    }

    void test7() {
        test("test7", 50, 86093442);
    }

    public static void main(String[] args) {
        CuttingRope demo = new CuttingRope();
        demo.test1();
        demo.test2();
        demo.test3();
        demo.test4();
        demo.test5();
        demo.test6();
        demo.test7();
    }
}
