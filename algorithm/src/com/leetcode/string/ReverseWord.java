package com.leetcode.string;


/**
 * 将字符串中的单词翻转
 * e.g my girlfriend is so beautiful
 * ==> beautiful so is girlfriend my
 */
public class ReverseWord {

    public static String reverse(String str){

        char[] chars = reverseString(str.toCharArray(),0,str.length()-1);
        int start = 0; int end = chars.length-1;
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length-1){
                break;
            }
            if (chars[i] == 32){
                end = i;
                chars = reverseString(chars,start,end-1);
                if (i != chars.length-1){
                    start = end+1;
                }
            }
        }
        chars = reverseString(chars,start,chars.length-1);
        return new String(chars);
    }

    public static char[] reverseString(char[] chars ,int start,int end){
        char temp;
        while (start <= end){
            temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        return chars;
    }

    public static void main(String[] args){
        String str = "my girlfriend is so beautiful";
        System.out.println(reverse(str));
    }
}
