package ch05;
// 실습 문제 1번
class Circle{
    private int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }
}
public class NameCircle extends Circle{
    private String name;
    public NameCircle(int radius, String name){
        super(radius);
        this.name=name;
    }
    public void show(){
        System.out.println(this.name+", 반지름 = "+getRadius());
    }
    public static void main(String[] args) {
        NameCircle w = new NameCircle(5,"Waffle");
        w.show();
    }
}
