package training.interfacepractice;

public class Superman implements Fly {

	@Override
	public void fly() {
		System.out.println("I'm Superman and Flying");

	}

	public static void main(String[] args) {
		Superman superman = new Superman();
		superman.fly();
	}
}
