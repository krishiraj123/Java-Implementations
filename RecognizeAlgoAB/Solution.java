package RecognizeAlgoAB;

import java.util.Stack;

class Solution{
    public static void main(String[] args) {
        String s = "aabbb";
        Stack<Character> st = new Stack<>();
        int i = 0,countA = 0;
        while (i<s.length())
        {
            if(s.charAt(i) == 'b')
            {
                st.push(s.charAt(i));
            }
            else {
                countA++;
            }
            i++;
        }
        while(!st.isEmpty()) {
            st.pop();
            countA--;
        }
        if(st.size() == countA)
        {
            System.out.println("Number of A and B are same");
        }
        else System.out.println("Number of A and B are not same");
    }
}