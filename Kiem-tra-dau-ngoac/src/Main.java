import java.util.Stack;

public class Main {
    public boolean checkValidBracket(String string){
        Stack<Character> myStack = new Stack<>();
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == '('){
                myStack.push(string.charAt(i));
            }
            else if(string.charAt(i) == ')')
            {
                if(myStack.empty()){
                    return false;
                } else {
                    myStack.pop();
                }
            }
        }
        return myStack.empty();
    }

    public static void main(String[] args) {
        Main test = new Main();
        System.out.println(test.checkValidBracket("s * (s – a) * (s – b) * (s – c) "));
        System.out.println(test.checkValidBracket("(– b + (b2 – 4*a*c)^0.5) / 2*a"));
        System.out.println(test.checkValidBracket("s * (s – a) * (s – b * (s – c)"));
        System.out.println(test.checkValidBracket("s * (s – a) * s – b) * (s – c)"));
        System.out.println(test.checkValidBracket("(– b + (b^2 – 4*a*c)^(0.5/ 2*a))"));
    }
}
