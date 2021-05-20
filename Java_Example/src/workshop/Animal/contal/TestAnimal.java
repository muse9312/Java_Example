package workshop.Animal.contal;

import workshop.Animal.entity.Animal;
import workshop.Animal.entity.Cat;
import workshop.Animal.entity.Fish;
import workshop.Animal.entity.Pet;
import workshop.Animal.entity.Spider;

public class TestAnimal {

	public static void main(String[] args) {
		
		
		
		Cat cat1 = new Cat();
		cat1.setName("나비");
		System.out.printf("이 고양이의 이름은 %s입니다%n" , cat1.getName());
		System.out.printf("나비의 다리갯수는 %d입니다%n" , cat1.getLeg());
		
		
		System.out.println("==========================================================");
		
		Animal cat2 = new Cat();
		System.out.printf("쿠키의 다리 갯수는 %d입니다%n" , cat2.getLeg());
		
		System.out.println("==========================================================");
				
		
		System.out.println(cat2.getLeg());
		
		System.out.println("==========================================================");
		
		Pet cat3 = new Cat("쿠키");
	
		
//		System.out.printf("이 고양이의 이름은 %s입니다%n" , cat3.getName() );
//		
//		System.out.println("==========================================================");
		
		Animal spider = new Spider();
		spider.walk();
		
		System.out.println("==========================================================");
		
		Animal spider2 = new Spider();
		System.out.printf("이 동물의 다리갯수는  %d입니다%n" , spider2.getLeg());
		
		System.out.println("==========================================================");
		
		Animal fish = new Fish();
		fish.walk();
		
		
		
		
		
		

	}

}
