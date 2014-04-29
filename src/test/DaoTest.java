package test;

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
         Session session = null;
         try {                
                 
                 tx = s.beginTransaction();
                 User u = new User();
                 u.setName("qaz");
                 u.setPassword("123456");
                 
                 Survey survey = new Survey();
                 survey.setUser(u);
                 
                 s.save(u);
                 s.save(survey);
                 tx.commit();
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
