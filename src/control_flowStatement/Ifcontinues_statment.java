package control_flowStatement;

public class Ifcontinues_statment {
	public static void main(String []args) {

		int score = 65;
				char grade;
				
				if (score>=85) {
					grade = 'A';
				}else if (score>=65) {
					grade = 'B';
				}else if (score>=55) {
					grade = 'C';
				}else {
					grade='F';
				}
		System.out.println("grade of student " + grade);
	}
		
	}


