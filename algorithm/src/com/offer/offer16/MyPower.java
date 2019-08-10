package com.offer.offer16;

/**
 * @author zth
 * @Date 2019-08-09 10:20
 */
public class MyPower {
    public double power(double base, int exponent) throws Exception {

        if (exponent < 0 ){
            if (base == 0){
                throw new Exception("负数的 0 次方没有意义");
            }
            return 1/powerWithUnsignedExponent(base,-exponent);

        }else if (exponent == 0){
            // 任意数的 0 次方为 1
            return 1;
        }else {
            return powerWithUnsignedExponent(base,exponent);
        }
    }

    private double powerWithUnsignedExponent(double base, int exponent){
        if (exponent == 0){
            return 1;
        }else if (exponent == 1){
            return base;
        }

        double result = powerWithUnsignedExponent(base,exponent>>1);
        result *= result;

        if ((exponent & 0x1)==1){
            result *= base;
        }
        return result;
    }

    // ========测试代码========
    void test(String testName, double base, int exponent,double expected) {
        if (testName != null)
            System.out.print(testName + ":");
        try {
            if (power(base, exponent) == expected ) {
                System.out.println("passed.");
            } else {
                System.out.println("failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void test1() {
        test("test1", 0, 6, 0);
    }

    void test2() {
        test("test2", 0, -6, 0);
    }

    void test3() {
        test("test3", 0, 0, 1);
    }

    void test4() {
        test("test4", 2, 6, 64);
    }

    void test5() {
        test("test5", 2, -3, 0.125);
    }

    void test6() {
        test("test6", 5, 0, 1);
    }

    void test7() {
        test("test7", -2, 6, 64);
    }



    public static void main(String[] args) {
        MyPower demo = new MyPower();
        demo.test1();
        demo.test2();
        demo.test3();
        demo.test4();
        demo.test5();
        demo.test6();
        demo.test7();
    }
}
