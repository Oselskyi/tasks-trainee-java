package stack;

import java.util.Arrays;
public class Stack {

    private int maxSize;
    private int [] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top =-1;
    }

    public boolean addElement(int element){

        stackArray[++top] = element;
        if (top > stackArray.length-1){
            return false;
        }
        return true;
    }

    public int deleteElement(){
        int removedElem = stackArray[top];
        stackArray[top--] = 0;
        return removedElem;
    }

    public boolean isEmpty(){

        return (top == -1);
    }

    public int getElement(){

        return stackArray[top];
    }

    public boolean isFull(){

        return (top == maxSize - 1);
    }

    public String show(){

        return Arrays.toString(stackArray);
    }
}
