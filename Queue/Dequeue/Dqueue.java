package Queue.Dequeue;

class Queue {
    int front;
    int rear;
    int arr[];
    int size;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public void pushRear(int element) {
        if ((front == 0 && rear == size - 1) || front == rear + 1) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) {
                rear = front = 0;
            } else if (rear == size - 1) {
                rear = 0;
            } else {
                rear++;
            }
            arr[rear] = element;
        }
    }

    public void popRear() {
        if (rear == -1) {
            System.out.println("Queue is Empty");
        } else {
            if (rear == 0 && front != size - 1) {
                rear = size - 1;
            } else if (rear == front) {
                rear = front = -1;
            } else {
                rear--;
            }
        }
    }

    public void pushFront(int element) {
        if ((front == 0 && rear == size - 1) || front == rear + 1) {
            System.out.println("Queue is Full");
        } else {
            if (front == 0 && rear != size - 1) {
                front = size - 1;
            } else if (front == -1) {
                front = rear = 0;
            } else {
                front--;
            }
            arr[front] = element;
        }
    }

    public void popFront() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        } else {
            if (front == size - 1 && rear != 0) {
                front = 0;
            } else if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
        }
    }
}

class Dqueue {
    public static void main(String[] args) {
        Queue q = new Queue(5);
    }
}
