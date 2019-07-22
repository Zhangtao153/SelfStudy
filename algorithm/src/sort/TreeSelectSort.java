package sort;

import java.util.Arrays;

/**
 * @author zth
 * @Date 2019-07-22 8:10
 */
public class TreeSelectSort {
    public static void sort(int array[]){
        int treeSize = array.length*2-1;
        int index = 0;
        int[] tree = new int[treeSize];

        /*填充叶子节点*/
        for (int i = array.length-1,j = 0; i >= 0; i--,j++) {
            tree[treeSize-1-j] = array[i];
        }

        /*填充非叶子节点*/
        for (int i = treeSize-1; i > 0 ; i -= 2) {
            tree[(i-1)/2] = (tree[i] - tree[i-1])>0? tree[i-1] : tree[i];
        }

        while (index < array.length){
            int min = tree[0];
            array[index++] = min;

            // 找最小值的索引
            int minindex = treeSize-1;

            while (tree[minindex]-min != 0){
                minindex--;
            }
            tree[minindex] = Integer.MAX_VALUE;

            // 找到该节点的兄弟节点
            while (minindex > 0){
                if (minindex %2 == 0){
                    tree[(minindex-1)/2] = (tree[minindex] > tree[minindex-1]?tree[minindex-1]:tree[minindex]);
                    minindex = (minindex-1)/2;
                }else {
                    tree[(minindex)/2] = (tree[minindex] > tree[minindex+1]?tree[minindex+1]:tree[minindex]);
                    minindex = minindex/2;
                }
            }
        }
    }

    public static void main(String[] args){
        int [] array1 = {3,2,5,8,4,7,6};
        sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}
