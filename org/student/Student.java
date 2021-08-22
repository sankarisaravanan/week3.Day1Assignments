package org.student;

//import org.college.*;
import org.department.*;

public class Student extends Department{
	
	public void studentId() {
		System.out.println("Inside Method Student Id....");
	}
	
	public void studentName() {
		System.out.println("Inside Method Student Name....");
	}
	
	public void studentDept() {
		System.out.println("Inside Method Student Dept....");
	}
	
	public static void main(String[] args) {
		Student stud1 = new Student();
		
		System.out.println("******************Methods from class College**************");
		stud1.collegeCode();
		stud1.collegeName();
		stud1.collegeRank();

		System.out.println("******************Methods from class Department**************");
		stud1.depName();
		
		System.out.println("******************Methods from class Student*****************");
		stud1.studentId();
		stud1.studentName();
		stud1.studentName();
	}

}
