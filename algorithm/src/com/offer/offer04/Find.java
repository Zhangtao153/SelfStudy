package com.offer.offer04;

/**
 * @author zth
 * @Date 2019-07-28 9:07
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Find {
    public static boolean find(int[][] array,int target){
        int[] res = {-1,-1};
        if(array == null || array.length<=0){
            return false;
        }
        int row = 0;
        int col = array[0].length-1;
        while (row<=array.length-1 && col>=0){
            if (target == array[row][col]){
                return true;
            }else if (target < array[row][col]){
                col--;
            }else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args){

        int[][] matrix = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
        // 包含
        System.out.println(find(matrix,12));

        // 不包含
        System.out.println(find(matrix,100));

    }
}
