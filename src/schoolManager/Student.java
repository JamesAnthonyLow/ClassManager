package schoolManager;

public class Student {
	private String name;
	private String phoneNum;
	private String major;
	private String GPA;
	
	public Student(){
		
	}
	
	public void setStudent(String name, String phoneNum, String major, String gPA) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.major = major;
		this.GPA = gPA;
	}

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", phoneNum=" + phoneNum + ", major="
				+ major + ", GPA=" + GPA + "]";
	}
}
