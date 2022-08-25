package singlebungle2;
class TV {
    private int size;
    public TV(int size) {
        this.size = size;
    }
    protected int getSize() {
        return size;
    }
}
public class ColorTV extends TV{
    private int color;
    public ColorTV(int size, int color){
        super(size);
        this.color = color;
    }
    void printProperty(){
        System.out.println(this.getSize()+"인치 "+this.color+"컬러");
    }
    public static void main(String[] args) {
        ColorTV mytv = new ColorTV(32, 1024);
        mytv.printProperty();
    }
}