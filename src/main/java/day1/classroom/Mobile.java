package day1.classroom;

public class Mobile {

	public void makeCall(int number) {
		System.out.println("Calling");
	}
	
	public void sendSMS(String message) {
		System.out.println("MessageSent");
	}
	
	public boolean shutDown() {
		System.out.println("Mobile is Shutting down");
		return true;
	}
	
	public static void main(String[] args) {
		
		Mobile mob = new Mobile();
		mob.makeCall(123456);
		mob.sendSMS("SendMessage");
		boolean shutDown = mob.shutDown();
		System.out.println(shutDown);
		
	}
}
