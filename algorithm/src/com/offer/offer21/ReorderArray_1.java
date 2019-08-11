package com.offer.offer21;

import java.util.Arrays;

/**
 * @author zth
 * @Date 2019-08-11 10:48
 *
 * 维持稳定性
 */
public class ReorderArray_1 {
    public void reOrderArray(int [] array) {
        if (null== array || array.length<=1){
            return;
        }

        int indexOfJishu ;
        int indexOfOUshu = 0;

        while (indexOfOUshu<array.length){
            //找到偶数
            while (indexOfOUshu < array.length && (array[indexOfOUshu]&1)!=0){
                indexOfOUshu++;
            }
            // 找到偶数后面的第一个奇数
            indexOfJishu = indexOfOUshu+1;

            while (indexOfJishu<array.length &&(array[indexOfJishu]&1)==0){
                indexOfJishu++;
            }

            // 交换
            if (indexOfJishu < array.length){
                int temp = array[indexOfJishu];
                for (int i = indexOfJishu-1; i >=indexOfOUshu ; i--) {
                    array[i+1] = array[i];
                }
                array[indexOfOUshu]=temp;
            }else {
                break;
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
        ReorderArray_1 demo = new ReorderArray_1();
        demo.test1();
        demo.test2();
        demo.test3();
        demo.test4();
        demo.test5();
        demo.test6();
        demo.test7();
    }


}
