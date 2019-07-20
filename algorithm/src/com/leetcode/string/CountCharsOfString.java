package com.leetcode.string;
import java.util.HashMap;

/**
 * 统计一个字符串中每个字符的个数
 */
public class CountCharsOfString {
    /**
     * 方法一
     * @param str 待统计的字符串
     */
    public static HashMap count(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        // 将原始字符串转换成字符数组
        char[] chars = str.toCharArray();
        int num = 0;
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])){
                num = map.get(chars[i]);
                map.put(chars[i],++num);
            }else {
                map.put(chars[i],1);
            }
        }
        return map;
    }

    /**
     * 方法二
     * @param str 待统计的字符串
     * @return
     */
    public static String count2(String str){
        if(str ==null || str.length()==0){
            return null;
        }

        // 利用ASCII 构建哈希表
        int[] chars = new int[256];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = 0;
        }

        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            index = str.charAt(i);
            chars[index] ++;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 0){
                result.append((char)i+"---"+chars[i]+"\t");
            }
        }
        return result.toString();

    }

    public static void main(String[] args){
        String str = "111";
        String string = count2(str);
        System.out.println(string);
    }
}
