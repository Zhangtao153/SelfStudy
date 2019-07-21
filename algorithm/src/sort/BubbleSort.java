package sort;

import java.util.Arrays;

/**
 * @author zth
 * @Date 2019-07-21 7:26
 */
public class BubbleSort {

    public static <T extends Comparable<? super T>> void bubbleSort(T[] array){
        boolean flag = true;

        int [] arr = new int[0];

        if (array.length<=1 || array ==null) return ;

        T temp;
        for (int i = 0; i < array.length - 1 && flag; i++) {
            flag = false;
            for (int j = 0; j < array.length-2-i; j++) {
                if (array[j].compareTo(array[j+1]) > 0){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args){
        Integer [] array1 = {3,2,5,8,4,7,6,9};
        bubbleSort(array1);

        Double[] array2 = {3.3,2.3,5.3,8.3,4.3,7.3,6.3,9.3};
        bubbleSort(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
