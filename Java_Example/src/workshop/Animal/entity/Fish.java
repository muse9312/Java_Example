package workshop.Animal.entity;

public class Fish extends Animal implements Pet {

	String name;

	public Fish() {
		super(0);
		System.out.println("다리가 없음");
	}

	@Override
	public void walk() {
		super.walk();
		System.out.println("물고기는 걸을 수 없다");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
