package com.demo.service;

import com.demo.entity.Student;

public interface StudentService {

	void addStudent(Student student);

	void updateStudent(Student student);

	void removeStudent(Student student);

	Student findStudentById(int id);

}