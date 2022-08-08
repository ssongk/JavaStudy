package DataStructure.stack;

public class ArrayStack implements StackInterface{
    private int top;
    private int stackSize;
    private String stackArr[];
    public ArrayStack(int stackSize){
        top = -1;
        this.stackSize = stackSize;
        stackArr = new String[this.stackSize];
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
    public void push(String item) {
        if(isFull()){
            System.out.println("Stack is full!");
        }
        else{
            stackArr[++top] = item;
            System.out.println("Inserted item : "+item);
        }
    }
    @Override
    public String pop() {
        if(isEmpty()){
            System.out.println("Delete task is failed! Stack is empty!");
            return null;
        }
        else{
            System.out.println("Deleted item : "+stackArr[top]);
            return stackArr[top--];
        }
    }
    @Override
    public String peek() {
        if(isEmpty()){
            System.out.println("Delete task is failed! Stack is empty!");
            return null;
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
            this.stackArr = new String[this.stackSize];
            System.out.println("Stack is clear!");
        }
    }
    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
        }
        else{
            System.out.println("<Stack Info>");
            for(int i=top;i>-1;i--){
                System.out.println("---------------");
                System.out.println(i+"  "+stackArr[i]);
            }
        }
    }
}
