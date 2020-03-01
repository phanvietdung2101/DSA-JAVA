import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome test = new Palindrome();
        System.out.println(test.palindrome("dung"));
        System.out.println(test.palindrome("aabaa"));
    }

    public boolean palindrome(String string){
        LinkedList<Character> myQueue = new LinkedList<>() ;
        Stack<Character> myStack = new Stack<>();

        for(int i = 0; i < string.length(); i++){
            char element = string.charAt(i);
            myQueue.offer(element);
            myStack.push(element);
        }
        for(int i = 0; i < string.length(); i++){
            boolean tmp =myQueue.remove().equals(myStack.pop());
            if(!tmp){
                return false;
            }
        }
        return true;
    }

}
