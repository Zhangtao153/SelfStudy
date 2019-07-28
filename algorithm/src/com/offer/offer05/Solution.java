package com.offer.offer05;

public class Solution {
    public static String replaceSpace(StringBuffer str) {
        if(str == null){
            return null;
        }
        int oldLength = str.length();
        int newLength = oldLength;

        for(int i=0;i<oldLength;i++){
            if(str.charAt(i) == ' '){
                newLength += 2;
            }
        }
        str.setLength(newLength);

        int oldIndex = oldLength-1;
        int newIndex = newLength-1;

        while(oldIndex < newIndex){
            if(str.charAt(oldIndex) != ' '){
                str.setCharAt(newIndex--,str.charAt(oldIndex));
            }else{
                str.setCharAt(newIndex--,'0');
                str.setCharAt(newIndex--,'2');
                str.setCharAt(newIndex--,'%');
            }
            oldIndex--;
        }
        return str.toString();
    }

    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer("");
        System.out.println(replaceSpace(stringBuffer));
    }
}