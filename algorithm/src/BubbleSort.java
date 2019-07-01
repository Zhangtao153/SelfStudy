import java.util.Arrays;

/**
 * @author zth
 * @Date 2019-07-01 21:59
 * 冒泡排序
 */
public class BubbleSort {
    private static <T extends Comparable<? super T>> void bubbleSort(T[] array){
        boolean flag = true;
        T temp;
        for (int i = 0;(i<array.length-1 && flag);i++){
            flag = false;
            for (int j=0;j<array.length-1-i;j++){
                if (array[j].compareTo(array[j+1])>0){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args){
        Integer[] array = {1,3,5,7,9,2};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
