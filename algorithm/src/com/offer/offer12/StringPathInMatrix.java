package com.offer.offer12;

/**
 * @author zth
 * @Date 2019-08-08 17:29
 */
public class StringPathInMatrix  {
    /**
     * 判断是否包含路径
     * @param matrix 字符矩阵
     * @param rows 矩阵的行数
     * @param cols 矩阵的列数
     * @param str 待查找的字符数组
     * @return 找到返回 true，否则返回 false
     */
    public boolean hasPath(char[] matrix,int rows,int cols,char[] str){
        if (null == matrix || rows<1 || cols < 1 || null == str){
            return false;
        }
        // 记录是否已经移入每个格子
        boolean[] isVisited = new boolean[rows * cols];
        for (int i = 0; i < isVisited.length; i++) {
            isVisited[i] = false;
        }

        // 记录当前已经查找字符串的长度
        int pathLength = 0;

        // 每一个格子可以作为起点进行查找
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (hasPathCore(matrix,rows,cols,row,col,str,pathLength,isVisited))
                    return true;
            }
        }
        return false;
    }

    private boolean hasPathCore(char[] matrix,int rows,int cols,int row, int col,
                                char[] str,int pathLength, boolean[] isVisited){

        if (row<0 || col <0 || row>=rows || col>=cols ||  // 范围不正确
                isVisited[row * cols+col]==true ||      // 当前小格已访问过
                str[pathLength] != matrix[row * cols+col]   // 字符不相等
        )return false;

        if (pathLength == str.length-1){
            return true;
        }

        isVisited[row * cols +col] = true;
         boolean hasPath = false;
         hasPath = hasPathCore(matrix,rows,cols,row-1,col,str,pathLength+1,isVisited)
                 || hasPathCore(matrix,rows,cols,row,col+1,str,pathLength+1,isVisited)
                 || hasPathCore(matrix,rows,cols,row+1,col,str,pathLength+1,isVisited)
                 || hasPathCore(matrix,rows,cols,row,col-1,str,pathLength+1,isVisited);

         if (!hasPath){
             isVisited[row*cols+col]=false;
         }
         return hasPath;
    }

    // =======测试代码========

    // A B T G
    // C F C S
    // J D E H

    // BFCTB
    public void test1() {
        char[] matrix = "ABTGCFCSJDEH".toCharArray();
        int rows = 3;
        int cols = 4;
        char[] str = "BFCTB".toCharArray();
        if (!hasPath(matrix, rows, cols, str))
            System.out.println("Test1 passed.");
        else
            System.out.println("Test1 failed.");
    }

    // A B T G
    // C F C S
    // J D E H

    // BFCE
    public void test2() {
        char[] matrix = "ABTGCFCSJDEH".toCharArray();
        int rows = 3;
        int cols = 4;
        char[] str = "BFCE".toCharArray();
        if (hasPath(matrix, rows, cols, str))
            System.out.println("Test2 passed.");
        else
            System.out.println("Test2 failed.");
    }

    // matrix=null
    public void test3() {
        char[] matrix = null;
        int rows = 0;
        int cols = 0;
        char[] str = "BFCE".toCharArray();
        if (!hasPath(matrix, rows, cols, str))
            System.out.println("Test3 passed.");
        else
            System.out.println("Test3 failed.");
    }

    // str=null
    public void test4() {
        char[] matrix = "ABTGCFCSJDEH".toCharArray();
        int rows = 3;
        int cols = 4;
        char[] str = null;
        if (!hasPath(matrix, rows, cols, str))
            System.out.println("Test4 passed.");
        else
            System.out.println("Test4 failed.");
    }

    // A

    // A
    public void test5() {
        char[] matrix = "A".toCharArray();
        int rows = 1;
        int cols = 1;
        char[] str = "A".toCharArray();
        if (hasPath(matrix, rows, cols, str))
            System.out.println("Test5 passed.");
        else
            System.out.println("Test5 failed.");
    }

    // A

    // B
    public void test6() {
        char[] matrix = "A".toCharArray();
        int rows = 1;
        int cols = 1;
        char[] str = "B".toCharArray();
        if (!hasPath(matrix, rows, cols, str))
            System.out.println("Test6 passed.");
        else
            System.out.println("Test6 failed.");
    }

    // AAAA
    // AAAA
    // AAAA

    // AAAAAAAAAAAA
    public void test7() {
        char[] matrix = "AAAAAAAAAAAA".toCharArray();
        int rows = 3;
        int cols = 4;
        char[] str = "AAAAAAAAAAAA".toCharArray();
        if (hasPath(matrix, rows, cols, str))
            System.out.println("Test7 passed.");
        else
            System.out.println("Test7 failed.");
    }

    public static void main(String[] args) {
        StringPathInMatrix demo = new StringPathInMatrix();
        demo.test1();
        demo.test2();
        demo.test3();
        demo.test4();
        demo.test5();
        demo.test6();
        demo.test7();
    }
}
