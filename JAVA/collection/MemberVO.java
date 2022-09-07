package basic05_collection;

public class MemberVO {
	// 사원번호 사원명 부서명 연락처
	private int num;//0
	private String username;//null
	private String department;
	private String tel;
	
	public MemberVO() {
		
	}
	public MemberVO(int num, String username, String department, String tel) {
		this.num = num;
		this.username = username;
		this.department = department;
		this.tel = tel;
	}
	
	//Getter, Setter
	//외부클래스 접근허용하는 메소드는 생성하기
	//Setter
		
	//Getter

	@Override
	public String toString() {
		return num + "\t" + username +"\t" + department +"\t" + tel;
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}
