package LinkListWithTail;

class SL {
    Node head;
    Node tail;
    int size;

    SL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            insertFront(data);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public void insetInOrder(int data) {
        Node newNode = new Node(data);
        if (head == null || data < head.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && data >= current.next.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void delete(int value) {
        if (head == null) {
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        while (current != null && current.data != value) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        previous.next = current.next;
    }

    // public void display()
    // {
    // Node current = head;
    // while(current.next != null)
    // {
    // System.out.print(current.data+"->");
    // current = current.next;
    // }
    // System.out.print(current.data+"->");
    // System.out.print("End");
    // }
    public void display() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
        } else {
            Node current = head;
            while (current.next != tail.next) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print(current.data + "->");
            System.out.print("END");
        }
    }
}

class Solution {
    public static void main(String[] args) {
        SL l = new SL();
        l.insertFront(3);
        l.insertFront(2);
        l.insertLast(1);
        // l.delete(1);
        l.display();
    }
}
