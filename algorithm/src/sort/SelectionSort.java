package sort;

import java.util.Arrays;

/**
 * @author zth
 * @Date 2019-07-22 7:42
 */
public class SelectionSort {

    public static void sort(int[] array){
        if (array==null || array.length<=1){
            return;
        }

        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = array[i];
            for (int j = i +1; j < array.length; j++) {
                if (array[j]<min){
                    min = min ^ array[j];
                    array[j] = min ^ array[j];
                    min = min ^ array[j];
                }
            }
            array[i] = min;
        }
    }

    public static void main(String[] args){
        int [] array1 = {3,2,5,8,4,7,6,9};
        sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}
