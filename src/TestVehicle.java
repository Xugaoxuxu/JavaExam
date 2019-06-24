public class TestVehicle {
    public static void main(String args[]) {
        Plane plane = new Plane();
        plane.run();

        Train train = new Train();
        train.run();

        Ship ship = new Ship();
        ship.run();
    }
}
