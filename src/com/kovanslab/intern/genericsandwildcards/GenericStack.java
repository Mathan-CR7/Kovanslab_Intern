package com.kovanslab.intern.genericsandwildcards;
class MyStack<T> {

    private Object[] arr;
    private int top;
    private int capacity;

    public MyStack() {
        capacity = 5;
        arr = new Object[capacity];
        top = -1;
    }

    public void push(T data) {

        if(top == capacity - 1) {
            resize();
        }

        arr[++top] = data;
    }

    public T pop() {

        if(isEmpty()) {
            throw new RuntimeException("Stack Underflow (Nothing to pop)");
        }

        T value = (T) arr[top];
        top--;
        return value;
    }

    public T peek() {

        if(isEmpty()) {
            throw new RuntimeException("Stack Empty");
        }

        return (T) arr[top];
    }


    public String toString() {

        if(isEmpty()) return "Stack is empty";

        StringBuilder sb = new StringBuilder();
        sb.append("[ ");

        for(int i = 0; i <= top; i++){
            sb.append(arr[i]).append(" ");
        }

        sb.append("]");
        return sb.toString();
    }


    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
    private void resize() {

        capacity = capacity * 2;

        Object[] newArr = new Object[capacity];

        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }

        arr = newArr;

        System.out.println("Stack resized to: " + capacity);
    }
}


public class GenericStack {

    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println("Stack Elements : ");
        System.out.println(stack.toString());

        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        System.out.println("\nPopping elements:");

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
