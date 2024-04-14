package Queue.Queue;

class Solution{
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.insert(5);
        q.insert(4);
        q.insert(3);
        q.display();
        // System.out.println(q.delete());
        // System.out.println(q.delete());
        // System.out.println(q.delete());
        // System.out.println(q.delete());
        q.display();
    }
}

class Queue{
    int front;
    int size;
    int rear;
    int arr[];

    Queue(int size)
    {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public void insert(int element)
    {
        if(rear >= size)
        {
            System.out.println("Overflow");
        }
        rear = rear + 1;
        arr[rear] = element;
        if(front == -1)
        {
            front = 0;
            return;
        }
    }

    public int delete()
    {
        if(front == -1)
        {
            System.out.println("Underflow");
        }
        int y = arr[front];
        if(rear == front)
        {
            front = rear = -1;
        }
        else {
            front++;
        }
        return y;
    }

    public void display()
    {
        if(front == -1)
        {
            System.out.println("Queue is empty");
        }
        for(int i = front;i<=rear;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
