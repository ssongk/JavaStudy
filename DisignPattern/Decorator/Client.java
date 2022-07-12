package DisignPattern.Decorator;

public class Client {
    public static void main(String[] args) {
        Display road = new RoadDisplay();
        road.draw();
        System.out.println();

        Display roadWithLine = new LineDecorator(new RoadDisplay());
        roadWithLine.draw();
        System.out.println();

        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw();
        System.out.println();
    }
}
