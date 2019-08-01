package com.offer.offer09;

import org.junit.Test;
import java.util.Stack;

/**
 * @author zth
 * @Date 2019-07-29 10:54
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    /**
     * 入队
     */
    public void push(int node) {
        stack1.push(node);
    }

    /**
     *出队
     */
    public int pop() {
        if (stack2.empty()){
            if (stack1.empty()){
                try {
                    throw new Exception("队列为空");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else {
                while (!stack1.empty()){
                    stack2.push(stack1.pop());
                }
            }
        }
        return stack2.pop();
    }

    @Test
    public void test(){
        Solution solution = new Solution();
        solution.push(1);
        solution.push(2);
        System.out.println(solution.pop());
    }
}
