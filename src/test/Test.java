package test;

import java.util.HashSet;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.feng.model.Page;
import com.feng.model.Question;
import com.feng.model.Survey;
import com.feng.model.User;

public class Test extends T_Test<User>{
	public Test() {
		System.out.println("sssssss");
	}
	public static void main(String[] args) {
		Test t = new Test();
		
	}

}
