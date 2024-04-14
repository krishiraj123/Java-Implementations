package Stack;
import java.util.NoSuchElementException;

class Stack {
    private int top;
    private int arr[];
    private int size;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = 0;
    }

    public void push(int element) {
        if (top >= size) {
            throw new StackOverflowError("Stack is Overflow");
        } else {
            arr[top++] = element;
        }
    }

    public int pop() {
        if (top == 0) {
            throw new NoSuchElementException("Stack is underflow");
        }
        return arr[--top];
    }

    public int peek(int index) {
        if (index <= 0 || index >= size) {
            System.out.println("enter valid index");
        }
        return arr[index - 1];
    }

    public void display() {
        if (top == 0) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = 0; i < top; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    public void change(int index, int element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        } else {
            arr[index] = element;
        }
    }
}

public class stackImplementation {
    public static void main(String[] args) {
        Stack s = new Stack(4);
        s.push(1);
        s.push(2);
        System.out.println(s.peek(1));
    }
}
