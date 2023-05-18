package leetcode;

import java.util.ArrayList;

public class ValidParentheses {
    public boolean isValid(String s) {

        String[] splitted = s.split("");
        ArrayList<String> stack = new ArrayList<>();
        boolean isValid = false;

        for (String bracket : splitted) {

            //Can use Hashset instead.
            if (splitted[0].equals(")") || splitted[0].equals("]") || splitted[0].equals("}")) {
                return isValid;
            }
            else if (bracket.equals("(") || bracket.equals("[") || bracket.equals("{")) {
                stack.add(bracket);
            } else if (bracket.equals(")")) {
                if (stack.size() != 0 && stack.get(stack.size() - 1).equals("(")) {
                    stack.remove(stack.size() - 1);
                } else return isValid;

            } else if (bracket.equals("]")) {
                if (stack.size() != 0 && stack.get(stack.size() - 1).equals("[")) {
                    stack.remove(stack.size() - 1);
                } else return isValid;

            } else if (bracket.equals("}")) {
                if (stack.size() != 0 && stack.get(stack.size() - 1).equals("{")) {
                    stack.remove(stack.size() - 1);
                } else return isValid;
            }
        }
        if (stack.size() == 0){
            isValid = true;
        }
        else {
            return isValid;
        }
        return isValid;
    }
}
