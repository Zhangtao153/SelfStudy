package com.leetcode.array;

/**
 * @author zth
 * @Date 2019-07-18 8:35
 * 蛇形矩阵
 */
public class SnakeLikeMat {

    /**
     * 填充蛇形矩阵
     * @param m 行数
     * @param n 列数
     * @return 返回填充完的数组
     */
    public static int[][] snakeLikeMat(int m,int n){
        int[][] array = new int[m][n];

        /**
         * false 向左下填充
         * true 向右上填充
         * 初始值决定了第一个值首先向下还是向右发展
         */
        boolean direction = false;
        // 当前填充的位置
        int x = 0,y = 0;
        // 当前待填充的数字
        int index = 1;

        for (int i = 0; i < m * n; i++) {
            array[x][y] = index++;
            // 右上填充
            if (direction){
                if(x==0 || y >= n-1){
                    direction = !direction;
                    if (y>=n-1){
                        x++;
                    }else {
                        y++;
                    }
                }else {
                    x--;
                    y++;
                }
            }else { // 左下填充
                if( y==0 || x >= m-1){
                    direction = !direction;
                    if (x>=m-1){
                        y++;
                    }else {
                        x++;
                    }
                }else {
                    x++;
                    y--;
                }
            }
        }
        return array;
    }

    public static void main(String[] args){
        int[][] array = snakeLikeMat(4,5);
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
        }
    }
}
