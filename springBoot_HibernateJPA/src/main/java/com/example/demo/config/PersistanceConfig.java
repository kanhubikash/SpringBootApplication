package com.example.demo.config;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.example.demo.entity.Student;

@Configuration
public class PersistanceConfig {

	@Autowired
	private DataSource ds;
	
	@Bean
	public LocalSessionFactoryBean getLocalSessionFactory() {
		LocalSessionFactoryBean bean=null;
		
		bean=new LocalSessionFactoryBean();
		bean.setAnnotatedClasses(Student.class);
		bean.setAnnotatedPackages("com.example.demo.entity");
		bean.setDataSource(ds);
		
		return bean;
	}
	
	@Bean
	@Primary
	public SessionFactory creatSessionFactory() {
		return getLocalSessionFactory().getObject();
	}
	
	@Bean
	public HibernateTemplate createHibernateTemplate() {
		return new HibernateTemplate(creatSessionFactory());
	}
}
