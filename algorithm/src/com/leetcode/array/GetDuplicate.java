package com.leetcode.array;

/**
 * @author zth
 * @Date 2019-07-20 10:56
 */
public class GetDuplicate {
    /**
     * 找到数组中一个重复的数字
     * @param array 待查找的数组
     * @return -1：未找到 找到直接返回数字
     */
    public static int getDuplicate(int[] array){
        /**
         * 验证数组的合法性
         */
        if (array == null || array.length <= 0){
            return -1;
        }

        /**
         * 验证数组中数字的合法性
         */
        for (int i:array) {
            if (i < 0 || i > array.length-1){
                return -1;
            }
        }

        int temp;
        for (int i = 0; i < array.length; i++) {
            while (array[i] != i){
                if (array[i] == array[array[i]]){
                    return array[i];
                }
                temp = array[i];
                array[i] = array[temp];
                array[temp] = temp;

            }
        }
        return -1;
    }

    public static void main(String[] args){
        // 测试一   预期结果：2 或 3
        int[] array = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(getDuplicate(array));

        // 测试二   预期结果：-1
        System.out.println(getDuplicate(null));

        // 测试三 无重复   预期结果-1
        int[] array1 = new int[]{2, 3, 1, 0, 4, 5, 6};
        System.out.println(getDuplicate(array1));

        // 测试四 数字越界 预期结果：-1
        int[] array2 = new int[]{2, 3, 2, 0, 4, 5, 7};
        System.out.println(getDuplicate(array2));

    }
}
