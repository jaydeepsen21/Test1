package com.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

 
public class StudentDao {

	private SessionFactory sessionFactory;
	
	public StudentDao(){
		
		Configuration config=new Configuration().configure();
		sessionFactory=config.buildSessionFactory();
	}
	public Student InsertStudent(Student s)
	{
		Session  session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(s);
		tr.commit();
		return s;
	}
	public Student DeleteStudent(int id)
	{
		Session  session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Student student=session.get(Student.class,id);
		//provide the response
		if(student!=null)
		{
			session.remove(student);
		}
		tr.commit();
		return student;
	}
	public Student UpdateStudent(int id)
	{
		Session  session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Student student=session.get(Student.class,id);
		
		//provide the response
		
		if(student!=null)
		{
		
		student.setName("pooja");
		student.setBatch("java");
		student.setMarks(90);
		student.setJoiningDate("19/10/2003");
		session.update(student);
		}
		tr.commit();
		return student;
	}
	public Student findbyId(int id)
	{ 
		System.out.println("Dao called");
		Session  session=sessionFactory.openSession();
		Student student=session.get(Student.class, id);
		return student;
	}
}