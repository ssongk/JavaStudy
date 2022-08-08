package DataStructure.stack;

public class ArrayStack implements stack{
    private int top;
    private int stackSize;
    private char stackArr[];
    public ArrayStack(int stackSize){
        top = -1;
        this.stackSize = stackSize;
        stackArr = new char[this.stackSize];
    }
    @Override
    public boolean isEmpty(){
        return (top==-1);
    }
    @Override
    public boolean isFull() {
        return (top==this.stackSize-1);
    }
    @Override
    public void push(char item) {
        if(isFull()){
            System.out.println("Stack is full!");
        }
        else{
            stackArr[++top] = item;
            System.out.println("Inserted item : "+item);
        }
    }
    @Override
    public char pop() {
        if(isEmpty()){
            System.out.println("Delete task is failed! Stack is empty!");
            return 0;
        }
        else{
            System.out.println("Deleted item : "+stackArr[top]);
            return stackArr[top--];
        }
    }
    @Override
    public char peek() {
        if(isEmpty()){
            System.out.println("Delete task is failed! Stack is empty!");
            return 0;
        }
        else{
            System.out.println("Peeked item : "+stackArr[top]);
            return stackArr[top];
        }
    } 
    @Override
    public void init() {
        if(isEmpty()){
            System.out.println("Stack is empty!");
        }
        else{
            top = -1;
            this.stackArr = new char[this.stackSize];
            System.out.println("Stack is clear!");
        }
    }
    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
        }
        else{
            for(int i=top;i>-1;i--){
                System.out.println(stackArr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int stackSize = 5;
        ArrayStack arrStack = new ArrayStack(stackSize);
        arrStack.push('A');
        arrStack.printStack();
        arrStack.push('B');
        arrStack.printStack();
        arrStack.push('C');
        arrStack.printStack();
        arrStack.pop();
        arrStack.printStack();
        arrStack.pop();
        arrStack.printStack();
        arrStack.peek();
        arrStack.printStack();
        arrStack.init();
        arrStack.printStack();
    }
}
