package Quiz3ExtraWork.Stacks;

// Method File

// UML Diagram
//
// ===============================================================
//                            Word Utilities
// ===============================================================
//
// ===============================================================
// + reverseOrder(word: String[]): String[]
// + reverseOrder(number: int[]): int[]
// ===============================================================

// Use a stack to reverse the order of the arrays

import java.util.Stack;

public class WordUtilities {
    public static String[] reverseOrder(String[] word) {
        Stack<String> stack = new Stack<>();
        for (String s : word) {
            stack.push(s);
        }
        for (int i = 0; i < word.length; i++) {
            word[i] = stack.pop();
        }
        return word;

    }

    public static int[] reverseOrder(int[] number) {
        Stack<Integer> stack = new Stack<>();
        for (int i : number) {
            stack.push(i);
        }
        for (int i = 0; i < number.length; i++) {
            number[i] = stack.pop();
        }
        return number;
    }
}
