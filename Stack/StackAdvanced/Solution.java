import java.util.Scanner;

class Stack{
    private Node top;
    private int size = 0;
    private class Node{
        int data;
        Node next;
        private Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    void push(int element)
    {
        Node newNode = new Node(element);
        if(top == null)
        {
            top = newNode;
        }
        else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

   int pop() {
        int temp = -1;
        try {
            if (top == null) {
                throw new Exception("Stack is Empty");
            } else {
                temp = top.data;
                top = top.next;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        size--;
        return temp;
    }

    int popMiddle(Scanner sc)
    {
        int temp = -1;
        try {
            if (top == null) {
                throw new Exception("Stack is Empty");
            }
            else {
               if((size & 1) != 0)
               {
                   Node current = top;
                   Node prev = null;
                   int i = 0;
                   while (current.next != null && i<size/2) {
                       prev = current;
                       current = current.next;
                       i++;
                   }
                   temp = current.data;
                   prev.next = current.next;
               }
               else {
                   Node current = top;
                   Node prev = null;
                   System.out.println("Enter the element index you want to delete\n1. To delete size/2 - 1\n2. To delete size/2");
                   int choice = sc.nextInt();
                   switch (choice)
                   {
                       case 1:
                           int i = 0;
                           while (current.next != null && i<(size/2)-1) {
                               prev = current;
                               current = current.next;
                               i++;
                           }
                           temp = current.data;
                           prev.next = current.next;
                           break;
                       case 2:
                           int j = 0;
                           while (current.next != null && j<size/2) {
                               prev = current;
                               current = current.next;
                               j++;
                           }
                           temp = current.data;
                           prev.next = current.next;
                           break;
                   }
               }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        size--;
        return temp;
    }

    void display()
    {
        try {
           if(top == null)
           {
               throw new Exception("Stack is Empty");
           }
           else {
               Node current = top;
               while (current.next != null)
               {
                   System.out.print(current.data+"->");
                   current = current.next;
               }
               System.out.print(current.data+"->");
               System.out.print("END");
           }
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

class Solution{
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.popMiddle(new Scanner(System.in));
        s.display();
    }
}
