package com.car.servlet.core;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zth
 * @Date 2019-06-18 12:32
 */
public class Algorithm {
}


/**
 * 平均数
 */

/*class Example01{

    public static void main (String[] arg){

        double a[]=new double[100];

        double sum=0;

        double aver;

        for(int i=0;i,a.length;i++){

            a[i]=Math.random()*1000;

        }

        for(int i=0;i,a.length;i++){

            sum=sum+a[i];

        }

        aver=sum/(a.length);

        System.out.println(aver)

    }

}*/

/**
 * 中位数
 */

/*public class Solution {

    public static int median(int []nums){
        if(nums.length==0)
            return 0;
        int start=0;
        int end=nums.length-1;
        int index=partition(nums, start, end);
        if(nums.length%2==0){
            while(index!=nums.length/2-1){
                if(index>nums.length/2-1){
                    index=partition(nums, start, index-1);
                }else{
                    index=partition(nums, index+1, end);
                }
            }
        }else{
            while(index!=nums.length/2){
                if(index>nums.length/2){
                    index=partition(nums, start, index-1);
                }else{
                    index=partition(nums, index+1, end);
                }
            }
        }
        return nums[index];
    }
    private static int partition(int nums[], int start, int end){
        int left=start;
        int right=end;
        int pivot=nums[left];
        while(left<right){
            while(left<right&&nums[right]>=pivot){
                right--;
            }
            if(left<right){
                nums[left]=nums[right];
                left++;
            }
            while(left<right&&nums[left]<=pivot){
                left++;
            }
            if(left<right){
                nums[right]=nums[left];
                right--;
            }
        }
        nums[left]=pivot;
        return left;
    }

}*/

/**
 * 众数
 *
 */
/*
class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int n = nums.length;

        for(int num : nums)   //统计每个元素出现的次数
        {
            Integer count = map.get(num);
            if(count == null)
                count =1;
            else
                count++;
            map.put(num,count);

            if(map.get(num) > n/2)
                return num;
        }

        return 0;
    }
}
*/

/**
 * 标准差
 */
/*

public class demo1 {

    public static void main(String[] args) {
        int[] array = {15,96,85,88,18,58,68,16,6,99,88,11,8,36,82,44,55,66};
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i];      //求出数组的总和
        }
        System.out.println(sum);  //939
        double average = sum/array.length;  //求出数组的平均数
        System.out.println(average);   //52.0
        int total=0;
        for(int i=0;i<array.length;i++){
            total += (array[i]-average)*(array[i]-average);   //求出方差，如果要计算方差的话这一步就可以了
        }
        double standardDeviation = Math.sqrt(total/array.length);   //求出标准差
        System.out.println(standardDeviation);    //32.55764119219941
    }

}*/

