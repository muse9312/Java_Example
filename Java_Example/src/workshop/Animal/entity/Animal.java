package workshop.Animal.entity;

public abstract class Animal {
	
	protected int leg;

	protected Animal(int leg) {
		this.leg = leg;
	}
	
	abstract void eat();
	
	public void walk() {
		System.out.println("�������� �ȴ´�");
		
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	
	
	
	
	
	
	
	

} // Class
