import java.util.Arrays;

/**
 * @author zth
 * @Date 2019-07-01 22:50
 * 直接插入排序
 */
public class InsertSort {
    private static <T extends Comparable<? super T>> void insertSort(T[] array){

        int j;
        T temp;
        for (int i = 1;i<array.length;i++){
            temp = array[i];
            for ( j = i-1; j>0 && temp.compareTo(array[j])<0; j--){
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }
    }

    public static void main(String[] args){
        Integer[] array = {1,3,5,7,9,2};
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
