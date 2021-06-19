package training.interfacepractice;

public class Bird implements Fly {

	@Override
	public void fly() {
		System.out.println("I'm a bird and Flying");
	}

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();
	}
}
