package com.offer.offer21;

import java.util.Arrays;

/**
 * @author zth
 * @Date 2019-08-11 10:48
 */
public class ReorderArray {
    public void reOrderArray(int [] array) {
        if (null== array || array.length<=1){
            return;
        }

        int left = 0;
        int right = array.length-1;

        while (left < right){
            while (left< right && (array[left]&1)!=0){
                left++;
            }
            while (left< right && (array[right]&1)==0){
                right--;
            }
            if (left<right){
                int temp = array[left];
                array[left]=array[right];
                array[right]=temp;
            }
        }
    }

    void test1() {
        int[] array = null;
        System.out.println("原始数组："+ Arrays.toString(array));
        reOrderArray(array);
        System.out.println("调整结果："+Arrays.toString(array));
        System.out.println();
    }

    void test2() {
        int[] array = {};
        System.out.println("原始数组："+Arrays.toString(array));
        reOrderArray(array);
        System.out.println("调整结果："+Arrays.toString(array));
        System.out.println();
    }

    void test3() {
        int[] array = {-2,4,-6,1,-3,5};
        System.out.println("原始数组："+Arrays.toString(array));
        reOrderArray(array);
        System.out.println("调整结果："+Arrays.toString(array));
        System.out.println();
    }

    void test4() {
        int[] array = {-1,3,-5,2,-4,6};
        System.out.println("原始数组："+Arrays.toString(array));
        reOrderArray(array);
        System.out.println("调整结果："+Arrays.toString(array));
        System.out.println();
    }

    void test5() {
        int[] array = {-1,2,-3,4,-5,6};
        System.out.println("原始数组："+Arrays.toString(array));
        reOrderArray(array);
        System.out.println("调整结果："+Arrays.toString(array));
        System.out.println();
    }

    void test6() {
        int[] array = {2,2,1,3,4,1};
        System.out.println("原始数组："+Arrays.toString(array));
        reOrderArray(array);
        System.out.println("调整结果："+Arrays.toString(array));
        System.out.println();
    }

    void test7() {
        int[] array = {1};
        System.out.println("原始数组："+Arrays.toString(array));
        reOrderArray(array);
        System.out.println("调整结果："+Arrays.toString(array));
        System.out.println();
    }

    public static void main(String[] args) {
        ReorderArray demo = new ReorderArray();
        demo.test1();
        demo.test2();
        demo.test3();
        demo.test4();
        demo.test5();
        demo.test6();
        demo.test7();
    }
}
