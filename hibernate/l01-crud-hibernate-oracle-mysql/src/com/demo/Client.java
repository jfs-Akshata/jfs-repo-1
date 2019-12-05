package com.demo;

import com.demo.entity.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class Client {
public static void main(String[] args) {
	StudentService service = new StudentServiceImpl();
	//Does Not Exist
	Student student = null;
	//New
	student = new Student();
	student.setStudentId(200);
	student.setName("Sachin");
	
	//look inside the StudentDAOImpl for managed state
	service.addStudent(student);
	

//	student = service.findStudentById(100);
//	System.out.print("ID:"+student.getStudentId());
//	System.out.println(" Name:"+student.getName());	
//	student.setName("Sachin Tendulkar");
//	service.updateStudent(student);
	
	//at this breakpoint, we have updated record added in first section
//	student = service.findStudentById(100);
//	System.out.print("ID:"+student.getStudentId());
//	System.out.println(" Name:"+student.getName());
	
//	//at this breakpoint, record is removed from table
//	service.removeStudent(student);
	System.out.println("End of program...");
}
}
