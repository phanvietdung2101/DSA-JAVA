//import java.util.LinkedList;\
import org.apache.commons.lang.SerializationUtils;
public class LinkedList<E> {
    private Node head;
    private int numNodes ;

    private class Node{
        private Node next;
        private E data;

        public Node(E data){
            this.data = data;
        }

        public E getData(){
            return this.data;
        }
    }

    public LinkedList(){
        head = null;
    }
    public void add(int index, E element){
        Node temp = head;
        Node holder;

        for(int i = 0; i < index - 1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(E e){
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }
    public void addLast(E e){
        Node temp = head;
        for(int i = 0; temp.next != null; i++){
            temp.next = new Node(e);
        }
        numNodes++;
    }
    public Node remove(int index){
        Node temp = head;
        Node holder;
        for(int i = 0; i < index - 1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = temp.next.next;
        numNodes--;
        return holder;
    }
    public boolean remove(Object e){
        Node temp = head;
        while(temp.next.equals(e)){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
        return true;
    }
    public int size(){
        return numNodes;
    }
//    public E clone(){
//        LinkedList<E> clone = new LinkedList<>();
//        clone.numNodes = numNodes;
//        Node temp = head;
//        while(temp != null){
//
//        }
//    }
    public boolean contains(E o){
        Node temp = head;
        while(temp.next != null)
        {
            if(temp.next.equals(o))
                return true;
        }
        return false;
    }
    public int indexOf(E o){
        Node temp = head;
        int i = 0;
        while(temp.next != null)
        {
            temp = temp.next;
            if(temp.equals(o))
                return i;
            i++;
        }
        throw new IndexOutOfBoundsException();
    }
    public boolean add(E e){
        if(e != null)
        {
            addLast(e);
            return true;
        } else
            return false;
    }
//    public void ensureCapacity(int minCapacity){}
    public Node get(int index){
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }
    public Node getFirst(){
        return head.next;
    }
    public Node getLast(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp;
    }
    public void clear(){
        head.next = null;
        numNodes = 0;
    }

    public static void main(String[] args) {
        Object a = new Object();
        a.clone
    }
}
