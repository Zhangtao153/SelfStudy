package sort;

import java.util.Arrays;

/**
 * @author zth
 * @Date 2019-07-22 9:38
 */
public class HeapSort {
    public static<T extends Comparable<? super T>> void heapSort(T[] array){
        /* 创建初始堆*/
        for (int i = array.length/2-1; i >=0 ; i--) {
            heapAdjust(array,i,array.length);
        }

        for (int i = array.length-1; i >0 ; i--) {
            T temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            heapAdjust(array,0,i);
        }
    }

    private static <T extends Comparable<? super T>> void heapAdjust(T[] array,int parent,int length){
        int child = 2*parent+1;

        while (child<length){
            // 如果有右节点
            if (child+1 <length && array[child+1].compareTo(array[child])>0){
                child++;
            }
            // 孩子节点大于父节点，子节点上提
            if (array[parent].compareTo(array[child])<0){
                T temp = array[parent];
                array[parent] = array[child];
                array[child] = temp;
            }else {
                break;
            }

            parent = child;
            child = 2*child+1;
        }
    }

    public static void main(String[] args){
        Integer [] array1 = {3,2,5,8,4,7,6};
        heapSort(array1);

        Double[] array2 = {3.3,2.3,5.3,8.3,4.3,7.3,6.3,9.3};
        heapSort(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }
}
