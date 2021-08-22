package week3Day1Assignment4;

public class Students {

	public void getStudentInfo() {
		System.out.println("getStudentInfo Method without any argument");
		
	}
	
	public void getStudentInfo(String studentId) {
		System.out.println("getStudentInfo Method without a argument StudentID");
		System.out.println("Student ID : "+studentId);		
		
	}
	
	public void getStudentInfo(String studentId, String studentName) {
		System.out.println("getStudentInfo Method with 2 arguments ID & Name");
		System.out.println("Student ID : "+studentId);
		System.out.println("Student Name : "+studentName);
	}
	
	public void getStudentInfo(String email, long phone) {
		System.out.println("getStudentInfo Method with 2 arguments email & phone");
		System.out.println("Student Email : "+email);
		System.out.println("Student Phone# : "+phone);
	}
	
	public static void main(String[] args) {
		Students stud1=new Students();
		stud1.getStudentInfo();
		stud1.getStudentInfo("ST12001");
		stud1.getStudentInfo("ST10001", "Sankari");
		stud1.getStudentInfo("sankari1@gmail.com", 996209919);
	}

}
