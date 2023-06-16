package std.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import std.dto.Student;

public class StudentDao {

public void saveStudent(Student student)
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("nis");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	et.begin();
	em.persist(student);
	et.commit();
}


}
