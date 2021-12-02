package stack;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack(7);
        System.out.println(stack.isEmpty());
        stack.addElement(4);
        stack.addElement(2);
        stack.addElement(6);
        stack.addElement(1);
        stack.isEmpty();
        stack.isFull();
        stack.deleteElement();
        stack.deleteElement();
        stack.getElement();
        stack.addElement(1);

    }
}
