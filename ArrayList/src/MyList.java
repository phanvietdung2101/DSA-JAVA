import java.util.ArrayList;
import java.util.Calendar;
public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }

    public void ensureCapacity(){
        if(size >= elements.length){
            E[] newElements = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(elements,0,newElements,0,size);
            elements = newElements;
        }
    }

    public void add(int index, E element){
        ensureCapacity();
        for(int i = size - 1; i >= index; i--)
            elements[i+1] = elements[i];
        elements[index] = element;
        size++;
    }

    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index"+ index + "out of bound");
        }
    }

    public E remove(int index){
        checkIndex(index);

        E e = (E) elements[index];

        for(int j = index; j < size - 1; j++){
            elements[j] = elements[j+1];
        }
        elements[size - 1] = null;
        size--;
        return e;
    }

    public int size(){
        return size;
    }

    public boolean contains(E o){
        for(int i = 0; i < size; i++){
            if(o.equals(elements[i]))
                return true;
        }
        return false;
    }

    public int indexOf(E o){
        for(int i = 0; i < size; i++){
            if(o.equals(elements[i]))
                return i;
        }
        return -1;
    }

    public boolean add(E e){
        add(size,e);
        return true;
    }

    public E get(int i){
        checkIndex(i);
        return (E) elements[i] ;
    }

    public void clear(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

}
