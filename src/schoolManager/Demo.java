package schoolManager;

public class Demo {

	public static void main(String[] args) {
		
		Student[] classStudent = new Student[3];
		classStudent[0].setStudent("James Lowenthal", "631-278-7743", "Computer Science", "4.0");
		classStudent[1].setStudent("Van Wilder", "555-555-5555", "Leisure Studies", "1.8");
		classStudent[2].setStudent("Jane Doe", "444-555-6666", "Environmental Studies", "3.4");
		
		Instructor professor1 = new Instructor();
		professor1.setInstructor("Xingben Chen", "433", "Dean", "MWF 9-3");
		
		Textbook java = new Textbook();
		java.setTextbook("Principles of Java", "Bilbo Baggins", "United Nations", "6.70");
		
		Classroom smithtown = new Classroom();
		smithtown.setClassroom("203", "Smithtown Science", "15", "608-281-3455");
		
		Course CST = new Course();
		CST.setCourse("Intro to Java", "CST 141", "2883", professor1, java, classStudent, smithtown);
		
		
	}
}
