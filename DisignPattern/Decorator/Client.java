package DisignPattern.Decorator;

public class Client {
    public static void main(String[] args) {
        Display road = new RoadDisplay();
        road.draw();
        System.out.println();

        Display roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw();
        System.out.println();

        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw();
        System.out.println();

        Display roadWithLaneAndTraffic =
            new TrafficDecorator(
            new LaneDecorator(
            new RoadDisplay()));
        roadWithLaneAndTraffic.draw();
        System.out.println();

        Display roadWithCrossingLaneAndTraffic = 
            new LaneDecorator(
            new TrafficDecorator(
            new CrossingDecorator(
            new RoadDisplay())));
        roadWithCrossingLaneAndTraffic.draw();
        System.out.println();
    }
}
