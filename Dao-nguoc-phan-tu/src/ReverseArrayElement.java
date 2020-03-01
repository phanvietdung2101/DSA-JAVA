import java.util.Stack;

public class ReverseArrayElement<E> {
    public void reverseArray(int[] arr){
        Stack myStack = new Stack();
        for(int i = 0; i < arr.length ; i++)
            myStack.push(arr[i]);
        for(int i = 0; i < arr.length ; i++)
            arr[i] = (int) myStack.pop();
    }

    public String reverseString(String string){
        Stack<Character> myStack = new Stack<>();
        String reversedString = new String();
        for(int i = 0; i < string.length(); i++){
            myStack.push(string.charAt(i));
        }
        for(int i = 0; i < string.length(); i++){
            reversedString += myStack.pop();
        }
        return reversedString;
    }
}
