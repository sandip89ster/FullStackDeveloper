package training.interfacepractice;

public class Airplane implements Fly {

	@Override
	public void fly() {
		System.out.println("I'm Airplane and Flying");

	}

	public static void main(String[] args) {
		Airplane airplane = new Airplane();
		airplane.fly();
	}

}
