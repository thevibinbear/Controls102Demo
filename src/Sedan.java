public class Sedan extends Car implements Driveable {

    public Sedan(String carname, int speed) {
        super(carname, speed);
        
    }
    public int wheels = 1;
    @Override
    public int getWheels() {
        return wheels;
    }
    @Override
    public void getSound() {
		System.out.println("Overrided Sound Method");
	} 
}
