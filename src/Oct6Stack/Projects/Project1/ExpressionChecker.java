package Oct6Stack.Projects.Project1;

import java.util.Stack;

public class ExpressionChecker {
    public boolean checkParentheses(String expression) {
        Stack<String> stk = new Stack<String>();
        for (int i = 0; i < expression.length(); i++) {
            String part = expression.substring(i, i + 1);
            stk.push(part);
            // TODO: Complete this loop
            if (part.equals(")")) {
                int flag = 0;
                while (!stk.isEmpty()) {
                    String pop = stk.pop();
                    if (pop.equals("(")) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    return false;
                }
            }
        }

        while (!stk.isEmpty()) {
            String part = stk.pop();
            // TODO: Complete this loop
            if(part.equals("(") || part.equals(")"))
            {
                return false;
            }
        }

        // TODO: Complete this statement
        return true;
    }
}