package workshop.person.control;

import workshop.person.entity.PersonEntity;

public class PersonManager {

	public static void main(String[] args) {

		PersonEntity[] person = new PersonEntity[10];

		PersonManager pManager = new PersonManager();
		pManager.fillPersons(person);

		// 호출

		pManager.printTitle();

		pManager.fillPersons(person);

		pManager.showPerson(person);

		char gender = '여';

		System.out.printf("성별 : %c (은)는 %d입니다%n", gender, pManager.findbyGender(person, gender));

		pManager.printItemline();

		String name = "김하늘";
		pManager.showPerson(person, name);

		// pManager.showPerson(person, null);

	} // main

	public PersonManager() {
		// TODO Auto-generated constructor stub
	}

	public void printTitle() {
		System.out.println("@@@ 인물 정보 조회 시스템 @@@");
		print(null);
	}

	public void fillPersons(PersonEntity[] person) {

		person[0] = new PersonEntity("이성호", "7212121028102", "인천 계양구", "032-392-2932");
		person[1] = new PersonEntity("김하늘", "7302132363217", "서울 강동구", "02-362-1932");
		person[2] = new PersonEntity("박영수", "7503111233201", "서울 성북구", "02-887-1542");
		person[3] = new PersonEntity("나인수", "7312041038988", "대전 유성구", "032-384-2223");
		person[4] = new PersonEntity("홍정수", "7606221021341", "서울 양천구", "02-158-7333");
		person[5] = new PersonEntity("이미숙", "7502142021321", "서울 강서구", "02-323-1934");
		person[6] = new PersonEntity("박성구", "7402061023101", "서울 종로구", "02-308-0932");
		person[7] = new PersonEntity("유성미", "7103282025101", "서울 은평구", "02-452-0939");
		person[8] = new PersonEntity("황재현", "7806231031101", "인천 중구", "032-327-2202");
		person[9] = new PersonEntity("최철수", "7601211025101", "인천 계양구", "032-122-7832");

	}

	public void showPerson(PersonEntity[] person) {
		for (PersonEntity i : person) {
			System.out.printf("[이름] %s    [성별] %s   [전화번호] %s%n", i.getName(), i.getGender(), i.getPhone());
			System.out.println("--------------------------------------------");

		}
	}

	public void showPerson(PersonEntity[] person, String name) {
		for (PersonEntity c : person) {
			if (name == c.getName()) {
				System.out.printf("[이름] %s%n[성별] %s%n[전화번호] %s%n[주소] %s%n", c.getName(), c.getGender(), c.getPhone(),
						c.getAddress());

			}
		}

	}

	public int findbyGender(PersonEntity[] person, char gender) {
		int count = 0;
		for (PersonEntity x : person) {
			if (gender == x.getGender()) {
				count++;
			}
		}
		return count;
	}

	public void printItemline() {
		System.out.println("========================================");
	}

	public void print(String print) {
		System.out.println("========================================");

	}

}
