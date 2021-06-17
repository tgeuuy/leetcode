package cn.zati;

import java.util.Stack;

public class IsValid {


    public static void main(String[] args) {
        String s = "(()){({{)}}}";
        System.out.println(isValid(s));


    }

    public static boolean isValid(String s) {
        if (s == null) return true;
        Stack<Character> st = new Stack<Character>();
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            if (!st.isEmpty()) {
                char ch2 = st.peek();
                if (ch2 == '(') {
                    if (ch1 == ')') {
                        st.pop();
                    } else st.push(ch1);
                }
                System.out.println(st);
                if (ch2 == '{') {
                    if (ch1 == '}') {
                        st.pop();
                    } else st.push(ch1);
                }

                if (ch2 == '[') {
                    if (ch1 == ']') {
                        st.pop();
                    } else st.push(ch1);
                }
            } else {
                st.push(ch1);
            }
        }
        return st.isEmpty();

    }
}
