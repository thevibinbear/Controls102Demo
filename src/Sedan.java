public class Sedan extends Car {

    public Sedan(String carname, int speed) {
        super(carname, speed);
        
    }
    @Override
    public void getSound() {
		System.out.println("Overrided Sound Method");
	} 
}