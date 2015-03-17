package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Users;

public class UsersDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public List<Users> getAllUser() {
		String hsql = "from users";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hsql);

		return query.list();
	}

	public int getCounts() {
		String hqlString = "select count(*) from users";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hqlString);
		int num = ((Number) query.uniqueResult()).intValue();
		System.out.println("count:"+num);
		return num;
	}
}
