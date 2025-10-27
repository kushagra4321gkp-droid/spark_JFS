package CollectionsFramwork.StackDemo;

import java.util.Stack;

public class Stack_demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(50);
        stack.push(90);
        stack.push(30);
        System.out.println("stack : " + stack);
        System.out.println("pop : " + stack.pop());
        System.out.println("pop : " + stack.pop());
        System.out.println("pop : " + stack.pop());
        System.out.println("stack : " + stack);
    }
}
