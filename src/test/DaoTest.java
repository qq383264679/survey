package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.feng.model.Survey;
import com.feng.model.User;

public class DaoTest {
	@Test
	 public void user() {
	     ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	    // System.out.println(ctx);
	     SessionFactory factory = (SessionFactory) ctx.getBean("sessionFactory");
	     Session s = factory.openSession();

		 
	     
	     Transaction tx = null;
         try {                
                 
        	 String hql = "from User where name = ?";
        	 Query q = s.createQuery(hql);
        	 q.setParameter(0, "qaz");
        	 
        	 User u = (User) q.uniqueResult();
        	System.out.println(u.getId());
         } catch(RuntimeException e) {
                 if(tx != null) {
                         tx.rollback();
                 }
                 throw e;
         } finally {
                 s.close();
         }
	 }
}
