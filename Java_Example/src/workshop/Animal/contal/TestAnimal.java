package workshop.Animal.contal;

import workshop.Animal.entity.Animal;
import workshop.Animal.entity.Cat;
import workshop.Animal.entity.Fish;
import workshop.Animal.entity.Pet;
import workshop.Animal.entity.Spider;

public class TestAnimal {

	public static void main(String[] args) {
		
		
		
		Cat cat1 = new Cat();
		cat1.setName("����");
		System.out.printf("�� ������� �̸��� %s�Դϴ�%n" , cat1.getName());
		System.out.printf("������ �ٸ������� %d�Դϴ�%n" , cat1.getLeg());
		
		
		System.out.println("==========================================================");
		
		Animal cat2 = new Cat();
		System.out.printf("��Ű�� �ٸ� ������ %d�Դϴ�%n" , cat2.getLeg());
		
		System.out.println("==========================================================");
				
		
		System.out.println(cat2.getLeg());
		
		System.out.println("==========================================================");
		
		Pet cat3 = new Cat("��Ű");
	
		
//		System.out.printf("�� ������� �̸��� %s�Դϴ�%n" , cat3.getName() );
//		
//		System.out.println("==========================================================");
		
		Animal spider = new Spider();
		spider.walk();
		
		System.out.println("==========================================================");
		
		Animal spider2 = new Spider();
		System.out.printf("�� ������ �ٸ�������  %d�Դϴ�%n" , spider2.getLeg());
		
		System.out.println("==========================================================");
		
		Animal fish = new Fish();
		fish.walk();
		
		
		
		
		
		

	}

}
