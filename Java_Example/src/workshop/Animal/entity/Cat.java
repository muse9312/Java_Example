package workshop.Animal.entity;

public class Cat extends Animal implements Pet {
	
	
	String name;

	public Cat(String name) {
		super(4);
		this.name = name;
	}
	
	public Cat() {
		super(4);
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
	
	



	

}
