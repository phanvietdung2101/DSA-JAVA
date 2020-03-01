public class Solution {
    static class Node{
        int data;
        Node link;
    }
    static class Queue{
        Node front;
        Node rear;
    }
    static void enQueue(Queue q,int value){
        Node temp = new Node();
        temp.data = value;
        if(q.front == null){
            q.front = temp;
            q.rear = temp;
        } else {
            q.rear = temp;
            q.rear.link = q.front;
        }
    }
    static void deQueue(Queue q,int value){
        Node temp = new Node();
        temp.data = value;
        if(q.front == null){
            return;
        } else {
            if(q.front == q.rear){
                value = q.front.data;
                q.front = null;
                q.rear = null;
            } else {
                q.front = q.front.link;
                q.rear.link = q.front;
            }
        }
    }
}
