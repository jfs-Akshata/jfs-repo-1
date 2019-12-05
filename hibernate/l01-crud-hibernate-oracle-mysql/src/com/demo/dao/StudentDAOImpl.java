package com.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.demo.entity.Student;

public class StudentDAOImpl implements StudentDao{
private EntityManager entityManager = null;

	public StudentDAOImpl() {
	entityManager = JPAUtil.getEntityManager();
}

	@Override
	public Student getStudentById(int id) {
		return entityManager.find(Student.class, 100);
	}

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);
		System.out.println("Student persisted in the database");
	}

	@Override
	public void removeStudent(Student student) {
		entityManager.remove(student);
	}

	@Override
	public void updateStudent(Student student) {
		entityManager.merge(student);
	}

	@Override
	public void commitTransaction() {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.commit();
	}

	@Override
	public void beginTransaction() {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityManager.getTransaction().begin();
	}

}
