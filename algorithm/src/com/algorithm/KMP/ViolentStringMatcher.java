package com.algorithm.KMP;

/**
 * @author zth
 * @Date 2019-08-07 14:51
 *  朴素的模式匹配（
 */
public class ViolentStringMatcher {
    /**
     * @param source 主串
     * @param pattern 模式串
     * @param pos 主串中开始的位置
     * @return 匹配成功返回模式串在主串从pos开始的位置，匹配失败，返回-1
     */
    public static int index(String source,String pattern,int pos){
        // 主串中的位置
        int i= pos;
        // 模式串中位置
        int j = 0;
        char[] src = source.toCharArray();
        char[] ptn = pattern.toCharArray();

        while (i<src.length && j<ptn.length){
            if (src[i] == ptn[j]){
                // 当前字符匹配成功
                i++;
                j++;
            }else {
                i = i - j +1;
                j = 0;
            }
        }

        if (j == ptn.length){
            return i - j;
        }else
            return -1;
    }

    public static void main(String[] args){
        String src = "ababcdefg";
        String pattern = "abc";

        int index = index(src,pattern,0);
        System.out.println(index);
    }
}
