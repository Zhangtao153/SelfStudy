package com.leetcode.array;

/**
 * @author zth
 * @Date 2019-07-17 21:50
 *  螺旋矩阵
 */
public class Juzhen {
    public static int[][] fill(int N){
        int index = 1;
        int[][] array = new int[N][N];
        for (int loop = 0; loop < N/2; loop++) {
            // 上
            for (int j = loop; j < N-loop-1 ; j++) {
                array[loop][j] = index++;
            }
            // 右
            for (int i = loop; i < N-loop-1; i++) {
                array[i][N-loop-1] = index++;
            }
            // 下
            for (int j = N-loop-1; j > loop ; j--) {
                array[N-loop-1][j] = index++;
            }
            // 左
            for (int i = N-loop-1; i > loop; i--) {
                array[i][loop] = index++;
            }
            if (N%2 != 0) array[N/2][N/2] = N*N;
        }
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
