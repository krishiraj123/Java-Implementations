package FactorialStack;

import java.util.Stack;

class Solution
{
    public static long Factorial(int n)
    {
        Stack<Integer> s = new Stack();
        long result = 1;
        s.push(n);
        while(!s.isEmpty())
        {
            int currentvalue = s.pop();
            result *= currentvalue;
            if(currentvalue > 1)
            {
                s.push(currentvalue - 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Factorial(6));
    }
}

