package com.offer.offer10;

/**
 * @author zth
 * @Date 2019-08-01 17:46
 * 输入n，求斐波那契（Fibonacci）数列的第n项。
 */
public class Fibonacci {
    public static int Fibonacci(int n) {
        int result = 0;
        if (n<0){
            try {
                throw new Exception("n >= 0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(n == 0){
            return 0;
        }else if(n==1){
            return 1;
        }else {
            int pre =  1;
            int prePre = 0;
            for (int i = 2; i <= n; i++) {
                result = pre + prePre;
                prePre = pre;
                pre = result;
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(Fibonacci(3));
    }
}
