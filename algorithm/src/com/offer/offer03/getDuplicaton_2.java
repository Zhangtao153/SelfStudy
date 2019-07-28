package com.offer.offer03;

public class getDuplicaton_2 {
    public static int getDuplication(int[] array){
        if (array == null || array.length<=1){
            return -1;
        }

        for (int i:array) {
            if (i<1 || i > array.length-1){
                return -1;
            }
        }

        int low = 1;
        int hight = array.length-1;
        int middle,count ;

        while (low<= hight){
            middle = ((hight-low)>>1) +low;
            count = countRange(array,low,middle);
            if (low == hight){
                if (count>1) return low;
                else break;
            }
            if (count > (middle -low+1)){
                hight = middle;
            }else {
                low = middle+1;
            }
        }
        return -1;
    }

    private static int countRange(int[] array,int low,int hight){
        if (array == null){
            return 0;
        }
        int count = 0;
        for (int i:array) {
            if (i>=low && i <= hight){
                count++;
            }
        }
        return count;
    }

    /**
     *数组为null
     */
    public void test1() {
        System.out.println("test1：");
        int[] a = null;
        int dup = getDuplication(a);
        if (dup >= 0)
            System.out.println("重复数字为：" + dup);
    }

    /**
     *数组数字越界
     */
    public void test2() {
        System.out.println("test2：");
        int[] a = { 1, 2, 3, 4 };
        int dup = getDuplication(a);
        if (dup >= 0)
            System.out.println("重复数字为：" + dup);
    }

    /**
     *数组带重复数字
     */
    public void test3() {
        System.out.println("test3：");
        int[] a = { 1, 2, 3, 2, 4 };
        int dup = getDuplication(a);
        if (dup >= 0)
            System.out.println("重复数字为：" + dup);
    }

    public static void main(String[] args) {
        getDuplicaton_2 f2 = new getDuplicaton_2();
        f2.test1();
        f2.test2();
        f2.test3();
    }
}
