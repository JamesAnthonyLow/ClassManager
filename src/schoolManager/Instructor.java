package schoolManager;

public class Instructor {
	private String name;
	private String roomNum;
	private String rank;
	private String officeHours;
	
	public Instructor(){
		
	}
	
	public void setInstructor(String name, String roomNum, String rank, String officeHours) {
	this.name = name;
	this.roomNum = roomNum;
	this.rank = rank;
	this.officeHours = officeHours;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", roomNum=" + roomNum + ", rank="
				+ rank + ", officeHours=" + officeHours + "]";
	}
}
