package schoolManager;

public class Classroom {
	private String roomNum;
	private String building;
	private String computers;
	private String phoneNum;
	
	public Classroom(){
		
	}
	
	public void setClassroom(String roomNum, String building, String computers,
			String phoneNum) {
		this.roomNum = roomNum;
		this.building = building;
		this.computers = computers;
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "Classroom [roomNum=" + roomNum + ", building=" + building
				+ ", computers=" + computers + ", phoneNum=" + phoneNum + "]";
	}
	
}
