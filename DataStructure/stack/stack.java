package DataStructure.stack;

public interface stack {
    boolean isEmpty();
    boolean isFull();
    void push(char item);
    char pop();
    char peek();
    void init();
}