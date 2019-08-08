package com.algorithm.KMP;

/**
 * @author zth
 * @Date 2019-08-07 16:06
 *  KMP 模式匹配
 */
public class KMP {

    /**
     * 获取部分匹配表
     */
    private static int[] getNext(String pattern){
        char[] ptn = pattern.toCharArray();
        int[] next = new int[pattern.length()];

        // 第一位置为-1,第二个位置为0
        next[0] = -1;next[1] = 0;

        int k = 0;

        for (int j = 2; j < ptn.length; j++) {
            k = next[j-1];
            while (k != -1){
                if (ptn[j-1] == ptn[k]){
                    next[j] = k+1;
                    break;
                }else {
                    k = next[k];
                }
                // 当 k==-1而跳出循环时，next[j] = 0
                next[j] = 0;
            }
        }
        return next;
    }

    /**
     * 进行KMP 模式匹配
     * @param src 主串
     * @param pattern 模式串
     * @return 匹配成功返回模式串在主串中的第一次出现的位置
     * 匹配失败，返回 -1
     */
    public static int KMPMatch(String src,String pattern){
        char[] S = src.toCharArray();
        char[] T = pattern.toCharArray();
        int next[] = getNext(pattern);
        /**
         * i: 主串中的位置
         * j：模式串中的位置
         */
        int i = 0,j = 0;
        while (i<S.length && j<T.length){
            if (j == -1 || S[i] == T[j]){
                i++;
                j++;
            }else {
                j = next[j];
            }
        }
        if (j == T.length){
            return i-j;
        }else {
            return -1;
        }
    }

    public static void main(String[] args){
        String src = "ababaaaba";
        String pattern = "aa";
        int index = KMPMatch(src,pattern);
        System.out.println(index);
    }
}
