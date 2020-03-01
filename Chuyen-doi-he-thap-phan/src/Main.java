import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main test = new Main();
        test.convertDecimalToBinary(30);
        test.convertDecimalToBinary(71);
    }
    Stack myStack = new Stack();
    int count = 0;

    public void convertDecimalToBinary(int number){
        pushInStack(number);
        while (count > 0){
            System.out.print(myStack.pop());
            count--;
        }
        System.out.println();
    }

    public void pushInStack(int number){
        if(number > 0) {
            myStack.push(number % 2);
            count++;
            number /= 2;
            pushInStack(number);
        }
    }
}
