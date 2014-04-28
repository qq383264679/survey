package test;

import java.util.HashSet;

import org.apache.jasper.tagplugins.jstl.core.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.feng.model.Page;
import com.feng.model.Question;
import com.feng.model.Survey;

public class Test {
	public static Test t = new Test();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	    // System.out.println(ctx);
	     SessionFactory factory = (SessionFactory) ctx.getBean("sessionFactory");	     
	     System.out.println(factory);
		
/*	     Session s = factory.openSession();
	     
	     
	     Survey survey = new Survey(); 
	     HashSet<Question> questions = new HashSet<Question>();
	     Question q = new Question();
	     questions.add(q);
	     
	     Page p = new Page();
	     p.setDescription("Äã·Ç³£ºÃ");
	     p.setSurvey(survey);
	     p.setQuestions(questions);
	     s.save(p);*/
	}

}
