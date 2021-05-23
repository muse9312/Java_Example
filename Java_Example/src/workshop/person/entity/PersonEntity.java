package workshop.person.entity;


public class PersonEntity {

	private String name; // 이름
	private String ssn; // 주민등록번호
	private String address; // 거주지
	private String phone; // 번호
	private char gender ; 
	
	
	// =========================   생성자   ================================
	
	// 기본 생성자
	
	public PersonEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public PersonEntity(String name, String ssn, String address, String phone) {
		setAddress(address);
		setName(name);
		setGender(gender);
		setPhone(phone);
		setSsn(ssn);
		
		
	}
	
	
	// =========================   매서드   ================================
	
	// set 매서드
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
		
		setGender(ssn.charAt(6));
		
		
		
		
		
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setGender(char gender) {
		
		
		if (gender == 1 || gender == 3) {
			 this.gender = '남'; 
		}else if (gender == 2 || gender == 4) {
			this.gender = '여';
		}
		
		
		
	}

	
	
	// get 매서드
	
	
	
	public String getName() {
		return name;
	}
	
	
	public String getAddress() {
		return address;
	}

	public String getSsn() {
		return ssn;
	}
	
	public String getPhone() {
		return phone;
	}

	
	public char getGender() {
		return gender;
	}

	
	
	
	
	
	
	
	
	

}
