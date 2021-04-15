package com.hcl.pp.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Repository;

import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

@Repository
public class UserDAOImpl implements UserDAO {


	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/hcl/pp/config/hibernate.cfg.xml")
			.build();

	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	SessionFactory factory = meta.getSessionFactoryBuilder().build();

	@Override
	public User addUser(User user) {

		Session session = factory.openSession();
	
		try {
			String hql = "from User user where user.username=:name";
			Query query = session.createQuery(hql).setParameter("name", user.getUsername());
			
			List<User> listOfUsers = query.getResultList();

			if (listOfUsers == null || listOfUsers.isEmpty()) {
				Transaction transaction = session.beginTransaction();
				session.saveOrUpdate(user);
				transaction.commit();
				System.out.println("Saving");
			}else {
				user = null;
			}
		}catch (Exception exception) {
			exception.printStackTrace();
		}
			return user;
		}

	
	@Override
	public Boolean authenticateUser(User user) {
		
		Session session = factory.openSession();
		
		Boolean isUser = false;
		try {
			String hql = "from User user where user.username=:name and user.userPassword=:passwd";
			Query query = session.createQuery(hql);
			query.setParameter("name", user.getUsername());
			query.setParameter("passwd", user.getUserPassword());
			
			List<User> listOfUsers = query.getResultList();

			if (listOfUsers != null && !(listOfUsers.isEmpty())) {
				isUser = true;
			}
		}catch (Exception exception) {
			exception.printStackTrace();
		}
			return isUser;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<User> listUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findByUserName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pet buyPet(Pet pet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Pet> getMyPets() {
		// TODO Auto-generated method stub
		return null;
	}

}
