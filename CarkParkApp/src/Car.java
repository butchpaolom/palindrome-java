
import java.util.Random;

public class Car {

	final private int entryTime;
	final private int FEE;
	private int lengthOfStay;
	private int ID;

	public Car(int ID, int entryTime, int FEE) {
		this.FEE = FEE;
		this.entryTime = entryTime;
		this.ID = ID;
		this.lengthOfStay = new Random().nextInt(15) + 1;
		System.out.println("New car #" + ID + " will stay in " + lengthOfStay);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean willCheckout(int currentTime) {
		return currentTime == entryTime + lengthOfStay;
	}

	public void checkout() throws InterruptedException {
		System.out.println("Car " + ID + " will checkout.");
		Thread.sleep(1000);
		System.out.println("Car " + ID + " has checked out. Paid: " + FEE * lengthOfStay);
	}

}
