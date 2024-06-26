package com.service;


import com.entity.Student;

import com.Dao.StudentDao;

public class StudentService {

	
	
	private StudentDao studentDao;
	
	public StudentService() {
	studentDao=new StudentDao();	
	
	}
	public Student InsertStudent(Student s) {
		// TODO Auto-generated method stub
		return studentDao.InsertStudent(s);
	}
	
	public Student DeleteStudent(int id)
	{
		return studentDao.DeleteStudent(id);
	}
	public Student UpdateStudent(int id)
	{
		return studentDao.UpdateStudent(id);
	}
	public Student findbyId(int id) 
	{
		return studentDao.findbyId(id);
	}
	
	
}