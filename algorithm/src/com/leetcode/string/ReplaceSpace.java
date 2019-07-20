package com.leetcode.string;

/**
 * 将所有空格替换为 20%
 * e.g my girlfriend is so beautiful
 * ==> my%20girlfriend%20is%20so%20beautiful
 */
public class ReplaceSpace {
    public static String replace(String str){
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 32){
                num++;
            }
        }

        char[] chars = new char[str.length()+2*num];
        int index = chars.length-1;
        for (int i = str.length()-1; i >=0; i--) {
            if (str.charAt(i) == 32){
                chars[index--] = '0';
                chars[index--] = '2';
                chars[index--] = '%';
            }else {
                chars[index--] = str.charAt(i);
            }
        }

        return new String(chars);
    }
    public static void main(String[] args){
        String str = "my girlfriend is so beautiful";
        System.out.println(replace(str));
    }
}
