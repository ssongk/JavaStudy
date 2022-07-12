package DisignPattern.Decorator;

public class LaneDecorator extends DisplayDecorator {
    public LaneDecorator(Display decoratedDisplay){
        super(decoratedDisplay);
    }
    @Override
    public void draw(){
        super.draw();
        drawLine();
    }
    private void drawLine(){
        System.out.print("+ 차선 표시");
    }
}
