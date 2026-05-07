package model.Stack;

public class ArrayStack<T> implements MyStack {

    private int n;
    private int top;
    private T[] data;

    public ArrayStack(int n) {
        if (n <= 0) System.exit(1);
        this.n = n;
        this.top = -1;//Fuera de cualquier indice del arreglo
        data = (T[]) new Object[n];
    }


    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public void clear() {
        this.top = -1;//Fuera de cualquier indice del arreglo
        data = (T[]) new Object[n];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public T peek() throws StackException {
        if (isEmpty()) throw new StackException("Array Stack is empty");
        return this.data[top];
    }

    @Override
    public T top() throws StackException {
        if (isEmpty()) throw new StackException("Array Stack is empty");
        return this.data[top];
    }

    @Override
    public void push(Object element) throws StackException {

    }

    @Override
    public Object pop() throws StackException {
    }
            }
