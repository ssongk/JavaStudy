package DisignPattern.Decorator;

public class CrossingDecorator extends DisplayDecorator{
    public CrossingDecorator(Display decoratedDisplay){
        super(decoratedDisplay);
    }
    @Override
    public void draw(){
        super.draw();
        drawCrossing();
    }
    private void drawCrossing(){
        System.out.print("+ 교차로 표시");
    }
}
