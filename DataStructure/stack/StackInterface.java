package DataStructure.Stack;

public interface StackInterface {
    boolean isEmpty();
    boolean isFull();
    void push(String item);
    String pop();
    String peek();
    void init();
}