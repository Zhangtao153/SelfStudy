package sort;

import java.util.Arrays;

/**
 * @author zth
 * @Date 2019-07-21 8:23
 */
public class QuickSort {
    public static <T extends Comparable<? super T>> void sort(T[] array){
        int left = 0;
        int right = array.length-1;
        sort(array,left,right);
    }
    private static <T extends Comparable<? super T>> void sort(T[] array ,int left,int right){

        int start = left;
        int end = right;

        T pivot = array[left];

        while (left < right){
            // 从右往左
            while (left<right && array[right].compareTo(pivot) >= 0){
                right--;
            }
            array[left] = array[right];

            // 从左往右
            while (left<right && array[left].compareTo(pivot) <= 0){
                left++;
            }
            array[right] = array[left];
        }
        array[right] = pivot;

        if (right-1> start) sort(array,start,right-1);
        if (right+1< end) sort(array,right+1,end);

    }

    public static void main(String[] args){
        Integer [] array1 = {3,2,5,8,4,7,6,9};
        sort(array1);

        Double[] array2 = {3.3,2.3,5.3,8.3,4.3,7.3,6.3,9.3};
        sort(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
