package singlebungle;

class CPoint {
    private int x, y;
    public CPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void show() {
        System.out.println("(" + x + "," + y + ")" + other());
    }
    protected String other() {
        return "";
    }
    public String toString() {
        return "(" + x + "," + y + ")" + "입니다";
    }
}
    class ColorPoint extends CPoint {
        private String color;
    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    public String other() {
        return color;
    }
}
    public class Binding {
    public static void main(String[] args) {
        CPoint a, b;
        a = new CPoint(2, 3);
        b = new ColorPoint(3, 4,"red");
        a.show();
        b.show();
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
