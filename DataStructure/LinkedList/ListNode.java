package DataStructure.LinkedList;

public class ListNode{
    private String data;
    private int link;
    public ListNode(String data,int link){
        this.data = data;
        this.link = link;
    }

    public ListNode insert(String data, int link) {
        ListNode newNode = new ListNode(data, link);
        return newNode;
    }

    public void remove(ListNode before,ListNode after) {
        this.data = null;
        this.link = -1;
        before.link = after.link;
    }

    public void remove() {
        this.data = null;
        this.link = -1;
    }

    public void remove(ListNode before) {
        this.data = null;
        this.link = -1;
    }

    public boolean isNotEmpty(){
        if(this.data!=null)
            return true;
        else
            return false;
    }

    public boolean isLiked(){
        if(this.link!=-1)
            return true;
        else
            return false;
    }


    public String printData(){
        return this.data;
    }

    public int printLink(){
        return this.link;
    }
}
