// package LinklistWithoutTail;

import java.util.Scanner;

class LinkList {
    Node head;

    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insertFirst(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void insertLast(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void insertInOrder(int element) {
        Node newNode = new Node(element);
        if (head == null || element < head.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && element > current.next.data) {
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
            current.next = current.next;
        }

        if (current == null) {
            return;
        }

        previous.next = current.next;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        // System.out.print(current.data + "->");
        System.out.println("END");
    }
}

public class SL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkList l = new LinkList();
        while (true) {
            System.out.println(
                    "\nEnter the choice \n1->insertFirst\n2->insertLast\n3->insertInOrder\n4->delete\n5->display\n6->Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element");
                    int num = sc.nextInt();
                    l.insertFirst(num);
                    break;
                case 2:
                    System.out.println("Enter the element");
                    int num1 = sc.nextInt();
                    l.insertLast(num1);
                    break;
                case 3:
                    System.out.println("Enter the element");
                    int num2 = sc.nextInt();
                    l.insertInOrder(num2);
                    break;
                case 4:
                    System.out.println("Enter the element");
                    int num3 = sc.nextInt();
                    l.delete(num3);
                    break;
                case 5:

                    l.display();
                    break;
                case 6: System.exit(0);    
                default:
                    System.out.println("Please Enter Valid Choice");
            }
        }
    }
}