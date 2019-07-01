import java.util.Arrays;

/**
 * @author zth
 * @Date 2019-07-01 22:30
 * 简单选择排序
 */
public class SelectionSort {
    private static void SelectionSort (int[] array){
        int min;
        for (int i=0;i<array.length-1;i++){
            min = array[i];
            for (int j = i+1;j<array.length;j++){
                if (array[j]<min){
                    min = min^array[j];
                    array[j] = min^array[j];
                    min = min^array[j];
                }
            }
                array[i] = min;
        }
    }

    public static void main(String[] args){
        int[] array = {1,3,5,7,9,2};
        System.out.println(Arrays.toString(array));
        SelectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
