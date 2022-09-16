public class App {
    public static void main(String[] args) {
        Car c = new Car("Joe", 1);
        Sedan s = new Sedan("Moe", 3);
        c.setSpeed(1);
        //System.out.println(c.getSpeed());
        c.getSound();
        s.getSound();
        s.getWheels();
    }
}