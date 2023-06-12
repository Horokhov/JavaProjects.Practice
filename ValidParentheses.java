import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char character : s.toCharArray()) {

            switch (character){
                case '(':
                case '[':
                case '{':
                    stack.push(character);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                    break;

            }
        }
        return stack.isEmpty();
    }
}