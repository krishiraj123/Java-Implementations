class Solution {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        q.dequeue();
        q.enqueue(60);
        q.display();
    }
}

class Queue {
    int front;
    int rear;
    int[] arr;
    int size;

    public Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int element) {
        if ((front == 0 && rear == size - 1) || (rear == (front - 1)%(size-1))) {
            System.out.println("Queue is Full");
        }
        if (rear == size - 1 && front != 0) {
            rear = 0;
        }
        if(front == -1)
        {
            rear = front = 0;
        }
        else{
            rear++;
        }
        arr[rear] = element;
    }

    public void dequeue() {
        if(front == -1)
        {
            System.out.println("Queue is Empty");
        }
        if(front == rear)
        {
            front = rear = -1;
        }
        if(front == size-1 && rear != 0)
        {
            front = 0;
        }
        else {
            front++;
        }
    }

    public void display() {
        if(front == -1)
        {
            System.out.println("Queue is Empty");
        }
        if(rear >= front)
        {
            for(int i = front;i<=rear;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i = front;i<size;i++)
            {
                System.out.print(arr[i] + " ");
            }
            for(int i = 0;i<=rear;i++)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}