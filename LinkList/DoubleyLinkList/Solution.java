package DoubleyLinkList;

class DBLinkList{
    Node head;

    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertHead(int element)
    {
        Node newNode = new Node(element);
        if(head == null)
        {
            head = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertEnd(int element)
    {
        Node newNode = new Node(element);
        if(head == null)
        {
            head = newNode;
        }
        else {
            Node current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void Delete(int element) {
        if (head == null) {
            System.out.println("DBLinkList is Empty");
        } else {
            if (element == head.data) {
                if (head.next != null) {
                    head.next.prev = null;
                    head = head.next;
                } else {
                    head = null;
                }
            } else {
                Node current = head;
                while (current != null && element != current.data) {
                    current = current.next;
                }
                if (current == null) {
                    System.out.println("Element Not Found");
                } else {
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    }
                }
            }
        }
    }


    public int noOfElement()
    {
        int len = 0;
        if(head == null)
        {
            return 0;
        }
        else{
            Node current = head;
            while (current.next != null)
            {
                len++;
                current = current.next;
            }
            return len+1;
        }
    }
    public void display()
    {
        if(head == null)
        {
            System.out.println("Queue is Empty");
        }
        else{
            Node current = head;
            while (current.next != null)
            {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print(current.data+"->");
            System.out.print("END");
        }
    }
}

public class Solution{
    public static void main(String[] args) {
        DBLinkList db = new DBLinkList();
//        System.out.println("\nElement Inserted at Head");
//        db.insertHead(1);
//        db.insertHead(2);
//        db.insertHead(3);
//        db.insertHead(4);
//        db.insertHead(5);
//        System.out.println("\nBefore Removal");
//        db.display();
//        System.out.println("\nAfter Removal");
//        db.Delete(4);
//        db.display();
        System.out.println("\nElement Inserted at End");
        db.insertEnd(1);
        db.insertEnd(2);
        db.insertEnd(3);
        db.insertEnd(4);
        db.insertEnd(5);
        System.out.println("\nBefore Removal");
        db.display();
        System.out.println("\nAfter Removal");
        db.Delete(2);
        db.display();
    }
}

