public class Car {
	private String carname = "";
	private int speed = 0;
	public Car(String carname, int speed) {
        this.carname = carname;
        this.speed = speed;
    }
    public void getSound() {
		System.out.println("vroom");
	}
  public String getCarname() {
    return carname;
  }
  public void setCarname(String c) {
    carname = c;
  }
  public int getSpeed() {
    return speed;
  }
  public void setSpeed(int s) {
    speed = s;
  }
  
}
