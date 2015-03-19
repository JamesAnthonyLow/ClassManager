package schoolManager;

import java.util.Arrays;

public class Course {
	private String title;
	private String courseNum;
	private String crn;
	private Instructor instructor;
	private Textbook textbook;
	private Student[] students;
	private Classroom classroom;
	
	public Course(){
		
	}
	
	public void setCourse(String title, String courseNum, String crn,
			Instructor instructor, Textbook textbook, Student[] students,
			Classroom classroom) {
		
		this.title = title;
		this.courseNum = courseNum;
		this.crn = crn;
		this.instructor = instructor;
		this.textbook = textbook;
		this.students = students;
		this.classroom = classroom;
		
	}

	@Override
	public String toString() {
		return "Course [title=" + title + ", courseNum=" + courseNum + ", crn="
				+ crn + ", instructor=" + instructor + ", textbook=" + textbook
				+ ", students=" + Arrays.toString(students) + ", classroom="
				+ classroom + "]";
	}
	
	
}
