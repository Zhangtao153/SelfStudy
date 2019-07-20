package com.leetcode.string;

/**
 * 在字符串中找出第一个只出现一次的字符
 */
public class FirstNotRepeatingChar {
    public static char getChar(String str){
        if (str == null || str.length()==0){
            return '\0';
        }

        // 利用ASCII 构建哈希表
        char[] chars = new char[256];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = 0;
        }

        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            index = str.charAt(i);
            chars[index] ++;
        }

        for (int i = 0; i < str.length(); i++) {
            index = str.charAt(i);
            if (chars[index] == 1){
                return (char)index;
            }
        }
        return '\0';
    }

    public static void main(String[] args){
        String s =null;
        System.out.println(getChar(s));
    }
}
