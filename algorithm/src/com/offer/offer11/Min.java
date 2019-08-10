package com.offer.offer11;

/**
 * @author zth
 * @Date 2019-08-08 15:05
 */
public class Min {
    public static int minNumberInRotateArray(int [] array) {
        if (null == array || array.length <= 0){
            return 0;
        }
        int left = 0;
        int right = array.length-1;

        /**
         * 数组的前 0 个元素旋转即数组为自增数组
         * 递增排序数组是自己的旋转
         */
        if (array[left] < array[right]){
            return array[0];
        }
        int mid = left;
        while (left < right){

            if (right - left==1){
                mid = right;
                break;
            }
            mid = (right + left)/2;
            /**
             * 如果三个指针所指位置为元素相等，则只能顺序查找，如下情况：
             * 1 0  1 1 1
             * 1 1 1 0 1
             */

            if (array[mid] == array[left] && array[mid]==array[right] ){
                return getMinInOrder(array,left,right);
            }
            if (array[mid] >= array[right]){
                left = mid;
            }else {
                right = mid;
            }
        }
        return array[mid];
    }

    private static int getMinInOrder(int array[],int left,int right){
        int min = array[left];
        for (int i = left+1; i <= right; i++) {
            if (array[i] < min){
                min =array[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        int[] array1 = { 1, 2, 3, 4, 5, 6 };
        int[] array2 = { 3,4,5,1,2 };
        int[] array3 = { 2};
        int[] array4 = null;

       System.out.println( minNumberInRotateArray(array2));
    }
}
