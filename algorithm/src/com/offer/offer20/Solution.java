package com.offer.offer20;

/**
 * @author zth
 * @Date 2019-08-11 8:34
 *
 * 表示字符串的模式：A[.[B]][e|EC]  或者 .B[e|EC]
 */
public class Solution {
    public boolean isNumeric(char[] str) {
        if (null==str || str.length == 0)
            return false;
        //记录当前扫描字符的位置，因为要进行方法传参，所以用类类型
        int[] index = new int[]{0};
        // 记录是否满足条件
        boolean isNumberic = false;

        // 判断 A
        isNumberic = isInteger(str,index);
        /**
         * 判断 . B
         * A  A.  A.B 均符合条件
         */
        if (index[0]<str.length && str[index[0]]=='.'){
            index[0]++;
            isNumberic = isUnsignedInteger(str,index) || isNumberic;
        }

        // 判断 e C ,E 后面必须有数字
        if (index[0]<str.length && (str[index[0]]=='e' || str[index[0]]=='E')){
            index[0]++;
            isNumberic = isInteger(str,index) && isNumberic;
        }

        if (isNumberic && index[0] == str.length){
            return true;
        }else {
            return false;
        }

    }

    // 判断输入的字符串是否包含一个无符号整数
    private boolean isUnsignedInteger(char[] str,int[] index){
        int start = index[0];
        while (index[0]<str.length && str[index[0]]>='0' && str[index[0]]<='9' ){
            index[0]++;
        }
        if (index[0] > start){
            return true;
        }else {
            return false;
        }
    }

    // 判断输入的是否包含一个数字
    private boolean isInteger(char[] str,int[] index){
        if (index[0]<str.length && (str[index[0]]=='-' || str[index[0]]=='+')){
            index[0]++;
        }
        return isUnsignedInteger(str,index);
    }

    // =======测试代码=========
    void test(String testName, char[] str, boolean expected) {
        System.out.print(testName + "：");
        if (isNumeric(str) == expected)
            System.out.println(" passed!");
        else
            System.out.println(" failed!");
    }

    void test1() {
        char[] str = null;
        test("test1", str, false);
    }

    void test2() {
        char[] str = {};
        test("test2", str, false);
    }

    void test3() {
        String string ="e3";
        char[] str=string.toCharArray();
        test("test3", str, false);
    }

    void test4() {
        String string ="3e1.2";
        char[] str=string.toCharArray();
        test("test4", str, false);
    }

    void test5() {
        String string ="e3";
        char[] str=string.toCharArray();
        test("test5", str, false);
    }

    void test6() {
        String string ="1.2e3";
        char[] str=string.toCharArray();
        test("test6", str, true);
    }

    void test7() {
        String string ="-.2e3";
        char[] str=string.toCharArray();
        test("test7", str, true);
    }

    void test8() {
        String string ="-.2e-3";
        char[] str=string.toCharArray();
        test("test8", str, true);
    }

    void test9() {
        String string ="1.e-3";
        char[] str=string.toCharArray();
        test("test9", str, true);
    }

    void test10() {
        String string ="1.";
        char[] str=string.toCharArray();
        test("test10", str, true);
    }

    void test11() {
        String string =".2";
        char[] str=string.toCharArray();
        test("test11", str, true);
    }

    void test12() {
        String string ="12e3";
        char[] str=string.toCharArray();
        test("test12", str, true);
    }

    public static void main(String[] args) {
        Solution demo = new Solution();
        demo.test1();
        demo.test2();
        demo.test3();
        demo.test4();
        demo.test5();
        demo.test6();
        demo.test7();
        demo.test8();
        demo.test9();
        demo.test10();
        demo.test11();
        demo.test12();
    }

}
