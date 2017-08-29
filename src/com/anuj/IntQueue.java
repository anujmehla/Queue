package com.anuj;

public class IntQueue {
//    it contains all the items
    private int[] q;
//     size of the queue
    private int size;
//    items in the queue
    private int total;
//    front item of the queue
    private int front;
//    rear item of the queue
    private int rear;
//    default constructor in which intialization has been done
    public IntQueue()
    {
     size=100;
     total=0;
     front=0;
     rear=0;
     q=new int[size];
    }
//    custom constructor with user defined size
    public IntQueue(int size)
    {
        this.size=size;
        total=0;
        front=0;
        rear=0;
        q=new int[size];
    }
//    lets us add two func enque and deque

//    enqueue function
//    rear will be handling the index of the array where we will be enqueue new value
    public boolean enqueue(int item)
    {
        if(isFull())
        {
            return false;
        }
        else
        {
            total++;
            q[rear]=item;
//            rear++;
//            instead of using rear++ we will be using another statement because it has some problems in it
//            like when we firstly add items and then dequeued items and again we want to add some more elements
//            then it should be pointing to 0 index. so to do so
//            or we can say once our queue is full and later on we delete some elements from the queue and index should
//            on first position so do we are adding rear=(rear+1)%size;
            rear=(rear+1)%size;
            return true;
        }
    }
//    lets us add dequeue function
//    we will be deleting items from the front.
    public int dequeue()
    {
        int item=q[front];
        total--;
//        front++;
//        similar reason as enqueue
        front=(front+1)%size;
        return item;
    }


//     lets add a function to check whether queue array is full or not
    public boolean isFull()
    {
        if (size==total)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
//      here we are adding one more function just to show that we can add as much functions as we can
//      there is no restrictions as it's our custom made class
//      here we are going to create a function to fetch all the data from the array
    public void showAll()
    {
        int f= front;
        if (total!=0)
        {
            for (int i=0;i<total;i++)
            {
                System.out.println("  "+q[f]);
                f=(f+1)%size;
            }
        }
    }
}
