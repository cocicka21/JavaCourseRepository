package it.academy.course.hw10.task3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack {
    private List<Integer> stack = new ArrayList<>();
    private List<Integer> maxList = new ArrayList<>();

    public void push(int x) {
        stack.add(x);
        if (maxList.isEmpty() || x >= maxList.get(maxList.size() - 1)) {
            maxList.add(x);
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        int popped = stack.remove(stack.size() - 1);
        if (popped == maxList.get(maxList.size() - 1)) {
            maxList.remove(maxList.size() - 1);
        }
        return popped;
    }

    public int max() {
        if (maxList.isEmpty()) {
            throw new EmptyStackException();
        }
        return maxList.get(maxList.size() - 1);
    }
}
