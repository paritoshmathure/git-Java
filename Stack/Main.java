package Stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        // myStack.getTop();
        // myStack.getHeight();
        myStack.push(1);
        myStack.printStack();
        System.out.println("Removed: " + myStack.pop().value);
        myStack.printStack();
    }
}
