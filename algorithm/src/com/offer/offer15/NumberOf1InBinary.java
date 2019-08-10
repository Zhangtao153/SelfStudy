package com.offer.offer15;

/**
 * @author zth
 * @Date 2019-08-09 8:38
 */
public class NumberOf1InBinary {
    /**
     * 方法一
     * @param n 输入的整数
     * @return 返回 n 的二进制中 1 的个数
     */
    public int numberOf1_1(int n){
        int count = 0;
        int flag = 1;
        while (flag != 0){
            if ((n & flag)!=0){

                count++;
            }
            flag = flag <<1;
        }
        return count;
    }

    /**
     * 方法二
     */
    public int numberOf1_2(int n){
        int count = 0;
        while (n !=0){
            count++;
            n = (n-1)&n;
        }
        return count;
    }


    // =========测试代码=========

    void test(String testName, int n, int expected) {
        if (testName != null)
            System.out.println(testName + ":");
        if (numberOf1_1(n) == expected) {
            System.out.print("    soluton1:" + "passed  ");
        } else {
            System.out.print("    solution1:" + "failed  ");
        }

        if (numberOf1_2(n) == expected) {
            System.out.println("soluton2:" + "passed  ");
        } else {
            System.out.println("solution2:" + "failed  ");
        }
    }

    void test1() {
        test("Test for 0", 0, 0);
    }

    void test2() {
        test("Test for 1", 1, 1);
    }

    void test3() {
        test("Test for 10", 10, 2);
    }

    void test4() {
        test("Test for 0x7FFFFFFF", 0x7FFFFFFF, 31);
    }

    void test5() {
        test("Test for 0xFFFFFFFF", 0xFFFFFFFF, 32);
    }

    void test6() {
        test("Test for 0x80000000", 0x80000000, 1);
    }

    public static void main(String[] args) {
        NumberOf1InBinary demo = new NumberOf1InBinary();
        demo.test1();
        demo.test2();
        demo.test3();
        demo.test4();
        demo.test5();
        demo.test6();
    }
}
