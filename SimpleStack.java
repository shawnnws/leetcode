package leetcode;

import java.util.ArrayList;

public class SimpleStack {
    ArrayList<String> myStack = new ArrayList<>();
    int size = 0;

    public void addStack(String item) {
        myStack.add(item);
        size += 1;
    }

    public void popStack(String item) {
        myStack.remove(-1);
        size -= 1;
    }
}
