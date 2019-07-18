package com.leetcode.array;

/**
 * @author zth
 * @Date 2019-07-18 11:15
 * 魔方矩阵
 */
public class MagicSquare {
    public static int[][] fill(int len){
        int[][] array =  new int[len][len];

        int x = 0;
        int y = len/2;

        // 1放在第一行中间

        array[0][len/2] = 1;

        return array;
    }

    public static void main(String[] args){
        int[][] array = fill(5);
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
        }
    }
}
