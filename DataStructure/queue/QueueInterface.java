package DataStructure.queue;

public interface QueueInterface {
    boolean isEmpty();
    boolean isFull();
    void add(String item);
    String remove();
    String peek();
    void print();
    void clear();
}
