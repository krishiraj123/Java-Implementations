class Queue{
    Node head;

    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(int element)
    {
        Node newNode = new Node(element);
        if(head == null)
        {
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void dequeue()
    {
        if(head == null)
        {
            System.out.println("Queue is Empty");
        }
        else {
            Node temp = head.next;
            head.next = head;
            head = temp;
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

class Solution{
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        System.out.println("Before Removal");
        q.display();
        System.out.println("\nAfter Removal");
        q.dequeue();
        q.dequeue();
        q.display();
    }
}