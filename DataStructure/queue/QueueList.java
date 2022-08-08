package DataStructure.queue;

public class QueueList implements QueueInterface{
    private int queueLength;
    private int index;
    private String ql[];
    public QueueList(int queueLength){
        index = -1;
        this.queueLength = queueLength;
        ql = new String[queueLength];
    }
    @Override
    public boolean isEmpty() {
        return (index==-1);
    }
    @Override
    public boolean isFull() {
        return (index==queueLength-1);
    }
    @Override
    public void add(String item) {
        if(isFull())
            System.out.println("Queue is full!");
        else{
            ql[++index] = item;
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
            System.out.println(ql[index]+" is deleted in Queue");
            ql[index] = null;
            return ql[index--];
        }
    }
    @Override
    public String peek() {
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        }
        else{
            System.out.println("peek in the Queue is "+ql[index]);
            return ql[index];
        }
    }
    @Override
    public void print() {
        if(isEmpty())
            System.out.println("Queue is empty!");
        else{
            System.out.println("----------------");
            System.out.println("\t<Queue Info>");
            for(int i=0;i<index+1;i++){
                System.out.print(i+"\t");
            }
            System.out.println();
            for(int i=0;i<index+1;i++){
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
            index = -1;
            this.ql = new String[this.queueLength];
        }
    }
}
