package DataStructure.Queue;

public class QueueList implements QueueInterface{
    private int queueLength;
    private int front;
    private int rear;
    private String ql[];
    public QueueList(int queueLength){
        front = -1;
        rear = -1;
        this.queueLength = queueLength;
        ql = new String[queueLength];
    }
    @Override
    public boolean isEmpty() {
        return (front==rear);
    }
    @Override
    public boolean isFull() {
        return (rear==queueLength-1);
    }
    @Override
    public void add(String item) {
        if(isFull())
            System.out.println("Queue is full!");
        else{
            ql[++rear] = item;
            System.out.println(item+" is added in Queue");
        }
    }
    @Override
    public String remove() {
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        }
        else{
            front++;
            System.out.println(ql[front]+" is deleted in Queue");
            ql[front] = null;
            return ql[front];
        }
    }
    @Override
    public String peek() {
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        }
        else{
            System.out.println("peek in the Queue is "+ql[front+1]);
            return ql[front+1];
        }
    }
    @Override
    public void print() {
        if(isEmpty())
            System.out.println("Queue is empty!");
        else{
            System.out.println("----------------");
            System.out.println("\t<Queue Info>");
            for(int i=0;i<rear+1;i++){
                System.out.print(i+"\t");
            }
            System.out.println();
            for(int i=0;i<rear+1;i++){
                System.out.print(ql[i]+"\t");
            }
            System.out.println();
            System.out.println("----------------");
        }
    }
    @Override
    public void clear(){
        if(isEmpty())
            System.out.println("Queue is empty!");
        else{
            front = -1;
            rear = -1;
            this.ql = new String[this.queueLength];
        }
    }
}
