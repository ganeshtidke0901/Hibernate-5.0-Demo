package uk.warley.ganesh.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import uk.warley.ganesh.hibernatedemo.entity.Student;

public class StudentHibernateDemo {
	public static void main(String[] args) {
		try (SessionFactory sessionFactory = new Configuration().configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();) {
			Session session = sessionFactory.getCurrentSession();

			Student student = new Student("Ganesh", "Tidke", "ganeshtidke2707@gmail.com");
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
		}

	}
}
