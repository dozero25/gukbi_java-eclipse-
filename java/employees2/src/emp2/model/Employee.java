package emp2.model;

public class Employee {

	private int id;
	private String userId;
	private String username;
	private String passwd;
	private String regdate;
	private int age;
	
	public Employee() {}

	public Employee(int id, String userId, String username, String passwd, String regdate, int age) {
		this.id = id;
		this.userId = userId;
		this.username = username;
		this.passwd = passwd;
		this.regdate = regdate;
		this.age = age;
	}

	// public void showInfo(){}
	// public String showMember(){}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", userId=" + userId + ", username=" + username + ", passwd=" + passwd
				+ ", regdate=" + regdate + ", age=" + age + ", getId()=" + getId() + ", getUserId()=" + getUserId()
				+ ", getUsername()=" + getUsername() + ", getPasswd()=" + getPasswd() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}
