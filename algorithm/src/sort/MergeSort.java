package sort;

import java.util.Arrays;

/**
 * @author zth
 * @Date 2019-07-21 11:26
 */
public class MergeSort {
    public static <T extends Comparable<? super T>> void mergeSort(T[] array){
        T[] tempArray = (T[]) new Comparable[array.length];
        mergeSort(array,tempArray,0,array.length-1);
    }

    private static <T extends Comparable<? super T>> void mergeSort(T[] array,T[] tempArray ,int left,int right){
        if (left < right){
            int center = (left + right)/2;
            mergeSort(array,tempArray,left,center);
            mergeSort(array,tempArray,center+1,right);
            merge(array,tempArray,left,center+1,right);
        }
    }

    private static <T extends Comparable<? super T>> void merge(T[] array,T[] tempArray ,int leftPos,int rightPos,int rightEnd){
        int leftEnd = rightPos-1;
        int temPos = leftPos;
        int num = rightEnd-leftPos+1;

        // 两个子序列都不为空
        while (leftPos <= leftEnd && rightPos <= rightEnd){
            if (array[leftPos].compareTo(array[rightPos])<=0){
                tempArray[temPos++] = array[leftPos++];
            }else {
                tempArray[temPos++] = array[rightPos++];
            }
        }

        while (rightPos <= rightEnd){
            tempArray[temPos++] = array[rightPos++];
        }

        while (leftPos <= leftEnd){
            tempArray[temPos++] = array[leftPos++];
        }

        for (int i = 0; i < num; i++,rightEnd--) {
            array[rightEnd] = tempArray[rightEnd];
        }
    }

    public static void main(String[] args){
        Integer[] array = {3,2,5,8,4,7,6,9};
        mergeSort(array);

        System.out.println(Arrays.toString(array));
    }
}
