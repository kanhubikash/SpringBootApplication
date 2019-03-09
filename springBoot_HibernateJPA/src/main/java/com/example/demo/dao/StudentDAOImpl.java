package com.example.demo.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository("studDAO")
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private HibernateTemplate ht;
	
	@Autowired
	private EntityManager em;
	
	@Override
	@Transactional
	public String saveStudent(Student student) {
		System.out.println(student);
		int id=0;
		//id=(int)ht.save(student);
		em.persist(student);
		System.out.println("DAO"+id);
		return "Success";
	}

}
