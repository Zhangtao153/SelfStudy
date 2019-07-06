package com.leetcode.string;

import com.leetcode.array.Solution002;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class Solution001 {
    /**
     * 暴力破解法
     */
    public boolean allUnique(String s,int start ,int end){
        Set<Character> set = new HashSet<>();
        for (int k = start; k < end; k++) {
            Character c = s.charAt(k);
            if (set.contains(c)) return false;
            set.add(c);
        }
        return true;
    }
    public int lengthOfLongestSubstring1(String s) {

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                if (allUnique(s,i,j)) res = Math.max(res,j-i);
            }
        }

        return res;
    }

    /**
     * 滑动窗口法
     */
    public int lengthOfLongestSubstring2(String s) {
        int res = 0,start = 0,end = 0,len = s.length();
        Set<Character> set = new HashSet<>();

        while (start<len && end <len){
            if (!set.contains(s.charAt(end))){
                set.add(s.charAt(end++));
                res = Math.max(res,end-start);
            }else {
                set.remove(s.charAt(start++));
            }
        }
        return res;
    }

    public int lengthOfLongestSubstring3(String s) {
        int len = s.length(),res = 0;
        Map<Character,Integer> map = new HashMap<>();

        for (int start=0,end=0; end <len && start<len; end++) {
            if (map.containsKey(s.charAt(end))){
                start = Math.max(map.get(s.charAt(end)),start);
            }
            res = Math.max(res,end-start+1);
            map.put(s.charAt(end),end+1);
        }
        return res;
    }

    public static void main(String[] args){
        String s = "dvdf";
        System.out.println(new Solution001().lengthOfLongestSubstring3(s));
    }
}
