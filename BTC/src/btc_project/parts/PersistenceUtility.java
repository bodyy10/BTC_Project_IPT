package btc_project.parts;

import java.util.*;

import javax.persistence.*;

public class PersistenceUtility {

	private static PersistenceUtility instance;
	private EntityManagerFactory emf;
	private EntityManager em;
	
	private PersistenceUtility ()
	{
		emf = Persistence.createEntityManagerFactory("$object/db/requirements.odb");
	}
	
	public static PersistenceUtility getInstance()
	{
		
		if(instance == null){
			instance = new PersistenceUtility();
		}
		instance.em = instance.emf.createEntityManager();
			return instance;
	}
	
	public void create(Requirement r)
	{
		em.getTransaction().begin();
		em.persist(r);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Requirement> getall()
	{
		return em.createQuery("SELECT r FROM Requirement r").getResultList();
	}
}
