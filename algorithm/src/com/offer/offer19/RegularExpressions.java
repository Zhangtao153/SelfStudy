package com.offer.offer19;

/**
 * @author zth
 * @Date 2019-08-10 15:38
 */
public class RegularExpressions {
    public boolean match(char[] str, char[] pattern){
        if (null == str || pattern == null){
            return false;
        }
        return matchCore(str,0,pattern,0);
    }

    private boolean matchCore(char[] str,int indexOfStr,char[] pattern,int indexOfPattern){
        // 匹配成功
        if (indexOfPattern == pattern.length && indexOfStr == str.length){
            return true;
        }
        // 正则表达式结束，待匹配字符串还没结束，则一定不匹配
        if (indexOfPattern == pattern.length && indexOfStr < str.length){
            return false;
        }

        // 模式串当前匹配位置的第二个字符是 *
        if (indexOfPattern+1 < pattern.length && pattern[indexOfPattern+1]=='*'){
            // 当前字符是 .或者和待匹配字符字符当前位置字符相等
            if ((indexOfStr<str.length && pattern[indexOfPattern]== '.' )|| ( indexOfStr<str.length && pattern[indexOfPattern]==str[indexOfStr])){
                return // 匹配一次
                        matchCore(str,indexOfStr+1,pattern,indexOfPattern+2)
                        // 匹配多次
                        || matchCore(str,indexOfStr+1,pattern,indexOfPattern)
                        // 匹配 0 次
                        || matchCore(str,indexOfStr,pattern,indexOfPattern+2);
            }else {
                // 忽略 *
                return matchCore(str,indexOfStr,pattern,indexOfPattern+2);
            }
        }

        // 两个字符相等或者模式串中为 .
        if ((indexOfStr<str.length  && pattern[indexOfPattern]==str[indexOfStr]) || (pattern[indexOfPattern]=='.' && indexOfStr<str.length)){
            return matchCore(str,indexOfStr+1,pattern,indexOfPattern+1);
        }

        return false;
    }

    // ==========测试代码=========
    void test(String testName, char[] str, char[] pattern, boolean expected) {
        System.out.print(testName + ":");
        if (match(str, pattern) == expected)
            System.out.println("passed!");
        else
            System.out.println("failed!");
    }

    void test1() {
        char[] str = {};
        char[] pattern = { '.' };
        test("test1", str, pattern, false);
    }

    void test2() {
        char[] str = {};
        char[] pattern = { '.', '*' };
        test("test2", str, pattern, true);
    }

    void test3() {
        char[] str = { 'a' };
        char[] pattern = { '.', '*' };
        test("test3", str, pattern, true);
    }

    void test4() {
        char[] str = {};
        char[] pattern = {};
        test("test4", str, pattern, true);
    }

    void test5() {
        char[] str = null;
        char[] pattern = null;
        test("test5", str, pattern, false);
    }

    void test6() {
        char[] str = { 'a', 'b', 'b' };
        char[] pattern = { 'a', 'b', 'b', '*', 'b' };
        test("test6", str, pattern, true);
    }

    void test7() {
        char[] str = { 'a' };
        char[] pattern = { 'a', 'a', '*' };
        test("test7", str, pattern, true);
    }

    public static void main(String[] args) {
        RegularExpressions demo = new RegularExpressions();
        demo.test1();
        demo.test2();
        demo.test3();
        demo.test4();
        demo.test5();
        demo.test6();
        demo.test7();
    }
}
