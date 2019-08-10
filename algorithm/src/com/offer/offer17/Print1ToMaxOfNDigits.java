package com.offer.offer17;

/**
 * @author zth
 * @Date 2019-08-10 8:21
 */
public class Print1ToMaxOfNDigits {
    public void print1ToMaxOfNDigits(int n){
        if (n<=0){
            return;
        }
        char[] number = new char[n];
        // 初始化为 0
        for (int i = 0; i < number.length; i++) {
            number[i] = '0';
        }

        while (!increment(number)){
            printNumber(number);
        }
    }

    /**
     * 进行加一操作，
     * @param number 对 number 加一
     * @return 达到最大值后返回 true,否则返回 false
     */
    int nSum = 0;
    private boolean increment(char[] number){
        int nTakeOver = 0;
        for (int i = number.length-1; i >=0 ; i--) {
            // 当前位置数字
            nSum = (number[i]-'0')+nTakeOver;
            // 最低为加一
            if (i == number.length-1) nSum++;
            // 有进位
            if (nSum >= 10){
                // 如果当前位为最高位，则停止
                if (i==0){
                    return true;
                }else {
                    nSum -= 10;
                    nTakeOver = 1;
                    number[i] = (char)('0'+nSum);
                }
            }else {
                number[i] = (char)('0'+nSum);
                // 没有进位，在当前位结束
                break;
            }
        }
        return false;
    }

    /**
     * @param number 打印 number 字符数组对应的数字
     */
    void printNumber(char[] number){
        // 从第一个非 0 开始打印
        boolean isBeginner0 = true;
        for (int i = 0; i < number.length; i++) {
            if (isBeginner0 && (number[i]-'0') !=0){
                isBeginner0 = false;
            }
            if (!isBeginner0){
                System.out.print(number[i]);
            }
        }
        System.out.println();
    }

    // ========测试代码=============
    void test(int nDigits) {
        System.out.println("===test begin===");
        print1ToMaxOfNDigits(nDigits);
        System.out.println("===test over===");
    }

    public static void main(String[] args) {
        Print1ToMaxOfNDigits demo = new Print1ToMaxOfNDigits();
        demo.test(-1);
        demo.test(0);
        demo.test(1);
        demo.test(2);
    }
}
